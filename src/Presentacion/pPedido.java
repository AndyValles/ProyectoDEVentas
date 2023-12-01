/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Entidad.Boleta;
import Entidad.Cliente;
import Entidad.Pedido;
import Entidad.Producto;
import Negocio.DefaultTable;
import Negocio.NBoleta;
import Negocio.NCliente;
import Negocio.NPedido;
import Negocio.NProducto;
import Negocio.NReporte;
import com.Presentacion.Diseño.Desing;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author andyv
 */
public class pPedido extends javax.swing.JFrame {
    private int cantidad=1,i=0,cod=1;
    private double monto=0;
    private String text="Nombre";

    
    private Desing ds=new Desing(); 
    
    private Cliente c=new Cliente();
    
    private NProducto pro=new NProducto();
    private NCliente cc=new NCliente();
    private NPedido pp=new NPedido();
    private NBoleta bb=new NBoleta();
    private NReporte rr=new NReporte();
    
    private DefaultTable dt=new DefaultTable();
    private DefaultTableModel dtm=new DefaultTableModel();
    private DefaultTableModel dtmCli=new DefaultTableModel();
    
    private LocalDate ld=LocalDate.now();
    
    public pPedido(Cliente c){
         this.c=c;
        Inicial();
    }
    
    public pPedido() {
        Inicial(); 
    }
    private void Inicial(){
        initComponents();
        InicialComponents();
        InicialImage();
        MostarTable();
    }
    
    
    private void InicialComponents(){
        AWTUtilities.setWindowOpaque(this,false);
        this.setLocationRelativeTo(this);
        if(c!=null){GetDatos();}
    }
    
    
    private void GetDatos(){
        dtmCli.setColumnIdentifiers(new String[]{" "," "," "," "," "," "});
        
        if(cc.Buscar(dtmCli, c)){text=dtmCli.getValueAt(0, 1)+"";}
        
        lblNombre.setText(text);
    }
    
    
    private void InicialImage(){
        JLabel[] lbl=new JLabel[]{iLogo,iPedido};
        String[] archivo=new String[]{"logo.png","Pedido.png"};
        String[] ruta=new String[]{"src/Resources","src/Resources"};
        ds.AsignarImagen(lbl,ruta,archivo);
    }
    
    private Producto Items(){
        Producto p=new Producto();
        if(!txtCodigo.getText().isEmpty()){p.setCodigo(Integer.parseInt(txtCodigo.getText()));}
        return p;
    }
    
    private Pedido items(){
    Pedido pedido=new Pedido();
        pedido.setCodigo(cod);
        pedido.setCliente(c.getCodigo());
        pedido.setProducto(Items().getCodigo());
        pedido.setCantidad(cantidad);
        cod++;
    return pedido;
    }
    
    private Boleta item(){
        Boleta b=new Boleta();
            b.setCliente(c.getCodigo());
            b.setPedido(items().getCodigo());
            b.setFecha(ld.getYear()+"-"+ld.getMonthValue()+"-"+ld.getDayOfMonth());
            b.setMonto(monto);
        return b;
    }
    
    private void MostarTable(){
        dtm.setColumnIdentifiers(new String[]{" "," "," "," "," "," "," "});
        tblResult.setModel(dt.Titles(new String[]{"Codigo","Descripción","Precio","Stock","Categoria","Marca","Estado"}));
    }
    
     private void agregar(){
        try{
        if(pro.Buscar(dtm, Items())){
            monto=monto + Double.parseDouble((String) dtm.getValueAt(i, 2));i++;
            cantidad=dt.Repetidos(dtm, Items().getCodigo()+"");    
//            pp.Insertar(items());
//            bb.Insertar(item());
        }
        
        lblPrecio.setText(monto+"");
        }catch(Exception e){}
    } 
     
      private void Eliminar(){
        int r=tblResult.getSelectedRow();
        dt.Eliminar(dtm, r);
    }
     
