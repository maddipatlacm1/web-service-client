
package com.customer.com.decos.services;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.Entity;


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
 *         &lt;element name="oEntity" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}Entity" minOccurs="0"/&gt;
 *         &lt;element name="oContactEntity" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}Entity" minOccurs="0"/&gt;
 *         &lt;element name="oAddressEntity" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}Entity" minOccurs="0"/&gt;
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
    "oEntity",
    "oContactEntity",
    "oAddressEntity",
    "sToken"
})
@XmlRootElement(name = "UnlinkEntityViaRelatedEntity")
public class UnlinkEntityViaRelatedEntity {

    @XmlElementRef(name = "oEntity", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<Entity> oEntity;
    @XmlElementRef(name = "oContactEntity", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<Entity> oContactEntity;
    @XmlElementRef(name = "oAddressEntity", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<Entity> oAddressEntity;
    @XmlElementRef(name = "sToken", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sToken;

    /**
     * Gets the value of the oEntity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Entity }{@code >}
     *     
     */
    public JAXBElement<Entity> getOEntity() {
        return oEntity;
    }

    /**
     * Sets the value of the oEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Entity }{@code >}
     *     
     */
    public void setOEntity(JAXBElement<Entity> value) {
        this.oEntity = value;
    }

    /**
     * Gets the value of the oContactEntity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Entity }{@code >}
     *     
     */
    public JAXBElement<Entity> getOContactEntity() {
        return oContactEntity;
    }

    /**
     * Sets the value of the oContactEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Entity }{@code >}
     *     
     */
    public void setOContactEntity(JAXBElement<Entity> value) {
        this.oContactEntity = value;
    }

    /**
     * Gets the value of the oAddressEntity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Entity }{@code >}
     *     
     */
    public JAXBElement<Entity> getOAddressEntity() {
        return oAddressEntity;
    }

    /**
     * Sets the value of the oAddressEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Entity }{@code >}
     *     
     */
    public void setOAddressEntity(JAXBElement<Entity> value) {
        this.oAddressEntity = value;
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
