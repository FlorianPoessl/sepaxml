
package at.poessl.sepaxml.schema.sepa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RemittanceLocation1 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RemittanceLocation1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RmtId" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="RmtLctnMtd" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}RemittanceLocationMethod1Code" minOccurs="0"/&gt;
 *         &lt;element name="RmtLctnElctrncAdr" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}Max256Text" minOccurs="0"/&gt;
 *         &lt;element name="RmtLctnPstlAdr" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}NameAndAddress3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemittanceLocation1", propOrder = {
    "rmtId",
    "rmtLctnMtd",
    "rmtLctnElctrncAdr",
    "rmtLctnPstlAdr"
})
public class RemittanceLocation1 {

    @XmlElement(name = "RmtId")
    protected String rmtId;
    @XmlElement(name = "RmtLctnMtd")
    @XmlSchemaType(name = "string")
    protected RemittanceLocationMethod1Code rmtLctnMtd;
    @XmlElement(name = "RmtLctnElctrncAdr")
    protected String rmtLctnElctrncAdr;
    @XmlElement(name = "RmtLctnPstlAdr")
    protected NameAndAddress3 rmtLctnPstlAdr;

    /**
     * Ruft den Wert der rmtId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmtId() {
        return rmtId;
    }

    /**
     * Legt den Wert der rmtId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmtId(String value) {
        this.rmtId = value;
    }

    /**
     * Ruft den Wert der rmtLctnMtd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceLocationMethod1Code }
     *     
     */
    public RemittanceLocationMethod1Code getRmtLctnMtd() {
        return rmtLctnMtd;
    }

    /**
     * Legt den Wert der rmtLctnMtd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceLocationMethod1Code }
     *     
     */
    public void setRmtLctnMtd(RemittanceLocationMethod1Code value) {
        this.rmtLctnMtd = value;
    }

    /**
     * Ruft den Wert der rmtLctnElctrncAdr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmtLctnElctrncAdr() {
        return rmtLctnElctrncAdr;
    }

    /**
     * Legt den Wert der rmtLctnElctrncAdr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmtLctnElctrncAdr(String value) {
        this.rmtLctnElctrncAdr = value;
    }

    /**
     * Ruft den Wert der rmtLctnPstlAdr-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress3 }
     *     
     */
    public NameAndAddress3 getRmtLctnPstlAdr() {
        return rmtLctnPstlAdr;
    }

    /**
     * Legt den Wert der rmtLctnPstlAdr-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress3 }
     *     
     */
    public void setRmtLctnPstlAdr(NameAndAddress3 value) {
        this.rmtLctnPstlAdr = value;
    }

}
