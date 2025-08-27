/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 *
 * @author Josué Sánchez
 */
public class Factura {
    
    private int facturaID;
    private Pedido pedido;
    private double montoTotal;
    private LocalDateTime fechaEmision;

    public Factura(int facturaID, Pedido pedido) {
        this.facturaID = facturaID;
        this.pedido = pedido;
        this.montoTotal = pedido.calcularTotal();
        this.fechaEmision = LocalDateTime.now();
    }

    public int getFacturaID() { return facturaID; }
    public Pedido getPedido() { return pedido; }
    public double getMontoTotal() { return montoTotal; }
    public LocalDateTime getFechaEmision() { return fechaEmision; }

    
    public File imprimirFactura() throws IOException {
        String base = System.getProperty("user.home") + File.separator + "FideBurguesasFacturas";
        File dir = new File(base);
        if (!dir.exists()) dir.mkdirs();

        File archivo = new File(dir, "factura_" + facturaID + ".txt");
        try (FileWriter fw = new FileWriter(archivo)) {
            fw.write("FideBurguesas - Factura #" + facturaID + "\n");
            fw.write("Fecha: " + fechaEmision + "\n");
            fw.write("----------------------------------\n");
            int i = 1;
            for (Producto p : pedido.getProductos()) {
                fw.write((i++) + ". " + p.getProductoNombre()
                        + "  ?" + String.format("%.2f", p.getPrecio()) + "\n");
            }
            fw.write("----------------------------------\n");
            fw.write("TOTAL: ?" + String.format("%.2f", montoTotal) + "\n");
        }

        pedido.setFacturado(true);
        return archivo;
    }
    
}
