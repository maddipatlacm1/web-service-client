
package com.customer.com.decos.services;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.Entity;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.EntityRelationType;


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
 *         &lt;element name="oEntity1" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}Entity" minOccurs="0"/&gt;
 *         &lt;element name="oEntity2" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}Entity" minOccurs="0"/&gt;
 *         &lt;element name="enumEntityRelType" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}EntityRelationType" minOccurs="0"/&gt;
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
    "oEntity1",
    "oEntity2",
    "enumEntityRelType",
    "sToken"
})
@XmlRootElement(name = "UnlinkEntityWithRelationType")
public class UnlinkEntityWithRelationType {

    @XmlElementRef(name = "oEntity1", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<Entity> oEntity1;
    @XmlElementRef(name = "oEntity2", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<Entity> oEntity2;
    @XmlSchemaType(name = "string")
    protected EntityRelationType enumEntityRelType;
    @XmlElementRef(name = "sToken", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sToken;

    /**
     * Gets the value of the oEntity1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Entity }{@code >}
     *     
     */
    public JAXBElement<Entity> getOEntity1() {
        return oEntity1;
    }

    /**
     * Sets the value of the oEntity1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Entity }{@code >}
     *     
     */
    public void setOEntity1(JAXBElement<Entity> value) {
        this.oEntity1 = value;
    }

    /**
     * Gets the value of the oEntity2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Entity }{@code >}
     *     
     */
    public JAXBElement<Entity> getOEntity2() {
        return oEntity2;
    }

    /**
     * Sets the value of the oEntity2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Entity }{@code >}
     *     
     */
    public void setOEntity2(JAXBElement<Entity> value) {
        this.oEntity2 = value;
    }

    /**
     * Gets the value of the enumEntityRelType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityRelationType }
     *     
     */
    public EntityRelationType getEnumEntityRelType() {
        return enumEntityRelType;
    }

    /**
     * Sets the value of the enumEntityRelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityRelationType }
     *     
     */
    public void setEnumEntityRelType(EntityRelationType value) {
        this.enumEntityRelType = value;
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
