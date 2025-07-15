/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.Usuario;
import java.util.ArrayList;

/**
 *
 * @author Josu? S?nchez
 */
public class controladorUsuario {
    
    private ArrayList<Usuario> listaUsuarios;

    public controladorUsuario() {
        listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario(1, "Josué Sánchez", "Cajero", "cajero1", "1234"));
        listaUsuarios.add(new Usuario(2, "Admin General", "Administrador", "admin", "admin123"));
    }

    public Usuario validarCredenciales(String usuario, String password) {
        for (Usuario u : listaUsuarios) {
            if (u.getUsuario().equals(usuario) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }
    
}
