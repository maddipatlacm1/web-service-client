
package com.customer.com.decos.services;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.customer.org.datacontract.schemas._2004._07.decos_connect_entities.Citizen;


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
 *         &lt;element name="GetCitizenFromCollectionResult" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government}Citizen" minOccurs="0"/&gt;
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
    "getCitizenFromCollectionResult"
})
@XmlRootElement(name = "GetCitizenFromCollectionResponse")
public class GetCitizenFromCollectionResponse {

    @XmlElementRef(name = "GetCitizenFromCollectionResult", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<Citizen> getCitizenFromCollectionResult;

    /**
     * Gets the value of the getCitizenFromCollectionResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Citizen }{@code >}
     *     
     */
    public JAXBElement<Citizen> getGetCitizenFromCollectionResult() {
        return getCitizenFromCollectionResult;
    }

    /**
     * Sets the value of the getCitizenFromCollectionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Citizen }{@code >}
     *     
     */
    public void setGetCitizenFromCollectionResult(JAXBElement<Citizen> value) {
        this.getCitizenFromCollectionResult = value;
    }

}
