
package com.customer.com.decos.services;

import com.customer.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
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
 *         &lt;element name="ent" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}Entity" minOccurs="0"/&gt;
 *         &lt;element name="sPropertyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sStartsWith" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lstUpperLevelValues" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
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
    "ent",
    "sPropertyName",
    "sStartsWith",
    "lstUpperLevelValues",
    "sToken"
})
@XmlRootElement(name = "GetPossibleTableValues")
public class GetPossibleTableValues {

    @XmlElementRef(name = "ent", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<Entity> ent;
    @XmlElementRef(name = "sPropertyName", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sPropertyName;
    @XmlElementRef(name = "sStartsWith", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sStartsWith;
    @XmlElementRef(name = "lstUpperLevelValues", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> lstUpperLevelValues;
    @XmlElementRef(name = "sToken", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sToken;

    /**
     * Gets the value of the ent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Entity }{@code >}
     *     
     */
    public JAXBElement<Entity> getEnt() {
        return ent;
    }

    /**
     * Sets the value of the ent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Entity }{@code >}
     *     
     */
    public void setEnt(JAXBElement<Entity> value) {
        this.ent = value;
    }

    /**
     * Gets the value of the sPropertyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSPropertyName() {
        return sPropertyName;
    }

    /**
     * Sets the value of the sPropertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSPropertyName(JAXBElement<String> value) {
        this.sPropertyName = value;
    }

    /**
     * Gets the value of the sStartsWith property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSStartsWith() {
        return sStartsWith;
    }

    /**
     * Sets the value of the sStartsWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSStartsWith(JAXBElement<String> value) {
        this.sStartsWith = value;
    }

    /**
     * Gets the value of the lstUpperLevelValues property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getLstUpperLevelValues() {
        return lstUpperLevelValues;
    }

    /**
     * Sets the value of the lstUpperLevelValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setLstUpperLevelValues(JAXBElement<ArrayOfstring> value) {
        this.lstUpperLevelValues = value;
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
