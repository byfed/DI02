/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.extendida;

import com.trolltech.qt.gui.QDialog;
import com.trolltech.qt.gui.QStandardItemModel;
import gui.generada.Dialog;
import dto.FilaTabla;

/**
 *
 * @author bbyfe
 */
public class ListaImpresa extends Dialog{
    
    
    private QDialog ListaImpresa;
    QStandardItemModel modelo;

    @Override
    public void setupUi(QDialog DialogoImprimir)
    {
        super.setupUi(DialogoImprimir);
        this.ListaImpresa = DialogoImprimir;
        modelo = new QStandardItemModel();
        this.clearText();
    }
    
    private void setText(String texto){
           this.label_ListaProductos.setText(texto);
    }
    
    private String getText(){
        return this.label_ListaProductos.text();
    }

    public void clearText(){
        this.label_ListaProductos.clear();
    }
    
    public void salir(){
        ListaImpresa.close();
    }
    
    public void imprimeRow(FilaTabla fila){
        String texto=this.getText();
        
        texto += fila.getCantidad() + " \t " + fila.getNombre() + "\t (" + fila.getSeccion() + ")";
        if (fila.isUrgente()) {
            texto += "\tURGENTE\n";
        } else {
           texto += "\tNO URGENTE\n";
        }
    
        
        this.setText(texto);
    }

}
