/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import Aplicacion.Inicio;
import Aplicacion.ReporteInscripcion;
import Aplicacion.listasAsistencias;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import libreria.Alumnos;
import libreria.Alumnos;
import libreria.Eventos;
import libreria.Eventos;
import libreria.Usuarios;
import libreria.Usuarios;

/**
 *
 * @author Bernardo SJ
 */
public class inicioAdmin extends javax.swing.JFrame {

    /**
     * Creates new form inicioAdmin
     */
    public static DefaultTableModel tabla;
    public static DefaultTableModel tabla2;
    public static DefaultTableModel tabla3;
    public static DefaultTableModel tabla4;

    public inicioAdmin() {
        initComponents();
        int numeroTotal = Usuarios.registro.alumnos.size();
        jPanel1.setOpaque(false);
        jPanel2.setOpaque(false);
        jPanel3.setOpaque(false);
        jPanel4.setOpaque(false);
        jTabbedPane1.setOpaque(false);
        this.setResizable(false);
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/Aplicacion/FondoInterfaz.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
        /*ImageIcon icon=new ImageIcon(this.getClass().getResource("/Aplicacion/FondoInterfaz.jpg"));
        panel panel = new panel();*/
        area.setLineWrap(true);
      /* this.add(panel);
       panel.repaint();*/
        
        
        for (int i = 0; i < numeroTotal; i++) {
            for (int j = 0; j < Usuarios.registro.eventos.size(); j++) {
                if (!Usuarios.registro.alumnos.get(i).inscrito.isEmpty()) {
                    for (int k = 0; k < Usuarios.registro.alumnos.get(i).inscrito.size(); k++) {
                        boolean existe=false;
                        if (Usuarios.registro.alumnos.get(i).inscrito.get(k).getId().equals(Usuarios.registro.eventos.get(j).getId())) {
                            
                            for(int l=0;l<idcurso.getItemCount();l++){
                                System.out.println(idcurso.getItemAt(l));
                               if(idcurso.getItemAt(l).equals(Usuarios.registro.eventos.get(j).getId())){
                                    existe=true;
                                    
                                    break;
                                }
                            }
                            
                            
                            if(!existe){
                                idcurso.addItem(Usuarios.registro.eventos.get(j).getId());
                            }
                        }
                        
                    }
                }
            }
        }
        masculino.setSelected(true);
        ganancia.setText("$" + Usuarios.registro.ganancias + ".00");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Inicio n = new Inicio();
                n.setVisible(true);
            }
        });
        String cabecera[] = {"Id", "Nombre", "Maestro", "Capacidad", "Tipo evento", "Lugar", "Dia", "Hora Inicio", "Hora Final"};
        tabla = new DefaultTableModel(null, cabecera);
        jTable1.setModel(tabla);
        String cabecera2[] = {"No Control", "Nombre", "Apellidos", "Sexo","Dirección","Carrera"};
        tabla2 = new DefaultTableModel(null, cabecera2);
        tablaalumnos.setModel(tabla2);
        tabla3 = new DefaultTableModel(null, cabecera);
        tablaeventos1.setModel(tabla3);
        tabla4 = new DefaultTableModel(null, cabecera);
        jTable4.setModel(tabla4);
        for (int i = 0; i < Usuarios.registro.eventos.size(); i++) {
            if (Usuarios.registro.eventos.get(i).getCapacidad() > 0) {
                String id = Usuarios.registro.eventos.get(i).getId();
                String nombre = Usuarios.registro.eventos.get(i).getNombre();
                String maestro = Usuarios.registro.eventos.get(i).getNombreMaestro();
                int capacidad = Usuarios.registro.eventos.get(i).getCapacidad();
                String tipo = Usuarios.registro.eventos.get(i).getTipoEvento();
                String lugar = Usuarios.registro.eventos.get(i).getLugar();
                String dia = Usuarios.registro.eventos.get(i).getDia();
                String horaI = Usuarios.registro.eventos.get(i).getHoraInicio();
                String horaF = Usuarios.registro.eventos.get(i).getHoraFinal();
                Object data[] = {id, nombre, maestro, capacidad, tipo, lugar, dia, horaI, horaF};
                tabla.addRow(data);
            }
        }
        for (int i = 0; i < Usuarios.registro.alumnos.size(); i++) {
            String nocontrol = Usuarios.registro.alumnos.get(i).getNoControl();
            String nombre = Usuarios.registro.alumnos.get(i).getNombre();
            String apellidos = Usuarios.registro.alumnos.get(i).getApellidos();
            String sexo = Usuarios.registro.alumnos.get(i).getSexo();
            String direccion=Usuarios.registro.alumnos.get(i).getDireccion();
            String carrera = Usuarios.registro.alumnos.get(i).getCarrera();
            Object data[] = {nocontrol, nombre, apellidos, sexo,direccion, carrera};
            tabla2.addRow(data);
        }

        for (int i = 0; i < Usuarios.registro.eventos.size(); i++) {

            String id = Usuarios.registro.eventos.get(i).getId();
            String nombre = Usuarios.registro.eventos.get(i).getNombre();
            String maestro = Usuarios.registro.eventos.get(i).getNombreMaestro();
            int capacidad = Usuarios.registro.eventos.get(i).getCapacidad();
            String tipo = Usuarios.registro.eventos.get(i).getTipoEvento();
            String lugar = Usuarios.registro.eventos.get(i).getLugar();
            String dia = Usuarios.registro.eventos.get(i).getDia();
            String horaI = Usuarios.registro.eventos.get(i).getHoraInicio();
            String horaF = Usuarios.registro.eventos.get(i).getHoraFinal();
            Object data[] = {id, nombre, maestro, capacidad, tipo, lugar, dia, horaI, horaF};
            tabla3.addRow(data);

        }
        for (int i = 0; i < Usuarios.registro.eventos.size(); i++) {

            String id = Usuarios.registro.eventos.get(i).getId();
            String nombre = Usuarios.registro.eventos.get(i).getNombre();
            String maestro = Usuarios.registro.eventos.get(i).getNombreMaestro();
            int capacidad = Usuarios.registro.eventos.get(i).getCapacidad();
            String tipo = Usuarios.registro.eventos.get(i).getTipoEvento();
            String lugar = Usuarios.registro.eventos.get(i).getLugar();
            String dia = Usuarios.registro.eventos.get(i).getDia();
            String horaI = Usuarios.registro.eventos.get(i).getHoraInicio();
            String horaF = Usuarios.registro.eventos.get(i).getHoraFinal();
            Object data[] = {id, nombre, maestro, capacidad, tipo, lugar, dia, horaI, horaF};
            tabla4.addRow(data);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        ganancia = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        combocarrera = new javax.swing.JComboBox<>();
        txtNoControl = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        masculino = new javax.swing.JRadioButton();
        femenino = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaalumnos = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaeventos1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        combotipolista = new javax.swing.JComboBox<>();
        generar = new javax.swing.JButton();
        idcurso = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNombreEvento = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNombreMaestro = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        combotipoevento = new javax.swing.JComboBox<>();
        combolugar = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        txtbuscar1 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        horaInicio = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        horafinal = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        combodia = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N

        jPanel1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N

        ganancia.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        ganancia.setForeground(new java.awt.Color(255, 255, 255));
        ganancia.setText("000000");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ganancias: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Eventos disponibles con cupo");

        jTable1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
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

        jLabel25.setFont(new java.awt.Font("Tahoma", 3, 28)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Información general del congreso");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ganancia, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ganancia, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inicio Administrador", jPanel1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No Control: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Número referencia el banco: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Apellidos: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Carrera:");

        combocarrera.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        combocarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ing. En Sistemas Computacionales", "Ing. En Informatica", "Ing. En Tecnologias de la Información y comunicación" }));

        txtNoControl.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N

        txtNumero.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N

        txtApellidos.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sexo:");

        buttonGroup1.add(masculino);
        masculino.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        masculino.setForeground(new java.awt.Color(255, 255, 255));
        masculino.setText("Maculino");

        buttonGroup1.add(femenino);
        femenino.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        femenino.setForeground(new java.awt.Color(255, 255, 255));
        femenino.setText("Femenino");

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Buscar: ");

        txtbuscar.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N

        tablaalumnos.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        tablaalumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaalumnos);

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Dirección: ");

        txtDireccion.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Acciones a realizar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jButton1)
                        .addGap(40, 40, 40)
                        .addComponent(jButton2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(41, 41, 41)
                                .addComponent(masculino)
                                .addGap(21, 21, 21)
                                .addComponent(femenino))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(85, 85, 85)
                                    .addComponent(txtNoControl, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel24))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(combocarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNombre)
                                            .addComponent(txtApellidos)
                                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addComponent(jButton3)
                .addGap(75, 75, 75))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNoControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(masculino)
                            .addComponent(femenino)
                            .addComponent(jLabel9))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(combocarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Alumnos Interesados", jPanel2);

        tablaeventos1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        tablaeventos1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tablaeventos1);

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Generación de listas");

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tipo de Lista:");

        combotipolista.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        combotipolista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reporte", "Lista de asistencia para maestro" }));

        generar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        generar.setText("Generar");
        generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarActionPerformed(evt);
            }
        });

        idcurso.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Ingresa la ID del evento:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idcurso, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(combotipolista, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(generar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(352, 352, 352))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(combotipolista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generar)
                    .addComponent(idcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(81, 81, 81)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listas de Asistencia", jPanel3);

        jPanel4.setPreferredSize(new java.awt.Dimension(893, 589));

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Registrar");

        jLabel14.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Nombre evento: ");

        txtNombreEvento.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre maestro: ");

        txtNombreMaestro.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Capacidad: ");

        txtCapacidad.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        txtCapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapacidadKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Tipo Evento: ");

        jLabel18.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Lugar:");

        combotipoevento.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        combotipoevento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TALLER", "CONFERENCIA" }));

        combolugar.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        combolugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gimnasio ITD", "Aulas Duplex", "Aula Gillot" }));

        jLabel19.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Descripción");

        area.setColumns(20);
        area.setFont(new java.awt.Font("Monospaced", 3, 13)); // NOI18N
        area.setRows(5);
        jScrollPane4.setViewportView(area);

        jButton5.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton5.setText("Registrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton6.setText("Limpiar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Buscar: ");

        txtbuscar1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N

        jButton7.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton7.setText("Buscar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTable4.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(jTable4);

        jButton8.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton8.setText("Pedir espacios");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Hora de inicio");

        horaInicio.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        horaInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                horaInicioKeyTyped(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Hora Final");

        horafinal.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        horafinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                horafinalKeyTyped(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Dia");

        combodia.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        combodia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" }));

        jButton4.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Acciones a realizar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreEvento, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(txtNombreMaestro)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(horaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(horafinal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel23)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel18)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combodia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combolugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combotipoevento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(122, 122, 122)
                                .addComponent(jButton6))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7)
                            .addComponent(jButton8))
                        .addGap(5, 5, 5)
                        .addComponent(jButton4)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel13))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(27, 27, 27)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(txtbuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(jButton7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton8)
                                            .addComponent(jLabel14)
                                            .addComponent(txtNombreEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(horaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22)
                                    .addComponent(horafinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(combodia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(combotipoevento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(combolugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(78, 78, 78))
        );

        jTabbedPane1.addTab("Eventos", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static String nocontrol, numeroreferencia, nombre, apellidos, direccion, sexo, carrera;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtNoControl.getText().equals("") || txtNumero.getText().equals("") || txtNombre.getText().equals("") || txtApellidos.getText().equals("") || txtDireccion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Asegurate de llenar todas las cajas de texto", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            nocontrol = txtNoControl.getText();
            numeroreferencia = txtNumero.getText().toUpperCase();
            nombre = txtNombre.getText().toUpperCase();
            apellidos = txtApellidos.getText().toUpperCase();
            direccion = txtDireccion.getText().toUpperCase();
            sexo = "";
            if (masculino.isSelected()) {
                sexo = masculino.getText();
            }
            if (femenino.isSelected()) {
                sexo = femenino.getText();
            }
            carrera = combocarrera.getSelectedItem().toString();
            boolean existe = false;
            for (int i = 0; i < Usuarios.registro.alumnos.size(); i++) {
                if (Usuarios.registro.alumnos.get(i).getNoControl().equals(nocontrol)) {
                    existe = true;
                }
            }
            if (existe) {
                JOptionPane.showMessageDialog(null, "El alumno con ese No Control ya esta inscrito en sistema de eventos", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                if (numeroreferencia.substring(0, 3).equals("MLB")) {
                    boolean existe2 = false;
                    for (int i = 0; i < Usuarios.registro.alumnos.size(); i++) {
                        if (Usuarios.registro.alumnos.get(i).getNoControl().equals(nocontrol)) {
                            existe2 = true;
                        }
                    }
                    if (existe2) {
                        JOptionPane.showMessageDialog(null, "Ese número de referencia ya fue canjeado anteriormente", "ERROR", JOptionPane.ERROR_MESSAGE);
                    } else {
                        Alumnos obj = new Alumnos();
                        obj.setNoControl(nocontrol);
                        obj.setNip("1234");
                        obj.setNumReferenciaBanco(numeroreferencia);
                        obj.setNombre(nombre);
                        obj.setApellidos(apellidos);
                        obj.setSexo(sexo);
                        obj.setCarrera(carrera);
                        obj.setDireccion(direccion);
                        Usuarios.registro.alumnos.add(obj);
                        limpiarTabla(tabla2);

                        for (int i = 0; i < Usuarios.registro.alumnos.size(); i++) {
                            String nocontrol2 = Usuarios.registro.alumnos.get(i).getNoControl();
                            String nombre2 = Usuarios.registro.alumnos.get(i).getNombre();
                            String apellidos2 = Usuarios.registro.alumnos.get(i).getApellidos();
                            String sexo2 = Usuarios.registro.alumnos.get(i).getSexo();
                            String direccion2=Usuarios.registro.alumnos.get(i).getDireccion();
                            String carrera2 = Usuarios.registro.alumnos.get(i).getCarrera();
                            Object data[] = {nocontrol2, nombre2, apellidos2, sexo2,direccion2, carrera2};
                            tabla2.addRow(data);
                        }
                        txtNoControl.setText("");
                        txtNumero.setText("");
                        txtNombre.setText("");
                        txtApellidos.setText("");
                        txtbuscar.setText("");
                        Usuarios.registro.ganancias += 150;
                        ganancia.setText("$" + Usuarios.registro.ganancias + ".00");

                        JOptionPane.showMessageDialog(null, "Alumno guardado con exito");
                        ReporteInscripcion n = new ReporteInscripcion();
                        n.setVisible(true);
                        this.dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El número de referencia no es valido", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        Usuarios.registro.guardar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtNoControl.setText("");
        txtNumero.setText("");
        txtNombre.setText("");
        txtApellidos.setText("");
        txtbuscar.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (txtbuscar.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Asegurate de llenar la caja de texto del boton buscar");
        } else {
            limpiarTabla(tabla2);
            boolean existe = false;
            for (int i = 0; i < Usuarios.registro.alumnos.size(); i++) {
                if (Usuarios.registro.alumnos.get(i).getNoControl().equals(txtbuscar.getText())) {
                    existe = true;
                }
            }
            if (existe) {
                for (int i = 0; i < Usuarios.registro.alumnos.size(); i++) {
                    if (Usuarios.registro.alumnos.get(i).getNoControl().equals(txtbuscar.getText())) {
                        String nocontrol2 = Usuarios.registro.alumnos.get(i).getNoControl();
                        String nombre2 = Usuarios.registro.alumnos.get(i).getNombre();
                        String apellidos2 = Usuarios.registro.alumnos.get(i).getApellidos();
                        String sexo2 = Usuarios.registro.alumnos.get(i).getSexo();
                        String carrera2 = Usuarios.registro.alumnos.get(i).getCarrera();
                        Object data[] = {nocontrol2, nombre2, apellidos2, sexo2, carrera2};
                        tabla2.addRow(data);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ese numero de control no esta registrado");
                for (int i = 0; i < Usuarios.registro.alumnos.size(); i++) {
                    String nocontrol2 = Usuarios.registro.alumnos.get(i).getNoControl();
                    String nombre2 = Usuarios.registro.alumnos.get(i).getNombre();
                    String apellidos2 = Usuarios.registro.alumnos.get(i).getApellidos();
                    String sexo2 = Usuarios.registro.alumnos.get(i).getSexo();
                    String carrera2 = Usuarios.registro.alumnos.get(i).getCarrera();
                    Object data[] = {nocontrol2, nombre2, apellidos2, sexo2, carrera2};
                    tabla2.addRow(data);
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (txtNombreEvento.getText().equals("") || txtNombreMaestro.getText().equals("") || txtCapacidad.getText().equals("") || horaInicio.getText().equals("") || horafinal.getText().equals("") || area.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Asegurate de llenar todas las cajas de texto", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            String nombre = txtNombreEvento.getText();
            String maestro = txtNombreMaestro.getText();
            int capacidad = Integer.parseInt(txtCapacidad.getText());
            String horainicio = horaInicio.getText() + ":00";
            String horaFinal = horafinal.getText() + ":00";
            String descripcion = area.getText();
            String tipo = combotipoevento.getSelectedItem().toString();
            String lugar = combolugar.getSelectedItem().toString();
            String dia = combodia.getSelectedItem().toString();
            if (Integer.parseInt("" + horainicio.charAt(0)) >= Integer.parseInt("" + horaFinal.charAt(0))) {
                JOptionPane.showMessageDialog(null, "La hora final del evento no puede ser igual o menor a la hora de inicio");
            } else {
                Eventos obj = new Eventos();
                boolean noSePuede = false;
                for (int i = 0; i < Usuarios.registro.eventos.size(); i++) {
                    if (Usuarios.registro.eventos.get(i).getLugar().equals(lugar) && Usuarios.registro.eventos.get(i).getDia().equals(dia)) {
                        int horaI = Integer.parseInt("" + Usuarios.registro.eventos.get(i).getHoraInicio().charAt(0));
                        int horaF = Integer.parseInt("" + Usuarios.registro.eventos.get(i).getHoraFinal().charAt(0));
                        int horaInI = Integer.parseInt("" + horainicio.charAt(0));
                        int horaInF = Integer.parseInt("" + horaFinal.charAt(0));
                        System.out.println(Usuarios.registro.eventos.get(i).getNombre());
                        System.out.println(horaI);
                        System.out.println(horaF);
                        System.out.println(horaInI);
                        System.out.println(horaInF);
                        if (horaI == horaInF || horaF == horaInI) {
                            noSePuede = false;
                        } else {
                            if (horaI >= horaInI || horaF <= horaInF) {
                                JOptionPane.showMessageDialog(null, "Un evento ya esta registrado en el mismo lugar, hora y dia");
                                noSePuede = true;
                                break;
                            }
                        }
                    } else {
                        noSePuede = false;
                    }
                }
                if (noSePuede) {

                } else {

                    if (Usuarios.registro.contadorEventos == 0) {
                        Usuarios.registro.contadorEventos += 3;
                    } else {
                        Usuarios.registro.contadorEventos++;
                    }
                    obj.setId("" + Usuarios.registro.contadorEventos);
                    obj.setNombre(nombre);
                    obj.setNombreMaestro(maestro);
                    obj.setCapacidad(capacidad);
                    obj.setHoraInicio(horainicio);
                    obj.setHoraFinal(horaFinal);
                    obj.setDescripcion(descripcion);
                    obj.setTipoEvento(tipo);
                    obj.setLugar(lugar);
                    obj.setDia(dia);
                    Usuarios.registro.eventos.add(obj);
                    limpiarTabla(tabla4);
                    limpiarTabla(tabla3);
                    limpiarTabla(tabla);
                    for (int i = 0; i < Usuarios.registro.eventos.size(); i++) {

                        String id = Usuarios.registro.eventos.get(i).getId();
                        String nombre1 = Usuarios.registro.eventos.get(i).getNombre();
                        String maestro1 = Usuarios.registro.eventos.get(i).getNombreMaestro();
                        int capacidad1 = Usuarios.registro.eventos.get(i).getCapacidad();
                        String tipo1 = Usuarios.registro.eventos.get(i).getTipoEvento();
                        String lugar1 = Usuarios.registro.eventos.get(i).getLugar();
                        String dial = Usuarios.registro.eventos.get(i).getDia();
                        String horaI = Usuarios.registro.eventos.get(i).getHoraInicio();
                        String horaF = Usuarios.registro.eventos.get(i).getHoraFinal();
                        Object data[] = {id, nombre1, maestro1, capacidad1, tipo1, lugar1, dial, horaI, horaF};
                        tabla4.addRow(data);

                    }
                    for (int i = 0; i < Usuarios.registro.eventos.size(); i++) {

                        String id = Usuarios.registro.eventos.get(i).getId();
                        String nombre2 = Usuarios.registro.eventos.get(i).getNombre();
                        String maestro2 = Usuarios.registro.eventos.get(i).getNombreMaestro();
                        int capacidad2 = Usuarios.registro.eventos.get(i).getCapacidad();
                        String tipo2 = Usuarios.registro.eventos.get(i).getTipoEvento();
                        String lugar2 = Usuarios.registro.eventos.get(i).getLugar();
                        String dia2 = Usuarios.registro.eventos.get(i).getDia();
                        String horaI = Usuarios.registro.eventos.get(i).getHoraInicio();
                        String horaF = Usuarios.registro.eventos.get(i).getHoraFinal();
                        Object data[] = {id, nombre2, maestro2, capacidad2, tipo2, lugar2, dia2, horaI, horaF};
                        tabla3.addRow(data);

                    }

                    for (int i = 0; i < Usuarios.registro.eventos.size(); i++) {
                        if (Usuarios.registro.eventos.get(i).getCapacidad() > 0) {
                            String id = Usuarios.registro.eventos.get(i).getId();
                            String nombre3 = Usuarios.registro.eventos.get(i).getNombre();
                            String maestro3 = Usuarios.registro.eventos.get(i).getNombreMaestro();
                            int capacidad3 = Usuarios.registro.eventos.get(i).getCapacidad();
                            String tipo3 = Usuarios.registro.eventos.get(i).getTipoEvento();
                            String lugar3 = Usuarios.registro.eventos.get(i).getLugar();
                            String dia3 = Usuarios.registro.eventos.get(i).getDia();
                            String horaI = Usuarios.registro.eventos.get(i).getHoraInicio();
                            String horaF = Usuarios.registro.eventos.get(i).getHoraFinal();
                            Object data[] = {id, nombre3, maestro3, capacidad3, tipo3, lugar3, dia3, horaI, horaF};
                            tabla.addRow(data);
                        }
                    }
                    txtNombreEvento.setText("");
                    txtNombreMaestro.setText("");
                    txtCapacidad.setText("");
                    horaInicio.setText("");
                    horafinal.setText("");
                    area.setText("");
                    JOptionPane.showMessageDialog(null, "El evento se añadio con exito");
                }
            }
            Usuarios.registro.guardar();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (txtbuscar1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Asegurate de llenar la caja de texto del boton buscar");
        } else {
            limpiarTabla(tabla4);
            boolean existe = false;
            for (int i = 0; i < Usuarios.registro.eventos.size(); i++) {
                System.out.println(Usuarios.registro.eventos.get(i).getId());
                if (Usuarios.registro.eventos.get(i).getId().equals(txtbuscar1.getText())) {
                    existe = true;
                }
            }
            if (existe) {
                for (int i = 0; i < Usuarios.registro.eventos.size(); i++) {
                    if (Usuarios.registro.eventos.get(i).getId().equals(txtbuscar1.getText())) {
                        String id = Usuarios.registro.eventos.get(i).getId();
                        String nombre1 = Usuarios.registro.eventos.get(i).getNombre();
                        String maestro1 = Usuarios.registro.eventos.get(i).getNombreMaestro();
                        int capacidad1 = Usuarios.registro.eventos.get(i).getCapacidad();
                        String tipo1 = Usuarios.registro.eventos.get(i).getTipoEvento();
                        String lugar1 = Usuarios.registro.eventos.get(i).getLugar();
                        String dia = Usuarios.registro.eventos.get(i).getDia();
                        String horaI = Usuarios.registro.eventos.get(i).getHoraInicio();
                        String horaF = Usuarios.registro.eventos.get(i).getHoraFinal();
                        Object data[] = {id, nombre1, maestro1, capacidad1, tipo1, lugar1, dia, horaI, horaF};
                        tabla4.addRow(data);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Esa ID no esta registrada");
                for (int i = 0; i < Usuarios.registro.eventos.size(); i++) {

                    String id = Usuarios.registro.eventos.get(i).getId();
                    String nombre1 = Usuarios.registro.eventos.get(i).getNombre();
                    String maestro1 = Usuarios.registro.eventos.get(i).getNombreMaestro();
                    int capacidad1 = Usuarios.registro.eventos.get(i).getCapacidad();
                    String tipo1 = Usuarios.registro.eventos.get(i).getTipoEvento();
                    String lugar1 = Usuarios.registro.eventos.get(i).getLugar();
                    String dia = Usuarios.registro.eventos.get(i).getDia();
                    String horaI = Usuarios.registro.eventos.get(i).getHoraInicio();
                    String horaF = Usuarios.registro.eventos.get(i).getHoraFinal();
                    Object data[] = {id, nombre1, maestro1, capacidad1, tipo1, lugar1, dia, horaI, horaF};
                    tabla4.addRow(data);

                }
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        txtNombreEvento.setText("");
        txtNombreMaestro.setText("");
        txtCapacidad.setText("");
        horaInicio.setText("");
        horafinal.setText("");
        area.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            int pos = 0;
            if (txtbuscar1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Asegurate de llenar la caja de texto del boton buscar");
            } else {
                boolean existe = false;

                for (int i = 0; i < Usuarios.registro.eventos.size(); i++) {
                    if (Usuarios.registro.eventos.get(i).getId().equals(txtbuscar1.getText())) {
                        existe = true;
                        pos = i;
                    }
                }
                if (existe) {
                    int n = Integer.parseInt(JOptionPane.showInputDialog("Cuabtas unidades quieres"));
                    int n2 = Usuarios.registro.eventos.get(pos).getCapacidad() + n;
                    Usuarios.registro.eventos.get(pos).setCapacidad(n2);
                    limpiarTabla(tabla4);
                    limpiarTabla(tabla3);
                    limpiarTabla(tabla);
                    for (int i = 0; i < Usuarios.registro.eventos.size(); i++) {

                        String id = Usuarios.registro.eventos.get(i).getId();
                        String nombre1 = Usuarios.registro.eventos.get(i).getNombre();
                        String maestro1 = Usuarios.registro.eventos.get(i).getNombreMaestro();
                        int capacidad1 = Usuarios.registro.eventos.get(i).getCapacidad();
                        String tipo1 = Usuarios.registro.eventos.get(i).getTipoEvento();
                        String lugar1 = Usuarios.registro.eventos.get(i).getLugar();
                        String dis = Usuarios.registro.eventos.get(i).getDia();
                        String horaI = Usuarios.registro.eventos.get(i).getHoraInicio();
                        String horaF = Usuarios.registro.eventos.get(i).getHoraFinal();
                        Object data[] = {id, nombre1, maestro1, capacidad1, tipo1, lugar1, dis, horaI, horaF};
                        tabla4.addRow(data);

                    }
                    for (int i = 0; i < Usuarios.registro.eventos.size(); i++) {

                        String id = Usuarios.registro.eventos.get(i).getId();
                        String nombre2 = Usuarios.registro.eventos.get(i).getNombre();
                        String maestro2 = Usuarios.registro.eventos.get(i).getNombreMaestro();
                        int capacidad2 = Usuarios.registro.eventos.get(i).getCapacidad();
                        String tipo2 = Usuarios.registro.eventos.get(i).getTipoEvento();
                        String lugar2 = Usuarios.registro.eventos.get(i).getLugar();
                        String dia2 = Usuarios.registro.eventos.get(i).getDia();
                        String horaI = Usuarios.registro.eventos.get(i).getHoraInicio();
                        String horaF = Usuarios.registro.eventos.get(i).getHoraFinal();
                        Object data[] = {id, nombre2, maestro2, capacidad2, tipo2, lugar2, dia2, horaI, horaF};
                        tabla3.addRow(data);

                    }

                    for (int i = 0; i < Usuarios.registro.eventos.size(); i++) {
                        if (Usuarios.registro.eventos.get(i).getCapacidad() > 0) {
                            String id = Usuarios.registro.eventos.get(i).getId();
                            String nombre3 = Usuarios.registro.eventos.get(i).getNombre();
                            String maestro3 = Usuarios.registro.eventos.get(i).getNombreMaestro();
                            int capacidad3 = Usuarios.registro.eventos.get(i).getCapacidad();
                            String tipo3 = Usuarios.registro.eventos.get(i).getTipoEvento();
                            String lugar3 = Usuarios.registro.eventos.get(i).getLugar();
                            String dis = Usuarios.registro.eventos.get(i).getDia();
                            String horaI = Usuarios.registro.eventos.get(i).getHoraInicio();
                            String horaF = Usuarios.registro.eventos.get(i).getHoraFinal();
                            Object data[] = {id, nombre3, maestro3, capacidad3, tipo3, lugar3, dis, horaI, horaF};
                            tabla.addRow(data);
                        }
                    }
                    JOptionPane.showMessageDialog(null,"Las unidades de espacio se añadieron con exito");
                } else {
                    JOptionPane.showMessageDialog(null, "Ese ID no esta registrado");
                }
                Usuarios.registro.guardar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingresa solamente números porfavor", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton8ActionPerformed
    public static int poscurso;
    private void generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarActionPerformed
        try {
            String id = idcurso.getSelectedItem().toString();
            if (id.equals("")) {
                JOptionPane.showMessageDialog(null, "Aún no se puede generar una lista");
            } else {
                poscurso = 0;
                boolean existe = false;
                for (int i = 0; i < Usuarios.registro.eventos.size(); i++) {
                    if (Usuarios.registro.eventos.get(i).getId().equals(id)) {
                        poscurso = i;
                        existe = true;
                        break;
                    } else {
                        existe = false;
                    }
                }
                if (existe) {

                    switch (combotipolista.getSelectedItem().toString()) {
                        case "Reporte":
                            reporteLista n = new reporteLista();
                            n.setVisible(true);
                            this.dispose();
                            break;
                        case "Lista de asistencia para maestro":
                            listasAsistencias n2 = new listasAsistencias();
                            n2.setVisible(true);
                            this.dispose();
                            break;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ese evento no esta registrado", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Aun no puedes crear una lista");
        }
    }//GEN-LAST:event_generarActionPerformed

    private void horaInicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_horaInicioKeyTyped
        char validar = evt.getKeyChar();
        if (validar < '1' || validar > '9') {
            getToolkit().beep();
            evt.consume();
        }
        if (horaInicio.getText().length() == 1) {
            getToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_horaInicioKeyTyped

    private void horafinalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_horafinalKeyTyped
        char validar = evt.getKeyChar();
        if (validar < '1' || validar > '9') {
            getToolkit().beep();
            evt.consume();
        }
        if (horafinal.getText().length() == 1) {
            getToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_horafinalKeyTyped

    private void txtCapacidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapacidadKeyTyped
        char validar = evt.getKeyChar();
        if (validar < '1' || validar > '9') {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCapacidadKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (txtbuscar1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Asegurate de haber llenado la caja de texto de buscar", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            boolean existe = false;
            int pos = 0;
            for (int i = 0; i < Usuarios.registro.eventos.size(); i++) {
                if (Usuarios.registro.eventos.get(i).getId().equals(txtbuscar1.getText())) {
                    pos = i;
                    existe = true;
                }
            }
            if (existe) {
                int op = JOptionPane.showConfirmDialog(null, "¿Seguro que deseas eliminar ese evento", "ADVERTENCIA", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                if (op == 0) {
                    Usuarios.registro.eventos.remove(pos);
                    limpiarTabla(tabla4);
                    limpiarTabla(tabla3);
                    limpiarTabla(tabla);
                    for (int i = 0; i < Usuarios.registro.eventos.size(); i++) {

                        String id = Usuarios.registro.eventos.get(i).getId();
                        String nombre1 = Usuarios.registro.eventos.get(i).getNombre();
                        String maestro1 = Usuarios.registro.eventos.get(i).getNombreMaestro();
                        int capacidad1 = Usuarios.registro.eventos.get(i).getCapacidad();
                        String tipo1 = Usuarios.registro.eventos.get(i).getTipoEvento();
                        String lugar1 = Usuarios.registro.eventos.get(i).getLugar();
                        String dial = Usuarios.registro.eventos.get(i).getDia();
                        String horaI = Usuarios.registro.eventos.get(i).getHoraInicio();
                        String horaF = Usuarios.registro.eventos.get(i).getHoraFinal();
                        Object data[] = {id, nombre1, maestro1, capacidad1, tipo1, lugar1, dial, horaI, horaF};
                        tabla4.addRow(data);

                    }
                    for (int i = 0; i < Usuarios.registro.eventos.size(); i++) {

                        String id = Usuarios.registro.eventos.get(i).getId();
                        String nombre2 = Usuarios.registro.eventos.get(i).getNombre();
                        String maestro2 = Usuarios.registro.eventos.get(i).getNombreMaestro();
                        int capacidad2 = Usuarios.registro.eventos.get(i).getCapacidad();
                        String tipo2 = Usuarios.registro.eventos.get(i).getTipoEvento();
                        String lugar2 = Usuarios.registro.eventos.get(i).getLugar();
                        String dia2 = Usuarios.registro.eventos.get(i).getDia();
                        String horaI = Usuarios.registro.eventos.get(i).getHoraInicio();
                        String horaF = Usuarios.registro.eventos.get(i).getHoraFinal();
                        Object data[] = {id, nombre2, maestro2, capacidad2, tipo2, lugar2, dia2, horaI, horaF};
                        tabla3.addRow(data);

                    }

                    for (int i = 0; i < Usuarios.registro.eventos.size(); i++) {
                        if (Usuarios.registro.eventos.get(i).getCapacidad() > 0) {
                            String id = Usuarios.registro.eventos.get(i).getId();
                            String nombre3 = Usuarios.registro.eventos.get(i).getNombre();
                            String maestro3 = Usuarios.registro.eventos.get(i).getNombreMaestro();
                            int capacidad3 = Usuarios.registro.eventos.get(i).getCapacidad();
                            String tipo3 = Usuarios.registro.eventos.get(i).getTipoEvento();
                            String lugar3 = Usuarios.registro.eventos.get(i).getLugar();
                            String dia3 = Usuarios.registro.eventos.get(i).getDia();
                            String horaI = Usuarios.registro.eventos.get(i).getHoraInicio();
                            String horaF = Usuarios.registro.eventos.get(i).getHoraFinal();
                            Object data[] = {id, nombre3, maestro3, capacidad3, tipo3, lugar3, dia3, horaI, horaF};
                            tabla.addRow(data);
                        }
                    }
                    Usuarios.registro.guardar();

                    JOptionPane.showMessageDialog(null, "El evento fue eliminado con exito");
                }
            } else {
                JOptionPane.showMessageDialog(null, "La ID que ingresaste no existe", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public void limpiarTabla(DefaultTableModel tabla) {
        for (int i = 0; i < tabla.getRowCount(); i++) {
            tabla.removeRow(i);
            i -= 1;
        }
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> combocarrera;
    private javax.swing.JComboBox<String> combodia;
    private javax.swing.JComboBox<String> combolugar;
    private javax.swing.JComboBox<String> combotipoevento;
    private javax.swing.JComboBox<String> combotipolista;
    private javax.swing.JRadioButton femenino;
    private javax.swing.JLabel ganancia;
    public static javax.swing.JButton generar;
    private javax.swing.JTextField horaInicio;
    private javax.swing.JTextField horafinal;
    private javax.swing.JComboBox<String> idcurso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    public static javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable4;
    private javax.swing.JRadioButton masculino;
    private javax.swing.JTable tablaalumnos;
    private javax.swing.JTable tablaeventos1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNoControl;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreEvento;
    private javax.swing.JTextField txtNombreMaestro;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtbuscar1;
    // End of variables declaration//GEN-END:variables
}
