
package com.customer.com.decos.services;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.customer.org.datacontract.schemas._2004._07.decos_connect_entities.BAGObject;


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
 *         &lt;element name="GetBAGObjectFromCollectionResult" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government}BAGObject" minOccurs="0"/&gt;
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
    "getBAGObjectFromCollectionResult"
})
@XmlRootElement(name = "GetBAGObjectFromCollectionResponse")
public class GetBAGObjectFromCollectionResponse {

    @XmlElementRef(name = "GetBAGObjectFromCollectionResult", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<BAGObject> getBAGObjectFromCollectionResult;

    /**
     * Gets the value of the getBAGObjectFromCollectionResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BAGObject }{@code >}
     *     
     */
    public JAXBElement<BAGObject> getGetBAGObjectFromCollectionResult() {
        return getBAGObjectFromCollectionResult;
    }

    /**
     * Sets the value of the getBAGObjectFromCollectionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BAGObject }{@code >}
     *     
     */
    public void setGetBAGObjectFromCollectionResult(JAXBElement<BAGObject> value) {
        this.getBAGObjectFromCollectionResult = value;
    }

}
