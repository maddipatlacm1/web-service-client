
package com.customer.org.datacontract.schemas._2004._07.decos_connect;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfExtendedPropertyValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfExtendedPropertyValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExtendedPropertyValue" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}ExtendedPropertyValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExtendedPropertyValue", propOrder = {
    "extendedPropertyValue"
})
public class ArrayOfExtendedPropertyValue {

    @XmlElement(name = "ExtendedPropertyValue", nillable = true)
    protected List<ExtendedPropertyValue> extendedPropertyValue;

    /**
     * Gets the value of the extendedPropertyValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the extendedPropertyValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedPropertyValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedPropertyValue }
     * 
     * 
     */
    public List<ExtendedPropertyValue> getExtendedPropertyValue() {
        if (extendedPropertyValue == null) {
            extendedPropertyValue = new ArrayList<ExtendedPropertyValue>();
        }
        return this.extendedPropertyValue;
    }

}
