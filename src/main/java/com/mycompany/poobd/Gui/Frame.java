package com.mycompany.poobd.Gui;

import com.mycompany.poobd.Controller.IController;
import java.awt.CardLayout;

public class Frame extends javax.swing.JFrame {
    private CardLayout layout;
    private IController controller;
    private Core core = new Core();
    
    public Frame(IController controller) {
        this.controller = controller;
        initComponents();
        jPanelMain.setLayout(new CardLayout());
        
        HomePanel homePanel = new HomePanel();
        
        BuscaCarroPanel buscaPanel = new BuscaCarroPanel(controller);
        buscaPanel.setCore(core);
        buscaPanel.setParentPanel(jPanelMain);
        
        CadastroCarroPanel cadastroPanel = new CadastroCarroPanel(controller);
//        cadastroPanel.setCore(core);
        cadastroPanel.setParentPanel(jPanelMain);
        
        EditarCarroPanel editarPanel = new EditarCarroPanel(controller);
        editarPanel.setCore(core);
        editarPanel.setParentPanel(jPanelMain);
        
        jPanelMain.add(buscaPanel, "buscar");
        jPanelMain.add(cadastroPanel, "cadastrar");
        jPanelMain.add(homePanel, "home");
        jPanelMain.add(editarPanel, "editar");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jMenuBar = new javax.swing.JMenuBar();
        Home = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuCadastrarCarro = new javax.swing.JMenuItem();
        jMenuConsultar = new javax.swing.JMenu();
        jMenuConsultarCarro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMain.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );

        Home.setText("Home");
        Home.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        jMenuBar.add(Home);

        jMenu2.setText("Cadastrar");
        jMenu2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        jMenuCadastrarCarro.setFont(new java.awt.Font("Noto Sans", 0, 13)); // NOI18N
        jMenuCadastrarCarro.setText("Carro");
        jMenuCadastrarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrarCarroActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuCadastrarCarro);

        jMenuBar.add(jMenu2);

        jMenuConsultar.setText("Consultar");
        jMenuConsultar.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        jMenuConsultarCarro.setFont(new java.awt.Font("Noto Sans", 0, 13)); // NOI18N
        jMenuConsultarCarro.setText("Carro");
        jMenuConsultarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultarCarroPressionado(evt);
            }
        });
        jMenuConsultar.add(jMenuConsultarCarro);

        jMenuBar.add(jMenuConsultar);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuConsultarCarroPressionado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultarCarroPressionado
        CardLayout layout = (CardLayout) jPanelMain.getLayout();
        layout.show(jPanelMain, "buscar");
    }//GEN-LAST:event_jMenuConsultarCarroPressionado

    private void jMenuCadastrarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrarCarroActionPerformed
        core.setModelo("");
        core.setCor("");
        core.setAno("");
        
        CardLayout layout = (CardLayout) jPanelMain.getLayout();
        layout.show(jPanelMain, "Cadastrar");
    }//GEN-LAST:event_jMenuCadastrarCarroActionPerformed

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        CardLayout layout = (CardLayout) jPanelMain.getLayout();
        layout.show(jPanelMain, "Home");
    }//GEN-LAST:event_HomeMouseClicked
        
    public void main() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.
                    getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame(controller).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Home;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuCadastrarCarro;
    private javax.swing.JMenu jMenuConsultar;
    private javax.swing.JMenuItem jMenuConsultarCarro;
    private javax.swing.JPanel jPanelMain;
    // End of variables declaration//GEN-END:variables
}
