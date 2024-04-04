
package com.customer.org.datacontract.schemas._2004._07.decos_connect_entities;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfCitizen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCitizen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Citizen" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government}Citizen" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCitizen", propOrder = {
    "citizen"
})
public class ArrayOfCitizen {

    @XmlElement(name = "Citizen", nillable = true)
    protected List<Citizen> citizen;

    /**
     * Gets the value of the citizen property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the citizen property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitizen().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Citizen }
     * 
     * 
     */
    public List<Citizen> getCitizen() {
        if (citizen == null) {
            citizen = new ArrayList<Citizen>();
        }
        return this.citizen;
    }

}
