package com.mycompany.poobd.Database;

import com.mycompany.poobd.Usecase.IDatabaseAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CarroDAO implements IDatabaseAccess {

    @Override
    public boolean save(String model, String color, String year) {
        final String insertStatement = "INSERT INTO carro (modelo, cor, ano) VALUES (?, ?, ?)";

        try(Connection connection = new PostgresqlConnection().getConnection();
             PreparedStatement ps = connection.prepareStatement(insertStatement))
        {
            ps.setString(1, model);
            ps.setString(2, color);
            ps.setString(3, year);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("Deu ruim na chamada ao banco de dados:" + ex);
            return false;
        }
    }

    @Override
    public boolean update(Integer id, String model, String color, String year) {
        final String updateStatement = "UPDATE carro SET modelo = ?, cor = ?, ano = ? WHERE id = ?";

        try (Connection connection = new PostgresqlConnection().getConnection();
             PreparedStatement ps = connection.prepareStatement(updateStatement)
        ){
            ps.setString(1, model);
            ps.setString(2, color);
            ps.setString(3, year);
            ps.setInt(4, id);
            ps.executeUpdate();
            return true;
        }
        catch (SQLException e) {
            System.out.println("Erro inesperado ao consultar o banco de dados:" + e);
            return false;
        }
    }

    @Override
    public ArrayList<String> selectByModel(String model) {
        ArrayList<String> DataList = new ArrayList<>();
        final String selectStatement = "SELECT id, modelo, cor, ano FROM carro WHERE modelo = ?";

        try(Connection connection = new PostgresqlConnection().getConnection();
            PreparedStatement ps = connection.prepareStatement(selectStatement))
        {
            ps.setString(1, model);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                DataList.add(rs.getString("id"));
                DataList.add(rs.getString("modelo"));
                DataList.add(rs.getString("cor"));
                DataList.add(rs.getString("ano"));
            }
            return DataList;

        } catch(SQLException ex) {
            System.out.println("Deu ruim na chamada ao banco de dados");
            return DataList;
        }
    }

    @Override
    public ArrayList<String[]> selectAll() {
        final String statement = "SELECT * FROM carro";
        ArrayList<String[]> DataList = new ArrayList<>();
        ResultSet rs = null;
        PreparedStatement ps = null;
        Connection connection = null;

        try {
            connection = new PostgresqlConnection().getConnection();
            ps = connection.prepareStatement(statement);
            rs = ps.executeQuery();

            while (rs.next()) {
                String[] auxArray = new String[4];
                auxArray[0] = rs.getString("id");
                auxArray[1] = rs.getString("modelo");
                auxArray[2] = rs.getString("cor");
                auxArray[3] = rs.getString("ano");
                DataList.add(auxArray);
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                System.out.println("Erro ao fechar conexão com banco de dados: " + ex);
            }
        }
        return DataList;
    }

    public int delete(int id) {
        final String deleteStatement = "DELETE FROM carro WHERE id = ?";
        Connection connection = null;
        PreparedStatement ps = null;

        try {
            connection = new PostgresqlConnection().getConnection();
            ps = connection.prepareStatement(deleteStatement);
            ps.setInt(1, id);
            return ps.executeUpdate();
        } catch (SQLException ex) {
            return -1;
        }
        finally {
            try {
                if (connection != null) {
                    connection.close();
                }

                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                System.out.println("Erro ao fechar conexão com banco de dados: " + ex);
            }
        }
    }
}
