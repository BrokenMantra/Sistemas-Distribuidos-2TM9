
package wsaplicacioncliente;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.3
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Transaccion", targetNamespace = "http://Transaccion.me.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Transaccion {


    /**
     * 
     * @param precio
     * @param total
     * @param numeroProductos
     * @param idProducto
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "Comprar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Comprar", targetNamespace = "http://Transaccion.me.org/", className = "wsaplicacioncliente.Comprar")
    @ResponseWrapper(localName = "ComprarResponse", targetNamespace = "http://Transaccion.me.org/", className = "wsaplicacioncliente.ComprarResponse")
    @Action(input = "http://Transaccion.me.org/Transaccion/ComprarRequest", output = "http://Transaccion.me.org/Transaccion/ComprarResponse")
    public Boolean comprar(
        @WebParam(name = "id_producto", targetNamespace = "")
        int idProducto,
        @WebParam(name = "precio", targetNamespace = "")
        int precio,
        @WebParam(name = "numero_productos", targetNamespace = "")
        int numeroProductos,
        @WebParam(name = "total", targetNamespace = "")
        int total);

    /**
     * 
     * @param monto
     * @param numeroTarjeta
     * @param nombre
     * @param codigoCVV
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "Pagar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Pagar", targetNamespace = "http://Transaccion.me.org/", className = "wsaplicacioncliente.Pagar")
    @ResponseWrapper(localName = "PagarResponse", targetNamespace = "http://Transaccion.me.org/", className = "wsaplicacioncliente.PagarResponse")
    @Action(input = "http://Transaccion.me.org/Transaccion/PagarRequest", output = "http://Transaccion.me.org/Transaccion/PagarResponse")
    public Boolean pagar(
        @WebParam(name = "numero_tarjeta", targetNamespace = "")
        int numeroTarjeta,
        @WebParam(name = "monto", targetNamespace = "")
        int monto,
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "codigo_CVV", targetNamespace = "")
        int codigoCVV);

}
