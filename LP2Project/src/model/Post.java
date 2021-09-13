/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author JOSE ANTONIO JULCAPOMA REMENTERIO
 */
public class Post {
    private int idPost;
    private String comentario;
    private int likes;
    private int prioridad;
    private ArrayList<Post> Posts;
       
    //unir con Usuario
    private Usuario usuario;
    //unir con Facultad
    private Facultad facultad;
    //unir con Curso
    private Curso curso; 
    
    
    public Post(){
        Posts = new ArrayList<>();
    }    
    
    /**
     * @return the idPost
     */
    public int getIdPost() {
        return idPost;
    }

    /**
     * @param idPost the idPost to set
     */
    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    /**
     * @return the comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * @return the likes
     */
    public int getLikes() {
        return likes;
    }

    /**
     * @param likes the likes to set
     */
    public void setLikes(int likes) {
        this.likes = likes;
    }

    /**
     * @return the prioridad
     */
    public int getPrioridad() {
        return prioridad;
    }

    /**
     * @param prioridad the prioridad to set
     */
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    /**
     * @return the Posts
     */
    public ArrayList<Post> getPosts() {
        return Posts;
    }

    /**
     * @param Posts the Posts to set
     */
    public void setPosts(ArrayList<Post> Posts) {
        this.Posts = Posts;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
}
