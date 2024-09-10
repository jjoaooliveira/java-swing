package com.mycompany.poobd.Gui;

import com.mycompany.poobd.Controller.IController;
import com.mycompany.poobd.Controller.Response;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class BuscaCarroPanel extends javax.swing.JPanel {
    private IController controller;
    private JPanel parentPanel;
    private Core core;
    
    public BuscaCarroPanel(IController controller) {
        this.controller = controller;
        initComponents();
        jLabelResultadoVazio.setVisible(false);
        refresh();
    }
    
    public void setCore(Core core) {
        this.core = core;
    }
    
    
    public void setParentPanel(JPanel panel) {
        this.parentPanel = panel;
    }

    private void refresh() {
        DefaultTableModel model = (DefaultTableModel) jTableCarros.getModel();
        model.setRowCount(0);
        Response response = controller.searchAll();
        List<String[]> listaCarro = response.list().get();

        for (String[] carro : listaCarro) {
            model.addRow(new Object[] {
                carro[0],
                carro[1],
                carro[2],
                carro[3]
            });
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonPesquisar = new javax.swing.JButton();
        jTextFieldModelo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCarros = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelResultadoVazio = new javax.swing.JLabel();
        jButtonAtualizar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jButtonPesquisar.setBackground(new java.awt.Color(51, 204, 255));
        jButtonPesquisar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.setActionCommand("jButtonPesquisar");
        jButtonPesquisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarClicado(evt);
            }
        });

        jTextFieldModelo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldModeloKeyTyped(evt);
            }
        });

        jTableCarros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Modelo", "Cor", "Ano"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCarros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCarrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCarros);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Pesquisar carro");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(19, 19, 19))
        );

        jLabelResultadoVazio.setBackground(new java.awt.Color(102, 102, 102));
        jLabelResultadoVazio.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabelResultadoVazio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelResultadoVazio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResultadoVazio.setText("Nenhum carro foi encontrado com este modelo...");

        jButtonAtualizar.setText("atualizar");
        jButtonAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAtualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAtualizar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelResultadoVazio, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(jLabelResultadoVazio)
                .addGap(32, 32, 32)
                .addComponent(jButtonAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesquisarClicado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarClicado
        if(!jTextFieldModelo.getText().equals("")) {
            Response response = controller.searchByModel(jTextFieldModelo.getText());
            List<String[]> responseCarroList = response.list().get();
            DefaultTableModel model = (DefaultTableModel) jTableCarros.getModel();
            model.setRowCount(0);

            if(!responseCarroList.isEmpty()) {
                for (String[] carro : responseCarroList) {
                    model.addRow(new Object[] {
                        carro[0],
                        carro[1],
                        carro[2],
                        carro[3]
                    });
                }
            } else {
                jLabelResultadoVazio.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(
                this,
                "Digite o modelo do carro.",
                "Atenção",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }//GEN-LAST:event_jButtonPesquisarClicado

    private void jTextFieldModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldModeloKeyTyped
        if(jTextFieldModelo.getText().equalsIgnoreCase("")) {
            refresh();
            jLabelResultadoVazio.setVisible(false);
        }
    }//GEN-LAST:event_jTextFieldModeloKeyTyped

    private void jTableCarrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCarrosMouseClicked
        if(evt.getClickCount() > 1) {
            core.setId(
                (String) jTableCarros.getValueAt(
                    jTableCarros.getSelectedRow(), 
                    0
                )
            );
            core.setModelo(
                (String) jTableCarros.getValueAt(
                    jTableCarros.getSelectedRow(), 
                    1
                )
            );
            core.setCor(
                (String) jTableCarros.getValueAt(
                    jTableCarros.getSelectedRow(), 
                    2
                )
            );
            core.setAno(
                (String) jTableCarros.getValueAt(
                    jTableCarros.getSelectedRow(), 
                    3
                )
            );
            CardLayout cl = (CardLayout) parentPanel.getLayout();
            cl.show(parentPanel, "editar");
            jTableCarros.clearSelection();
        }
    }//GEN-LAST:event_jTableCarrosMouseClicked

    private void jButtonAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAtualizarMouseClicked
        refresh();
    }//GEN-LAST:event_jButtonAtualizarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelResultadoVazio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCarros;
    private javax.swing.JTextField jTextFieldModelo;
    // End of variables declaration//GEN-END:variables
}
