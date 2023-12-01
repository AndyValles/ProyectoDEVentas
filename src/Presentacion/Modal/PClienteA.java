/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Modal;

import Entidad.Cliente;
import Negocio.NCliente;
import Negocio.NDistrito;
import Presentacion.Modal.Apartado.PDistritoA;
import Presentacion.pCliente;
import com.sun.awt.AWTUtilities;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author andyv
 */
public class PClienteA extends javax.swing.JFrame {
    private LocalDate ld=LocalDate.now();
    private Cliente codigo=new Cliente();
    private NCliente cc=new NCliente(); 
    private NDistrito dd=new NDistrito();
    
    public PClienteA(Cliente codigo) {
        Inicial();
       this.codigo=codigo;
    }
    
    public PClienteA() {
        Inicial();
    }
    
    public void Inicial(){
    initComponents();
    AWTUtilities.setWindowOpaque(this, false);
    this.setLocationRelativeTo(this);
    IniciarCBO();
    }
    
    public void IniciarCBO(){
        String[] meses=new String[]{"Ene","Feb","Mar","Abr","May","Jun","Jul","Ago","Sep","Oct","Nov","Dic"};
        for(int i=1;i<=30;i++){cboDia.addItem(i);}
        for(int i=1900;i<=ld.getYear();i++){cboAño.addItem(i);}
        for(int i=0;i<meses.length;i++){cboMes.addItem(meses[i]);}
        for(int i=0;i<dd.cboDistrito().size();i++){cboDistrito.addItem(dd.cboDistrito().get(i));}
    
        cboDia.setSelectedIndex(ld.getDayOfMonth()-1);
        cboMes.setSelectedIndex(ld.getMonthValue()-1);
        cboAño.setSelectedItem(ld.getYear());
    }
    
    public Cliente Items(){
        int est=0;
        codigo.setNombre(txtNombre.getText());
        codigo.setApellido(txtApellido.getText());
        codigo.setFNacimiento(cboAño.getSelectedItem()+"-"+(cboMes.getSelectedIndex()+1)+"-"+cboDia.getSelectedItem());
        if(cbEstado.isSelected()){
            est=1;
        }
        codigo.setEstado(est+"");
        codigo.setDistrito(cboDistrito.getSelectedIndex()+1);
        return codigo;
    }
    
    private void Ingresar(){
        if(cc.Insertar(Items())){
        JOptionPane.showMessageDialog(null,"Se Ingreso correctamente");
        }else{
        JOptionPane.showMessageDialog(null,"No Ingreso correctamente");
        }
    }
    
    private void Modificar(){
        if(cc.Actualizar(Items())){
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
        btnADis = new button.MyButton();
        txtNombre = new textfield.TextField();
        txtApellido = new textfield.TextField();
        cbEstado = new javax.swing.JCheckBox();
        cboAño = new combobox.Combobox();
        cboDistrito = new combobox.Combobox();
        cboDia = new combobox.Combobox();
        cboMes = new combobox.Combobox();
        btnAgregar = new button.MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        panelRound1.add(btnADis, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 40, 30));

        txtNombre.setBackground(new java.awt.Color(21, 23, 36));
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setLabelText("Nombre");
        txtNombre.setLineColor(new java.awt.Color(255, 0, 51));
        panelRound1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 220, -1));

        txtApellido.setBackground(new java.awt.Color(21, 23, 36));
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido.setLabelText("Apellidos");
        txtApellido.setLineColor(new java.awt.Color(255, 0, 51));
        panelRound1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 220, -1));

        cbEstado.setBackground(new java.awt.Color(21, 23, 36));
        cbEstado.setForeground(new java.awt.Color(255, 255, 255));
        cbEstado.setText("Estado");
        panelRound1.add(cbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        cboAño.setBackground(new java.awt.Color(21, 23, 36));
        cboAño.setForeground(new java.awt.Color(255, 255, 255));
        cboAño.setLabeText("Año");
        cboAño.setLineColor(new java.awt.Color(255, 0, 0));
        panelRound1.add(cboAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 70, -1));

        cboDistrito.setBackground(new java.awt.Color(21, 23, 36));
        cboDistrito.setForeground(new java.awt.Color(255, 255, 255));
        cboDistrito.setLabeText("Distrito");
        cboDistrito.setLineColor(new java.awt.Color(255, 0, 0));
        panelRound1.add(cboDistrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 170, -1));

        cboDia.setBackground(new java.awt.Color(21, 23, 36));
        cboDia.setForeground(new java.awt.Color(255, 255, 255));
        cboDia.setLabeText("Dia");
        cboDia.setLineColor(new java.awt.Color(255, 0, 0));
        panelRound1.add(cboDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 70, -1));

        cboMes.setBackground(new java.awt.Color(21, 23, 36));
        cboMes.setForeground(new java.awt.Color(255, 255, 255));
        cboMes.setLabeText("Mes");
        cboMes.setLineColor(new java.awt.Color(255, 0, 0));
        panelRound1.add(cboMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 70, -1));

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
        new pCliente().setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnADisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADisActionPerformed
        this.dispose();
        new PDistritoA(PDistritoA.ClienteDist).setVisible(true);
    }//GEN-LAST:event_btnADisActionPerformed

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
            java.util.logging.Logger.getLogger(PClienteA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PClienteA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PClienteA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PClienteA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PClienteA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.MyButton btnADis;
    private button.MyButton btnAgregar;
    private button.MyButton btnCancelar;
    private javax.swing.JCheckBox cbEstado;
    private combobox.Combobox cboAño;
    private combobox.Combobox cboDia;
    private combobox.Combobox cboDistrito;
    private combobox.Combobox cboMes;
    private test.PanelRound panelRound1;
    private textfield.TextField txtApellido;
    private textfield.TextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
