
package com.customer.com.decos.services;

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
 *         &lt;element name="sIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sParentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sParentCollectionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sParentEntityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "sIdentifier",
    "sParentIdentifier",
    "sParentCollectionIdentifier",
    "sParentEntityType",
    "sToken"
})
@XmlRootElement(name = "GetFileFromCollection")
public class GetFileFromCollection {

    @XmlElementRef(name = "sIdentifier", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sIdentifier;
    @XmlElementRef(name = "sParentIdentifier", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sParentIdentifier;
    @XmlElementRef(name = "sParentCollectionIdentifier", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sParentCollectionIdentifier;
    @XmlElementRef(name = "sParentEntityType", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sParentEntityType;
    @XmlElementRef(name = "sToken", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sToken;

    /**
     * Gets the value of the sIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSIdentifier() {
        return sIdentifier;
    }

    /**
     * Sets the value of the sIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSIdentifier(JAXBElement<String> value) {
        this.sIdentifier = value;
    }

    /**
     * Gets the value of the sParentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSParentIdentifier() {
        return sParentIdentifier;
    }

    /**
     * Sets the value of the sParentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSParentIdentifier(JAXBElement<String> value) {
        this.sParentIdentifier = value;
    }

    /**
     * Gets the value of the sParentCollectionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSParentCollectionIdentifier() {
        return sParentCollectionIdentifier;
    }

    /**
     * Sets the value of the sParentCollectionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSParentCollectionIdentifier(JAXBElement<String> value) {
        this.sParentCollectionIdentifier = value;
    }

    /**
     * Gets the value of the sParentEntityType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSParentEntityType() {
        return sParentEntityType;
    }

    /**
     * Sets the value of the sParentEntityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSParentEntityType(JAXBElement<String> value) {
        this.sParentEntityType = value;
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
