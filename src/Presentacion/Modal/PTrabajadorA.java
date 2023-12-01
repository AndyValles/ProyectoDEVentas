/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Modal;

import Entidad.Trabajador;
import Negocio.NDistrito;
import Negocio.NTrabajador;
import Presentacion.Modal.Apartado.PDistritoA;
import Presentacion.pTrabajador;
import com.sun.awt.AWTUtilities;
import javax.swing.JOptionPane;

/**
 *
 * @author andyv
 */
public class PTrabajadorA extends javax.swing.JFrame {
    private Trabajador codigo=new Trabajador();
    private NTrabajador tt=new NTrabajador();
    private NDistrito dd=new NDistrito();
    
    public PTrabajadorA(Trabajador codigo) {
        Inicial();
        this.codigo=codigo;
    }
    
    
    public PTrabajadorA() {
        Inicial();
    }
    
    public void Inicial(){
       initComponents(); 
    AWTUtilities.setWindowOpaque(this, false);
    this.setLocationRelativeTo(this);
    Iniciarcbo();
    }
    
    private void Iniciarcbo(){
        for(int i=0;i<dd.cboDistrito().size();i++){cboDistrito.addItem(dd.cboDistrito().get(i));}
        for(int i=0;i<tt.cboArea().size();i++){cboArea.addItem(tt.cboArea().get(i));}
    }
    
    public Trabajador Items(){
        int est=0;
        codigo.setNombre(txtNombre.getText());
        codigo.setAPaterno(txtAP.getText());
        codigo.setAMaterno(txtAM.getText());
        codigo.setUsuario(txtUsuario.getText());
        codigo.setClave(txtClave.getText());
        codigo.setDistrito(cboDistrito.getSelectedIndex()+1);
        codigo.setSueldo(Double.parseDouble(txtSueldo.getText()));
        return codigo;
    }
    
    public void Agregar(){
        if(tt.Insertar(Items())){
            JOptionPane.showMessageDialog(rootPane,"Se Actualizo Correctamente");
        }else{
            JOptionPane.showMessageDialog(rootPane,"No Actualizo Correctamente");
        }
    }
    
    public void Modificar(){
        if(tt.Actualizar(Items())){
               JOptionPane.showMessageDialog(rootPane,"Se Actualizo Correctamente");
        }else{
            JOptionPane.showMessageDialog(rootPane,"No Actualizo Correctamente");
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new test.PanelRound();
        btnCancelar = new button.MyButton();
        txtNombre = new textfield.TextField();
        txtAM = new textfield.TextField();
        cboArea = new combobox.Combobox();
        cboDistrito = new combobox.Combobox();
        btnAgregar = new button.MyButton();
        txtSueldo = new textfield.TextField();
        txtAP = new textfield.TextField();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new textfield.TextField();
        txtClave = new textfield.PasswordField();
        btnADis = new button.MyButton();

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
        panelRound1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 100, 40));

        txtNombre.setBackground(new java.awt.Color(21, 23, 36));
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setLabelText("Nombre");
        txtNombre.setLineColor(new java.awt.Color(255, 0, 51));
        panelRound1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 230, -1));

        txtAM.setBackground(new java.awt.Color(21, 23, 36));
        txtAM.setForeground(new java.awt.Color(255, 255, 255));
        txtAM.setLabelText("Apellido Materno");
        txtAM.setLineColor(new java.awt.Color(255, 0, 51));
        panelRound1.add(txtAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 110, -1));

        cboArea.setBackground(new java.awt.Color(21, 23, 36));
        cboArea.setForeground(new java.awt.Color(255, 255, 255));
        cboArea.setLabeText("Area");
        cboArea.setLineColor(new java.awt.Color(255, 0, 0));
        panelRound1.add(cboArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 230, -1));

        cboDistrito.setBackground(new java.awt.Color(21, 23, 36));
        cboDistrito.setForeground(new java.awt.Color(255, 255, 255));
        cboDistrito.setLabeText("Distrito");
        cboDistrito.setLineColor(new java.awt.Color(255, 0, 0));
        panelRound1.add(cboDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 180, -1));

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
        panelRound1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 100, 40));

        txtSueldo.setBackground(new java.awt.Color(21, 23, 36));
        txtSueldo.setForeground(new java.awt.Color(255, 255, 255));
        txtSueldo.setText("0.00");
        txtSueldo.setLabelText("Sueldo");
        txtSueldo.setLineColor(new java.awt.Color(255, 0, 51));
        panelRound1.add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 90, -1));

        txtAP.setBackground(new java.awt.Color(21, 23, 36));
        txtAP.setForeground(new java.awt.Color(255, 255, 255));
        txtAP.setLabelText("Apellido Paterno");
        txtAP.setLineColor(new java.awt.Color(255, 0, 51));
        panelRound1.add(txtAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 110, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("S/.");
        panelRound1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(21, 23, 36));
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setLabelText("Usuario");
        txtUsuario.setLineColor(new java.awt.Color(255, 0, 51));
        panelRound1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 150, -1));

        txtClave.setBackground(new java.awt.Color(21, 23, 36));
        txtClave.setLabelText("Contraseña");
        txtClave.setLineColor(new java.awt.Color(255, 0, 0));
        panelRound1.add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 140, -1));

        btnADis.setBorder(null);
        btnADis.setForeground(new java.awt.Color(255, 255, 255));
        btnADis.setText("+");
        btnADis.setBorderColor(new java.awt.Color(255, 0, 51));
        btnADis.setColor(new java.awt.Color(255, 0, 51));
        btnADis.setColorClick(new java.awt.Color(255, 51, 51));
        btnADis.setColorOver(new java.awt.Color(255, 102, 102));
        btnADis.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnADis.setRadius(20);
        btnADis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADisActionPerformed(evt);
            }
        });
        panelRound1.add(btnADis, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       if(codigo.getCodigo()==0){
           Agregar();
       }else{
            Modificar();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        new pTrabajador().setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnADisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADisActionPerformed
        this.dispose();
        new PDistritoA(PDistritoA.TrabajadorDis).setVisible(true);
    }//GEN-LAST:event_btnADisActionPerformed

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
            java.util.logging.Logger.getLogger(PTrabajadorA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PTrabajadorA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PTrabajadorA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PTrabajadorA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PTrabajadorA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.MyButton btnADis;
    private button.MyButton btnAgregar;
    private button.MyButton btnCancelar;
    private combobox.Combobox cboArea;
    private combobox.Combobox cboDistrito;
    private javax.swing.JLabel jLabel2;
    private test.PanelRound panelRound1;
    private textfield.TextField txtAM;
    private textfield.TextField txtAP;
    private textfield.PasswordField txtClave;
    private textfield.TextField txtNombre;
    private textfield.TextField txtSueldo;
    private textfield.TextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
