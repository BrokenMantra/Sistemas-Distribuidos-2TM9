
package clientememe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pagar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="pagar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numero_tarjeta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="monto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo_CVV" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pagar", propOrder = {
    "numeroTarjeta",
    "monto",
    "nombre",
    "codigoCVV"
})
public class Pagar {

    @XmlElement(name = "numero_tarjeta")
    protected int numeroTarjeta;
    protected int monto;
    protected String nombre;
    @XmlElement(name = "codigo_CVV")
    protected int codigoCVV;

    /**
     * Obtiene el valor de la propiedad numeroTarjeta.
     * 
     */
    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * Define el valor de la propiedad numeroTarjeta.
     * 
     */
    public void setNumeroTarjeta(int value) {
        this.numeroTarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     */
    public int getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     */
    public void setMonto(int value) {
        this.monto = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCVV.
     * 
     */
    public int getCodigoCVV() {
        return codigoCVV;
    }

    /**
     * Define el valor de la propiedad codigoCVV.
     * 
     */
    public void setCodigoCVV(int value) {
        this.codigoCVV = value;
    }

}
