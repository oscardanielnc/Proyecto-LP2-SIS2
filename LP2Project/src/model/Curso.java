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

    /**
     * @return the profesores
     */
    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    /**
     * @param profesores the profesores to set
     */
    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    /**
     * @return the usuarios
     */
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * @param usuarios the usuarios to set
     */
    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    /**
     * @return the asesores
     */
    public ArrayList<Profesor> getAsesores() {
        return asesores;
    }

    /**
     * @param asesores the asesores to set
     */
    public void setAsesores(ArrayList<Profesor> asesores) {
        this.asesores = asesores;
    }

    /**
     * @return the posts
     */
    public ArrayList<Post> getPosts() {
        return posts;
    }

    /**
     * @param posts the posts to set
     */
    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }

    /**
     * @return the idCurso
     */
    public int getIdCurso() {
        return idCurso;
    }

    /**
     * @param idCurso the idCurso to set
     */
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the creditos
     */
    public float getCreditos() {
        return creditos;
    }

    /**
     * @param creditos the creditos to set
     */
    public void setCreditos(float creditos) {
        this.creditos = creditos;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the creditosRequeridos
     */
    public float getCreditosRequeridos() {
        return creditosRequeridos;
    }

    /**
     * @param creditosRequeridos the creditosRequeridos to set
     */
    public void setCreditosRequeridos(float creditosRequeridos) {
        this.creditosRequeridos = creditosRequeridos;
    }

    /**
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }
	
}
