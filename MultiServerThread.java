package com.mycompany.cliente_de_eco;

import java.net.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiServerThread extends Thread {
   private Socket socket = null;

   String maquinaX="25.73.60.146"; //Ip dada por servidor de Hamachi 
   int puertoX=5000; // Puerto dado por la practica
   PrintWriter escritorX = null; //Cumple la función de dar la respuesta del servidor
   String DatosEnviadosX = null;//Cumplea la función de dar la respuesta de datos
   BufferedReader entradaX =null;
   Socket clienteX = null;


   public MultiServerThread(Socket socket) {
      super("MultiServerThread");
      this.socket = socket;
      ServerMultiClient.NoClients++;
      System.out.println("Cliente conectado");
   }

   public void run() {

      try {
             
            PrintWriter escritor = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String lineIn, lineOut;

	     while((lineIn = entrada.readLine()) != null){
            System.out.println("Recibido: "+lineIn);
            escritor.flush();
            if(lineIn.equals("Salir")){ //Estas condicionales sirven si queremos definir un comportamiento del servidor
                ServerMultiClient.NoClients--;
                System.out.println("Desconnecting from this server");
			          break;
 
            }else{
                escritor.println("Echo... "+lineIn);
                escritor.flush();
            }
        }
        try{
            entrada.close();
            escritor.close();
            socket.close();
         }catch(Exception e){
            System.out.println ("Error : " + e.toString());
            socket.close();
            System.exit (0);
   	   }
      }catch (IOException e) {
        System.out.println("Error---");
         e.printStackTrace();
      } 
   }
}
