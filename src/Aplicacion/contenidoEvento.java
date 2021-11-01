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
import libreria.Usuarios;

/**
 *
 * @author Bernardo SJ
 */
public class contenidoEvento extends javax.swing.JFrame {

    /**
     * Creates new form contenidoEvento
     */
    public contenidoEvento(int num) {
        getContentPane().setBackground(Color.decode("#74101E"));
        initComponents();
        jTextArea1.setLineWrap(true);
        this.setResizable(false);
        if(num==1){
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                inicioAlumno n = new inicioAlumno();
                n.setVisible(true);
            }
        });
        txtTitulo.setText(Usuarios.registro.eventos.get(vercursoalumno.pos).getNombre());
        maestro.setText(Usuarios.registro.eventos.get(vercursoalumno.pos).getNombreMaestro());
        lugar.setText(Usuarios.registro.eventos.get(vercursoalumno.pos).getLugar());
        hi.setText(Usuarios.registro.eventos.get(vercursoalumno.pos).getHoraInicio());
        hf.setText(Usuarios.registro.eventos.get(vercursoalumno.pos).getHoraFinal());
        jTextArea1.setText(Usuarios.registro.eventos.get(vercursoalumno.pos).getDescripcion());
        }else{
          addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                inscripcionaevento n = new inscripcionaevento();
                n.setVisible(true);
            }
        });
        txtTitulo.setText(Usuarios.registro.eventos.get(inscripcionaevento.pos).getNombre());
        maestro.setText(Usuarios.registro.eventos.get(inscripcionaevento.pos).getNombreMaestro());
        lugar.setText(Usuarios.registro.eventos.get(inscripcionaevento.pos).getLugar());
        hi.setText(Usuarios.registro.eventos.get(inscripcionaevento.pos).getHoraInicio());
        hf.setText(Usuarios.registro.eventos.get(inscripcionaevento.pos).getHoraFinal());
        jTextArea1.setText(Usuarios.registro.eventos.get(inscripcionaevento.pos).getDescripcion());
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

        txtTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        maestro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lugar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hi = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        hf = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTitulo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Maestro: ");

        maestro.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        maestro.setForeground(new java.awt.Color(255, 255, 255));
        maestro.setText("maestr");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lugar:");

        lugar.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        lugar.setForeground(new java.awt.Color(255, 255, 255));
        lugar.setText("jLabel3");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("H.I");

        hi.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        hi.setForeground(new java.awt.Color(255, 255, 255));
        hi.setText("jLabel4");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("H.F");

        hf.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        hf.setForeground(new java.awt.Color(255, 255, 255));
        hf.setText("jLabel5");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 3, 13)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Descripción:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maestro, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addGap(8, 8, 8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(hf)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lugar;
    private javax.swing.JLabel maestro;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
