/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Josué Sánchez
 */
public class pedidoDAO {
    
    public int crear(String cliente, double total) {
        String sql = "INSERT INTO pedido (cliente, total) VALUES (?, ?)";
        try (Connection cn = conexionBD.obtenerConexion();
             PreparedStatement ps = cn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, cliente);
            ps.setDouble(2, total);
            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                return rs.next() ? rs.getInt(1) : -1;
            }
        } catch (SQLException e) {
            System.err.println("Error crear pedido: " + e.getMessage());
            return -1;
        }
    }

    public List<String> listarResumen() {
        String sql = "SELECT id, cliente, total, fecha FROM pedido ORDER BY fecha DESC";
        List<String> res = new ArrayList<>();
        try (Connection cn = conexionBD.obtenerConexion();
             PreparedStatement ps = cn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                res.add("#" + rs.getInt("id") + " - " + rs.getString("cliente")
                        + " - \u20A1" + rs.getDouble("total") + " - " + rs.getTimestamp("fecha"));
            }
        } catch (SQLException e) {
            System.err.println("Error listar pedidos: " + e.getMessage());
        }
        return res;
    }
    
}
