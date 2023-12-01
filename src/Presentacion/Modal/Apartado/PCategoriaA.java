/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Modal.Apartado;

import Entidad.Categoria;
import Negocio.NCategoria;
import Presentacion.Modal.PProductoA;
import com.sun.awt.AWTUtilities;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andyv
 */
public class PCategoriaA extends javax.swing.JFrame {
    private NCategoria cc=new NCategoria();
    private DefaultTableModel dtm=new DefaultTableModel();
    
    public PCategoriaA() {
        initComponents();
        MostarTable();
          Inicio();
    }
    
      private void Inicio(){
    AWTUtilities.setWindowOpaque(this, false);
    this.setLocationRelativeTo(this);
    }

  
    
     private void MostarTable(){
        
        dtm.setColumnIdentifiers(new String[]{"Codigo","Descripcion","Estado"}); 
        tblResult.setModel(dtm);
        cc.Leer(dtm);
    }
     
     
      private Categoria Items(){
     Categoria cat=new Categoria();
     int est=0;
     if(!txtCodigo.getText().isEmpty()){cat.setCodigo(Integer.parseInt(txtCodigo.getText()));}
     cat.setDescripcion(txtDescripcion.getText());
     if(cbEstado.isSelected()){est=1;}
     cat.setEstado(est);
     return cat;
     }
     
      private void Insertar(){
        if(cc.Insertar(Items())){
        JOptionPane.showMessageDialog(null,"Se Ingreso correctamente");
         MostarTable();
        }else{
        JOptionPane.showMessageDialog(null,"No Ingreso correctamente");
        }
    }
    
    private void Modificar(){
        if(cc.Actualizar(Items())){
            JOptionPane.showMessageDialog(null,"Se modifico correctamente");
             MostarTable();
        }else{
            JOptionPane.showMessageDialog(null,"No modifico correctamente");
        }
    }
    
    private void Eliminar(){
        
        if(cc.Eliminar(Items())){
        JOptionPane.showMessageDialog(null,"Se elimino correctamente");
         MostarTable();
        }else{
        JOptionPane.showMessageDialog(null,"No elimino correctamente");
        }
    }
    
    private void Buscar(){
        if(cc.Buscar(dtm,Items())){
            JOptionPane.showMessageDialog(null,"No se encontro");
             MostarTable();
        }
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new test.PanelRound();
        btnBuscar = new button.MyButton();
        jLabel1 = new javax.swing.JLabel();
        cbEstado = new javax.swing.JCheckBox();
        txtCodigo = new textfield.TextField();
        btnModificar = new button.MyButton();
        txtDescripcion = new textfield.TextField();
        btnEliminar = new button.MyButton();
        btnAgregar = new button.MyButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResult = new javax.swing.JTable();
        btnCancelar = new button.MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        panelRound1.setBackground(new java.awt.Color(21, 23, 36));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setBorder(null);
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorderColor(new java.awt.Color(255, 0, 51));
        btnBuscar.setColor(new java.awt.Color(255, 0, 51));
        btnBuscar.setColorClick(new java.awt.Color(255, 51, 51));
        btnBuscar.setColorOver(new java.awt.Color(255, 102, 102));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscar.setRadius(20);
        panelRound1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 100, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Categoria");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 100, -1));

        cbEstado.setBackground(new java.awt.Color(21, 23, 36));
        cbEstado.setForeground(new java.awt.Color(255, 255, 255));
        cbEstado.setText("Estado");
        panelRound1.add(cbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtCodigo.setBackground(new java.awt.Color(21, 23, 36));
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setLabelText("Codigo");
        txtCodigo.setLineColor(new java.awt.Color(255, 0, 51));
        panelRound1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 190, -1));

        btnModificar.setBorder(null);
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.setBorderColor(new java.awt.Color(255, 0, 51));
        btnModificar.setColor(new java.awt.Color(255, 0, 51));
        btnModificar.setColorClick(new java.awt.Color(255, 51, 51));
        btnModificar.setColorOver(new java.awt.Color(255, 102, 102));
        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnModificar.setRadius(20);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        panelRound1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 90, 30));

        txtDescripcion.setBackground(new java.awt.Color(21, 23, 36));
        txtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setLabelText("Descripcion");
        txtDescripcion.setLineColor(new java.awt.Color(255, 0, 51));
        panelRound1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 190, -1));

        btnEliminar.setBorder(null);
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorderColor(new java.awt.Color(255, 0, 51));
        btnEliminar.setColor(new java.awt.Color(255, 0, 51));
        btnEliminar.setColorClick(new java.awt.Color(255, 51, 51));
        btnEliminar.setColorOver(new java.awt.Color(255, 102, 102));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEliminar.setRadius(20);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panelRound1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 90, 30));

        btnAgregar.setBorder(null);
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorderColor(new java.awt.Color(255, 0, 51));
        btnAgregar.setColor(new java.awt.Color(255, 0, 51));
        btnAgregar.setColorClick(new java.awt.Color(255, 51, 51));
        btnAgregar.setColorOver(new java.awt.Color(255, 102, 102));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAgregar.setRadius(20);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        panelRound1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, 30));

        tblResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblResult);

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 310, 190));

        btnCancelar.setBorder(null);
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorderColor(new java.awt.Color(255, 0, 51));
        btnCancelar.setColor(new java.awt.Color(255, 0, 51));
        btnCancelar.setColorClick(new java.awt.Color(255, 51, 51));
        btnCancelar.setColorOver(new java.awt.Color(255, 102, 102));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setRadius(20);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelRound1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Modificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       Eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       Insertar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        new PProductoA().setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(PCategoriaA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PCategoriaA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PCategoriaA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PCategoriaA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PCategoriaA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.MyButton btnAgregar;
    private button.MyButton btnBuscar;
    private button.MyButton btnCancelar;
    private button.MyButton btnEliminar;
    private button.MyButton btnModificar;
    private javax.swing.JCheckBox cbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private test.PanelRound panelRound1;
    private javax.swing.JTable tblResult;
    private textfield.TextField txtCodigo;
    private textfield.TextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
