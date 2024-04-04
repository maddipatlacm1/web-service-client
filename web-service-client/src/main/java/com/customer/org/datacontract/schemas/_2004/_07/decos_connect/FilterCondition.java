
package com.customer.org.datacontract.schemas._2004._07.decos_connect;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterCondition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndBracket" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NextOperator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PropertyValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartBracket" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterCondition", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Filters", propOrder = {
    "endBracket",
    "nextOperator",
    "operator",
    "propertyName",
    "propertyValue",
    "startBracket"
})
@XmlSeeAlso({
    FilterConditionSQL.class
})
public class FilterCondition {

    @XmlElement(name = "EndBracket")
    protected Boolean endBracket;
    @XmlElementRef(name = "NextOperator", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Filters", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nextOperator;
    @XmlElementRef(name = "Operator", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Filters", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operator;
    @XmlElementRef(name = "PropertyName", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Filters", type = JAXBElement.class, required = false)
    protected JAXBElement<String> propertyName;
    @XmlElementRef(name = "PropertyValue", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Filters", type = JAXBElement.class, required = false)
    protected JAXBElement<String> propertyValue;
    @XmlElement(name = "StartBracket")
    protected Boolean startBracket;

    /**
     * Gets the value of the endBracket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEndBracket() {
        return endBracket;
    }

    /**
     * Sets the value of the endBracket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndBracket(Boolean value) {
        this.endBracket = value;
    }

    /**
     * Gets the value of the nextOperator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNextOperator() {
        return nextOperator;
    }

    /**
     * Sets the value of the nextOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNextOperator(JAXBElement<String> value) {
        this.nextOperator = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperator(JAXBElement<String> value) {
        this.operator = value;
    }

    /**
     * Gets the value of the propertyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPropertyName() {
        return propertyName;
    }

    /**
     * Sets the value of the propertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPropertyName(JAXBElement<String> value) {
        this.propertyName = value;
    }

    /**
     * Gets the value of the propertyValue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPropertyValue() {
        return propertyValue;
    }

    /**
     * Sets the value of the propertyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPropertyValue(JAXBElement<String> value) {
        this.propertyValue = value;
    }

    /**
     * Gets the value of the startBracket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStartBracket() {
        return startBracket;
    }

    /**
     * Sets the value of the startBracket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartBracket(Boolean value) {
        this.startBracket = value;
    }

}
