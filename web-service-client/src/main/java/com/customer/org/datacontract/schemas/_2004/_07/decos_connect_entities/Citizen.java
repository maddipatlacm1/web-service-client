
package com.customer.org.datacontract.schemas._2004._07.decos_connect_entities;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.Person;


/**
 * <p>Java class for Citizen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Citizen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}Person"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AristocraticTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CitizenServiceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FamilyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FullFirstNames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsSecretAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SourceApplicationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VisitCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VisitCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VisitHouseLetter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VisitHouseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VisitHouseNumberAddition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VisitMunicipalityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VisitState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VisitStreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VisitZipcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Citizen", propOrder = {
    "aristocraticTitle",
    "citizenServiceNumber",
    "familyName",
    "fullFirstNames",
    "isSecretAddress",
    "sourceApplicationName",
    "visitCity",
    "visitCountry",
    "visitHouseLetter",
    "visitHouseNumber",
    "visitHouseNumberAddition",
    "visitMunicipalityCode",
    "visitState",
    "visitStreetName",
    "visitZipcode",
    "subscribed"
})
public class Citizen
    extends Person
{

    @XmlElementRef(name = "AristocraticTitle", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aristocraticTitle;
    @XmlElementRef(name = "CitizenServiceNumber", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> citizenServiceNumber;
    @XmlElementRef(name = "FamilyName", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> familyName;
    @XmlElementRef(name = "FullFirstNames", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fullFirstNames;
    @XmlElement(name = "IsSecretAddress")
    protected Boolean isSecretAddress;
    @XmlElementRef(name = "SourceApplicationName", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceApplicationName;
    @XmlElementRef(name = "VisitCity", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> visitCity;
    @XmlElementRef(name = "VisitCountry", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> visitCountry;
    @XmlElementRef(name = "VisitHouseLetter", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> visitHouseLetter;
    @XmlElementRef(name = "VisitHouseNumber", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> visitHouseNumber;
    @XmlElementRef(name = "VisitHouseNumberAddition", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> visitHouseNumberAddition;
    @XmlElementRef(name = "VisitMunicipalityCode", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> visitMunicipalityCode;
    @XmlElementRef(name = "VisitState", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> visitState;
    @XmlElementRef(name = "VisitStreetName", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> visitStreetName;
    @XmlElementRef(name = "VisitZipcode", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.Government", type = JAXBElement.class, required = false)
    protected JAXBElement<String> visitZipcode;
    @XmlElement(name = "Subscribed")
    protected Boolean subscribed;

    /**
     * Gets the value of the aristocraticTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAristocraticTitle() {
        return aristocraticTitle;
    }

    /**
     * Sets the value of the aristocraticTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAristocraticTitle(JAXBElement<String> value) {
        this.aristocraticTitle = value;
    }

    /**
     * Gets the value of the citizenServiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCitizenServiceNumber() {
        return citizenServiceNumber;
    }

    /**
     * Sets the value of the citizenServiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCitizenServiceNumber(JAXBElement<String> value) {
        this.citizenServiceNumber = value;
    }

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFamilyName(JAXBElement<String> value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the fullFirstNames property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFullFirstNames() {
        return fullFirstNames;
    }

    /**
     * Sets the value of the fullFirstNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFullFirstNames(JAXBElement<String> value) {
        this.fullFirstNames = value;
    }

    /**
     * Gets the value of the isSecretAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSecretAddress() {
        return isSecretAddress;
    }

    /**
     * Sets the value of the isSecretAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSecretAddress(Boolean value) {
        this.isSecretAddress = value;
    }

    /**
     * Gets the value of the sourceApplicationName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceApplicationName() {
        return sourceApplicationName;
    }

    /**
     * Sets the value of the sourceApplicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceApplicationName(JAXBElement<String> value) {
        this.sourceApplicationName = value;
    }

    /**
     * Gets the value of the visitCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVisitCity() {
        return visitCity;
    }

    /**
     * Sets the value of the visitCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVisitCity(JAXBElement<String> value) {
        this.visitCity = value;
    }

    /**
     * Gets the value of the visitCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVisitCountry() {
        return visitCountry;
    }

    /**
     * Sets the value of the visitCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVisitCountry(JAXBElement<String> value) {
        this.visitCountry = value;
    }

    /**
     * Gets the value of the visitHouseLetter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVisitHouseLetter() {
        return visitHouseLetter;
    }

    /**
     * Sets the value of the visitHouseLetter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVisitHouseLetter(JAXBElement<String> value) {
        this.visitHouseLetter = value;
    }

    /**
     * Gets the value of the visitHouseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVisitHouseNumber() {
        return visitHouseNumber;
    }

    /**
     * Sets the value of the visitHouseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVisitHouseNumber(JAXBElement<String> value) {
        this.visitHouseNumber = value;
    }

    /**
     * Gets the value of the visitHouseNumberAddition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVisitHouseNumberAddition() {
        return visitHouseNumberAddition;
    }

    /**
     * Sets the value of the visitHouseNumberAddition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVisitHouseNumberAddition(JAXBElement<String> value) {
        this.visitHouseNumberAddition = value;
    }

    /**
     * Gets the value of the visitMunicipalityCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVisitMunicipalityCode() {
        return visitMunicipalityCode;
    }

    /**
     * Sets the value of the visitMunicipalityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVisitMunicipalityCode(JAXBElement<String> value) {
        this.visitMunicipalityCode = value;
    }

    /**
     * Gets the value of the visitState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVisitState() {
        return visitState;
    }

    /**
     * Sets the value of the visitState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVisitState(JAXBElement<String> value) {
        this.visitState = value;
    }

    /**
     * Gets the value of the visitStreetName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVisitStreetName() {
        return visitStreetName;
    }

    /**
     * Sets the value of the visitStreetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVisitStreetName(JAXBElement<String> value) {
        this.visitStreetName = value;
    }

    /**
     * Gets the value of the visitZipcode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVisitZipcode() {
        return visitZipcode;
    }

    /**
     * Sets the value of the visitZipcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVisitZipcode(JAXBElement<String> value) {
        this.visitZipcode = value;
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
