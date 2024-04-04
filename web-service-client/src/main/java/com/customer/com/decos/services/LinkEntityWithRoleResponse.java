
package com.customer.com.decos.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="LinkEntityWithRoleResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "linkEntityWithRoleResult"
})
@XmlRootElement(name = "LinkEntityWithRoleResponse")
public class LinkEntityWithRoleResponse {

    @XmlElement(name = "LinkEntityWithRoleResult")
    protected Boolean linkEntityWithRoleResult;

    /**
     * Gets the value of the linkEntityWithRoleResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLinkEntityWithRoleResult() {
        return linkEntityWithRoleResult;
    }

    /**
     * Sets the value of the linkEntityWithRoleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLinkEntityWithRoleResult(Boolean value) {
        this.linkEntityWithRoleResult = value;
    }

}
