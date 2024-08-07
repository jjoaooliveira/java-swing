package com.mycompany.poobd.Gui;

import com.mycompany.poobd.Controller.IController;
import java.awt.CardLayout;
import java.beans.PropertyChangeEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EditarCarroPanel extends javax.swing.JPanel {
    private JPanel parentPanel;
    private IController controller;
    private Core core;
    private String registerId;
    
    public EditarCarroPanel(IController controller) {
        this.controller = controller;
        initComponents();
    }
    
    public void setParentPanel(JPanel panel) {
        this.parentPanel = panel;
    }
    
    public void setCore(Core core) {
        this.core = core;
        
        core.addPropertyChangeListener((PropertyChangeEvent evt) -> {
            if(Core.MODELO.equals(evt.getPropertyName())) {
                String modelo = evt.getNewValue().toString();
                jTextFieldModelo.setText(modelo);
            }
            if(Core.COR.equals(evt.getPropertyName())) {
                String cor = evt.getNewValue().toString();
                jTextFieldCor.setText(cor);
            }
            if(Core.ANO.equals(evt.getPropertyName())) {
                String ano = evt.getNewValue().toString();
                jTextFieldAno.setText(ano);
            }
            if(Core.ID.equals(evt.getPropertyName())) {
                String id = evt.getNewValue().toString();
                registerId = id;
            }
        }); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelModelo = new javax.swing.JLabel();
        jTextFieldModelo = new javax.swing.JTextField();
        jLabelCor = new javax.swing.JLabel();
        jTextFieldCor = new javax.swing.JTextField();
        jLabelAno = new javax.swing.JLabel();
        jTextFieldAno = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edição de registro");

        jLabelModelo.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabelModelo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelModelo.setText("MODELO");

        jTextFieldModelo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldModelo.setToolTipText("");

        jLabelCor.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabelCor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCor.setText("COR");

        jTextFieldCor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabelAno.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        jLabelAno.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAno.setText("ANO");

        jTextFieldAno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jButtonSalvar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSalvar.setText("CONFIRMAR");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarPressionado(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCancelar.setText("CANCELAR");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarPressionado(evt);
            }
        });

        jButtonDeletar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonDeletar.setText("DELETAR");
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarPressionado(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelAno)
                        .addComponent(jLabelModelo)
                        .addComponent(jTextFieldCor, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCor)
                        .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(jLabelModelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabelCor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabelAno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarPressionado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarPressionado
        String[] inputData = {jTextFieldModelo.getText(), jTextFieldCor.getText(), jTextFieldAno.getText()};
        
        if(controller.updateInputData(registerId, inputData)){
            JOptionPane.showMessageDialog(this, "Registro atualizado.");
            CardLayout cl = (CardLayout) parentPanel.getLayout();
            cl.show(parentPanel, "buscar");
        } else {
            JOptionPane.showMessageDialog(this, "Não foi possível atualizar registro.");
        }
    }//GEN-LAST:event_jButtonConfirmarPressionado

    private void jButtonCancelarPressionado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarPressionado
        CardLayout cl = (CardLayout) parentPanel.getLayout();
        cl.show(parentPanel, "buscar");
    }//GEN-LAST:event_jButtonCancelarPressionado

    private void jButtonDeletarPressionado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarPressionado
        if(controller.delete(registerId)) {
            JOptionPane.showConfirmDialog(this, "Registro deletado.");
            CardLayout cl = (CardLayout) parentPanel.getLayout();
            cl.show(parentPanel, "buscar");
        } else {
            JOptionPane.showMessageDialog(this, "Não foi possível deletar registro.");
        }
    }//GEN-LAST:event_jButtonDeletarPressionado


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAno;
    private javax.swing.JLabel jLabelCor;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldCor;
    private javax.swing.JTextField jTextFieldModelo;
    // End of variables declaration//GEN-END:variables
}