    private void Comprar(){
        rr.Reporte(text);
   

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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new test.PanelRound();
        panelRound2 = new test.PanelRound();
        pCambiar = new test.PanelRound();
        lCambiar = new javax.swing.JLabel();
        pSalir = new test.PanelRound();
        lSalir = new javax.swing.JLabel();
        pPedido = new test.PanelRound();
        bPedido1 = new javax.swing.JLabel();
        iPedido = new javax.swing.JLabel();
        lPedido = new javax.swing.JLabel();
        panelRound3 = new test.PanelRound();
        txtCodigo = new textfield.TextField();
        btnBorrar = new button.MyButton();
        btnComprar = new button.MyButton();
        btnLimpiar = new button.MyButton();
        btnActualizar = new button.MyButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResult = new javax.swing.JTable();
        btnAgregar = new button.MyButton();
        lblPrecio = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        iLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        pCambiar.setBackground(new java.awt.Color(255, 0, 51));
        pCambiar.setRoundBottomLeft(40);
        pCambiar.setRoundBottomRight(40);
        pCambiar.setRoundTopLeft(40);
        pCambiar.setRoundTopRight(40);
        pCambiar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lCambiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lCambiar.setForeground(new java.awt.Color(255, 255, 255));
        lCambiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lCambiar.setText("Cambiar");
        lCambiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lCambiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lCambiarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lCambiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lCambiarMouseExited(evt);
            }
        });
        pCambiar.add(lCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, -10, 90, 60));

        panelRound2.add(pCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 110, 40));

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

        pPedido.setBackground(new java.awt.Color(255, 255, 255));
        pPedido.setRoundBottomLeft(40);
        pPedido.setRoundBottomRight(40);
        pPedido.setRoundTopLeft(40);
        pPedido.setRoundTopRight(40);
        pPedido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bPedido1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pPedido.add(bPedido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        iPedido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        iPedido.setForeground(new java.awt.Color(255, 255, 255));
        iPedido.setText("IMG");
        pPedido.add(iPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 50, 50));

        lPedido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lPedido.setForeground(new java.awt.Color(255, 0, 0));
        lPedido.setText("Compra");
        pPedido.add(lPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 20));

        panelRound2.add(pPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 190, 40));

        panelRound1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 220, 410));

        panelRound3.setBackground(new java.awt.Color(1, 46, 51));
        panelRound3.setRoundBottomLeft(40);
        panelRound3.setRoundBottomRight(40);
        panelRound3.setRoundTopLeft(40);
        panelRound3.setRoundTopRight(40);
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigo.setBackground(new java.awt.Color(1, 46, 51));
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setLabelText("Codigo del Producto");
        txtCodigo.setLineColor(new java.awt.Color(255, 0, 51));
        panelRound3.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 350, -1));

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
        panelRound3.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 90, 30));

        btnComprar.setBorder(null);
        btnComprar.setForeground(new java.awt.Color(255, 255, 255));
        btnComprar.setText("Comprar");
        btnComprar.setBorderColor(new java.awt.Color(255, 0, 51));
        btnComprar.setColor(new java.awt.Color(255, 0, 51));
        btnComprar.setColorClick(new java.awt.Color(255, 51, 51));
        btnComprar.setColorOver(new java.awt.Color(255, 51, 51));
        btnComprar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnComprar.setRadius(20);
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        panelRound3.add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 90, 30));

        btnLimpiar.setBorder(null);
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorderColor(new java.awt.Color(255, 0, 51));
        btnLimpiar.setColor(new java.awt.Color(255, 0, 51));
        btnLimpiar.setColorClick(new java.awt.Color(255, 51, 51));
        btnLimpiar.setColorOver(new java.awt.Color(255, 102, 102));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLimpiar.setRadius(20);
        panelRound3.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 90, 30));

        btnActualizar.setBorder(null);
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorderColor(new java.awt.Color(255, 0, 51));
        btnActualizar.setColor(new java.awt.Color(255, 0, 51));
        btnActualizar.setColorClick(new java.awt.Color(255, 51, 51));
        btnActualizar.setColorOver(new java.awt.Color(255, 51, 51));
        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnActualizar.setRadius(20);
        panelRound3.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 90, 30));

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

        panelRound3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 360, 360));

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
        panelRound3.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 90, 30));

        lblPrecio.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrecio.setText("0");
        panelRound3.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 110, 70));

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Nombre");
        panelRound3.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 110, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("S/. ");
        panelRound3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 110, 70));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total:");
        panelRound3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 110, 70));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cliente:");
        panelRound3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 110, 70));

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

    private void lCambiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lCambiarMouseClicked
        this.dispose();
        new Venta(false).setVisible(true);
    }//GEN-LAST:event_lCambiarMouseClicked

    private void lCambiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lCambiarMouseEntered
        lCambiar.setForeground(new Color(255,0,0));
        pCambiar.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_lCambiarMouseEntered

    private void lCambiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lCambiarMouseExited
        lCambiar.setForeground(new Color(255,255,255));
        pCambiar.setBackground(new Color(255,0,51));
    }//GEN-LAST:event_lCambiarMouseExited

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        Comprar();
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        Eliminar();
    }//GEN-LAST:event_btnBorrarActionPerformed

  
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
            java.util.logging.Logger.getLogger(pPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bPedido1;
    private button.MyButton btnActualizar;
    private button.MyButton btnAgregar;
    private button.MyButton btnBorrar;
    private button.MyButton btnComprar;
    private button.MyButton btnLimpiar;
    private javax.swing.JLabel iLogo;
    private javax.swing.JLabel iPedido;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lCambiar;
    private javax.swing.JLabel lPedido;
    private javax.swing.JLabel lSalir;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private test.PanelRound pCambiar;
    private test.PanelRound pPedido;
    private test.PanelRound pSalir;
    private test.PanelRound panelRound1;
    private test.PanelRound panelRound2;
    private test.PanelRound panelRound3;
    private javax.swing.JTable tblResult;
    private textfield.TextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
