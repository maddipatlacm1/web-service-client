
package com.customer.com.decos.services;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.Filter;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.TaskCategory;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eTaskCategory" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}TaskCategory" minOccurs="0"/&gt;
 *         &lt;element name="sUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="filter" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Filters}Filter" minOccurs="0"/&gt;
 *         &lt;element name="sToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "eTaskCategory",
    "sUserName",
    "filter",
    "sToken"
})
@XmlRootElement(name = "GetTasksByCategory")
public class GetTasksByCategory {

    @XmlSchemaType(name = "string")
    protected TaskCategory eTaskCategory;
    @XmlElementRef(name = "sUserName", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sUserName;
    @XmlElementRef(name = "filter", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<Filter> filter;
    @XmlElementRef(name = "sToken", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sToken;

    /**
     * Gets the value of the eTaskCategory property.
     * 
     * @return
     *     possible object is
     *     {@link TaskCategory }
     *     
     */
    public TaskCategory getETaskCategory() {
        return eTaskCategory;
    }

    /**
     * Sets the value of the eTaskCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskCategory }
     *     
     */
    public void setETaskCategory(TaskCategory value) {
        this.eTaskCategory = value;
    }

    /**
     * Gets the value of the sUserName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSUserName() {
        return sUserName;
    }

    /**
     * Sets the value of the sUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSUserName(JAXBElement<String> value) {
        this.sUserName = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Filter }{@code >}
     *     
     */
    public JAXBElement<Filter> getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Filter }{@code >}
     *     
     */
    public void setFilter(JAXBElement<Filter> value) {
        this.filter = value;
    }

    /**
     * Gets the value of the sToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSToken() {
        return sToken;
    }

    /**
     * Sets the value of the sToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSToken(JAXBElement<String> value) {
        this.sToken = value;
    }

}
