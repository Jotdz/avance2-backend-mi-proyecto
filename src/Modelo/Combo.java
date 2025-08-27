/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Josué Sánchez
 */
public class Combo extends Producto {
    
    private final List<Producto> productosIncluidos = new ArrayList<>();
    
    public Combo(int productoID, String comboNombre, double precioCombo) {
        super(productoID, comboNombre, precioCombo, "Combo");
    }

    public void agregarProductoIncluido(Producto p) { 
        if (p != null) productosIncluidos.add(p); 
    }

    public List<Producto> getProductosIncluidos() { 
        return productosIncluidos; 
    }

    @Override
    public String toString() {
        return "Combo " + getProductoNombre() + " - \u20A1" + String.format("%.2f", getPrecio());
    } 
}
