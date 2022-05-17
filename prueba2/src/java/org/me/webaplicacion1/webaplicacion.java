/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.webaplicacion1;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Alvaro Ceballos
 */
@WebService(serviceName = "webaplicacion")
public class webaplicacion {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "pagar")
    public Boolean pagar(@WebParam(name = "numero_tarjeta") int numero_tarjeta, @WebParam(name = "monto") int monto, @WebParam(name = "nombre") String nombre, @WebParam(name = "codigo_CVV") int codigo_CVV) {
        //TODO write your implementation code here:
         boolean r;
        if(monto<5000){
        r=true;
            System.out.println("TRANSACCION EXITOSA");
        }
        else{
        r=false;
        System.out.println("FALLO LA TRANSACCION");
        }
        return r;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "comprar")
    public Boolean comprar(@WebParam(name = "id_producto") int id_producto, @WebParam(name = "precio") int precio, @WebParam(name = "numero_productos") int numero_productos, @WebParam(name = "total") int total) {
        //TODO write your implementation code here:
         boolean d;
        if(id_producto<10){
        d=true;
        System.out.println("PRODUCTO ENCONTRADO");
        }
        else{
        d=false;
        System.out.println("PRODUCTO NO ENCONTRADO");
        }
        return d;
    }

    /**
     * This is a sample web service operation
     */
    
}
