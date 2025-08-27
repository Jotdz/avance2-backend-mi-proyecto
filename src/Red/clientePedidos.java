/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Red;

import java.io.*;
import java.net.Socket;

/**
 *
 * @author Josué Sánchez
 */
public class clientePedidos {
    
    public static String enviarResumen(String host, int puerto, String resumen) {
        try (Socket s = new Socket(host, puerto);
             BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
             PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()), true)) {
            out.println(resumen);
            return in.readLine(); 
        } catch (IOException e) {
            return "ERROR: " + e.getMessage();
        }
    }
}
   
