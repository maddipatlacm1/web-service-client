
package com.customer.org.datacontract.schemas._2004._07.decos_connect_entities;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.Company;


/**
 * <p>Java class for CompanyNHR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyNHR"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}Company"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OrganisationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RSIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatutoryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Subscribed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyNHR", propOrder = {
    "endDate",
    "organisationNumber",
    "rsin",
    "statutoryName",
    "taxNumber",
    "subscribed"
})
public class CompanyNHR
    extends Company
{

    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElementRef(name = "OrganisationNumber", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organisationNumber;
    @XmlElementRef(name = "RSIN", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rsin;
    @XmlElementRef(name = "StatutoryName", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statutoryName;
    @XmlElementRef(name = "TaxNumber", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxNumber;
    @XmlElement(name = "Subscribed")
    protected Boolean subscribed;

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the organisationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganisationNumber() {
        return organisationNumber;
    }

    /**
     * Sets the value of the organisationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganisationNumber(JAXBElement<String> value) {
        this.organisationNumber = value;
    }

    /**
     * Gets the value of the rsin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRSIN() {
        return rsin;
    }

    /**
     * Sets the value of the rsin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRSIN(JAXBElement<String> value) {
        this.rsin = value;
    }

    /**
     * Gets the value of the statutoryName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatutoryName() {
        return statutoryName;
    }

    /**
     * Sets the value of the statutoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatutoryName(JAXBElement<String> value) {
        this.statutoryName = value;
    }

    /**
     * Gets the value of the taxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxNumber() {
        return taxNumber;
    }

    /**
     * Sets the value of the taxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxNumber(JAXBElement<String> value) {
        this.taxNumber = value;
    }

    /**
     * Gets the value of the subscribed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubscribed() {
        return subscribed;
    }

    /**
     * Sets the value of the subscribed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubscribed(Boolean value) {
        this.subscribed = value;
    }

}
