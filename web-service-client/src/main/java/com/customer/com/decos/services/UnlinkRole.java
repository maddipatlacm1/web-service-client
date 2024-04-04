
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
import com.customer.org.datacontract.schemas._2004._07.decos_connect.Role;


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
 *         &lt;element name="ent1" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}Entity" minOccurs="0"/&gt;
 *         &lt;element name="ent2" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}Entity" minOccurs="0"/&gt;
 *         &lt;element name="enumEntityRelation" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}EntityRelationType" minOccurs="0"/&gt;
 *         &lt;element name="oRole" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}Role" minOccurs="0"/&gt;
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
    "ent1",
    "ent2",
    "enumEntityRelation",
    "oRole",
    "sToken"
})
@XmlRootElement(name = "UnlinkRole")
public class UnlinkRole {

    @XmlElementRef(name = "ent1", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<Entity> ent1;
    @XmlElementRef(name = "ent2", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<Entity> ent2;
    @XmlSchemaType(name = "string")
    protected EntityRelationType enumEntityRelation;
    @XmlElementRef(name = "oRole", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<Role> oRole;
    @XmlElementRef(name = "sToken", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sToken;

    /**
     * Gets the value of the ent1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Entity }{@code >}
     *     
     */
    public JAXBElement<Entity> getEnt1() {
        return ent1;
    }

    /**
     * Sets the value of the ent1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Entity }{@code >}
     *     
     */
    public void setEnt1(JAXBElement<Entity> value) {
        this.ent1 = value;
    }

    /**
     * Gets the value of the ent2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Entity }{@code >}
     *     
     */
    public JAXBElement<Entity> getEnt2() {
        return ent2;
    }

    /**
     * Sets the value of the ent2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Entity }{@code >}
     *     
     */
    public void setEnt2(JAXBElement<Entity> value) {
        this.ent2 = value;
    }

    /**
     * Gets the value of the enumEntityRelation property.
     * 
     * @return
     *     possible object is
     *     {@link EntityRelationType }
     *     
     */
    public EntityRelationType getEnumEntityRelation() {
        return enumEntityRelation;
    }

    /**
     * Sets the value of the enumEntityRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityRelationType }
     *     
     */
    public void setEnumEntityRelation(EntityRelationType value) {
        this.enumEntityRelation = value;
    }

    /**
     * Gets the value of the oRole property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Role }{@code >}
     *     
     */
    public JAXBElement<Role> getORole() {
        return oRole;
    }

    /**
     * Sets the value of the oRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Role }{@code >}
     *     
     */
    public void setORole(JAXBElement<Role> value) {
        this.oRole = value;
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
