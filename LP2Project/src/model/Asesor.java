/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author JOSE
 */
public class Asesor {
    private int idAsesor;
	private float calificacion;
	private ArrayList<Curso>cursos;
	
	public Asesor(){
		cursos = new ArrayList<>();
		this.idAsesor = idAsesor;
		this.calificacion = calificacion;
	}

    /**
     * @return the idAsesor
     */
    public int getIdAsesor() {
        return idAsesor;
    }

    /**
     * @param idAsesor the idAsesor to set
     */
    public void setIdAsesor(int idAsesor) {
        this.idAsesor = idAsesor;
    }

    /**
     * @return the calificacion
     */
    public float getCalificacion() {
        return calificacion;
    }

    /**
     * @param calificacion the calificacion to set
     */
    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * @return the cursos
     */
    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    /**
     * @param cursos the cursos to set
     */
    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
	
}
