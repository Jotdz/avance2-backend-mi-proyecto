/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Josué Sánchez
 */
public class Combo extends Producto {
    private ArrayList<Producto> productosIncluidos;

    public Combo(int productoID, String comboNombre, double precioCombo, ArrayList<Producto> productosIncluidos) {
        super(productoID, comboNombre, precioCombo, "Combo");
        this.productosIncluidos = productosIncluidos;
    }

    public ArrayList<Producto> getProductosIncluidos() {
        return productosIncluidos;
    }


    @Override
    public String toString() {
        return getProductoNombre() + " (Combo) - \u20A1" + getPrecio();
    }    
}
