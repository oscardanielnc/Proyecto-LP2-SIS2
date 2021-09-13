/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author RENZO ERNESTO RICHLE GIANOTTI
 * 
 */
public class Usuario {
    private int codigoPUCP;
	private String nombre;
	private String correo;
	private String contrasena; 
	private Date fechaNacimiento;
	private int tipo;
	private boolean activo;
	private byte[] foto;
	private double creditosTot = 0.0;
	private ArrayList<String> comentarios;
	private boolean asesor;
	
	// Clases instanciadas en Usuario
	private ArrayList<Curso> cursos;
	//private Calendario calendario;
	private ArrayList<Post> posts;
	private Facultad facultad;
	
	// Constructo de Usuario
	public Usuario(int codigoPUCP, String nombre, String correo, String contrasena,
	Date fechaNacimiento, int tipo, boolean activo, boolean asesor){
		this.codigoPUCP = codigoPUCP;
		this.nombre = nombre;
		this.correo = correo;
		this.contrasena = contrasena;
		this.fechaNacimiento = fechaNacimiento;
		this.tipo = tipo;
		this.activo = activo;
		this.asesor = asesor;
		comentarios = new ArrayList<>();
		cursos = new ArrayList<>();
		posts = new ArrayList<>();
	} 
	// Métodos de Usuario
	public void addFoto(byte[] foto){
            this.setFoto(foto);
	}
	// Métodos para añadir y quitar cursos
	public void addCurso(Curso curso){
            this.getCursos().add(curso);
		addCreditos(curso);
	}
	public void addCreditos(Curso curso){
            this.setCreditosTot(this.getCreditosTot() + curso.getCreditos());
	}
	public void quitarCurso(Curso curso){
            this.getCursos().remove(curso);
		quitarCreditos(curso);
	}
	public void quitarCreditos(Curso curso){
            this.setCreditosTot(this.getCreditosTot() - curso.getCreditos());
	}
	// Añadir comentario en el perfil 
	public void addComentario(String comment){
            this.getComentarios().add(comment);
	}
	public void eliminarComentario(String comment){
            this.getComentarios().remove(comment);
	}
	// Activar modo asesor
	public void activarAsesor(){
            this.setAsesor(true);
	}

    /**
     * @return the codigoPUCP
     */
    public int getCodigoPUCP() {
        return codigoPUCP;
    }

    /**
     * @param codigoPUCP the codigoPUCP to set
     */
    public void setCodigoPUCP(int codigoPUCP) {
        this.codigoPUCP = codigoPUCP;
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
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the contrasena
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * @param contrasena the contrasena to set
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the activo
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * @param activo the activo to set
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    /**
     * @return the foto
     */
    public byte[] getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    /**
     * @return the creditosTot
     */
    public double getCreditosTot() {
        return creditosTot;
    }

    /**
     * @param creditosTot the creditosTot to set
     */
    public void setCreditosTot(double creditosTot) {
        this.creditosTot = creditosTot;
    }

    /**
     * @return the comentarios
     */
    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    /**
     * @param comentarios the comentarios to set
     */
    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }

    /**
     * @return the asesor
     */
    public boolean isAsesor() {
        return asesor;
    }

    /**
     * @param asesor the asesor to set
     */
    public void setAsesor(boolean asesor) {
        this.asesor = asesor;
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
     * @return the facultad
     */
    public Facultad getFacultad() {
        return facultad;
    }

    /**
     * @param facultad the facultad to set
     */
    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }
}
