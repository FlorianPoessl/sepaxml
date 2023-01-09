
package at.poessl.sepaxml.schema.sepa;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für Grouping1Code.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <pre>
 * &lt;simpleType name="Grouping1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SNGL"/&gt;
 *     &lt;enumeration value="GRPD"/&gt;
 *     &lt;enumeration value="MIXD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Grouping1Code")
@XmlEnum
public enum Grouping1Code {

    SNGL,
    GRPD,
    MIXD;

    public String value() {
        return name();
    }

    public static Grouping1Code fromValue(String v) {
        return valueOf(v);
    }

}
