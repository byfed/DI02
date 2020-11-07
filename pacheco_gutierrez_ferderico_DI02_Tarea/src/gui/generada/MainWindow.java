package gui.generada;

/********************************************************************************
 ** Form generated from reading ui file 'ListaCompra.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.7
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class MainWindow implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QWidget centralwidget;
    public QGridLayout gridLayout_2;
    public QVBoxLayout verticalLayout;
    public QGridLayout gridLayout;
    public QCheckBox checkBoxUrgente;
    public QLabel label_2;
    public QLabel label_3;
    public QComboBox comboBoxSeccion;
    public QPushButton pushButtonAnadir;
    public QSpinBox spinBoxCantidad;
    public QLineEdit lineEditNombre;
    public QLabel label;
    public QSpacerItem horizontalSpacer;
    public QLabel label_4;
    public QTableView tableView;
    public QHBoxLayout horizontalLayout;
    public QPushButton pushButtonBorrarSeleccion;
    public QPushButton pushButtonBorrarLista;
    public QPushButton pushButtonImprimir;
    public QMenuBar menubar;
    public QMenu menuAcciones;
    public QMenu menuAyuda;
    public QStatusBar statusbar;

    public MainWindow() { super(); }

    public void setupUi(QMainWindow MainWindow)
    {
        MainWindow.setObjectName("MainWindow");
        MainWindow.resize(new QSize(376, 320).expandedTo(MainWindow.minimumSizeHint()));
        QPalette palette= new QPalette();
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(24, 106, 48));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Button, new QColor(233, 240, 207));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Light, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Midlight, new QColor(244, 247, 231));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Dark, new QColor(116, 120, 103));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Mid, new QColor(155, 160, 138));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Window, new QColor(233, 240, 207));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.AlternateBase, new QColor(244, 247, 231));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(24, 106, 48));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Button, new QColor(233, 240, 207));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Light, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Midlight, new QColor(244, 247, 231));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Dark, new QColor(116, 120, 103));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Mid, new QColor(155, 160, 138));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Text, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Base, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Window, new QColor(233, 240, 207));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.AlternateBase, new QColor(244, 247, 231));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(116, 120, 103));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Button, new QColor(233, 240, 207));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Light, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Midlight, new QColor(244, 247, 231));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Dark, new QColor(116, 120, 103));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Mid, new QColor(155, 160, 138));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Text, new QColor(116, 120, 103));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.BrightText, new QColor(255, 255, 255));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(116, 120, 103));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Base, new QColor(233, 240, 207));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Window, new QColor(233, 240, 207));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.Shadow, new QColor(0, 0, 0));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.AlternateBase, new QColor(233, 240, 207));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipBase, new QColor(255, 255, 220));
        palette.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ToolTipText, new QColor(0, 0, 0));
        MainWindow.setPalette(palette);
        MainWindow.setWindowIcon(new QIcon(new QPixmap("recursos/header.png")));
        MainWindow.setAutoFillBackground(false);
        centralwidget = new QWidget(MainWindow);
        centralwidget.setObjectName("centralwidget");
        gridLayout_2 = new QGridLayout(centralwidget);
        gridLayout_2.setObjectName("gridLayout_2");
        verticalLayout = new QVBoxLayout();
        verticalLayout.setObjectName("verticalLayout");
        gridLayout = new QGridLayout();
        gridLayout.setObjectName("gridLayout");
        checkBoxUrgente = new QCheckBox(centralwidget);
        checkBoxUrgente.setObjectName("checkBoxUrgente");

        gridLayout.addWidget(checkBoxUrgente, 1, 3, 1, 1);

        label_2 = new QLabel(centralwidget);
        label_2.setObjectName("label_2");
        QPalette palette1= new QPalette();
        palette1.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(24, 106, 48));
        palette1.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(24, 106, 48));
        palette1.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(116, 120, 103));
        label_2.setPalette(palette1);
        QFont font = new QFont();
        font.setFamily("Tahoma");
        font.setPointSize(10);
        label_2.setFont(font);

        gridLayout.addWidget(label_2, 0, 3, 1, 1);

        label_3 = new QLabel(centralwidget);
        label_3.setObjectName("label_3");
        QPalette palette2= new QPalette();
        palette2.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(24, 106, 48));
        palette2.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(24, 106, 48));
        palette2.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(116, 120, 103));
        label_3.setPalette(palette2);
        QFont font1 = new QFont();
        font1.setFamily("Tahoma");
        font1.setPointSize(10);
        label_3.setFont(font1);

        gridLayout.addWidget(label_3, 1, 0, 1, 1);

        comboBoxSeccion = new QComboBox(centralwidget);
        comboBoxSeccion.setObjectName("comboBoxSeccion");

        gridLayout.addWidget(comboBoxSeccion, 1, 1, 1, 1);

        pushButtonAnadir = new QPushButton(centralwidget);
        pushButtonAnadir.setObjectName("pushButtonAnadir");
        pushButtonAnadir.setIcon(new QIcon(new QPixmap("recursos/iconoBoton.png")));

        gridLayout.addWidget(pushButtonAnadir, 1, 4, 1, 1);

        spinBoxCantidad = new QSpinBox(centralwidget);
        spinBoxCantidad.setObjectName("spinBoxCantidad");
        spinBoxCantidad.setMinimum(1);
        spinBoxCantidad.setMaximum(999999);

        gridLayout.addWidget(spinBoxCantidad, 0, 1, 1, 1);

        lineEditNombre = new QLineEdit(centralwidget);
        lineEditNombre.setObjectName("lineEditNombre");

        gridLayout.addWidget(lineEditNombre, 0, 4, 1, 1);

        label = new QLabel(centralwidget);
        label.setObjectName("label");
        QPalette palette3= new QPalette();
        palette3.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(24, 106, 48));
        palette3.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(24, 106, 48));
        palette3.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(116, 120, 103));
        label.setPalette(palette3);
        QFont font2 = new QFont();
        font2.setFamily("Tahoma");
        font2.setPointSize(10);
        label.setFont(font2);

        gridLayout.addWidget(label, 0, 0, 1, 1);

        horizontalSpacer = new QSpacerItem(10, 0, com.trolltech.qt.gui.QSizePolicy.Policy.MinimumExpanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout.addItem(horizontalSpacer, 0, 2, 1, 1);


        verticalLayout.addLayout(gridLayout);

        label_4 = new QLabel(centralwidget);
        label_4.setObjectName("label_4");
        QPalette palette4= new QPalette();
        palette4.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.WindowText, new QColor(24, 106, 48));
        palette4.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.WindowText, new QColor(24, 106, 48));
        palette4.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.WindowText, new QColor(116, 120, 103));
        label_4.setPalette(palette4);
        QFont font3 = new QFont();
        font3.setFamily("Tahoma");
        font3.setPointSize(12);
        font3.setBold(true);
        font3.setWeight(75);
        label_4.setFont(font3);

        verticalLayout.addWidget(label_4);

        tableView = new QTableView(centralwidget);
        tableView.setObjectName("tableView");

        verticalLayout.addWidget(tableView);

        horizontalLayout = new QHBoxLayout();
        horizontalLayout.setObjectName("horizontalLayout");
        pushButtonBorrarSeleccion = new QPushButton(centralwidget);
        pushButtonBorrarSeleccion.setObjectName("pushButtonBorrarSeleccion");
        QPalette palette5= new QPalette();
        palette5.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(24, 106, 48));
        palette5.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(24, 106, 48));
        palette5.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(116, 120, 103));
        pushButtonBorrarSeleccion.setPalette(palette5);
        QFont font4 = new QFont();
        font4.setFamily("Tahoma");
        font4.setPointSize(10);
        pushButtonBorrarSeleccion.setFont(font4);

        horizontalLayout.addWidget(pushButtonBorrarSeleccion);

        pushButtonBorrarLista = new QPushButton(centralwidget);
        pushButtonBorrarLista.setObjectName("pushButtonBorrarLista");
        QPalette palette6= new QPalette();
        palette6.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(24, 106, 48));
        palette6.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(24, 106, 48));
        palette6.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(116, 120, 103));
        pushButtonBorrarLista.setPalette(palette6);
        QFont font5 = new QFont();
        font5.setFamily("Tahoma");
        font5.setPointSize(10);
        pushButtonBorrarLista.setFont(font5);

        horizontalLayout.addWidget(pushButtonBorrarLista);

        pushButtonImprimir = new QPushButton(centralwidget);
        pushButtonImprimir.setObjectName("pushButtonImprimir");
        QPalette palette7= new QPalette();
        palette7.setColor(QPalette.ColorGroup.Active, QPalette.ColorRole.ButtonText, new QColor(24, 106, 48));
        palette7.setColor(QPalette.ColorGroup.Inactive, QPalette.ColorRole.ButtonText, new QColor(24, 106, 48));
        palette7.setColor(QPalette.ColorGroup.Disabled, QPalette.ColorRole.ButtonText, new QColor(116, 120, 103));
        pushButtonImprimir.setPalette(palette7);
        QFont font6 = new QFont();
        font6.setFamily("Tahoma");
        font6.setPointSize(10);
        pushButtonImprimir.setFont(font6);

        horizontalLayout.addWidget(pushButtonImprimir);


        verticalLayout.addLayout(horizontalLayout);


        gridLayout_2.addLayout(verticalLayout, 0, 0, 1, 1);

        MainWindow.setCentralWidget(centralwidget);
        menubar = new QMenuBar(MainWindow);
        menubar.setObjectName("menubar");
        menubar.setGeometry(new QRect(0, 0, 376, 21));
        menuAcciones = new QMenu(menubar);
        menuAcciones.setObjectName("menuAcciones");
        menuAyuda = new QMenu(menubar);
        menuAyuda.setObjectName("menuAyuda");
        MainWindow.setMenuBar(menubar);
        statusbar = new QStatusBar(MainWindow);
        statusbar.setObjectName("statusbar");
        MainWindow.setStatusBar(statusbar);

        menubar.addAction(menuAcciones.menuAction());
        menubar.addAction(menuAyuda.menuAction());
        retranslateUi(MainWindow);

        MainWindow.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow MainWindow)
    {
        MainWindow.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "MainWindow", null));
        checkBoxUrgente.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Urgente", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Nombre:", null));
        label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Secci\u00f3n:", null));
        comboBoxSeccion.clear();
        comboBoxSeccion.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Panader\u00eda", null));
        comboBoxSeccion.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Pescader\u00eda", null));
        comboBoxSeccion.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Fruter\u00eda", null));
        comboBoxSeccion.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Carnicer\u00eda", null));
        comboBoxSeccion.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Charcuter\u00eda", null));
        comboBoxSeccion.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Conservas", null));
        comboBoxSeccion.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Perfumer\u00eda", null));
        comboBoxSeccion.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "General", null));
        pushButtonAnadir.setText("");
        label.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Cantidad:", null));
        label_4.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Mi lista de la compra", null));
        pushButtonBorrarSeleccion.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Borrar Selecci\u00f3n", null));
        pushButtonBorrarLista.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Borrar Lista", null));
        pushButtonImprimir.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Imprimir", null));
        menuAcciones.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Acciones", null));
        menuAyuda.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Ayuda", null));
    } // retranslateUi

}

