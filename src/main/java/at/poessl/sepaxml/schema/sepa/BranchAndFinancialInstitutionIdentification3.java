
package at.poessl.sepaxml.schema.sepa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für BranchAndFinancialInstitutionIdentification3 complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BranchAndFinancialInstitutionIdentification3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FinInstnId" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}FinancialInstitutionIdentification5Choice"/&gt;
 *         &lt;element name="BrnchId" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}BranchData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchAndFinancialInstitutionIdentification3", propOrder = {
    "finInstnId",
    "brnchId"
})
public class BranchAndFinancialInstitutionIdentification3 {

    @XmlElement(name = "FinInstnId", required = true)
    protected FinancialInstitutionIdentification5Choice finInstnId;
    @XmlElement(name = "BrnchId")
    protected BranchData brnchId;

    /**
     * Ruft den Wert der finInstnId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification5Choice }
     *     
     */
    public FinancialInstitutionIdentification5Choice getFinInstnId() {
        return finInstnId;
    }

    /**
     * Legt den Wert der finInstnId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification5Choice }
     *     
     */
    public void setFinInstnId(FinancialInstitutionIdentification5Choice value) {
        this.finInstnId = value;
    }

    /**
     * Ruft den Wert der brnchId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BranchData }
     *     
     */
    public BranchData getBrnchId() {
        return brnchId;
    }

    /**
     * Legt den Wert der brnchId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchData }
     *     
     */
    public void setBrnchId(BranchData value) {
        this.brnchId = value;
    }

}
