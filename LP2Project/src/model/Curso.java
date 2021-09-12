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
public class Curso {
    //Atributos intanciados
	private ArrayList<Profesor> profesores;
	private ArrayList<Usuario> usuarios;
	private ArrayList<Profesor> asesores;
	private ArrayList<Post> posts;
	//Atributos principales
	private int idCurso;
	private String codigo;
	private String nombre;
	private float creditos;
	private String carrera;
	private int nivel;
	private String descripcion;
	private float creditosRequeridos;
	private int estado;
	////////////////////////////////
	public Curso(int idCurso,String codigo,String nombre,float creditos,String carrera,int nivel,String descripcion,float creditosRequeridos,int estado){
		this.idCurso = idCurso;
		this.codigo = codigo;
		this.nombre = nombre;
		this.creditos = creditos;
		this.carrera = carrera;
		this.nivel = nivel;
		this.descripcion = descripcion;
		this.creditosRequeridos = creditosRequeridos;
		this.estado = estado;
		profesores = new ArrayList<>();
		usuarios = new ArrayList<>();
		asesores = new ArrayList<>();
		posts = new ArrayList<>();
	}
	
}
