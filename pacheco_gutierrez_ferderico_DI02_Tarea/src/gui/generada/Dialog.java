package gui.generada;

/********************************************************************************
 ** Form generated from reading ui file 'ListaImpresa.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Dialog implements com.trolltech.qt.QUiForm<QDialog>
{
    public QGridLayout gridLayout;
    public QVBoxLayout verticalLayout;
    public QLabel label;
    public QSpacerItem verticalSpacer;
    public QLabel label_ListaProductos;
    public QSpacerItem verticalSpacer_2;
    public QPushButton pushButtonCerrar;

    public Dialog() { super(); }

    public void setupUi(QDialog Dialog)
    {
        Dialog.setObjectName("Dialog");
        Dialog.resize(new QSize(273, 248).expandedTo(Dialog.minimumSizeHint()));
        gridLayout = new QGridLayout(Dialog);
        gridLayout.setObjectName("gridLayout");
        verticalLayout = new QVBoxLayout();
        verticalLayout.setObjectName("verticalLayout");
        label = new QLabel(Dialog);
        label.setObjectName("label");

        verticalLayout.addWidget(label);

        verticalSpacer = new QSpacerItem(20, 13, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);

        verticalLayout.addItem(verticalSpacer);

        label_ListaProductos = new QLabel(Dialog);
        label_ListaProductos.setObjectName("label_ListaProductos");

        verticalLayout.addWidget(label_ListaProductos);

        verticalSpacer_2 = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        verticalLayout.addItem(verticalSpacer_2);

        pushButtonCerrar = new QPushButton(Dialog);
        pushButtonCerrar.setObjectName("pushButtonCerrar");

        verticalLayout.addWidget(pushButtonCerrar);


        gridLayout.addLayout(verticalLayout, 0, 0, 1, 1);

        retranslateUi(Dialog);
        pushButtonCerrar.clicked.connect(Dialog, "accept()");

        Dialog.connectSlotsByName();
    } // setupUi

    void retranslateUi(QDialog Dialog)
    {
        Dialog.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Lista de productos Impresa", null));
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Lista de productos", null));
        label_ListaProductos.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Lista de productos", null));
        pushButtonCerrar.setText(com.trolltech.qt.core.QCoreApplication.translate("Dialog", "Cerrar", null));
    } // retranslateUi

}

