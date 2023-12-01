/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Entidad.Cliente;
import Negocio.NCliente;
import Presentacion.Modal.PClienteA;
import com.Presentacion.Diseño.Desing;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andyv
 */
public class pCliente extends javax.swing.JFrame {
    
    private Desing ds=new Desing();
    private NCliente cc=new NCliente();
    
    private DefaultTableModel dtm=new DefaultTableModel();
    
    
    public pCliente() {
        initComponents();
        Inicial();
        InicialComponents();
        InicialImage();
    }
    private void Inicial(){
        MostarTable();
    }

    private void InicialComponents(){
        AWTUtilities.setWindowOpaque(this,false);
        this.setLocationRelativeTo(this);
    
    }
    
    private void InicialImage(){
        JLabel[] lbl=new JLabel[]{iLogo,iTrabajador,iCliente,iProducto};
        String[] archivo=new String[]{"logo.png","trabajador.png","Cliente.png","producto.png"};
        String[] ruta=new String[]{"src/Resources","src/Resources","src/Resources","src/Resources"};
        ds.AsignarImagen(lbl,ruta,archivo);
    }
    
    private void MostarTable(){
        dtm.setColumnIdentifiers(new String[]{"Codigo","Nombre","Apellido","Fecha Nacimiento","Estado","Distrito"});
        tblResult.setModel(dtm);
        cc.Leer(dtm);
    }
    
    private void VisualFrame(JFrame fr,MouseEvent evt){
        if(evt.getButton()==1){
        this.dispose();
        fr.setVisible(true);
       }
    }
    
    private void SelectColor(JLabel lbl,JPanel panel,int tam,boolean select){
         lbl.setFont(new Font("Tahoma",1,tam));
         if(select){panel.setBackground(new Color(210,0,0));}
         else{panel.setBackground(new Color(250,0,0));}
    }
    
    //CRUD
    
