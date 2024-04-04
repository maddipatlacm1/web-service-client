
package com.customer.com.decos.services;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.Task;


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
 *         &lt;element name="GetTaskResult" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}Task" minOccurs="0"/&gt;
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
    "getTaskResult"
})
@XmlRootElement(name = "GetTaskResponse")
public class GetTaskResponse {

    @XmlElementRef(name = "GetTaskResult", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<Task> getTaskResult;

    /**
     * Gets the value of the getTaskResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Task }{@code >}
     *     
     */
    public JAXBElement<Task> getGetTaskResult() {
        return getTaskResult;
    }

    /**
     * Sets the value of the getTaskResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Task }{@code >}
     *     
     */
    public void setGetTaskResult(JAXBElement<Task> value) {
        this.getTaskResult = value;
    }

}
