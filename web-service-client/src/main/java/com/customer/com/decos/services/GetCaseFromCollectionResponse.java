
package com.customer.com.decos.services;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.Case;


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
 *         &lt;element name="GetCaseFromCollectionResult" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}Case" minOccurs="0"/&gt;
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
    "getCaseFromCollectionResult"
})
@XmlRootElement(name = "GetCaseFromCollectionResponse")
public class GetCaseFromCollectionResponse {

    @XmlElementRef(name = "GetCaseFromCollectionResult", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<Case> getCaseFromCollectionResult;

    /**
     * Gets the value of the getCaseFromCollectionResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Case }{@code >}
     *     
     */
    public JAXBElement<Case> getGetCaseFromCollectionResult() {
        return getCaseFromCollectionResult;
    }

    /**
     * Sets the value of the getCaseFromCollectionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Case }{@code >}
     *     
     */
    public void setGetCaseFromCollectionResult(JAXBElement<Case> value) {
        this.getCaseFromCollectionResult = value;
    }

}
