
package com.customer.com.decos.services;

import com.customer.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="GetLinkedFilesResult" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt" minOccurs="0"/&gt;
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
    "getLinkedFilesResult"
})
@XmlRootElement(name = "GetLinkedFilesResponse")
public class GetLinkedFilesResponse {

    @XmlElementRef(name = "GetLinkedFilesResult", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt> getLinkedFilesResult;

    /**
     * Gets the value of the getLinkedFilesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt> getGetLinkedFilesResult() {
        return getLinkedFilesResult;
    }

    /**
     * Sets the value of the getLinkedFilesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt }{@code >}
     *     
     */
    public void setGetLinkedFilesResult(JAXBElement<ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt> value) {
        this.getLinkedFilesResult = value;
    }

}
