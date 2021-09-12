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
public class Facultad {
    private int idFacultad;
    private String codFacultad;
    private String nombre;
    private byte[] foto;
    
    private ArrayList<Usuario> usuarios;
    private ArrayList<Post> posts;
    
    public Facultad(int idFacultad,String codFacultad,String nombre,byte[] foto){
    }

    public int getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(int idFacultad) {
        this.idFacultad = idFacultad;
    }

    public String getCodFacultad() {
        return codFacultad;
    }

    public void setCodFacultad(String codFacultad) {
        this.codFacultad = codFacultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }
    
    public void agregarUsuario(Usuario usario){
    }
    
    public void agregarPost(Post post){
    }
}
