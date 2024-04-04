
package com.customer.org.datacontract.schemas._2004._07.decos_connect;

import com.customer.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfanyType;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Filter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Filter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndRecord" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FilterConditions" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfanyType" minOccurs="0"/&gt;
 *         &lt;element name="StartRecord" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Filter", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Filters", propOrder = {
    "endRecord",
    "filterConditions",
    "startRecord"
})
public class Filter {

    @XmlElement(name = "EndRecord")
    protected Integer endRecord;
    @XmlElementRef(name = "FilterConditions", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Filters", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfanyType> filterConditions;
    @XmlElement(name = "StartRecord")
    protected Integer startRecord;

    /**
     * Gets the value of the endRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndRecord() {
        return endRecord;
    }

    /**
     * Sets the value of the endRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndRecord(Integer value) {
        this.endRecord = value;
    }

    /**
     * Gets the value of the filterConditions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfanyType> getFilterConditions() {
        return filterConditions;
    }

    /**
     * Sets the value of the filterConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     *     
     */
    public void setFilterConditions(JAXBElement<ArrayOfanyType> value) {
        this.filterConditions = value;
    }

    /**
     * Gets the value of the startRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartRecord() {
        return startRecord;
    }

    /**
     * Sets the value of the startRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartRecord(Integer value) {
        this.startRecord = value;
    }

}