    private Cliente Items(){
        Cliente cli=new Cliente();
        if(!txtCodigo.getText().isEmpty()){
            cli.setCodigo(Integer.parseInt(txtCodigo.getText()));
        }
        return cli;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new test.PanelRound();
        panelRound2 = new test.PanelRound();
        pSalir = new test.PanelRound();
        lSalir = new javax.swing.JLabel();
        pTrabajador = new test.PanelRound();
        bTrabajador = new javax.swing.JLabel();
        iTrabajador = new javax.swing.JLabel();
        lTrabajador = new javax.swing.JLabel();
        pCliente = new test.PanelRound();
        bCliente = new javax.swing.JLabel();
        iCliente = new javax.swing.JLabel();
        lCliente = new javax.swing.JLabel();
        paProducto = new test.PanelRound();
        bProducto = new javax.swing.JLabel();
        iProducto = new javax.swing.JLabel();
        lProducto = new javax.swing.JLabel();
        panelRound3 = new test.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new textfield.TextField();
        btnBorrar = new button.MyButton();
        btnBuscar = new button.MyButton();
        btnActualizar = new button.MyButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResult = new javax.swing.JTable();
        btnAgregar = new button.MyButton();
        iLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound2.setBackground(new java.awt.Color(255, 0, 0));
        panelRound2.setRoundBottomLeft(20);
        panelRound2.setRoundTopRight(120);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pSalir.setBackground(new java.awt.Color(255, 0, 51));
        pSalir.setRoundBottomLeft(40);
        pSalir.setRoundBottomRight(40);
        pSalir.setRoundTopLeft(40);
        pSalir.setRoundTopRight(40);
        pSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lSalir.setForeground(new java.awt.Color(255, 255, 255));
        lSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lSalir.setText("Salir");
        lSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lSalirMouseExited(evt);
            }
        });
        pSalir.add(lSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, -10, 90, 60));

        panelRound2.add(pSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 110, 40));

        pTrabajador.setBackground(new java.awt.Color(255, 0, 0));
        pTrabajador.setRoundBottomLeft(40);
        pTrabajador.setRoundBottomRight(40);
        pTrabajador.setRoundTopLeft(40);
        pTrabajador.setRoundTopRight(40);
        pTrabajador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bTrabajador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bTrabajador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bTrabajadorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bTrabajadorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bTrabajadorMouseExited(evt);
            }
        });
        pTrabajador.add(bTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        iTrabajador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        iTrabajador.setForeground(new java.awt.Color(255, 255, 255));
        iTrabajador.setText("IMG");
        pTrabajador.add(iTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 50, 50));

        lTrabajador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lTrabajador.setForeground(new java.awt.Color(255, 255, 255));
        lTrabajador.setText("Trabajador");
        pTrabajador.add(lTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 20));

        panelRound2.add(pTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 190, 40));

        pCliente.setBackground(new java.awt.Color(255, 255, 255));
        pCliente.setRoundBottomLeft(40);
        pCliente.setRoundBottomRight(40);
        pCliente.setRoundTopLeft(40);
        pCliente.setRoundTopRight(40);
        pCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bCliente.setBackground(new java.awt.Color(255, 255, 255));
        bCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pCliente.add(bCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 190, 50));

        iCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        iCliente.setForeground(new java.awt.Color(255, 255, 255));
        iCliente.setText("IMG");
        pCliente.add(iCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 50, 50));

        lCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lCliente.setForeground(new java.awt.Color(255, 0, 0));
        lCliente.setText("Cliente");
        pCliente.add(lCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 70, 40));

        panelRound2.add(pCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 190, 40));

        paProducto.setBackground(new java.awt.Color(255, 0, 0));
        paProducto.setRoundBottomLeft(40);
        paProducto.setRoundBottomRight(40);
        paProducto.setRoundTopLeft(40);
        paProducto.setRoundTopRight(40);
        paProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bProductoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bProductoMouseExited(evt);
            }
        });
        paProducto.add(bProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 190, 50));

        iProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        iProducto.setForeground(new java.awt.Color(255, 0, 0));
        iProducto.setText("IMG");
        paProducto.add(iProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 40));

        lProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lProducto.setForeground(new java.awt.Color(255, 255, 255));
        lProducto.setText("Producto");
        paProducto.add(lProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 90, 40));

        panelRound2.add(paProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 190, 40));

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 220, 410));

        panelRound3.setBackground(new java.awt.Color(97, 109, 117));
        panelRound3.setRoundBottomLeft(40);
        panelRound3.setRoundBottomRight(40);
        panelRound3.setRoundTopLeft(40);
        panelRound3.setRoundTopRight(40);
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cliente");
        panelRound3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        txtCodigo.setBackground(new java.awt.Color(97, 109, 117));
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setLabelText("Codigo");
        txtCodigo.setLineColor(new java.awt.Color(255, 0, 51));
        panelRound3.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 320, -1));

        btnBorrar.setBorder(null);
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setBorderColor(new java.awt.Color(255, 0, 51));
        btnBorrar.setColor(new java.awt.Color(255, 0, 51));
        btnBorrar.setColorClick(new java.awt.Color(255, 51, 51));
        btnBorrar.setColorOver(new java.awt.Color(255, 51, 51));
        btnBorrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBorrar.setLabel("Borrar");
        btnBorrar.setRadius(20);
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        panelRound3.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 90, 20));

        btnBuscar.setBorder(null);
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorderColor(new java.awt.Color(255, 0, 51));
        btnBuscar.setBorderPainted(false);
        btnBuscar.setColor(new java.awt.Color(255, 0, 51));
        btnBuscar.setColorClick(new java.awt.Color(255, 51, 51));
        btnBuscar.setColorOver(new java.awt.Color(255, 102, 102));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscar.setRadius(20);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        panelRound3.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 90, 20));

        btnActualizar.setBorder(null);
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorderColor(new java.awt.Color(255, 0, 51));
        btnActualizar.setColor(new java.awt.Color(255, 0, 51));
        btnActualizar.setColorClick(new java.awt.Color(255, 51, 51));
        btnActualizar.setColorOver(new java.awt.Color(255, 51, 51));
        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnActualizar.setRadius(20);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        panelRound3.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 90, 20));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

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
        tblResult.setFocusable(false);
        tblResult.setGridColor(new java.awt.Color(255, 255, 255));
        tblResult.setSelectionBackground(new java.awt.Color(255, 0, 51));
        tblResult.setShowHorizontalLines(false);
        tblResult.setShowVerticalLines(false);
        tblResult.getTableHeader().setResizingAllowed(false);
        tblResult.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblResult);

        panelRound3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 560, 240));

        btnAgregar.setBorder(null);
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setBorderColor(new java.awt.Color(255, 0, 51));
        btnAgregar.setColor(new java.awt.Color(255, 0, 51));
        btnAgregar.setColorClick(new java.awt.Color(255, 51, 51));
        btnAgregar.setColorOver(new java.awt.Color(255, 51, 51));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAgregar.setRadius(20);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        panelRound3.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 90, 30));

        panelRound1.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 650, 460));

        iLogo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        iLogo.setIcon(new javax.swing.ImageIcon("C:\\Users\\andyv\\OneDrive\\Documentos\\Recursos\\Oecsle\\logo.png")); // NOI18N
        iLogo.setText("Logo");
        iLogo.setToolTipText("");
        panelRound1.add(iLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lSalirMouseEntered
        lSalir.setForeground(new Color(255,0,0));
        pSalir.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_lSalirMouseEntered

    private void lSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lSalirMouseExited
        lSalir.setForeground(new Color(255,255,255));
        pSalir.setBackground(new Color(255,0,51));
    }//GEN-LAST:event_lSalirMouseExited

    private void lSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lSalirMouseClicked
        this.dispose();
        new Principal().setVisible(true);
    }//GEN-LAST:event_lSalirMouseClicked

    private void bProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bProductoMouseEntered
       SelectColor(lProducto,paProducto,18,true);
    }//GEN-LAST:event_bProductoMouseEntered

    private void bProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bProductoMouseExited
       SelectColor(lProducto,paProducto,14,false);
    }//GEN-LAST:event_bProductoMouseExited

    private void bProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bProductoMouseClicked
            VisualFrame(new pProducto(),evt);
    }//GEN-LAST:event_bProductoMouseClicked

    private void bTrabajadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bTrabajadorMouseClicked
        VisualFrame(new pTrabajador(),evt);
    }//GEN-LAST:event_bTrabajadorMouseClicked

    private void bTrabajadorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bTrabajadorMouseEntered
        SelectColor(lTrabajador,pTrabajador,18,true);
    }//GEN-LAST:event_bTrabajadorMouseEntered

    private void bTrabajadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bTrabajadorMouseExited
        SelectColor(lTrabajador,pTrabajador,14,false);
    }//GEN-LAST:event_bTrabajadorMouseExited

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(!txtCodigo.getText().isEmpty()){
            if(!cc.Buscar(dtm, Items())){
                JOptionPane.showMessageDialog(null,"El codigo debe ser correcto o no existe");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Debe agregar un codigo");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
       if(!txtCodigo.getText().isEmpty()){
            if(cc.Eliminar(Items())){
                JOptionPane.showMessageDialog(null,"Se elimino correctamente");
            }else{
                JOptionPane.showMessageDialog(null,"El codigo debe ser correcto o no existe");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Debe agregar un codigo");
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
       this.dispose();
        new PClienteA().setVisible(true);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       this.dispose();
        new PClienteA(Items()).setVisible(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

   
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bCliente;
    private javax.swing.JLabel bProducto;
    private javax.swing.JLabel bTrabajador;
    private button.MyButton btnActualizar;
    private button.MyButton btnAgregar;
    private button.MyButton btnBorrar;
    private button.MyButton btnBuscar;
    private javax.swing.JLabel iCliente;
    private javax.swing.JLabel iLogo;
    private javax.swing.JLabel iProducto;
    private javax.swing.JLabel iTrabajador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lCliente;
    private javax.swing.JLabel lProducto;
    private javax.swing.JLabel lSalir;
    private javax.swing.JLabel lTrabajador;
    private test.PanelRound pCliente;
    private test.PanelRound pSalir;
    private test.PanelRound pTrabajador;
    private test.PanelRound paProducto;
    private test.PanelRound panelRound1;
    private test.PanelRound panelRound2;
    private test.PanelRound panelRound3;
    private javax.swing.JTable tblResult;
    private textfield.TextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
