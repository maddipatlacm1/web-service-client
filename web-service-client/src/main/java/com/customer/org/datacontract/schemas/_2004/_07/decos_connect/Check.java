
package com.customer.org.datacontract.schemas._2004._07.decos_connect;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Check complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Check"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Answer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Automatic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DecosUniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Question" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Check", propOrder = {
    "answer",
    "automatic",
    "decosUniqueId",
    "question"
})
public class Check {

    @XmlElement(name = "Answer")
    protected Boolean answer;
    @XmlElement(name = "Automatic")
    protected Boolean automatic;
    @XmlElementRef(name = "DecosUniqueId", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> decosUniqueId;
    @XmlElementRef(name = "Question", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> question;

    /**
     * Gets the value of the answer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnswer() {
        return answer;
    }

    /**
     * Sets the value of the answer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnswer(Boolean value) {
        this.answer = value;
    }

    /**
     * Gets the value of the automatic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomatic() {
        return automatic;
    }

    /**
     * Sets the value of the automatic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomatic(Boolean value) {
        this.automatic = value;
    }

    /**
     * Gets the value of the decosUniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDecosUniqueId() {
        return decosUniqueId;
    }

    /**
     * Sets the value of the decosUniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDecosUniqueId(JAXBElement<String> value) {
        this.decosUniqueId = value;
    }

    /**
     * Gets the value of the question property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuestion() {
        return question;
    }

    /**
     * Sets the value of the question property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuestion(JAXBElement<String> value) {
        this.question = value;
    }

}
