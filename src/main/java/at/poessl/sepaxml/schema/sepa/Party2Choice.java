
package at.poessl.sepaxml.schema.sepa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Party2Choice complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Party2Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="OrgId" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}OrganisationIdentification2"/&gt;
 *           &lt;element name="PrvtId" type="{APC:STUZZA:payments:ISO:pain:008:001:01:austrian:002}PersonIdentification3" maxOccurs="4"/&gt;
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
@XmlType(name = "Party2Choice", propOrder = {
    "orgId",
    "prvtId"
})
public class Party2Choice {

    @XmlElement(name = "OrgId")
    protected OrganisationIdentification2 orgId;
    @XmlElement(name = "PrvtId")
    protected List<PersonIdentification3> prvtId;

    /**
     * Ruft den Wert der orgId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification2 }
     *     
     */
    public OrganisationIdentification2 getOrgId() {
        return orgId;
    }

    /**
     * Legt den Wert der orgId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification2 }
     *     
     */
    public void setOrgId(OrganisationIdentification2 value) {
        this.orgId = value;
    }

    /**
     * Gets the value of the prvtId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the prvtId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvtId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonIdentification3 }
     * 
     * 
     */
    public List<PersonIdentification3> getPrvtId() {
        if (prvtId == null) {
            prvtId = new ArrayList<PersonIdentification3>();
        }
        return this.prvtId;
    }

}
