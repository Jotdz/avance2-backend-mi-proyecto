/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;
import java.time.LocalDateTime;

/**
 *
 * @author Josué Sánchez
 */
public class Pedido {
    
    private int pedidoID;
    private ArrayList<Producto> productos;
    private LocalDateTime fechaHora;
    private String estado; 
    private boolean facturado = false;

    public Pedido(int pedidoID) {
        this.pedidoID = pedidoID;
        this.productos = new ArrayList<>();
        this.fechaHora = LocalDateTime.now();
        this.estado = "Pendiente";
    }
    
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void eliminarProducto(Producto p) {
        productos.remove(p);
    }

    public double calcularTotal() {
        return productos.stream().mapToDouble(p -> p.getPrecio()).sum();
    }

    public int getPedidoID() {
        return pedidoID;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public boolean isFacturado() { 
        return facturado; 
    }
    public void setFacturado(boolean facturado) { 
        this.facturado = facturado; 
    }
    
    public void marcarPreparado() { 
        this.estado = "preparado"; 
    }

    public void marcarEntregado() { 
        this.estado = "entregado"; 
    }
    
    @Override
    public String toString() {
        return "Pedido #" + pedidoID + " | " + productos.size() + " ítems | " +
               "Estado: " + estado + " | Total \u20A1" + String.format("%.2f", calcularTotal());
    }
       
}
