/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author ANTHONY ROMERO GONZALES
 */
public class Ciclo {
    private int idCiclo;
    private String nombre;
    
    private ArrayList<Curso> cursos;
    
    public Ciclo(int idCiclo,String nombre){
    }

    public int getIdCiclo() {
        return idCiclo;
    }

    public void setIdCiclo(int idCiclo) {
        this.idCiclo = idCiclo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }
    
    public void insertarCurso(Curso curso){
    }
}
