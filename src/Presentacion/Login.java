/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.UIManager;


/**
 *
 * @author andyv
 */
public class Login extends javax.swing.JFrame {
    private int X=300,Y=0;

    
    public Login() {
        initComponents();
        IniciarTimer();
    }
    
    private void Iniciar(){
    
    }

    private void IniciarTimer(){
     
       Timer time=new Timer();
       TimerTask timer=new TimerTask() {
           @Override
           public void run() {
              pP1.setLocation(X, Y);
              Y++;
              
              if(Y==180){
                    time.cancel();
            }
              
           }
          
       };
       
     
     
     time.scheduleAtFixedRate(timer,0,70);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pPrincipal = new test.PanelRound();
        pP1 = new test.PanelRound();
        pP2 = new test.PanelRound();
        lblImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pPrincipal.setRoundBottomLeft(30);
        pPrincipal.setRoundBottomRight(30);
        pPrincipal.setRoundTopLeft(30);
        pPrincipal.setRoundTopRight(30);
        pPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pP1.setRoundBottomLeft(30);
        pP1.setRoundBottomRight(30);
        pP1.setRoundTopLeft(30);
        pP1.setRoundTopRight(30);
        pP1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pP2.setBackground(new java.awt.Color(255, 255, 255));
        pP2.setRoundBottomLeft(30);
        pP2.setRoundBottomRight(30);
        pP2.setRoundTopLeft(30);
        pP2.setRoundTopRight(30);

        javax.swing.GroupLayout pP2Layout = new javax.swing.GroupLayout(pP2);
        pP2.setLayout(pP2Layout);
        pP2Layout.setHorizontalGroup(
            pP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        pP2Layout.setVerticalGroup(
            pP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );

        pP1.add(pP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 260, 330));

        pPrincipal.add(pP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 280, 360));
        pPrincipal.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 210, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblImage;
    private test.PanelRound pP1;
    private test.PanelRound pP2;
    private test.PanelRound pPrincipal;
    // End of variables declaration//GEN-END:variables
}
