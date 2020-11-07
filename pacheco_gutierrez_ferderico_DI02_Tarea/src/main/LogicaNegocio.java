/*
 * Esta clase se ocupa de la lógica del manejo de la tabla, usando el 
 * QTableView de la interfaz y el modelo de la librería QT QStandardItemModel 
 */
package main;

import com.trolltech.qt.core.Qt;
import static com.trolltech.qt.core.Qt.CheckState.Checked;
import com.trolltech.qt.gui.QStandardItem;
import com.trolltech.qt.gui.QStandardItemModel;
import com.trolltech.qt.gui.QTableView;
import java.util.Arrays;
import java.util.List;
import gui.extendida.ListaCompra;
import dto.FilaTabla;
import java.util.ArrayList;

public class LogicaNegocio {
    
    private QStandardItemModel modelo;
    private QTableView tabla;
    private static List<String> titulosColumnas;
    
    public LogicaNegocio( ListaCompra interfaz){
        titulosColumnas =  Arrays.asList("X", "Cantidad", "Nombre", "Seccion", "Urgente");
        modelo = new QStandardItemModel();
        modelo.setHorizontalHeaderLabels(titulosColumnas); //poner cabeceras
        tabla= interfaz.tableView;
        tabla.setModel(modelo);
         
    }
    
    public QStandardItemModel getModel(){
        return modelo;   
    }
    
 
    public FilaTabla getFila(int i){
        FilaTabla fila= new FilaTabla();
        QStandardItem item=null;
                
        item = modelo.item(i, 1); //cantidad
        fila.setCantidad(Integer.parseInt(item.text()));
        
        item= modelo.item(i, 2); //nombre
        fila.setNombre(item.text());
        
        item= modelo.item(i, 3); //seccion
        fila.setSeccion(item.text());
        
        item= modelo.item(i, 4); //checkbox urgente
        boolean urgente = item.checkState() == Checked ? true: false;
        fila.setUrgente(urgente);

        return fila;
    }
    
  
   public int getNumFilas () {
       return modelo.rowCount();
   }
   
  
   public int getNumColumnas() {
       return modelo.columnCount();
   }

   public void refrescarTabla() {
       modelo.setHorizontalHeaderLabels(titulosColumnas);
       tabla.setModel(modelo);
   }
   
 
   public void insertarFila(FilaTabla fila) {

        QStandardItem estado = new QStandardItem();
        estado.setCheckable(true);
        estado.setCheckState(Qt.CheckState.Unchecked);

        QStandardItem urgente = new QStandardItem();
        urgente.setCheckable(false);
        urgente.setCheckState(fila.isUrgente()?Qt.CheckState.Checked: Qt.CheckState.Unchecked);

        int nFilas =modelo.rowCount();
        modelo.setItem(nFilas, 0, estado);
        modelo.setData(nFilas, 1, fila.getCantidad());
        modelo.setData(nFilas, 2, fila.getNombre());
        modelo.setData(nFilas, 3, fila.getSeccion());
        modelo.setItem(nFilas, 4, urgente);            
   }
   

   
   public void borrarTodo(){
        modelo.clear();
        this.refrescarTabla();
   }
   

   public void borrarSeleccionados(){
       
        //pedir el modelo, buscar checked y eliminarlos
        int numRows =this.getNumFilas();
        System.out.println("Entra borrarselecconados:"+numRows);
        for(int i=(numRows-1);i>=0;i--){
            QStandardItem fila = modelo.item(i);
            if (fila.checkState() == Qt.CheckState.Checked) modelo.removeRow(i);
            //System.out.println("stado: "+current.checkState());
        }
        this.refrescarTabla();
    }
   
}