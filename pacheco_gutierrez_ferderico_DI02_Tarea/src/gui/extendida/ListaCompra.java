/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.extendida;


import com.trolltech.qt.core.Qt;
import com.trolltech.qt.gui.QDialog;
import com.trolltech.qt.gui.QIcon;
import com.trolltech.qt.gui.QMainWindow;
import com.trolltech.qt.gui.QMessageBox;
import com.trolltech.qt.gui.QPixmap;
import com.trolltech.qt.gui.QStandardItemModel;
import com.trolltech.qt.gui.QTableView;
import static com.trolltech.qt.core.Qt.CheckState.Checked;
import com.trolltech.qt.gui.QStandardItem;
import dto.FilaTabla;
import gui.generada.MainWindow;
import java.util.HashSet;
import java.util.List;
import main.LogicaNegocio;
/**
 *
 * @author bbyfe
 */
public class ListaCompra extends MainWindow{
    
    private LogicaNegocio logica;
    private QStandardItemModel modelo;  
    private QTableView tabla;
    
     @Override
    public void setupUi(QMainWindow qmw){
        super.setupUi(qmw);
        //poner iconos
        qmw.setWindowIcon(new QIcon(new QPixmap("classpath:recursos/header.png")));
        this.pushButtonAnadir.setIcon(new QIcon (new QPixmap("classpath:recursos/iconoBoton.png")) );
        
        logica = new LogicaNegocio(this);
        
        
        this.pushButtonImprimir.clicked.connect(this,"ImprimirProductos()"); 
        this.pushButtonAnadir.clicked.connect(this, "AnadirProducto()");
        this.pushButtonBorrarSeleccion.clicked.connect(this,"borrarSeleccionados()");
        this.pushButtonBorrarLista.clicked.connect(this,"borrarLista()");
        //this.pushButtonBorrarSeleccion.clicked.connect(this, "logica.borrarSeleccionados()");
        
//        gestionTabla= new LogicaTabla(this);
//    
//        /* mis conexiónes signal/slot   Al hacer clic en el botón Reservas se abre el dialogo de reservas. */
//        this.pushButton_BorrarTodo.clicked.connect(this, "borrarTodoSlot()");
//        this.pushButton_BorrarSeleccion.clicked.connect(this, "borrarSeleccionadosSlot()");
//        this.pushButton_Imprimir.clicked.connect(this,"imprimirSlot()");           
//        this.pushButton_Anadir.clicked.connect(this,"anadirSlot()");
    }
    
    private void dibujarTabla(List<FilaTabla> listado, List<String> titulos) {
        modelo.setHorizontalHeaderLabels(titulos);
        
        for(FilaTabla f: listado) {
        QStandardItem estado = new QStandardItem();
        estado.setCheckable(true);
        estado.setCheckState(Qt.CheckState.Unchecked);

        QStandardItem urgente = new QStandardItem();
        urgente.setCheckable(false);
        urgente.setCheckState(f.isUrgente()?Qt.CheckState.Checked: Qt.CheckState.Unchecked);

        int nFilas =modelo.rowCount();
        modelo.setItem(nFilas, 0, estado);
        modelo.setData(nFilas, 1, f.getCantidad());
        modelo.setData(nFilas, 2, f.getNombre());
        modelo.setData(nFilas, 3, f.getSeccion());
        modelo.setItem(nFilas, 4, urgente);               
        
        tabla.setModel(modelo);        
    }
        
        
        
    }
    
    
    private void ImprimirProductos() {
        
        QDialog listadoProductos = new QDialog();
        ListaImpresa listaImpresaUI = new ListaImpresa();
        listadoProductos.setModal(true);
        listaImpresaUI.setupUi( listadoProductos );
        
        for (int i = 0; i < logica.getNumFilas(); i++) {     
            FilaTabla fila = logica.getFila(i);
            listaImpresaUI.imprimeRow(fila);
        }

        int ok= listadoProductos.exec(); //aceptado o candelado
    }
    
    private void AnadirProducto() {
        boolean datosValidos = validarDatos();
        
        if (datosValidos) {
            FilaTabla fila = new FilaTabla();
            fila.setCantidad(this.spinBoxCantidad.value());
            fila.setNombre(this.lineEditNombre.text());
            fila.setSeccion(this.comboBoxSeccion.currentText());
            fila.setUrgente(this.checkBoxUrgente.isChecked());
            
            logica.insertarFila(fila);
            limpiarCampos();
        }
    }
    
    private void limpiarCampos() {
        this.spinBoxCantidad.setValue(1);
        this.lineEditNombre.setText("");
    }
    private boolean validarDatos() {
        QMessageBox msgBox = new QMessageBox() ;
        msgBox.setModal(true);
            
        if (spinBoxCantidad.value() < 1) {
            msgBox.setText("La cantidad debe ser mayor que cero");
            msgBox.exec();
            return false;
        } else if (lineEditNombre.text().equals("")) {
             msgBox.setText("El artículo debe tener nombre");
             msgBox.exec();
            return false;
        }
        return true;
    }
    
    private void borrarSeleccionados() {
        logica.borrarSeleccionados();
    }
    
    private void borrarLista() {
        logica.borrarTodo();
    }
}
