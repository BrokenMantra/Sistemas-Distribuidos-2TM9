package com.mycompany.cliente_de_eco;


import java.net.*;
import java.io.*;
public class ServerMultiClient{
   static int NoClients=0;
   public static void main (String[] argumentos)throws IOException{
	ServerSocket socketServidor = null;
	Socket socketCliente = null;

	try{
	   socketServidor = new ServerSocket (5000);
	}catch (Exception e){
	   System.out.println ("Error : "+ e.toString());
	   System.exit (0);
	}

	System.out.println ("Servidor iniciado...");
	int enproceso=1;
	while(enproceso==1){
		try{
	   		socketCliente = socketServidor.accept();
			MultiServerThread controlThread=new MultiServerThread(socketCliente);  // El comportamiento de mi servidor va relacionado al hilo.
//dicho hilo va a procesar la cadena de caracteres que vamos a recibir 
			controlThread.start();
	   	}catch (Exception e){
	    	System.out.println ("Error : " + e.toString());
			socketServidor.close();
			System.exit (0);
	   	}
	}
	System.out.println("Finalizando Servidor...");

   }
}
