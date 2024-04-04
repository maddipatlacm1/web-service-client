
package com.customer.org.datacontract.schemas._2004._07.decos_connect_entities;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBAGObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBAGObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BAGObject" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government}BAGObject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBAGObject", propOrder = {
    "bagObject"
})
public class ArrayOfBAGObject {

    @XmlElement(name = "BAGObject", nillable = true)
    protected List<BAGObject> bagObject;

    /**
     * Gets the value of the bagObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the bagObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBAGObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BAGObject }
     * 
     * 
     */
    public List<BAGObject> getBAGObject() {
        if (bagObject == null) {
            bagObject = new ArrayList<BAGObject>();
        }
        return this.bagObject;
    }

}
