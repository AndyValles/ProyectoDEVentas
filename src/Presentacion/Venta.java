/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Entidad.Cliente;
import Negocio.NCliente;
import com.sun.awt.AWTUtilities;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andyv
 */
public class Venta extends javax.swing.JFrame {
    private NCliente cc=new NCliente();
    private DefaultTableModel dtm=new DefaultTableModel();
    private boolean cambia=true;
    
    public Venta(boolean cambiar){
        this.cambia=cambiar;
        Iniciar();
    }
    
    public Venta() {
        Iniciar();
       
    }
    
    private void Iniciar(){
        initComponents();
        IniciarComponents();
        IniciarTable();
        
      
    }

    private void IniciarComponents(){
        this.setLocationRelativeTo(this);
        AWTUtilities.setWindowOpaque(this,false);
        btnVolver.setVisible(cambia);
    }
    
    private void IniciarTable(){
        dtm.setColumnIdentifiers(new String[]{"codigo","Nombre","Apellido","Fecha Nacimiento","Estado","Distrito"});
        tblResult.setModel(dtm);
        cc.Leer(dtm);
    }
    private Cliente codigo(){
    Cliente cli=new Cliente();
    if(!txtCodigo.getText().isEmpty()){cli.setCodigo(Integer.parseInt(txtCodigo.getText()));}
    return cli;
    }
    
    private void Buscar(){
    if(cc.Buscar(dtm,codigo())){
            JOptionPane.showMessageDialog(null,"se encontro");
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new test.PanelRound();
        txtCodigo = new textfield.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResult = new javax.swing.JTable();
        btnComprar = new button.MyButton();
        btnVolver = new button.MyButton();
        btnBuscar = new button.MyButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(40);
        panelRound1.setRoundBottomRight(40);
        panelRound1.setRoundTopLeft(40);
        panelRound1.setRoundTopRight(40);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigo.setLabelText("Codigo del Cliente");
        txtCodigo.setLineColor(new java.awt.Color(255, 0, 0));
        panelRound1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 290, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jScrollPane1.setForeground(new java.awt.Color(204, 204, 204));

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
        tblResult.setFillsViewportHeight(true);
        tblResult.setGridColor(new java.awt.Color(255, 255, 255));
        tblResult.setSelectionBackground(new java.awt.Color(255, 0, 51));
        jScrollPane1.setViewportView(tblResult);

        panelRound1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 160));

        btnComprar.setBorder(null);
        btnComprar.setForeground(new java.awt.Color(255, 255, 255));
        btnComprar.setBorderColor(new java.awt.Color(255, 0, 0));
        btnComprar.setColor(new java.awt.Color(255, 0, 0));
        btnComprar.setColorClick(new java.awt.Color(255, 102, 102));
        btnComprar.setColorOver(new java.awt.Color(255, 102, 102));
        btnComprar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnComprar.setLabel("Comprar");
        btnComprar.setRadius(10);
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        panelRound1.add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 80, 20));

        btnVolver.setBorder(null);
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setBorderColor(new java.awt.Color(255, 0, 0));
        btnVolver.setColor(new java.awt.Color(255, 0, 0));
        btnVolver.setColorClick(new java.awt.Color(255, 102, 102));
        btnVolver.setColorOver(new java.awt.Color(255, 102, 102));
        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVolver.setLabel("Volver");
        btnVolver.setRadius(10);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        panelRound1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 80, 20));

        btnBuscar.setBorder(null);
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setBorderColor(new java.awt.Color(255, 0, 0));
        btnBuscar.setColor(new java.awt.Color(255, 0, 0));
        btnBuscar.setColorClick(new java.awt.Color(255, 102, 102));
        btnBuscar.setColorOver(new java.awt.Color(255, 102, 102));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscar.setLabel("Buscar");
        btnBuscar.setRadius(10);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        panelRound1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 80, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        
        this.dispose();
        new Principal().setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
       if(!txtCodigo.getText().isEmpty()){ 
            this.dispose();
            new pPedido(codigo()).setVisible(true);
       }else{
           JOptionPane.showMessageDialog(null,"Debe agregar un codigo");
       }
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.MyButton btnBuscar;
    private button.MyButton btnComprar;
    private button.MyButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    private test.PanelRound panelRound1;
    private javax.swing.JTable tblResult;
    private textfield.TextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
