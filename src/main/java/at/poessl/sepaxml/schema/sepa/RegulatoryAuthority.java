
package at.poessl.sepaxml.schema.sepa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RegulatoryAuthority complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RegulatoryAuthority"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthrtyNm" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="AuthrtyCtry" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}CountryCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatoryAuthority", propOrder = {
    "authrtyNm",
    "authrtyCtry"
})
public class RegulatoryAuthority {

    @XmlElement(name = "AuthrtyNm")
    protected String authrtyNm;
    @XmlElement(name = "AuthrtyCtry")
    protected String authrtyCtry;

    /**
     * Ruft den Wert der authrtyNm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthrtyNm() {
        return authrtyNm;
    }

    /**
     * Legt den Wert der authrtyNm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthrtyNm(String value) {
        this.authrtyNm = value;
    }

    /**
     * Ruft den Wert der authrtyCtry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthrtyCtry() {
        return authrtyCtry;
    }

    /**
     * Legt den Wert der authrtyCtry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthrtyCtry(String value) {
        this.authrtyCtry = value;
    }

}
