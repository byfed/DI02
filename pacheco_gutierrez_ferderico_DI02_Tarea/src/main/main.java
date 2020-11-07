/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QMainWindow;
import gui.extendida.ListaCompra;

/**
 *
 * @author bbyfe
 */
public class main {

    
    public static void main(String[] args) {
        QApplication.initialize(args);
        ListaCompra ui = new ListaCompra();
        QMainWindow qmw = new QMainWindow();
        ui.setupUi( qmw );
        qmw.show();
        
        QApplication.execStatic();
    }
    
}
