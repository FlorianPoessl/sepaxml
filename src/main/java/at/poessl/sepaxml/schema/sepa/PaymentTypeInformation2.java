
package at.poessl.sepaxml.schema.sepa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für PaymentTypeInformation2 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PaymentTypeInformation2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InstrPrty" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}Priority2Code" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="SvcLvl" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}ServiceLevel3Choice" minOccurs="0"/&gt;
 *           &lt;element name="ClrChanl" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}ClearingChannel2Code" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="LclInstrm" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}LocalInstrument1Choice" minOccurs="0"/&gt;
 *         &lt;element name="SeqTp" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}SequenceType1Code" minOccurs="0"/&gt;
 *         &lt;element name="CtgyPurp" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}PaymentCategoryPurpose1Code" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTypeInformation2", propOrder = {
    "instrPrty",
    "svcLvl",
    "clrChanl",
    "lclInstrm",
    "seqTp",
    "ctgyPurp"
})
public class PaymentTypeInformation2 {

    @XmlElement(name = "InstrPrty")
    @XmlSchemaType(name = "string")
    protected Priority2Code instrPrty;
    @XmlElement(name = "SvcLvl")
    protected ServiceLevel3Choice svcLvl;
    @XmlElement(name = "ClrChanl")
    @XmlSchemaType(name = "string")
    protected ClearingChannel2Code clrChanl;
    @XmlElement(name = "LclInstrm")
    protected LocalInstrument1Choice lclInstrm;
    @XmlElement(name = "SeqTp")
    @XmlSchemaType(name = "string")
    protected SequenceType1Code seqTp;
    @XmlElement(name = "CtgyPurp")
    @XmlSchemaType(name = "string")
    protected PaymentCategoryPurpose1Code ctgyPurp;

    /**
     * Ruft den Wert der instrPrty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Priority2Code }
     *     
     */
    public Priority2Code getInstrPrty() {
        return instrPrty;
    }

    /**
     * Legt den Wert der instrPrty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority2Code }
     *     
     */
    public void setInstrPrty(Priority2Code value) {
        this.instrPrty = value;
    }

    /**
     * Ruft den Wert der svcLvl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLevel3Choice }
     *     
     */
    public ServiceLevel3Choice getSvcLvl() {
        return svcLvl;
    }

    /**
     * Legt den Wert der svcLvl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLevel3Choice }
     *     
     */
    public void setSvcLvl(ServiceLevel3Choice value) {
        this.svcLvl = value;
    }

    /**
     * Ruft den Wert der clrChanl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ClearingChannel2Code }
     *     
     */
    public ClearingChannel2Code getClrChanl() {
        return clrChanl;
    }

    /**
     * Legt den Wert der clrChanl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingChannel2Code }
     *     
     */
    public void setClrChanl(ClearingChannel2Code value) {
        this.clrChanl = value;
    }

    /**
     * Ruft den Wert der lclInstrm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocalInstrument1Choice }
     *     
     */
    public LocalInstrument1Choice getLclInstrm() {
        return lclInstrm;
    }

    /**
     * Legt den Wert der lclInstrm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalInstrument1Choice }
     *     
     */
    public void setLclInstrm(LocalInstrument1Choice value) {
        this.lclInstrm = value;
    }

    /**
     * Ruft den Wert der seqTp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SequenceType1Code }
     *     
     */
    public SequenceType1Code getSeqTp() {
        return seqTp;
    }

    /**
     * Legt den Wert der seqTp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceType1Code }
     *     
     */
    public void setSeqTp(SequenceType1Code value) {
        this.seqTp = value;
    }

    /**
     * Ruft den Wert der ctgyPurp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCategoryPurpose1Code }
     *     
     */
    public PaymentCategoryPurpose1Code getCtgyPurp() {
        return ctgyPurp;
    }

    /**
     * Legt den Wert der ctgyPurp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCategoryPurpose1Code }
     *     
     */
    public void setCtgyPurp(PaymentCategoryPurpose1Code value) {
        this.ctgyPurp = value;
    }

}
