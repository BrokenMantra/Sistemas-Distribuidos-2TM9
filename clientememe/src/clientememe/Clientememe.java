/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientememe;

/**
 *
 * @author Alvaro Ceballos
 */
public class Clientememe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroTarjeta = 584247914;
        int monto = 1000;
        String nombre = "lucia";
        int codigoCVV = 777;
        
        boolean result = pagar(numeroTarjeta,monto,nombre,codigoCVV); 
        if(result == true){
            System.out.println("TRANSACCION EXITOSA");
        
        }
        else{
            System.out.println("FALLO LA TRANSACCION");
        }
    }

    private static Boolean pagar(int numeroTarjeta, int monto, java.lang.String nombre, int codigoCVV) {
        clientememe.Webaplicacion_Service service = new clientememe.Webaplicacion_Service();
        clientememe.Webaplicacion port = service.getWebaplicacionPort();
        return port.pagar(numeroTarjeta, monto, nombre, codigoCVV);
    }
    
}
