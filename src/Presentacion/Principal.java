/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import com.Presentacion.Diseño.Desing;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Principal extends javax.swing.JFrame {

    private Desing ds=new Desing();
    
    public Principal() {
        initComponents();
        InicioImage();
        InicioComponents();
    }
    
    private void InicioComponents(){
        this.setLocationRelativeTo(this);
        AWTUtilities.setWindowOpaque(this,false);
    }
    
    
    private void InicioImage(){
        JLabel[] lbl=new JLabel[]{lIngreso,lVentas,lLogo};
        String[] ruta=new String[]{"src/Resources","src/Resources","src/Resources"};
        String[] archivo=new String[]{"IDatos3.png","Ventas2.png","logo.png"};
        ds.AsignarImagen(lbl, ruta, archivo);
    }
    
    private void SelectPanel(JPanel panel,JLabel lbl,boolean select){
        Color c=new Color(240,240,240);
        int w=120,h=110;
        if(select){
            c = new Color(255,0,0);
            w=100;
            h=100;
        }
        
        lbl.setSize(w, h);
        panel.setBackground(c);
        InicioImage();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new test.PanelRound();
        pIngreso = new test.PanelRound();
        bIngreso = new javax.swing.JLabel();
        lIngreso = new javax.swing.JLabel();
        pVentas = new test.PanelRound();
        bVenta = new javax.swing.JLabel();
        lVentas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        myButton1 = new button.MyButton();
        lLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(40);
        panelRound1.setRoundBottomRight(40);
        panelRound1.setRoundTopLeft(40);
        panelRound1.setRoundTopRight(40);

        pIngreso.setRoundBottomLeft(30);
        pIngreso.setRoundBottomRight(30);
        pIngreso.setRoundTopLeft(30);
        pIngreso.setRoundTopRight(30);
        pIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bIngreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bIngreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bIngresoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bIngresoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bIngresoMouseExited(evt);
            }
        });
        pIngreso.add(bIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 160, 140));
        pIngreso.add(lIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 110));

        pVentas.setRoundBottomLeft(30);
        pVentas.setRoundBottomRight(30);
        pVentas.setRoundTopLeft(30);
        pVentas.setRoundTopRight(30);
        pVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bVentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bVentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bVentaMouseExited(evt);
            }
        });
        pVentas.add(bVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 160, 140));
        pVentas.add(lVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 110));

        jLabel1.setText("Realizar Ventas");

        jLabel2.setText("Realizar Ingreso de datos");

        myButton1.setBorder(null);
        myButton1.setForeground(new java.awt.Color(255, 255, 255));
        myButton1.setText("Salir");
        myButton1.setBorderColor(new java.awt.Color(255, 0, 0));
        myButton1.setColor(new java.awt.Color(255, 0, 0));
        myButton1.setColorClick(new java.awt.Color(255, 102, 102));
        myButton1.setColorOver(new java.awt.Color(255, 102, 102));
        myButton1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        myButton1.setRadius(30);
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        lLogo.setText("jLabel3");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(pVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(pIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bIngresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bIngresoMouseClicked
        this.dispose();
        new pProducto().setVisible(true);
    }//GEN-LAST:event_bIngresoMouseClicked

    private void bIngresoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bIngresoMouseEntered
        SelectPanel(pIngreso,lIngreso,true);
    }//GEN-LAST:event_bIngresoMouseEntered

    private void bIngresoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bIngresoMouseExited
        SelectPanel(pIngreso,lIngreso,false);
    }//GEN-LAST:event_bIngresoMouseExited

    private void bVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVentaMouseClicked
        this.dispose();
        new Venta().setVisible(true);
    }//GEN-LAST:event_bVentaMouseClicked

    private void bVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVentaMouseEntered
         SelectPanel(pVentas,lVentas,true);
         
    }//GEN-LAST:event_bVentaMouseEntered

    private void bVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bVentaMouseExited
        SelectPanel(pVentas,lVentas,false);
    }//GEN-LAST:event_bVentaMouseExited

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_myButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bIngreso;
    private javax.swing.JLabel bVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lIngreso;
    private javax.swing.JLabel lLogo;
    private javax.swing.JLabel lVentas;
    private button.MyButton myButton1;
    private test.PanelRound pIngreso;
    private test.PanelRound pVentas;
    private test.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
