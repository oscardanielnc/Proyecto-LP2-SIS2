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
	
}
