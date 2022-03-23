/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author mateo
 */
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JOptionPane;
import java.util.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Formulario extends javax.swing.JFrame {

    boolean banderaInventario = false;
    boolean banderaJornada = false;

    int contAseo = 0, contPapeleria = 0, contViveres = 0, conMascotas = 0, conOtros = 0;
    int contDiurna = 0, contNocturna;
    public DefaultTableModel modeloTablaEmpleados = new DefaultTableModel();
    public DefaultTableModel modeloTablaInventarios = new DefaultTableModel();

    public Formulario() {
        initComponents();
        banderaInventario = false;
        banderaJornada = true;
        this.jButton1.setEnabled(false);
        this.jButton2.setEnabled(false);

        this.jTable1.setModel(modeloTablaEmpleados);
        modeloTablaEmpleados.addColumn("Nombre");
        modeloTablaEmpleados.addColumn("Id");
        modeloTablaEmpleados.addColumn("Edad");
        modeloTablaEmpleados.addColumn("Jornada");
        modeloTablaEmpleados.addColumn("Antiguedad");
        modeloTablaEmpleados.addColumn("Dcto Tienda");
        modeloTablaEmpleados.addColumn("Dcto Recreacion");

        this.jTable2.setModel(modeloTablaInventarios);
        modeloTablaInventarios.addColumn("Nombre");
        modeloTablaInventarios.addColumn("Tipo");
        modeloTablaInventarios.addColumn("Unidades");
        modeloTablaInventarios.addColumn("Valor Un");
        modeloTablaInventarios.addColumn("IVA");
        modeloTablaInventarios.addColumn("Total");

        txtEmpID.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();
                }
            }

        });
        txtEmpNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {

                if (!(Character.isLetter(evt.getKeyChar()))  && (!(Character.isSpaceChar(evt.getKeyChar())))) {
                    evt.consume();
                }
//                else if (!(Character.isSpaceChar(evt.getKeyChar())))
//                {
//                      evt.consume();
//                }
                
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblEmpNombre = new javax.swing.JLabel();
        lblEmpID = new javax.swing.JLabel();
        lblEmpEdad = new javax.swing.JLabel();
        lblEmpJornada = new javax.swing.JLabel();
        lblEmpAnti = new javax.swing.JLabel();
        btnEmpLimpiar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        radioDiurna = new javax.swing.JRadioButton();
        radioNocturna = new javax.swing.JRadioButton();
        spinnerEmpEdad = new javax.swing.JSpinner();
        spinnerEmpAntiguedad = new javax.swing.JSpinner();
        txtEmpNombre = new javax.swing.JTextField();
        txtEmpID = new javax.swing.JTextField();
        btnEmpClearRow = new javax.swing.JButton();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        lblInvNombre = new javax.swing.JLabel();
        comboInvCategoria = new javax.swing.JComboBox<>();
        spinnerInvValor = new javax.swing.JSpinner();
        spinnerInvUnds = new javax.swing.JSpinner();
        lblInvTipo = new javax.swing.JLabel();
        lblInvValor = new javax.swing.JLabel();
        lblInvUnidades = new javax.swing.JLabel();
        txtInvNombre = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        btnEmpLimpiar1 = new javax.swing.JButton();
        btnInvClearRow = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Registro de empleados");
        jInternalFrame1.setFrameIcon(new javax.swing.ImageIcon("D:\\Users\\Mateo\\Pictures\\descargar.png")); // NOI18N
        jInternalFrame1.setVisible(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        lblEmpNombre.setText("Nombre");
        lblEmpNombre.setToolTipText("");

        lblEmpID.setText("Cedula");
        lblEmpID.setToolTipText("");

        lblEmpEdad.setText("Edad");

        lblEmpJornada.setText("Jornada");

        lblEmpAnti.setText("Antiguedad (AÑOS)");

        btnEmpLimpiar.setText("Limpiar tabla");
        btnEmpLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpLimpiarActionPerformed(evt);
            }
        });

        jButton4.setText("Registrar empleado");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        radioDiurna.setSelected(true);
        radioDiurna.setText("Diurna");
        radioDiurna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDiurnaActionPerformed(evt);
            }
        });

        radioNocturna.setText("Nocturna");
        radioNocturna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNocturnaActionPerformed(evt);
            }
        });

        spinnerEmpEdad.setValue(18);

        txtEmpNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpNombreActionPerformed(evt);
            }
        });

        btnEmpClearRow.setText("Eliminar Registro");
        btnEmpClearRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpClearRowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEmpClearRow, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnEmpLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(lblEmpNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEmpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(lblEmpJornada)
                                .addGap(18, 18, 18)
                                .addComponent(radioDiurna)
                                .addGap(29, 29, 29)
                                .addComponent(radioNocturna)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(lblEmpAnti, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spinnerEmpAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(lblEmpID)
                                .addGap(18, 18, 18)
                                .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblEmpEdad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spinnerEmpEdad)))))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpEdad)
                    .addComponent(spinnerEmpEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpID)
                    .addComponent(txtEmpNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpJornada)
                    .addComponent(radioDiurna)
                    .addComponent(radioNocturna)
                    .addComponent(lblEmpAnti)
                    .addComponent(spinnerEmpAntiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(btnEmpLimpiar)
                    .addComponent(btnEmpClearRow))
                .addGap(608, 608, 608))
        );

        jInternalFrame2.setIconifiable(true);
        jInternalFrame2.setMaximizable(true);
        jInternalFrame2.setResizable(true);
        jInternalFrame2.setTitle("Registro de inventarios");
        jInternalFrame2.setFrameIcon(new javax.swing.ImageIcon("D:\\Users\\Mateo\\Pictures\\descargar (1).png")); // NOI18N
        jInternalFrame2.setVisible(true);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        lblInvNombre.setText("Nombre");

        comboInvCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aseo", "Papeleria", "Viveres", "Mascotas", "Otros" }));

        spinnerInvValor.setValue(1);

        spinnerInvUnds.setValue(1);

        lblInvTipo.setText("Tipo");

        lblInvValor.setText("Vlr Unitario");

        lblInvUnidades.setText("Unidades");

        jButton5.setText("Registrar inventario");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnEmpLimpiar1.setText("Limpiar tabla");
        btnEmpLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpLimpiar1ActionPerformed(evt);
            }
        });

        btnInvClearRow.setText("Eliminar Registro");
        btnInvClearRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvClearRowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnInvClearRow, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnEmpLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblInvNombre)
                                    .addComponent(lblInvTipo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jInternalFrame2Layout.createSequentialGroup()
                                        .addComponent(txtInvNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(lblInvValor))
                                    .addComponent(comboInvCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinnerInvValor, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblInvUnidades)
                                .addGap(18, 18, 18)
                                .addComponent(spinnerInvUnds, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))))
                .addGap(37, 37, 37))
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInvNombre)
                    .addComponent(txtInvNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerInvValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInvValor)
                    .addComponent(lblInvUnidades)
                    .addComponent(spinnerInvUnds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInvTipo)
                    .addComponent(comboInvCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(btnEmpLimpiar1)
                    .addComponent(btnInvClearRow))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jInternalFrame2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jInternalFrame2)
                    .addComponent(jInternalFrame1))
                .addGap(15, 15, 15))
        );

        try {
            jInternalFrame2.setIcon(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        jTabbedPane1.addTab("Gestion", new javax.swing.ImageIcon("D:\\Users\\Mateo\\Pictures\\ucompensar icono.png"), jPanel1); // NOI18N

        jButton1.setText("Graficar Jornadas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Graficar inventario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Habilitar Graficado");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(800, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(363, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addGap(137, 137, 137))
        );

        jTabbedPane1.addTab("Estadistica", new javax.swing.ImageIcon("D:\\Users\\Mateo\\Pictures\\ucompensar icono.png"), jPanel2); // NOI18N

        jMenu3.setText("Inicio");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Sobre nosotros");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void datearGraficoJornadas(int contDiurna, int contNocturna) {
        this.contDiurna = contDiurna;
        this.contNocturna = contNocturna;

    }

    public void datearGraficoInventario(int contAseo, int contPapeleria, int contViveres, int conMascotas, int conOtros) {
        this.contAseo = contAseo;
        this.contPapeleria = contPapeleria;
        this.contViveres = contViveres;
        this.conMascotas = conMascotas;
        this.conOtros = conOtros;
    }

    public void paint(Graphics g) {
        try {
            super.paint(g);
            if (banderaInventario == true) {

                int total = contAseo + contPapeleria + contViveres + conMascotas + conOtros;
                int gradosAseo = contAseo * 360 / total;
                int gradosPapeleria = contPapeleria * 360 / total;
                int gradosViveres = contViveres * 360 / total;
                int gradosMascotas = conMascotas * 360 / total;
                int gradosOtros = conOtros * 360 / total;

                g.setColor(Color.PINK);
                g.fillArc(125, 180, 200, 200, 0, gradosAseo);
                g.fillRect(380, 135, 20, 20);
                g.drawString("Aseo " + (contAseo * 100) / total + "%", 415, 150);
                g.setColor(Color.GREEN);
                g.fillArc(125, 180, 200, 200, gradosAseo, gradosPapeleria);
                g.fillRect(380, 165, 20, 20);
                g.drawString("Papeleria " + (contPapeleria * 100) / total + "%", 415, 180);
                g.setColor(Color.ORANGE);
                g.fillArc(125, 180, 200, 200, gradosAseo + gradosPapeleria, gradosViveres);
                g.fillRect(380, 195, 20, 20);
                g.drawString("Viveres " + (contViveres * 100) / total + "%", 415, 210);
                g.setColor(Color.BLUE);
                g.fillArc(125, 180, 200, 200, gradosAseo + gradosPapeleria + gradosViveres, gradosMascotas);
                g.fillRect(380, 225, 20, 20);
                g.drawString("Mascotas " + (conMascotas * 100) / total + "%", 415, 240);
                g.setColor(Color.CYAN);
                g.fillArc(125, 180, 200, 200, gradosAseo + gradosPapeleria + gradosViveres + gradosMascotas, gradosOtros);
                g.fillRect(380, 255, 20, 20);
                g.drawString("Otros " + (conOtros * 100) / total + "%", 415, 270);

            } else if (banderaJornada == true) {

                int total = contDiurna + contNocturna;
                int gradosDiurna = contDiurna * 360 / total;
                int gradosNocturna = contNocturna * 360 / total;
                g.setColor(Color.YELLOW);
                g.fillArc(125, 180, 200, 200, 0, gradosDiurna);
                g.fillRect(380, 135, 20, 20);
                g.drawString("Diurna " + (contDiurna * 100) / total + "%", 415, 150);
                g.setColor(Color.BLUE);
                g.fillArc(125, 180, 200, 200, gradosDiurna, gradosNocturna);
                g.fillRect(380, 165, 20, 20);
                g.drawString("Nocturna " + (contNocturna * 100) / total + "%", 415, 180);

            }
        } catch (Exception e) {

        }
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        datearGraficoJornadas(this.contDiurna, this.contNocturna);
        banderaInventario = false;
        banderaJornada = true;
        repaint();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        datearGraficoInventario(this.contAseo, this.contPapeleria, this.contViveres, this.conMascotas, this.conOtros);
        banderaInventario = true;
        banderaJornada = false;
        repaint();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

        if (this.jCheckBox1.isSelected()) {
            this.jButton1.setEnabled(true);
            this.jButton2.setEnabled(true);
        } else {

            this.jButton1.setEnabled(false);
            this.jButton2.setEnabled(false);
            banderaInventario = false;
            banderaJornada = false;
            repaint();
        }


    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void btnEmpLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpLimpiarActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        this.contDiurna = 0;
        this.contNocturna = 0;
    }//GEN-LAST:event_btnEmpLimpiarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (checkEmpID(modeloTablaEmpleados, txtEmpID.getText()) == false && checkEmpEmpty() == false) {

            boolean jornada = true;

            if (this.radioDiurna.isSelected()) {
                this.contDiurna++;
                jornada = true;
            } else if (this.radioNocturna.isSelected()) {
                this.contNocturna++;
                jornada = false;
            }
            Empleado emp = new Empleado(txtEmpNombre.getText(), Integer.parseInt(this.spinnerEmpEdad.getValue().toString()),
                    txtEmpID.getText(), jornada, Integer.parseInt(this.spinnerEmpAntiguedad.getValue().toString()));

            this.modeloTablaEmpleados.insertRow(0, new Object[]{emp.GetNombre(), emp.GetID(), emp.GetEdad(),
                emp.GetJornada(), emp.GetAntiguedad(), emp.GetDctoTienda(), emp.GetDctoRecreacion()});

        } else {
            JOptionPane.showMessageDialog(null, "Por favor verifique sus campos", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void radioDiurnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDiurnaActionPerformed
        this.radioNocturna.setSelected(false);
    }//GEN-LAST:event_radioDiurnaActionPerformed

    private void radioNocturnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNocturnaActionPerformed
        this.radioDiurna.setSelected(false);
    }//GEN-LAST:event_radioNocturnaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        if (checkInvEmpty() == false) {

            Inventario inv = new Inventario(txtInvNombre.getText(), this.comboInvCategoria.getSelectedIndex(),
                    Integer.parseInt(this.spinnerInvValor.getValue().toString()),
                    Integer.parseInt(this.spinnerInvUnds.getValue().toString()));

            switch (this.comboInvCategoria.getSelectedIndex()) {
                case 0:
                    this.contAseo++;
                    break;
                case 1:
                    this.contPapeleria++;
                    break;
                case 2:
                    this.contViveres++;
                    break;
                case 3:
                    this.conMascotas++;
                    break;
                case 5:
                    this.conOtros++;
                    break;
                default:

                    break;
            }

            this.modeloTablaInventarios.insertRow(0, new Object[]{
                inv.GetNombre(),
                inv.GetTipo(),
                inv.GetVlrUNI(),
                inv.GetUNDS(),
                inv.CalcularIVA(),
                inv.CalcularTotal()
            });

        } else {
            JOptionPane.showMessageDialog(null, "Por favor verifique sus campos", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnEmpLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpLimpiar1ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
        dtm.setRowCount(0);
        this.contAseo = 0;
        this.contPapeleria = 0;
        this.contViveres = 0;
        this.conMascotas = 0;
        this.conOtros = 0;
    }//GEN-LAST:event_btnEmpLimpiar1ActionPerformed

    private void btnEmpClearRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpClearRowActionPerformed
        eliminarRegistro(this.jTable1);

    }//GEN-LAST:event_btnEmpClearRowActionPerformed

    private void btnInvClearRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvClearRowActionPerformed
        eliminarRegistro(this.jTable2);
    }//GEN-LAST:event_btnInvClearRowActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed

    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked

  File file2 = new File(".\\fotomia.png");
        BufferedImage bufferedImage;
        try {
            bufferedImage = ImageIO.read(file2);
        ImageIcon imageIcon = new ImageIcon(bufferedImage);
        JFrame jFrame = new JFrame();       
        
       jFrame.setLayout(new FlowLayout());
       jFrame.setSize(300, 500);
        JLabel jLabel = new JLabel();
         JLabel jLabel2 = new JLabel();
         JTextArea jTexto = new JTextArea();
          JLabel jLabel3 = new JLabel();
        jLabel.setIcon(imageIcon);
        jLabel2.setText("MATEO RODRIGUEZ LOPEZ");

       jTexto.setLayout(new FlowLayout());
        jFrame.add(jLabel);
           jFrame.add(jLabel2);
         jFrame.add(jTexto);
                 jTexto.setText("Compensar como entidad \n de Seguridad Social facilita  \n a sus afiliados, a través de \n los Planes de Bienestar, \n un amplio portafolio de servicios \n que le permite, mediante  \nsu utilización empresarial e individual, \n generar condiciones que \n favorecen el desarrollo personal \n y laboral de sus trabajadores y grupo familiar.\n");
        jTexto.setOpaque(false);
        jTexto.setEnabled(false);
        
        jFrame.setVisible(true);

       jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         } 
        catch (IOException ex) {
            Logger.getLogger(AcercaDE.class.getName()).log(Level.SEVERE, null, ex);
        }
   


    }//GEN-LAST:event_jMenu4MouseClicked

    private void txtEmpNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpNombreActionPerformed
    public void eliminarRegistro(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int[] rows = table.getSelectedRows();
        for (int i = 0; i < rows.length; i++) {
            model.removeRow(rows[i] - i);
        }
    }

    public boolean checkEmpID(DefaultTableModel table, String ID) {

        int row = this.modeloTablaEmpleados.getRowCount();
        {
            Object[] contenido = new Object[row];
            for (int i = 0; i < row; i++) {
                contenido[i] = modeloTablaEmpleados.getValueAt(i, 1);
            }
            Object buscarID = ID;
            boolean existe = Arrays.asList(contenido).contains(buscarID);
            if (existe) {

                JOptionPane.showMessageDialog(null, "Ya existe este empleado", "Duplicado", JOptionPane.ERROR_MESSAGE);
                return true;
            } else {

                return false;
            }

        }

    }

    public boolean checkEmpEmpty() {

        if (this.txtEmpNombre.getText().isBlank() || this.txtEmpID.getText().isBlank()
                || this.spinnerEmpAntiguedad.getValue() == null || this.spinnerEmpEdad.getValue() == null) {
            return true;
        }
        return false;

    }

    public boolean checkInvEmpty() {

        if (this.txtInvNombre.getText().isBlank()
                || Integer.parseInt(this.spinnerInvValor.getValue().toString()) < 1 || Integer.parseInt(this.spinnerInvUnds.getValue().toString()) < 1) {
            return true;
        }
        return false;

    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpClearRow;
    private javax.swing.JButton btnEmpLimpiar;
    private javax.swing.JButton btnEmpLimpiar1;
    private javax.swing.JButton btnInvClearRow;
    private javax.swing.JComboBox<String> comboInvCategoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblEmpAnti;
    private javax.swing.JLabel lblEmpEdad;
    private javax.swing.JLabel lblEmpID;
    private javax.swing.JLabel lblEmpJornada;
    private javax.swing.JLabel lblEmpNombre;
    private javax.swing.JLabel lblInvNombre;
    private javax.swing.JLabel lblInvTipo;
    private javax.swing.JLabel lblInvUnidades;
    private javax.swing.JLabel lblInvValor;
    private javax.swing.JRadioButton radioDiurna;
    private javax.swing.JRadioButton radioNocturna;
    private javax.swing.JSpinner spinnerEmpAntiguedad;
    private javax.swing.JSpinner spinnerEmpEdad;
    private javax.swing.JSpinner spinnerInvUnds;
    private javax.swing.JSpinner spinnerInvValor;
    private javax.swing.JTextField txtEmpID;
    private javax.swing.JTextField txtEmpNombre;
    private javax.swing.JTextField txtInvNombre;
    // End of variables declaration//GEN-END:variables
}
