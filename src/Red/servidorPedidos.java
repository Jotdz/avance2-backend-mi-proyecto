/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Red;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Josué Sánchez
 */
public class servidorPedidos {
    
    public static void main(String[] args) {
        final int PUERTO = 5000;
        System.out.println("[Servidor] Escuchando en puerto " + PUERTO);
        try (ServerSocket ss = new ServerSocket(PUERTO)) {
            while (true) {
                Socket s = ss.accept();
                new Thread(() -> atender(s)).start();
            }
        } catch (IOException e) {
            System.err.println("Error servidor: " + e.getMessage());
        }
    }

    private static void atender(Socket s) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
             PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()), true)) {
            String linea = in.readLine(); 
            System.out.println("[Servidor] Recibido: " + linea);
            out.println("OK"); 
        } catch (IOException e) {
            System.err.println("Error a atender: " + e.getMessage());
        } finally {
            try { s.close(); } catch (IOException ignored) {}
        }
    }
    
}
