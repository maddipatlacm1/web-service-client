
package com.customer.org.datacontract.schemas._2004._07.decos_connect;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoteType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="NoteType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SystemEvent"/&gt;
 *     &lt;enumeration value="Text"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NoteType")
@XmlEnum
public enum NoteType {

    @XmlEnumValue("SystemEvent")
    SYSTEM_EVENT("SystemEvent"),
    @XmlEnumValue("Text")
    TEXT("Text");
    private final String value;

    NoteType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NoteType fromValue(String v) {
        for (NoteType c: NoteType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
