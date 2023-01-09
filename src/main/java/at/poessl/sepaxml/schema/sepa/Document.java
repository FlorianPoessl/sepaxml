
package at.poessl.sepaxml.schema.sepa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Document complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Document"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pain.008.001.01" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}pain.008.001.01"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "pain00800101"
})
@XmlRootElement(name = "Document")
public class Document {

    @XmlElement(name = "pain.008.001.01", required = true)
    protected Pain00800101 pain00800101;

    /**
     * Ruft den Wert der pain00800101-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Pain00800101 }
     *     
     */
    public Pain00800101 getPain00800101() {
        return pain00800101;
    }

    /**
     * Legt den Wert der pain00800101-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Pain00800101 }
     *     
     */
    public void setPain00800101(Pain00800101 value) {
        this.pain00800101 = value;
    }

}
