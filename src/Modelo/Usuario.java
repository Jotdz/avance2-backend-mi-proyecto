/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Josué Sánchez
 */
public class Usuario {
    
    private int usuarioID;
    private String usuarioNombre;
    private String rol;
    private String usuario;
    private String password;

    public Usuario(int usuarioID, String usuarioNombre, String rol, String usuario, String password) {
        this.usuarioID = usuarioID;
        this.usuarioNombre = usuarioNombre;
        this.rol = rol;
        this.usuario = usuario;
        this.password = password;
    }

    public int getUsuarioID() {
        return usuarioID;
    }

    public String getUsuarioNombre() {
        return usuarioNombre;
    }

    public String getRol() {
        return rol;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }
    
    
    


    
}
