
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
 *         &lt;element name="sSystemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sSystemPwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "sSystemId",
    "sSystemPwd"
})
@XmlRootElement(name = "GetToken")
public class GetToken {

    @XmlElementRef(name = "sSystemId", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sSystemId;
    @XmlElementRef(name = "sSystemPwd", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sSystemPwd;

    /**
     * Gets the value of the sSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSSystemId() {
        return sSystemId;
    }

    /**
     * Sets the value of the sSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSSystemId(JAXBElement<String> value) {
        this.sSystemId = value;
    }

    /**
     * Gets the value of the sSystemPwd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSSystemPwd() {
        return sSystemPwd;
    }

    /**
     * Sets the value of the sSystemPwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSSystemPwd(JAXBElement<String> value) {
        this.sSystemPwd = value;
    }

}
