package faan;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FrontFAAN extends javax.swing.JFrame implements Printable
{
    
     conexionBD con =new conexionBD();
    Connection conn = con.conectar(); 
    
     public void FiltrarNombre(String name){
   
       try {
           Statement sts = conn.createStatement();
           String cod="Select * from caninos Where nombre LIKE '%"+this.txtBuscar.getText().trim()+"%' ";
           ResultSet rs=sts.executeQuery(cod);
            String filas []={"cc","nombre","especie","estatura","raza","peso","color","rescate","origen","esterilizado","condicion","estado","rescatista","vacuna"}; 
            DefaultTableModel tbc = new DefaultTableModel(null,filas);
           while(rs.next()){
            Object fila[]={rs.getString("cc"),rs.getString("nombre"),rs.getString("especie"),rs.getString("estatura"),rs.getString("raza"),rs.getString("peso"),rs.getString("color"),rs.getString("rescate"),rs.getString("origen"), rs.getString("esterilizado"),rs.getString("condicion"),rs.getString("estado"),rs.getString("rescatista"),rs.getString("vacuna")};
            tbc.addRow(fila);
             
           }
           tbCanino.setModel(tbc);
       } catch (Exception e) {
       }
   }
    
    
    public FrontFAAN() {
        initComponents(); 
        this.setLocationRelativeTo(null);
    } 
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtEspecie = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCC = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtOrigen = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtFR = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEstatura = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        txtEsterilizado = new javax.swing.JTextField();
        btnMostrarTabla = new javax.swing.JButton();
        btnElegir = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCondicion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtRescatista = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtVacunado = new javax.swing.JTextField();
        Registro = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbCanino = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtFechaVacunas = new javax.swing.JTextField();
        txtVacunaVacuna = new javax.swing.JTextField();
        txtPV = new javax.swing.JTextField();
        btnGuardarVacuna = new javax.swing.JButton();
        btnEliminacionVacuna = new javax.swing.JButton();
        btnCancelarVacuna = new javax.swing.JButton();
        btnVerTablaVacunas = new javax.swing.JButton();
        btnEditarVacuna = new javax.swing.JButton();
        btnElegirVacuna = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        txtIDVacunas = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbVacunas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtFechaDespa = new javax.swing.JTextField();
        txtProductoDespa = new javax.swing.JTextField();
        txtPesoDespa = new javax.swing.JTextField();
        txtPD = new javax.swing.JTextField();
        btnGuardarDespa = new javax.swing.JButton();
        btnEliminarDespa = new javax.swing.JButton();
        btnCancelarDespa = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        txtIDDespa = new javax.swing.JTextField();
        btnElegirDespa = new javax.swing.JButton();
        btnEditarVacunas = new javax.swing.JButton();
        btnMstrarDespa = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDesparasitaciones = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtFechaAnti = new javax.swing.JTextField();
        txtProductoAnti = new javax.swing.JTextField();
        txtPA = new javax.swing.JTextField();
        btnGuardarAnti = new javax.swing.JButton();
        btnEliminarAnti = new javax.swing.JButton();
        btnCancelarAnti = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        txtIdAnti = new javax.swing.JTextField();
        btnElegirAnti = new javax.swing.JButton();
        btnEditarAnti = new javax.swing.JButton();
        btnVerAnti = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbAntipulgas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/iconfinder_animal-footprint_85561.png"))); // NOI18N
        jLabel2.setText("REGISTRO CANINO");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombre: ");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Color:");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Especie:");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Raza:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Peso:");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("CC:");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Origen:");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Rescate:");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Tamaño:");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/4308517-20.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/111048-20_1.png"))); // NOI18N
        btnModificar.setText("Editar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/3017912-20.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/103431-20.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Esterilizado:");
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btnMostrarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/3671905-20.png"))); // NOI18N
        btnMostrarTabla.setText("Ver Tabla");
        btnMostrarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTablaActionPerformed(evt);
            }
        });

        btnElegir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/808645-20.png"))); // NOI18N
        btnElegir.setText("Elegir");
        btnElegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Condicion:");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/FAAN3_IMG.jpg"))); // NOI18N

        jLabel36.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/iconfinder_Kennel_3775247 (2).png"))); // NOI18N

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/183520-20_1.png"))); // NOI18N

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/326675-20.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("Estado:");
        jLabel39.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setText("Rescatista");
        jLabel40.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel41.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("Vacunado");
        jLabel41.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnMostrarTabla)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                            .addComponent(btnRegistrar)
                                            .addComponent(btnElegir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(28, 28, 28))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtBuscar)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtColor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFR, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCC, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(txtCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEsterilizado, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(244, 244, 244)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btnImprimir)
                        .addGap(178, 178, 178)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRescatista, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVacunado, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCancelar)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEsterilizado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRescatista, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFR, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtVacunado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRegistrar))
                                .addGap(8, 8, 8)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnModificar)
                                    .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnElegir)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEliminar))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMostrarTabla)
                            .addComponent(btnImprimir))
                        .addGap(142, 142, 142))))
        );

        tbCanino.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbCanino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCaninoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbCanino);

        javax.swing.GroupLayout RegistroLayout = new javax.swing.GroupLayout(Registro);
        Registro.setLayout(RegistroLayout);
        RegistroLayout.setHorizontalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, Short.MAX_VALUE)
                    .addComponent(Registro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Registro canino", jPanel1);

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel15.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/iconfinder_3_3678446.png"))); // NOI18N
        jLabel15.setText("REGISTRO DE VACUNAS");

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 153));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("N°");

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 153));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Vacuna:");

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 153));
        jLabel18.setText("Proxima Vacuna:");

        txtVacunaVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVacunaVacunaActionPerformed(evt);
            }
        });

        txtPV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPVActionPerformed(evt);
            }
        });

        btnGuardarVacuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/4308517-20.png"))); // NOI18N
        btnGuardarVacuna.setText("Guardar");
        btnGuardarVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarVacunaActionPerformed(evt);
            }
        });

        btnEliminacionVacuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/3017912-20.png"))); // NOI18N
        btnEliminacionVacuna.setText("Eliminar");
        btnEliminacionVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminacionVacunaActionPerformed(evt);
            }
        });

        btnCancelarVacuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/103431-20.png"))); // NOI18N
        btnCancelarVacuna.setText("Cancelar");
        btnCancelarVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVacunaActionPerformed(evt);
            }
        });

        btnVerTablaVacunas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/3671905-20.png"))); // NOI18N
        btnVerTablaVacunas.setText("Ver Tabla");
        btnVerTablaVacunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTablaVacunasActionPerformed(evt);
            }
        });

        btnEditarVacuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/111048-20_1.png"))); // NOI18N
        btnEditarVacuna.setText("Editar");
        btnEditarVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarVacunaActionPerformed(evt);
            }
        });

        btnElegirVacuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/808645-20.png"))); // NOI18N
        btnElegirVacuna.setText("Elegir");
        btnElegirVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirVacunaActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 153));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Fecha:");

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/FAAN3_IMG.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtVacunaVacuna, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(txtPV)
                            .addComponent(txtFechaVacunas)
                            .addComponent(txtIDVacunas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCancelarVacuna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminacionVacuna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardarVacuna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVerTablaVacunas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditarVacuna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnElegirVacuna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(92, 92, 92))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel27)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGuardarVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(16, 16, 16)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtIDVacunas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnElegirVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(3, 3, 3)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtVacunaVacuna, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnEliminacionVacuna)
                                    .addComponent(btnEditarVacuna))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnCancelarVacuna)
                                    .addComponent(btnVerTablaVacunas)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(txtFechaVacunas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPV, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        tbVacunas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tbVacunas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1054, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Vacunas", jPanel2);

        jPanel7.setBackground(new java.awt.Color(204, 255, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel20.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/iconfinder_57_111135.png"))); // NOI18N
        jLabel20.setText("REGISTRO DE DESPARASITACIONES");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 366, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 153, 153));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("ID:");

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 153, 153));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Producto:");

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 153, 153));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Peso:");

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 153, 153));
        jLabel24.setText("Proxima desparasitación:");

        btnGuardarDespa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/4308517-20.png"))); // NOI18N
        btnGuardarDespa.setText("Guardar");
        btnGuardarDespa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDespaActionPerformed(evt);
            }
        });

        btnEliminarDespa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/3017912-20.png"))); // NOI18N
        btnEliminarDespa.setText("Eliminar");
        btnEliminarDespa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDespaActionPerformed(evt);
            }
        });

        btnCancelarDespa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/103431-20.png"))); // NOI18N
        btnCancelarDespa.setText("Cancelar");
        btnCancelarDespa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarDespaActionPerformed(evt);
            }
        });

        jLabel28.setBackground(new java.awt.Color(0, 0, 0));
        jLabel28.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 153, 153));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Fecha:");

        btnElegirDespa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/808645-20.png"))); // NOI18N
        btnElegirDespa.setText("Elegir");
        btnElegirDespa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirDespaActionPerformed(evt);
            }
        });

        btnEditarVacunas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/111048-20_1.png"))); // NOI18N
        btnEditarVacunas.setText("Editar");
        btnEditarVacunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarVacunasActionPerformed(evt);
            }
        });

        btnMstrarDespa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/3671905-20.png"))); // NOI18N
        btnMstrarDespa.setText("Ver Tabla");
        btnMstrarDespa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMstrarDespaActionPerformed(evt);
            }
        });

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/FAAN3_IMG.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPD, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(txtFechaDespa)
                                    .addComponent(txtPesoDespa)
                                    .addComponent(txtProductoDespa))
                                .addGap(127, 127, 127)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminarDespa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCancelarDespa, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(btnGuardarDespa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnEditarVacunas, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnMstrarDespa))
                                        .addGap(301, 301, 301))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(btnElegirDespa, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel29)
                                        .addGap(24, 24, 24))))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(txtIDDespa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(330, 330, 330))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIDDespa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnGuardarDespa)
                                .addComponent(btnElegirDespa))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFechaDespa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProductoDespa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarDespa)
                            .addComponent(btnEditarVacunas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelarDespa)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPesoDespa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMstrarDespa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPD, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        tbDesparasitaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbDesparasitaciones);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Desparacitaciones", jPanel3);

        jPanel9.setBackground(new java.awt.Color(204, 255, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel30.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/iconfinder_Pet_soap_3775238.png"))); // NOI18N
        jLabel30.setText("REGISTRO ANTIPULGAS");

        jLabel31.setBackground(new java.awt.Color(0, 0, 0));
        jLabel31.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 153, 153));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Fecha:");

        jLabel32.setBackground(new java.awt.Color(0, 0, 0));
        jLabel32.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 153, 153));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Producto:");

        jLabel33.setBackground(new java.awt.Color(0, 0, 0));
        jLabel33.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 153, 153));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Próxima aplicación:");

        btnGuardarAnti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/4308517-20.png"))); // NOI18N
        btnGuardarAnti.setText("Guardar");
        btnGuardarAnti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAntiActionPerformed(evt);
            }
        });

        btnEliminarAnti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/3017912-20.png"))); // NOI18N
        btnEliminarAnti.setText("Eliminar");
        btnEliminarAnti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAntiActionPerformed(evt);
            }
        });

        btnCancelarAnti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/103431-20.png"))); // NOI18N
        btnCancelarAnti.setText("Cancelar");
        btnCancelarAnti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAntiActionPerformed(evt);
            }
        });

        jLabel34.setBackground(new java.awt.Color(0, 0, 0));
        jLabel34.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 153, 153));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("N:");

        btnElegirAnti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/808645-20.png"))); // NOI18N
        btnElegirAnti.setText("Elegir");
        btnElegirAnti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirAntiActionPerformed(evt);
            }
        });

        btnEditarAnti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/111048-20_1.png"))); // NOI18N
        btnEditarAnti.setText("Editar");
        btnEditarAnti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAntiActionPerformed(evt);
            }
        });

        btnVerAnti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/3671905-20.png"))); // NOI18N
        btnVerAnti.setText("Ver Tabla");
        btnVerAnti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerAntiActionPerformed(evt);
            }
        });

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/FAAN3_IMG.jpg"))); // NOI18N

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/iconfinder_stick_figure_2_4051025 (3).png"))); // NOI18N
        jLabel37.setText("jLabel37");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addGap(58, 58, 58)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFechaAnti, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtProductoAnti, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdAnti, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(192, 192, 192)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnGuardarAnti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminarAnti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCancelarAnti, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnElegirAnti, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(btnEditarAnti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnVerAnti, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                                .addGap(191, 191, 191))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(txtPA, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel35)
                .addGap(30, 30, 30))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGuardarAnti)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnElegirAnti))
                    .addComponent(txtIdAnti))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaAnti, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProductoAnti, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarAnti)
                            .addComponent(btnEditarAnti))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVerAnti)
                            .addComponent(btnCancelarAnti))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPA, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addGap(68, 68, 68))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel35)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbAntipulgas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tbAntipulgas);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1054, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Antipulgas", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //--------LIMPIA CAMPOS CANINO
     public void limpiar(){
    txtNombre.setText("");
    txtCC.setText(""); 
    txtColor.setText(""); 
    txtEspecie.setText(""); 
    txtPeso.setText(""); 
    txtEstatura.setText(""); 
    txtFR.setText(""); 
    txtOrigen.setText(""); 
    txtEsterilizado.setText("");
    txtRaza.setText("");
    txtCondicion.setText(""); 
    txtEstado.setText(""); 
    txtRescatista.setText("");
    txtVacunado.setText("");
    }    
     //-------LIMPIAR CAMPOS DE ANTIPULGAS 
     public void limpiar3(){
     txtFechaAnti.setText(""); 
     txtIdAnti.setText("");
     txtProductoAnti.setText("");
     txtPA.setText("");
     }
     //------LIMPIA CAMPOS VACUNAS-----------
     public void limpiar1(){
     txtIDVacunas.setText("");
     txtVacunaVacuna.setText(""); 
     txtFechaVacunas.setText(""); 
     txtPV.setText("");
     
     } 
     
     public void limpirar2(){
      txtIDDespa.setText(""); 
      txtFechaDespa.setText("");
      txtProductoDespa.setText("");
      txtPesoDespa.setText("");
      txtPD.setText("");
         
     }
     //------Consulta de La base caninos------------///
     public void verdatos(String valor){
        DefaultTableModel modelo = new DefaultTableModel();
       modelo.addColumn("cc");
       modelo.addColumn("nombre");
       modelo.addColumn("especie");
       modelo.addColumn("estatura");
       modelo.addColumn("raza");
       modelo.addColumn("peso");
       modelo.addColumn("color");
       modelo.addColumn("rescate");
       modelo.addColumn("origen");
       modelo.addColumn("esterilizado");
       modelo.addColumn("condicion");
       modelo.addColumn("estado"); 
       modelo.addColumn("rescatista"); 
       modelo.addColumn("vacuna");
       tbCanino.setModel(modelo); 
       
       String sql="";
       if(valor.equals("")){
       sql="SELECT * FROM caninos";
       }else{
       sql="SELECT * from caninos WHERE cc='" + valor + "'";
       }
       String datos[] = new String[14];
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
            datos[0]=rs.getString(9);
            datos[1]=rs.getString(1);
            datos[2]=rs.getString(2);
            datos[3]=rs.getString(3);
            datos[4]=rs.getString(4);
            datos[5]=rs.getString(14);
            datos[6]=rs.getString(5);
            datos[7]=rs.getString(6);
            datos[8]=rs.getString(7);
            datos[9]=rs.getString(8); 
            datos[10]=rs.getString(10);
            datos[11]=rs.getString(11);
            datos[12]=rs.getString(12);
            datos[13]=rs.getString(13);
            
            modelo.addRow(datos);
            }
            tbCanino.setModel(modelo);
        } catch (Exception e) {
        }
    } 
     //------------------------------------------------------------- 
     
     //-----------------COnsulta a la base de desparacitaciones
     public void verdatos2(String valor2){
       DefaultTableModel modelo = new DefaultTableModel();
       modelo.addColumn("N");
       modelo.addColumn("Fecha");
       modelo.addColumn("Producto");
       modelo.addColumn("Peso"); 
       modelo.addColumn("Proxima desparasitacion"); 
       
     
       tbDesparasitaciones.setModel(modelo); 
       
       String sqlll="";
       if(valor2.equals("")){
       sqlll="SELECT * FROM desparasitaciones";
       }else{
       sqlll="SELECT * from desparasitaciones WHERE Id='" + valor2 + "'";
       }
       String datos[] = new String[5];
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sqlll);
            while(rs.next()){
            datos[0]=rs.getString(1);
            datos[1]=rs.getString(2);
            datos[2]=rs.getString(3);
            datos[3]=rs.getString(4);
            datos[4]=rs.getString(5);
         
            
            modelo.addRow(datos);
            }
            tbDesparasitaciones.setModel(modelo);
        } catch (Exception e) {
        }
     
     } 
     public void verdatos3(String valor3){
         
       DefaultTableModel modelo = new DefaultTableModel();
       modelo.addColumn("N");
       modelo.addColumn("Fecha");
       modelo.addColumn("Producto");
       modelo.addColumn("Proxima aplicacion");
     
       tbAntipulgas.setModel(modelo); 
       
       String sqll="";
       if(valor3.equals("")){
       sqll="SELECT * FROM antipulgas";
       }else{
       sqll="SELECT * from antipulgas WHERE Id='" + valor3 + "'";
       }
       String datos[] = new String[5];
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sqll);
            while(rs.next()){
            datos[0]=rs.getString(1);
            datos[1]=rs.getString(2);
            datos[2]=rs.getString(3);
            datos[3]=rs.getString(4); 
                 
            
            modelo.addRow(datos);
            }
            tbAntipulgas.setModel(modelo);
        } catch (Exception e) {
        }
     
     }
     
     //----------------Consulta a la base de vacuna--------------------
     public void verdatos1(String valor1){
         
       DefaultTableModel modelo = new DefaultTableModel();
       modelo.addColumn("N");
       modelo.addColumn("Fecha");
       modelo.addColumn("Vacuna");
       modelo.addColumn("Proxima vacuna");
     
       tbVacunas.setModel(modelo); 
       
       String sqll="";
       if(valor1.equals("")){
       sqll="SELECT * FROM vacuna";
       }else{
       sqll="SELECT * from vacuna WHERE Id='" + valor1 + "'";
       }
       String datos[] = new String[4];
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sqll);
            while(rs.next()){
            datos[0]=rs.getString(4);
            datos[1]=rs.getString(2);
            datos[2]=rs.getString(1);
            datos[3]=rs.getString(3);
         
            
            modelo.addRow(datos);
            }
            tbVacunas.setModel(modelo);
        } catch (Exception e) {
        }
       
     
     }  
     //-----------------------------------------------------------------------     

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        //--------REGISTRA EN LA TABLA CANINOS 
        try {
            String Query="INSERT INTO caninos(nombre,especie,estatura,raza,peso,color,rescate,origen,esterilizado,condicion,estado,rescatista,vacuna) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement statement =conn.prepareStatement(Query);
            // statement.setString(1, txtCC.getText());
            statement.setString(1, txtNombre.getText());
            statement.setString(2, txtEspecie.getText());
            statement.setString(3, txtEstatura.getText());
            statement.setString(4, txtRaza.getText());
            statement.setString(5, txtPeso.getText());
            statement.setString(6, txtColor.getText());
            statement.setString(7, txtFR.getText());
            statement.setString(8, txtOrigen.getText());
            statement.setString(9, txtEsterilizado.getText()); 
            statement.setString(10,txtCondicion.getText());
            statement.setString(11, txtEstado.getText());
            statement.setString(12, txtRescatista.getText()); 
            statement.setString(13, txtVacunado.getText());
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados");
            limpiar();
            verdatos("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR");
            System.out.println(e);
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //MODIFICA REGISTROS DE LA TABLA DE CANINOS 
        try {
            PreparedStatement pst=conn.prepareStatement("UPDATE caninos SET" + " nombre='"+txtNombre.getText()+"',especie='"+txtEspecie.getText()+"', estatura='"+txtEstatura.getText()+"', raza='"+txtRaza.getText()+"', peso='"+txtPeso.getText()+"',color='"+txtColor.getText()+"', rescate='"+txtFR.getText()+"', origen='"+txtOrigen.getText()+"',esterilizado='"+txtEsterilizado.getText()+"',condicion='"+txtCondicion.getText()+"', estado='"+txtEstado.getText()+"', rescatista='"+txtRescatista.getText()+"', vacuna='"+txtVacunado.getText()+"' WHERE cc='"+txtCC.getText()+"'");
            pst.executeUpdate();
            verdatos("");
            limpiar();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //ELIMINA REGISTROS DE LA TABLA DE CANINOS 
        int fila =tbCanino.getSelectedRow();
        String cod="";
        cod=tbCanino.getValueAt(fila,0).toString();
        try {
            PreparedStatement pst=conn.prepareStatement("DELETE from caninos where  cc='"+txtCC.getText()+"'");
            pst.executeUpdate();
            limpiar();
            verdatos("");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //CANCELA PROCESO DE LA TABLA DE CANINOS 
        int num;
        num =JOptionPane.showConfirmDialog(null,"¿Desea salir del sistema?","Salida del sistema",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(num==0){
            System.exit(0);}
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirActionPerformed
        //SELECCIONA REGISTROS DE LA TABLA CANINOS 
        int fila = tbCanino.getSelectedRow();

        if(fila>=0){

            txtCC.setText(tbCanino.getValueAt(fila, 0).toString());
            txtNombre.setText(tbCanino.getValueAt(fila, 1).toString());
            txtEspecie.setText(tbCanino.getValueAt(fila, 2).toString());
            txtEstatura.setText(tbCanino.getValueAt(fila, 3).toString());
            txtRaza.setText(tbCanino.getValueAt(fila, 4).toString());
            txtPeso.setText(tbCanino.getValueAt(fila, 5).toString());
            txtColor.setText(tbCanino.getValueAt(fila, 6).toString());
            txtFR.setText(tbCanino.getValueAt(fila, 7).toString());
            txtOrigen.setText(tbCanino.getValueAt(fila, 8).toString());
            txtEsterilizado.setText(tbCanino.getValueAt(fila, 9).toString());
            txtCondicion.setText(tbCanino.getValueAt(fila, 10).toString());
            txtEstado.setText(tbCanino.getValueAt(fila, 11).toString());
            txtRescatista.setText(tbCanino.getValueAt(fila, 12).toString()); 
            txtVacunado.setText(tbCanino.getValueAt(fila, 13).toString());
        }else{
            JOptionPane.showMessageDialog(null, "No ha seleccionado registro");
        }
    }//GEN-LAST:event_btnElegirActionPerformed

    private void btnMostrarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTablaActionPerformed
        verdatos("");
    }//GEN-LAST:event_btnMostrarTablaActionPerformed

    private void btnVerTablaVacunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTablaVacunasActionPerformed
        verdatos1("");
    }//GEN-LAST:event_btnVerTablaVacunasActionPerformed

    private void btnEditarVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarVacunaActionPerformed
      //EDITA REGISTROS DE LA TABLA VACUNAS 
        try {
            PreparedStatement pst=conn.prepareStatement("UPDATE vacuna SET" + " fecha='"+txtFechaVacunas.getText()+"',vacuna='"+txtVacunaVacuna.getText()+"', proxima_vacuna='"+txtPV.getText()+"' WHERE Id='"+txtIDVacunas.getText()+"'");
            pst.executeUpdate();
            verdatos1("");
            limpiar1();
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }//GEN-LAST:event_btnEditarVacunaActionPerformed

    private void btnElegirVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirVacunaActionPerformed
        //SELECCIONA REGISTROS DE LA TABLA VACUNAS 
        int fila = tbVacunas.getSelectedRow(); 
        if (fila>0) {
            
            txtIDVacunas.setText(tbVacunas.getValueAt(fila, 0).toString()); 
            txtFechaVacunas.setText(tbVacunas.getValueAt(fila, 1).toString());
            txtVacunaVacuna.setText(tbVacunas.getValueAt(fila, 2).toString());  
            txtPV.setText(tbVacunas.getValueAt(fila, 3).toString()); 
            
        } else { 
            JOptionPane.showMessageDialog(null, "Seleciones un registro para poder modificar"); 
            
        }
    }//GEN-LAST:event_btnElegirVacunaActionPerformed

    private void btnGuardarVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarVacunaActionPerformed
        //------------GUARDAR ARCHIVOS EN LA TABLA  VACUNAS------------- 
        try {
            String Query="INSERT INTO vacuna(fecha,vacuna,proxima_vacuna) values(?,?,?)";
            PreparedStatement statement =conn.prepareStatement(Query);
          
            statement.setString(1, txtFechaVacunas.getText());
            statement.setString(2, txtVacunaVacuna.getText());
            statement.setString(3, txtPV.getText());
           
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados");
            limpiar1();
            verdatos1("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR");
            System.out.println(e);
        }
    }//GEN-LAST:event_btnGuardarVacunaActionPerformed

    private void btnEliminacionVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminacionVacunaActionPerformed
      ///----------------ELIMINA ARCHIVOS DE LA TABLA VACUNAS
        int filas =tbVacunas.getSelectedRow();
        String code="";
        code=tbVacunas.getValueAt(filas,0).toString();
        try {
            PreparedStatement pste=conn.prepareStatement("DELETE from vacuna where  Id='"+txtIDVacunas.getText()+"'");
            pste.executeUpdate();
            limpiar1();
            verdatos1("");
        } catch (Exception e) { 
            System.out.println(e);
        }
    }//GEN-LAST:event_btnEliminacionVacunaActionPerformed

    private void txtPVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPVActionPerformed

    private void txtVacunaVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVacunaVacunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVacunaVacunaActionPerformed

    private void btnCancelarVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVacunaActionPerformed
       //---------------CANCELA PROCESOS EN LA TABLA DE VACUNAS
        int num;
        num =JOptionPane.showConfirmDialog(null,"¿Desea salir del sistema?","Salida del sistema",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(num==0){
            System.exit(0);}
    }//GEN-LAST:event_btnCancelarVacunaActionPerformed

    private void btnGuardarDespaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDespaActionPerformed
      //Guardar Desparasitacione
        try {
            String Query="INSERT INTO desparasitaciones(fecha,producto,peso,proxima) values(?,?,?,?)";
            PreparedStatement statement =conn.prepareStatement(Query);
          
            statement.setString(1, txtFechaDespa.getText());
            statement.setString(2, txtProductoDespa.getText());
            statement.setString(3, txtPesoDespa.getText());
            statement.setString(4, txtPD.getText());
           
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados");
            limpirar2();
            verdatos2("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR");
            System.out.println(e);
        }
    }//GEN-LAST:event_btnGuardarDespaActionPerformed

    private void btnMstrarDespaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMstrarDespaActionPerformed
        verdatos2("");
    }//GEN-LAST:event_btnMstrarDespaActionPerformed

    private void btnCancelarDespaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarDespaActionPerformed
        int num;
        num =JOptionPane.showConfirmDialog(null,"¿Desea salir del sistema?","Salida del sistema",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(num==0){
            System.exit(0);}
    }//GEN-LAST:event_btnCancelarDespaActionPerformed

    private void btnEliminarDespaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDespaActionPerformed
         int filas =tbDesparasitaciones.getSelectedRow();
        String code="";
        code=tbDesparasitaciones.getValueAt(filas,0).toString();
        try {
            PreparedStatement pste=conn.prepareStatement("DELETE from desparasitaciones where  Id='"+txtIDDespa.getText()+"'");
            pste.executeUpdate();
            limpirar2();
            verdatos2("");
        } catch (Exception e) { 
            System.out.println(e);
        }
    }//GEN-LAST:event_btnEliminarDespaActionPerformed

    private void btnEditarVacunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarVacunasActionPerformed
       try {
            PreparedStatement pst=conn.prepareStatement("UPDATE desparasitaciones SET" + " fecha='"+txtFechaDespa.getText()+"',producto='"+txtProductoDespa.getText()+"', peso='"+txtPesoDespa.getText()+"', proxima='"+txtPD.getText()+"' WHERE Id='"+txtIDDespa.getText()+"'");
            pst.executeUpdate();
            verdatos2("");
            limpirar2();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnEditarVacunasActionPerformed

    private void btnElegirDespaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirDespaActionPerformed
                int fila = tbDesparasitaciones.getSelectedRow(); 
        if (fila>0) {
            
            txtIDDespa.setText(tbDesparasitaciones.getValueAt(fila, 0).toString()); 
            txtFechaDespa.setText(tbDesparasitaciones.getValueAt(fila, 1).toString());
            txtProductoDespa.setText(tbDesparasitaciones.getValueAt(fila, 2).toString());  
            txtPesoDespa.setText(tbDesparasitaciones.getValueAt(fila, 3).toString()); 
            txtPD.setText(tbDesparasitaciones.getValueAt(fila, 4).toString());
            
        } else { 
            JOptionPane.showMessageDialog(null, "Seleciones un registro para poder modificar"); 
            
        }
    }//GEN-LAST:event_btnElegirDespaActionPerformed

    private void btnGuardarAntiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAntiActionPerformed
    
         try {
            String Query="INSERT INTO antipulgas(fecha,producto,aplicacion) values(?,?,?)";
            PreparedStatement statement =conn.prepareStatement(Query);
          
            statement.setString(1, txtFechaAnti.getText());
            statement.setString(2, txtProductoAnti.getText());
            statement.setString(3, txtPA.getText());
          
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Guardados");
             limpiar3();
            verdatos3("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR");
            System.out.println(e);
        }
        
    }//GEN-LAST:event_btnGuardarAntiActionPerformed

    private void btnVerAntiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAntiActionPerformed
        verdatos3("");
    }//GEN-LAST:event_btnVerAntiActionPerformed

    private void btnCancelarAntiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAntiActionPerformed
       int num;
        num =JOptionPane.showConfirmDialog(null,"¿Desea salir del sistema?","Salida del sistema",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(num==0){
            System.exit(0);}
    }//GEN-LAST:event_btnCancelarAntiActionPerformed

    private void btnEliminarAntiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAntiActionPerformed
           int filas =tbAntipulgas.getSelectedRow();
        String code="";
        code=tbAntipulgas.getValueAt(filas,0).toString();
        try {
            PreparedStatement pste=conn.prepareStatement("DELETE from antipulgas where  Id='"+txtIdAnti.getText()+"'");
            pste.executeUpdate();
            limpiar3();
            verdatos3("");
        } catch (Exception e) { 
            System.out.println(e);
        }
    }//GEN-LAST:event_btnEliminarAntiActionPerformed

    private void btnEditarAntiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAntiActionPerformed
        try {
            PreparedStatement pst=conn.prepareStatement("UPDATE antipulgas SET" + " fecha='"+txtFechaAnti.getText()+"',producto='"+txtProductoAnti.getText()+"', aplicacion='"+txtPA.getText()+"' WHERE Id='"+txtIdAnti.getText()+"'");
            pst.executeUpdate();
            verdatos3("");
            limpiar3();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnEditarAntiActionPerformed

    private void btnElegirAntiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirAntiActionPerformed
        int fila = tbAntipulgas.getSelectedRow(); 
        if (fila>0) {
            
            txtIdAnti.setText(tbAntipulgas.getValueAt(fila, 0).toString()); 
            txtFechaAnti.setText(tbAntipulgas.getValueAt(fila, 1).toString());
            txtProductoAnti.setText(tbAntipulgas.getValueAt(fila, 2).toString());  
            txtPA.setText(tbAntipulgas.getValueAt(fila, 3).toString()); 
         
            
        } else { 
            JOptionPane.showMessageDialog(null, "Seleciones un registro para poder modificar"); 
            
        }
    }//GEN-LAST:event_btnElegirAntiActionPerformed

    private void tbCaninoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCaninoMouseClicked
            int seleccion = tbCanino.rowAtPoint(evt.getPoint()); 
            
            //txtCC.setText(String.valueOf(tbCanino.getValueAt(seleccion, 0)));
            
            txtCC.setText(String.valueOf(tbCanino.getValueAt(seleccion, 0).toString()));
            txtNombre.setText(String.valueOf(tbCanino.getValueAt(seleccion, 1).toString()));
            txtEspecie.setText(String.valueOf(tbCanino.getValueAt(seleccion, 2).toString()));
            txtEstatura.setText(String.valueOf(tbCanino.getValueAt(seleccion, 3).toString()));
            txtRaza.setText(String.valueOf(tbCanino.getValueAt(seleccion, 4).toString()));
            txtPeso.setText(String.valueOf(tbCanino.getValueAt(seleccion, 5).toString()));
            txtColor.setText(String.valueOf(tbCanino.getValueAt(seleccion, 6).toString()));
            txtFR.setText(String.valueOf(tbCanino.getValueAt(seleccion, 7).toString()));
            txtOrigen.setText(String.valueOf(tbCanino.getValueAt(seleccion, 8).toString()));
            txtEsterilizado.setText(String.valueOf(tbCanino.getValueAt(seleccion, 9).toString()));
            txtCondicion.setText(String.valueOf(tbCanino.getValueAt(seleccion, 10).toString()));
            txtEstado.setText(String.valueOf(tbCanino.getValueAt(seleccion, 11).toString()));
            txtRescatista.setText(String.valueOf(tbCanino.getValueAt(seleccion, 12).toString()));
            txtVacunado.setText(String.valueOf(tbCanino.getValueAt(seleccion, 13).toString()));
        
    }//GEN-LAST:event_tbCaninoMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        FiltrarNombre(txtBuscar.getText().trim());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
            try {
                PrinterJob gap = PrinterJob.getPrinterJob();
                gap.setPrintable(this);
                boolean top = gap.printDialog();
                if (top) {
                    gap.print();
                }
        } catch (PrinterException pex) {
            JOptionPane.showMessageDialog(null, "ERROR DE PROGRAMA", "ERROR \n"+pex,JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btnImprimirActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrontFAAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrontFAAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrontFAAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrontFAAN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrontFAAN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Registro;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarAnti;
    private javax.swing.JButton btnCancelarDespa;
    private javax.swing.JButton btnCancelarVacuna;
    private javax.swing.JButton btnEditarAnti;
    private javax.swing.JButton btnEditarVacuna;
    private javax.swing.JButton btnEditarVacunas;
    private javax.swing.JButton btnElegir;
    private javax.swing.JButton btnElegirAnti;
    private javax.swing.JButton btnElegirDespa;
    private javax.swing.JButton btnElegirVacuna;
    private javax.swing.JButton btnEliminacionVacuna;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarAnti;
    private javax.swing.JButton btnEliminarDespa;
    private javax.swing.JButton btnGuardarAnti;
    private javax.swing.JButton btnGuardarDespa;
    private javax.swing.JButton btnGuardarVacuna;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrarTabla;
    private javax.swing.JButton btnMstrarDespa;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVerAnti;
    private javax.swing.JButton btnVerTablaVacunas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable tbAntipulgas;
    public javax.swing.JTable tbCanino;
    private javax.swing.JTable tbDesparasitaciones;
    private javax.swing.JTable tbVacunas;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCC;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtCondicion;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtEstatura;
    private javax.swing.JTextField txtEsterilizado;
    private javax.swing.JTextField txtFR;
    private javax.swing.JTextField txtFechaAnti;
    private javax.swing.JTextField txtFechaDespa;
    private javax.swing.JTextField txtFechaVacunas;
    private javax.swing.JTextField txtIDDespa;
    private javax.swing.JTextField txtIDVacunas;
    private javax.swing.JTextField txtIdAnti;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOrigen;
    private javax.swing.JTextField txtPA;
    private javax.swing.JTextField txtPD;
    private javax.swing.JTextField txtPV;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtPesoDespa;
    private javax.swing.JTextField txtProductoAnti;
    private javax.swing.JTextField txtProductoDespa;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtRescatista;
    private javax.swing.JTextField txtVacunaVacuna;
    private javax.swing.JTextField txtVacunado;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graf, PageFormat pagfor, int index) throws PrinterException {
        if(index>0)
        {
        return NO_SUCH_PAGE;
        }
        Graphics2D hd = (Graphics2D) graf;
        hd.translate(pagfor.getImageableX() +30 ,pagfor.getImageableY()+30); 
        hd.scale(0.5,0.5);  
        Registro.printAll(graf);
        return PAGE_EXISTS;
        
    }


} 

 
