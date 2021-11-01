/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;


import java.io.Serializable;




public class Usuarios implements Serializable{
    private String nombre;
    private String apellidos;
    private String tipoUsuario;
    private String noControl;
    private String nip;
    private String sexo;
    public static Registro registro;
    
     public static void recuperarListas() {
        registro = new Registro(false);

        if (Usuarios.registro.administrador.isEmpty() && Usuarios.registro.alumnos.isEmpty() && Usuarios.registro.eventos.isEmpty()) {
            Usuarios.registro.ganancias=150;
            Usuarios.registro.contadorEventos=0;
            Usuarios n=new Usuarios();
            n.setNoControl("A1998103");
            n.setNip("1234");
            n.setNombre("LUIS");
            n.setApellidos("SOLIS GALLEGOS");
            n.setTipoUsuario("Administrador");
            n.setSexo("Masculino");
            Usuarios.registro.administrador.add(n);
            Alumnos n1=new Alumnos();
            n1.setSexo("Masculino");
            n1.setNoControl("16041248");
            n1.setNip("2372");
            n1.setNombre("BERNARDO");
            n1.setApellidos("SALINAS JAQUEZ");
            n1.setTipoUsuario("Alumno");
            n1.setNumReferenciaBanco("MLB1");
            n1.setCarrera("Ing. En Sistemas Computacionales");
            n1.setDireccion("CHAPULTEPEC 203");
            Usuarios.registro.alumnos.add(n1);
            Eventos n2=new Eventos();
            n2.setId("1");
            n2.setNombre("PROGRAMACIÓN SECUENCIAL");
            n2.setNombreMaestro("LIC. ABEL OLIVAS");
            n2.setTipoEvento("TALLER");
            n2.setHoraInicio("2:00");
            n2.setHoraFinal("3:00");
            n2.setLugar("Aulas Duplex");
            n2.setDescripcion("Es un taller que fue planeado para aquellos "
                    + "alumnos que no se les da la programación y de esta manera que puedan tomar pasión por"
                    + " la programación");
            n2.setDia("Lunes");
            n2.setCapacidad(2);
            Usuarios.registro.eventos.add(n2);
            Eventos n3=new Eventos();
            n3.setId("2");
            n3.setNombre("¿PORQUE RAZON TU CARRERA PODRIA SER LA CARRERA DEL FUTURO?");
            n3.setNombreMaestro("ING. RAUL FERNANDEZ");
            n3.setTipoEvento("CONFERENCIA");
            n3.setHoraInicio("3:00");
            n3.setHoraFinal("4:00");
            n3.setLugar("Gimnasio ITD");
            n3.setDescripcion("Es una conferencia para que los jovenes puedan adquirir amor por sus respectivas carreras "
                    + "y de esa mandera tengan mejores ideas para el futuro");
            n3.setDia("Lunes");
            n3.setCapacidad(2);
            Usuarios.registro.eventos.add(n3);
        }
     }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
