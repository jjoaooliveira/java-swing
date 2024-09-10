package com.mycompany.poobd.Database;

import com.mycompany.poobd.Domain.Vehicle;
import com.mycompany.poobd.Services.IDatabaseAccess;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class CarroDAO implements IDatabaseAccess {
    Properties properties;

    public CarroDAO() {
        loadProperties();
    }

    @Override
    public void save(Vehicle vehicle) {
        final String insertStatement = "INSERT INTO carro (modelo, cor, ano) VALUES (?, ?, ?)";

        try(
            Connection connection = new PostgresqlConnection().getConnection(properties);
            PreparedStatement ps = connection.prepareStatement(insertStatement)
        ) {
            ps.setString(1, vehicle.getModel());
            ps.setString(2, vehicle.getColor());
            ps.setString(3, vehicle.getYear());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.printf("Error code: %d", e.getErrorCode());
            System.err.printf("Cause: ", e.getCause());
            System.out.printf("Response: ", e.getMessage());
        }
    }

    @Override
    public void update(Vehicle vehicle) {
        final String updateStatement = "UPDATE carro SET modelo = ?, cor = ?, ano = ? WHERE id = ?";

        try (
            Connection connection = new PostgresqlConnection().getConnection(properties);
            PreparedStatement ps = connection.prepareStatement(updateStatement)
        ){
            ps.setString(1, vehicle.getModel());
            ps.setString(2, vehicle.getColor());
            ps.setString(3, vehicle.getYear());
            ps.setInt(4, vehicle.getId());
            ps.executeUpdate();
        }
        catch (SQLException e) {
            System.out.println("Erro inesperado ao consultar o banco de dados:" + e);
        }
    }

    @Override
    public ArrayList<String[]> selectByModel(String model) {
        ArrayList<String[]> arrayList = new ArrayList<>();
        final String selectStatement = "SELECT id, modelo, cor, ano FROM carro WHERE modelo = ?";

        try(
            Connection connection = new PostgresqlConnection().getConnection(properties);
            PreparedStatement ps = connection.prepareStatement(selectStatement)
        ){
            ps.setString(1, model);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String[] dataList = new String[4];
                dataList[0] = rs.getString("id");
                dataList[1] = rs.getString("modelo");
                dataList[2] = rs.getString("cor");
                dataList[3] = rs.getString("ano");
                arrayList.add(dataList);
            }
            return arrayList;

        } catch(SQLException e) {
            System.out.println("Erro inesperado na chamada ao banco de dados:" + e);
            return arrayList;
        }
    }

    @Override
    public ArrayList<String[]> selectAll() {
        final String statement = "SELECT * FROM carro";
        ArrayList<String[]> DataList = new ArrayList<>();

        try(
            Connection connection = new PostgresqlConnection().getConnection(properties);
            PreparedStatement ps = connection.prepareStatement(statement);
            ResultSet rs = ps.executeQuery();
        ){
            while (rs.next()) {
                String[] auxArray = new String[4];
                auxArray[0] = rs.getString("id");
                auxArray[1] = rs.getString("modelo");
                auxArray[2] = rs.getString("cor");
                auxArray[3] = rs.getString("ano");
                DataList.add(auxArray);
            }
        }
        catch (SQLClientInfoException e) {
            System.out.println("Erro: " + e);
        } catch (SQLException e) {
            System.out.println("Erro inesperado na chamada ao banco de dados:" + e);
        }
        return DataList;
    }
    
    @Override
    public void delete(Integer id) {
        final String deleteStatement = "DELETE FROM carro WHERE id = ?";
        try(
            Connection connection = new PostgresqlConnection().getConnection(properties);
            PreparedStatement ps = connection.prepareStatement(deleteStatement);
        ) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro inesperado na chamada ao banco de dados:" + e);
        }
    }

    private void loadProperties() {
        properties = new Properties();
        try(
            InputStream propertiesFileStream = this.getClass()
            .getResourceAsStream("/dados.properties")
        ) {
            properties.load(propertiesFileStream);
        } catch (IOException e) {
            System.err.printf("Cause: ", e.getCause());
            System.out.printf("Response: ", e.getMessage());
        }
    }
}
