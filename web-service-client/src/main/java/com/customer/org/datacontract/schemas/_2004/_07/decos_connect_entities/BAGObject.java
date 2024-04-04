
package com.customer.org.datacontract.schemas._2004._07.decos_connect_entities;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.Entity;


/**
 * <p>Java class for BAGObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BAGObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="HouseLetter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HouseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HouseNumberAddition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationLatLong" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationRijksdriehoekCoordinates" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PublicSpaceIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourceDocumentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SourceDocumentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Zipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "BAGObject", propOrder = {
    "addressIdentification",
    "city",
    "description",
    "endDate",
    "houseLetter",
    "houseNumber",
    "houseNumberAddition",
    "identification",
    "locationLatLong",
    "locationRijksdriehoekCoordinates",
    "mailAddress",
    "objectType",
    "publicSpaceIdentification",
    "sourceDocumentDate",
    "sourceDocumentNumber",
    "startDate",
    "status",
    "streetName",
    "zipcode",
    "subscribed"
})
public class BAGObject
    extends Entity
{

    @XmlElementRef(name = "AddressIdentification", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressIdentification;
    @XmlElementRef(name = "City", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlElementRef(name = "HouseLetter", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> houseLetter;
    @XmlElementRef(name = "HouseNumber", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> houseNumber;
    @XmlElementRef(name = "HouseNumberAddition", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> houseNumberAddition;
    @XmlElementRef(name = "Identification", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identification;
    @XmlElementRef(name = "LocationLatLong", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationLatLong;
    @XmlElementRef(name = "LocationRijksdriehoekCoordinates", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationRijksdriehoekCoordinates;
    @XmlElementRef(name = "MailAddress", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailAddress;
    @XmlElementRef(name = "ObjectType", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> objectType;
    @XmlElementRef(name = "PublicSpaceIdentification", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> publicSpaceIdentification;
    @XmlElement(name = "SourceDocumentDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sourceDocumentDate;
    @XmlElementRef(name = "SourceDocumentNumber", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceDocumentNumber;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElementRef(name = "Status", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "StreetName", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> streetName;
    @XmlElementRef(name = "Zipcode", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> zipcode;
    @XmlElement(name = "Subscribed")
    protected Boolean subscribed;

    /**
     * Gets the value of the addressIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressIdentification() {
        return addressIdentification;
    }

    /**
     * Sets the value of the addressIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressIdentification(JAXBElement<String> value) {
        this.addressIdentification = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCity(JAXBElement<String> value) {
        this.city = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

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
     * Gets the value of the houseLetter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHouseLetter() {
        return houseLetter;
    }

    /**
     * Sets the value of the houseLetter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHouseLetter(JAXBElement<String> value) {
        this.houseLetter = value;
    }

    /**
     * Gets the value of the houseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHouseNumber() {
        return houseNumber;
    }

    /**
     * Sets the value of the houseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHouseNumber(JAXBElement<String> value) {
        this.houseNumber = value;
    }

    /**
     * Gets the value of the houseNumberAddition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHouseNumberAddition() {
        return houseNumberAddition;
    }

    /**
     * Sets the value of the houseNumberAddition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHouseNumberAddition(JAXBElement<String> value) {
        this.houseNumberAddition = value;
    }

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentification(JAXBElement<String> value) {
        this.identification = value;
    }

    /**
     * Gets the value of the locationLatLong property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationLatLong() {
        return locationLatLong;
    }

    /**
     * Sets the value of the locationLatLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationLatLong(JAXBElement<String> value) {
        this.locationLatLong = value;
    }

    /**
     * Gets the value of the locationRijksdriehoekCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationRijksdriehoekCoordinates() {
        return locationRijksdriehoekCoordinates;
    }

    /**
     * Sets the value of the locationRijksdriehoekCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationRijksdriehoekCoordinates(JAXBElement<String> value) {
        this.locationRijksdriehoekCoordinates = value;
    }

    /**
     * Gets the value of the mailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailAddress() {
        return mailAddress;
    }

    /**
     * Sets the value of the mailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailAddress(JAXBElement<String> value) {
        this.mailAddress = value;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObjectType(JAXBElement<String> value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the publicSpaceIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPublicSpaceIdentification() {
        return publicSpaceIdentification;
    }

    /**
     * Sets the value of the publicSpaceIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPublicSpaceIdentification(JAXBElement<String> value) {
        this.publicSpaceIdentification = value;
    }

    /**
     * Gets the value of the sourceDocumentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSourceDocumentDate() {
        return sourceDocumentDate;
    }

    /**
     * Sets the value of the sourceDocumentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSourceDocumentDate(XMLGregorianCalendar value) {
        this.sourceDocumentDate = value;
    }

    /**
     * Gets the value of the sourceDocumentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceDocumentNumber() {
        return sourceDocumentNumber;
    }

    /**
     * Sets the value of the sourceDocumentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceDocumentNumber(JAXBElement<String> value) {
        this.sourceDocumentNumber = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStreetName(JAXBElement<String> value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the zipcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getZipcode() {
        return zipcode;
    }

    /**
     * Sets the value of the zipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setZipcode(JAXBElement<String> value) {
        this.zipcode = value;
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
