
package at.poessl.sepaxml.schema.sepa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für ReferredDocumentAmount1Choice complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ReferredDocumentAmount1Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="DuePyblAmt" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}CurrencyAndAmount"/&gt;
 *           &lt;element name="DscntApldAmt" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}CurrencyAndAmount"/&gt;
 *           &lt;element name="RmtdAmt" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}CurrencyAndAmount"/&gt;
 *           &lt;element name="CdtNoteAmt" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}CurrencyAndAmount"/&gt;
 *           &lt;element name="TaxAmt" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}CurrencyAndAmount"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferredDocumentAmount1Choice", propOrder = {
    "duePyblAmt",
    "dscntApldAmt",
    "rmtdAmt",
    "cdtNoteAmt",
    "taxAmt"
})
public class ReferredDocumentAmount1Choice {

    @XmlElement(name = "DuePyblAmt")
    protected CurrencyAndAmount duePyblAmt;
    @XmlElement(name = "DscntApldAmt")
    protected CurrencyAndAmount dscntApldAmt;
    @XmlElement(name = "RmtdAmt")
    protected CurrencyAndAmount rmtdAmt;
    @XmlElement(name = "CdtNoteAmt")
    protected CurrencyAndAmount cdtNoteAmt;
    @XmlElement(name = "TaxAmt")
    protected CurrencyAndAmount taxAmt;

    /**
     * Ruft den Wert der duePyblAmt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getDuePyblAmt() {
        return duePyblAmt;
    }

    /**
     * Legt den Wert der duePyblAmt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setDuePyblAmt(CurrencyAndAmount value) {
        this.duePyblAmt = value;
    }

    /**
     * Ruft den Wert der dscntApldAmt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getDscntApldAmt() {
        return dscntApldAmt;
    }

    /**
     * Legt den Wert der dscntApldAmt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setDscntApldAmt(CurrencyAndAmount value) {
        this.dscntApldAmt = value;
    }

    /**
     * Ruft den Wert der rmtdAmt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getRmtdAmt() {
        return rmtdAmt;
    }

    /**
     * Legt den Wert der rmtdAmt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setRmtdAmt(CurrencyAndAmount value) {
        this.rmtdAmt = value;
    }

    /**
     * Ruft den Wert der cdtNoteAmt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getCdtNoteAmt() {
        return cdtNoteAmt;
    }

    /**
     * Legt den Wert der cdtNoteAmt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setCdtNoteAmt(CurrencyAndAmount value) {
        this.cdtNoteAmt = value;
    }

    /**
     * Ruft den Wert der taxAmt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getTaxAmt() {
        return taxAmt;
    }

    /**
     * Legt den Wert der taxAmt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setTaxAmt(CurrencyAndAmount value) {
        this.taxAmt = value;
    }

}
