
package com.customer.org.datacontract.schemas._2004._07.decos_connect;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterConditionSQL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterConditionSQL"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Decos.Connect.Filters}FilterCondition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PropertyFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterConditionSQL", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Filters", propOrder = {
    "propertyFilter"
})
public class FilterConditionSQL
    extends FilterCondition
{

    @XmlElementRef(name = "PropertyFilter", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Filters", type = JAXBElement.class, required = false)
    protected JAXBElement<String> propertyFilter;

    /**
     * Gets the value of the propertyFilter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPropertyFilter() {
        return propertyFilter;
    }

    /**
     * Sets the value of the propertyFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPropertyFilter(JAXBElement<String> value) {
        this.propertyFilter = value;
    }

}
