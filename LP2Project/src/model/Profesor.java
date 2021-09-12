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
public class Profesor {
    private int idProfesor;
	private String nombre;
	private float calificacion;
	private String correo;
	private byte[] foto;
	private String descripcion;
	private ArrayList<Curso>cursos;
	private int cantCursos;
	
	public Profesor(int idProfesor,String nombre,float calificacion,String correo,String descripcion){
		cursos = new ArrayList<>();
		this.idProfesor = idProfesor;
		this.nombre = nombre;
		this.calificacion = calificacion;
		this.correo = correo;
		this.descripcion = descripcion;
		this.cantCursos = 0;
	}
}
