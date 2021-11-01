/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;


import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Bernardo SJ
 */
public class Alumnos extends Usuarios implements Serializable{
    private String numReferenciaBanco;
    private String carrera;
    private String direccion;
    public ArrayList<Eventos> inscrito=new ArrayList();

    public String getNumReferenciaBanco() {
        return numReferenciaBanco;
    }

    public void setNumReferenciaBanco(String numReferenciaBanco) {
        this.numReferenciaBanco = numReferenciaBanco;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    

}
