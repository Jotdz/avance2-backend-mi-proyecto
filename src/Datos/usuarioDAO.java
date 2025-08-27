/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Josué Sánchez
 */
public class usuarioDAO {
    
    public Usuario validarLogin(String nombreUsuario, String clave) {
        final String sql = """
            SELECT 
                id                AS usuarioID,
                nombre_usuario    AS usuarioNombre,  -- no existe 'nombre', usamos nombre_usuario
                rol               AS rol,
                nombre_usuario    AS usuario,
                clave             AS password
            FROM usuario
            WHERE nombre_usuario = ? AND clave = ?
            LIMIT 1
        """;

        try (Connection cn = conexionBD.obtenerConexion(); 
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, nombreUsuario);
            ps.setString(2, clave);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Usuario(
                        rs.getInt("usuarioID"),
                        rs.getString("usuarioNombre"),
                        rs.getString("rol"),
                        rs.getString("usuario"),
                        rs.getString("password")
                    );
                }
            }
        } catch (SQLException e) {
            System.err.println("Error validarLogin: " + e.getMessage());
        }
        return null;
    }
    
}
