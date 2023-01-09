
package at.poessl.sepaxml.schema.sepa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für RegulatoryReporting2 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RegulatoryReporting2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DbtCdtRptgInd" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}RegulatoryReportingType1Code" minOccurs="0"/&gt;
 *         &lt;element name="Authrty" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}RegulatoryAuthority" minOccurs="0"/&gt;
 *         &lt;element name="RgltryDtls" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}StructuredRegulatoryReporting2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatoryReporting2", propOrder = {
    "dbtCdtRptgInd",
    "authrty",
    "rgltryDtls"
})
public class RegulatoryReporting2 {

    @XmlElement(name = "DbtCdtRptgInd")
    @XmlSchemaType(name = "string")
    protected RegulatoryReportingType1Code dbtCdtRptgInd;
    @XmlElement(name = "Authrty")
    protected RegulatoryAuthority authrty;
    @XmlElement(name = "RgltryDtls")
    protected StructuredRegulatoryReporting2 rgltryDtls;

    /**
     * Ruft den Wert der dbtCdtRptgInd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryReportingType1Code }
     *     
     */
    public RegulatoryReportingType1Code getDbtCdtRptgInd() {
        return dbtCdtRptgInd;
    }

    /**
     * Legt den Wert der dbtCdtRptgInd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryReportingType1Code }
     *     
     */
    public void setDbtCdtRptgInd(RegulatoryReportingType1Code value) {
        this.dbtCdtRptgInd = value;
    }

    /**
     * Ruft den Wert der authrty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryAuthority }
     *     
     */
    public RegulatoryAuthority getAuthrty() {
        return authrty;
    }

    /**
     * Legt den Wert der authrty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryAuthority }
     *     
     */
    public void setAuthrty(RegulatoryAuthority value) {
        this.authrty = value;
    }

    /**
     * Ruft den Wert der rgltryDtls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StructuredRegulatoryReporting2 }
     *     
     */
    public StructuredRegulatoryReporting2 getRgltryDtls() {
        return rgltryDtls;
    }

    /**
     * Legt den Wert der rgltryDtls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredRegulatoryReporting2 }
     *     
     */
    public void setRgltryDtls(StructuredRegulatoryReporting2 value) {
        this.rgltryDtls = value;
    }

}
