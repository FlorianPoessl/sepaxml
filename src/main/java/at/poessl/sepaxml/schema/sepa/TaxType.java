
package at.poessl.sepaxml.schema.sepa;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für TaxType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TaxType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CtgyDesc" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Rate" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}PercentageRate" minOccurs="0"/&gt;
 *         &lt;element name="TaxblBaseAmt" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}CurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="Amt" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}CurrencyAndAmount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxType", propOrder = {
    "ctgyDesc",
    "rate",
    "taxblBaseAmt",
    "amt"
})
public class TaxType {

    @XmlElement(name = "CtgyDesc")
    protected String ctgyDesc;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "TaxblBaseAmt")
    protected CurrencyAndAmount taxblBaseAmt;
    @XmlElement(name = "Amt")
    protected CurrencyAndAmount amt;

    /**
     * Ruft den Wert der ctgyDesc-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtgyDesc() {
        return ctgyDesc;
    }

    /**
     * Legt den Wert der ctgyDesc-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtgyDesc(String value) {
        this.ctgyDesc = value;
    }

    /**
     * Ruft den Wert der rate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Legt den Wert der rate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Ruft den Wert der taxblBaseAmt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getTaxblBaseAmt() {
        return taxblBaseAmt;
    }

    /**
     * Legt den Wert der taxblBaseAmt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setTaxblBaseAmt(CurrencyAndAmount value) {
        this.taxblBaseAmt = value;
    }

    /**
     * Ruft den Wert der amt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Legt den Wert der amt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setAmt(CurrencyAndAmount value) {
        this.amt = value;
    }

}
