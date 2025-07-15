/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Pedido;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Josué Sánchez
 */
public class servicioCocina {
    
    private static final List<Pedido> pendientes = new ArrayList<>();
    private static int nextId = 1;

    public static int generarId()               { return nextId++; }

    public static void agregar(Pedido p)        { pendientes.add(p); }

    public static List<Pedido> getPendientes()  { return pendientes; }
    
}
