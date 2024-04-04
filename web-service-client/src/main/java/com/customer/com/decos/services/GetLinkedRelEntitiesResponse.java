
package com.customer.com.decos.services;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.ArrayOfEntity;


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
 *         &lt;element name="GetLinkedRelEntitiesResult" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}ArrayOfEntity" minOccurs="0"/&gt;
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
    "getLinkedRelEntitiesResult"
})
@XmlRootElement(name = "GetLinkedRelEntitiesResponse")
public class GetLinkedRelEntitiesResponse {

    @XmlElementRef(name = "GetLinkedRelEntitiesResult", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEntity> getLinkedRelEntitiesResult;

    /**
     * Gets the value of the getLinkedRelEntitiesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEntity> getGetLinkedRelEntitiesResult() {
        return getLinkedRelEntitiesResult;
    }

    /**
     * Sets the value of the getLinkedRelEntitiesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     *     
     */
    public void setGetLinkedRelEntitiesResult(JAXBElement<ArrayOfEntity> value) {
        this.getLinkedRelEntitiesResult = value;
    }

}
