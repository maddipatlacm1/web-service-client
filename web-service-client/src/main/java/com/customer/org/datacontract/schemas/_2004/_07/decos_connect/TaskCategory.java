
package com.customer.org.datacontract.schemas._2004._07.decos_connect;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TaskCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Active"/&gt;
 *     &lt;enumeration value="Completed"/&gt;
 *     &lt;enumeration value="Forwarded"/&gt;
 *     &lt;enumeration value="Suspended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaskCategory")
@XmlEnum
public enum TaskCategory {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("Forwarded")
    FORWARDED("Forwarded"),
    @XmlEnumValue("Suspended")
    SUSPENDED("Suspended");
    private final String value;

    TaskCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaskCategory fromValue(String v) {
        for (TaskCategory c: TaskCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
