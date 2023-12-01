/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Modal;

import Entidad.Producto;
import Negocio.*;
import Presentacion.Modal.Apartado.PCategoriaA;
import Presentacion.Modal.Apartado.PMarcaA;
import Presentacion.pProducto;
import com.sun.awt.AWTUtilities;
import javax.swing.JOptionPane;

/**
 *
 * @author andyv
 */
public class PProductoA extends javax.swing.JFrame {
    private Producto codigo=new Producto();
    private NProducto pp=new NProducto();
    private NCategoria cc=new NCategoria();
    private NMarca mm=new NMarca();
    
    public PProductoA(Producto codigo){
        Inicial();
        this.codigo=codigo;
    }
    
    
    public PProductoA() {
        Inicial();
        IniciarCBO();
    }
    
    private void Inicial(){
        initComponents();
        AWTUtilities.setWindowOpaque(this,false);
        this.setLocationRelativeTo(this);
    }
    
    private void IniciarCBO(){
     for(int i=0;i<cc.cboCategoria().size();i++){    
            cboCategoria.addItem(cc.cboCategoria().get(i));
        }
     for(int i=0;i<mm.cboMarca().size();i++){    
            cboMarca.addItem(mm.cboMarca().get(i));
        }
    }
    
    private Producto Items(){
        int est=0;
        codigo.setDescripcion(txtDescripcion.getText());
        codigo.setCategoria(cboCategoria.getSelectedIndex()+1);
        codigo.setMarca(cboMarca.getSelectedIndex()+1);
         if(cbEstado.isSelected()){
            est=1;
        }
        codigo.setEstado(est);
        codigo.setPrecio(Double.parseDouble(txtPrecio.getText()));
        codigo.setStock(Integer.parseInt(txtStock.getText()));
        return codigo;
    }
    
    
    private void Ingresar(){
        if(pp.Insertar(Items())){
        JOptionPane.showMessageDialog(null,"Se Ingreso correctamente");
        }else{
        JOptionPane.showMessageDialog(null,"No Ingreso correctamente");
        }
    }
    
    private void Modificar(){
        if(pp.Actualizar(Items())){
            JOptionPane.showMessageDialog(null,"Se modifico correctamente");
        }else{
            JOptionPane.showMessageDialog(null,"No modifico correctamente");
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new test.PanelRound();
        btnCancelar = new button.MyButton();
        btnMarca = new button.MyButton();
        txtDescripcion = new textfield.TextField();
        txtStock = new textfield.TextField();
        cbEstado = new javax.swing.JCheckBox();
        cboCategoria = new combobox.Combobox();
        cboMarca = new combobox.Combobox();
        btnAgregar = new button.MyButton();
        txtPrecio = new textfield.TextField();
        btnCategoria = new button.MyButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        panelRound1.setBackground(new java.awt.Color(21, 23, 36));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        panelRound1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 100, 40));

        btnMarca.setBorder(null);
        btnMarca.setForeground(new java.awt.Color(255, 255, 255));
        btnMarca.setText("+");
        btnMarca.setBorderColor(new java.awt.Color(255, 0, 51));
        btnMarca.setColor(new java.awt.Color(255, 0, 51));
        btnMarca.setColorClick(new java.awt.Color(255, 51, 51));
        btnMarca.setColorOver(new java.awt.Color(255, 102, 102));
        btnMarca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMarca.setRadius(20);
        btnMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcaActionPerformed(evt);
            }
        });
        panelRound1.add(btnMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 40, 30));

        txtDescripcion.setBackground(new java.awt.Color(21, 23, 36));
        txtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setCaretColor(new java.awt.Color(255, 255, 255));
        txtDescripcion.setLabelText("Descripcion");
        txtDescripcion.setLineColor(new java.awt.Color(255, 0, 51));
        panelRound1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 220, -1));

        txtStock.setBackground(new java.awt.Color(21, 23, 36));
        txtStock.setForeground(new java.awt.Color(255, 255, 255));
        txtStock.setText("0");
        txtStock.setCaretColor(new java.awt.Color(255, 255, 255));
        txtStock.setLabelText("Stock");
        txtStock.setLineColor(new java.awt.Color(255, 0, 51));
        panelRound1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 90, -1));

        cbEstado.setBackground(new java.awt.Color(21, 23, 36));
        cbEstado.setForeground(new java.awt.Color(255, 255, 255));
        cbEstado.setText("Estado");
        panelRound1.add(cbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        cboCategoria.setBackground(new java.awt.Color(21, 23, 36));
        cboCategoria.setForeground(new java.awt.Color(255, 255, 255));
        cboCategoria.setLabeText("Categoria");
        cboCategoria.setLineColor(new java.awt.Color(255, 0, 0));
        panelRound1.add(cboCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 190, -1));

        cboMarca.setBackground(new java.awt.Color(21, 23, 36));
        cboMarca.setForeground(new java.awt.Color(255, 255, 255));
        cboMarca.setLabeText("Marca");
        cboMarca.setLineColor(new java.awt.Color(255, 0, 0));
        panelRound1.add(cboMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 180, -1));

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
        panelRound1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 100, 40));

        txtPrecio.setBackground(new java.awt.Color(21, 23, 36));
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.setText("0.00");
        txtPrecio.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPrecio.setLabelText("Precio");
        txtPrecio.setLineColor(new java.awt.Color(255, 0, 51));
        panelRound1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 80, -1));

        btnCategoria.setBorder(null);
        btnCategoria.setForeground(new java.awt.Color(255, 255, 255));
        btnCategoria.setText("+");
        btnCategoria.setBorderColor(new java.awt.Color(255, 0, 51));
        btnCategoria.setColor(new java.awt.Color(255, 0, 51));
        btnCategoria.setColorClick(new java.awt.Color(255, 51, 51));
        btnCategoria.setColorOver(new java.awt.Color(255, 102, 102));
        btnCategoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCategoria.setRadius(20);
        btnCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaActionPerformed(evt);
            }
        });
        panelRound1.add(btnCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 40, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("S/.");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        new pProducto().setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcaActionPerformed
        this.dispose();
        new PCategoriaA().setVisible(true);
    }//GEN-LAST:event_btnMarcaActionPerformed

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed
        this.dispose(); 
        new PMarcaA().setVisible(true);
    }//GEN-LAST:event_btnCategoriaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       if(codigo.getCodigo()==0){
           Ingresar();
       }else{
            Modificar();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(PProductoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PProductoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PProductoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PProductoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new PProductoA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.MyButton btnAgregar;
    private button.MyButton btnCancelar;
    private button.MyButton btnCategoria;
    private button.MyButton btnMarca;
    private javax.swing.JCheckBox cbEstado;
    private combobox.Combobox cboCategoria;
    private combobox.Combobox cboMarca;
    private javax.swing.JLabel jLabel1;
    private test.PanelRound panelRound1;
    private textfield.TextField txtDescripcion;
    private textfield.TextField txtPrecio;
    private textfield.TextField txtStock;
    // End of variables declaration//GEN-END:variables
}
