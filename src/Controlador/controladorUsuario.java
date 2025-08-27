/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.Usuario;
import java.util.ArrayList;
import Datos.usuarioDAO;

/**
 *
 * @author Josu? S?nchez
 */
public class controladorUsuario {
    
    private ArrayList<Usuario> listaUsuarios;
    private usuarioDAO usuarioDao; // referencia al DAO

    public controladorUsuario() {
        listaUsuarios = new ArrayList<>();
        usuarioDao = new usuarioDAO(); // inicializar
    }

    public Usuario validarCredenciales(String usuario, String password) {
        return usuarioDao.validarLogin(usuario, password);
    }   
}
