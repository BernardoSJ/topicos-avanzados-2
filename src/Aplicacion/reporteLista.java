/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import libreria.Usuarios;

/**
 *
 * @author Bernardo SJ
 */
public class reporteLista extends javax.swing.JFrame {

    /**
     * Creates new form reporteLista
     */
    DefaultTableModel modelo;
    public reporteLista() {
        initComponents();
        this.setResizable(false);
        getContentPane().setBackground(Color.WHITE);
        String cabecera[]={"No Control","Nombre","Apellidos","Direccion"};
        modelo=new DefaultTableModel(null,cabecera);
        jTable1.setModel(modelo);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                inicioAdmin n = new inicioAdmin();
                n.setVisible(true);
            }
        });
        for(int i=0;i<Usuarios.registro.alumnos.size();i++){
            for(int j=0;j<Usuarios.registro.alumnos.get(i).inscrito.size();j++){
                if(Usuarios.registro.alumnos.get(i).inscrito.get(j).getId().equals(Usuarios.registro.eventos.get(inicioAdmin.poscurso).getId())){
                   String noControl=Usuarios.registro.alumnos.get(i).getNoControl();
                   String nombre=Usuarios.registro.alumnos.get(i).getNombre();
                   String apellidos=Usuarios.registro.alumnos.get(i).getApellidos();
                   String direccion=Usuarios.registro.alumnos.get(i).getDireccion();
                   Object data[]={noControl,nombre,apellidos,direccion};
                   modelo.addRow(data);
                }
            }
        }
        txtTitulo.setText(Usuarios.registro.eventos.get(inicioAdmin.poscurso).getNombre());
        maestro.setText(Usuarios.registro.eventos.get(inicioAdmin.poscurso).getNombreMaestro());
        lugar.setText(Usuarios.registro.eventos.get(inicioAdmin.poscurso).getLugar());
        hi.setText(Usuarios.registro.eventos.get(inicioAdmin.poscurso).getHoraInicio());
        hf.setText(Usuarios.registro.eventos.get(inicioAdmin.poscurso).getHoraFinal());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        maestro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lugar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hi = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hf = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        maestro.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        maestro.setText("maestr");

        jLabel1.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jLabel1.setText("Lugar:");

        lugar.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        lugar.setText("jLabel3");

        jLabel3.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jLabel3.setText("H.I");

        hi.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        hi.setText("jLabel4");

        jLabel4.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jLabel4.setText("H.F");

        hf.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        hf.setText("jLabel5");

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

        txtTitulo.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Arial", 3, 11)); // NOI18N
        jLabel2.setText("Maestro: ");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplicacion/escudoitd2.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aplicacion/logosistemas2.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maestro, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lugar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hi, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hf, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6))))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(maestro)
                    .addComponent(jLabel1)
                    .addComponent(lugar)
                    .addComponent(jLabel3)
                    .addComponent(hi)
                    .addComponent(jLabel4)
                    .addComponent(hf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hf;
    private javax.swing.JLabel hi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lugar;
    private javax.swing.JLabel maestro;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
