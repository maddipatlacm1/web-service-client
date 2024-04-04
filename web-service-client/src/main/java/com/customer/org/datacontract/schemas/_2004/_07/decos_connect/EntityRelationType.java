
package com.customer.org.datacontract.schemas._2004._07.decos_connect;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityRelationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="EntityRelationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Default"/&gt;
 *     &lt;enumeration value="CopyTo"/&gt;
 *     &lt;enumeration value="Equivalent"/&gt;
 *     &lt;enumeration value="SubEntity"/&gt;
 *     &lt;enumeration value="AllCaseType"/&gt;
 *     &lt;enumeration value="UnknownCaseType"/&gt;
 *     &lt;enumeration value="MainCaseType"/&gt;
 *     &lt;enumeration value="SubCaseType"/&gt;
 *     &lt;enumeration value="FollowsUpCaseType"/&gt;
 *     &lt;enumeration value="FollowedUpByCaseType"/&gt;
 *     &lt;enumeration value="RelatedCaseType"/&gt;
 *     &lt;enumeration value="SubFolder"/&gt;
 *     &lt;enumeration value="MainFolder"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EntityRelationType")
@XmlEnum
public enum EntityRelationType {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("CopyTo")
    COPY_TO("CopyTo"),
    @XmlEnumValue("Equivalent")
    EQUIVALENT("Equivalent"),
    @XmlEnumValue("SubEntity")
    SUB_ENTITY("SubEntity"),
    @XmlEnumValue("AllCaseType")
    ALL_CASE_TYPE("AllCaseType"),
    @XmlEnumValue("UnknownCaseType")
    UNKNOWN_CASE_TYPE("UnknownCaseType"),
    @XmlEnumValue("MainCaseType")
    MAIN_CASE_TYPE("MainCaseType"),
    @XmlEnumValue("SubCaseType")
    SUB_CASE_TYPE("SubCaseType"),
    @XmlEnumValue("FollowsUpCaseType")
    FOLLOWS_UP_CASE_TYPE("FollowsUpCaseType"),
    @XmlEnumValue("FollowedUpByCaseType")
    FOLLOWED_UP_BY_CASE_TYPE("FollowedUpByCaseType"),
    @XmlEnumValue("RelatedCaseType")
    RELATED_CASE_TYPE("RelatedCaseType"),
    @XmlEnumValue("SubFolder")
    SUB_FOLDER("SubFolder"),
    @XmlEnumValue("MainFolder")
    MAIN_FOLDER("MainFolder");
    private final String value;

    EntityRelationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntityRelationType fromValue(String v) {
        for (EntityRelationType c: EntityRelationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
