
package Negocio;

import javax.swing.table.DefaultTableModel;

public class DefaultTable {
    private DefaultTableModel dt=new DefaultTableModel();
    
    public DefaultTableModel Titles(String ...Titles){
        dt.setColumnIdentifiers(Titles);
        return dt;
    }
    
    public DefaultTableModel Mostrar(DefaultTableModel raw){
        String[] items=new String[100];
        
        while(dt.getRowCount()!=0){dt.removeRow(0);}
        
        for(int a=0;a<raw.getRowCount();a++){
            for(int b=0;b<raw.getColumnCount();b++){
               items[b]=raw.getValueAt(a, b)+"";
            }
            dt.addRow(items);
        }
       
        return dt;
    }
    
    public void Eliminar(DefaultTableModel raw,int r){
       raw.removeRow(r);
    }
    
    public int Repetidos(DefaultTableModel raw,String txt){
       int cantidad=0;
        for(int a=0;a<raw.getRowCount();a++){
           if(txt.equals(raw.getValueAt(a, 0))){
                cantidad++;
                if(cantidad>1){
                    
                }
            }
           }
        return cantidad;
    }
}
