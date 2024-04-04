
package com.customer.com.decos.services;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.File;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.FileVersion;


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
 *         &lt;element name="ent" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}File" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}FileVersion" minOccurs="0"/&gt;
 *         &lt;element name="sToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "ent",
    "version",
    "sToken"
})
@XmlRootElement(name = "DownloadFileVersionByEntity")
public class DownloadFileVersionByEntity {

    @XmlElementRef(name = "ent", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<File> ent;
    @XmlElementRef(name = "version", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<FileVersion> version;
    @XmlElementRef(name = "sToken", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sToken;

    /**
     * Gets the value of the ent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link File }{@code >}
     *     
     */
    public JAXBElement<File> getEnt() {
        return ent;
    }

    /**
     * Sets the value of the ent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link File }{@code >}
     *     
     */
    public void setEnt(JAXBElement<File> value) {
        this.ent = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileVersion }{@code >}
     *     
     */
    public JAXBElement<FileVersion> getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileVersion }{@code >}
     *     
     */
    public void setVersion(JAXBElement<FileVersion> value) {
        this.version = value;
    }

    /**
     * Gets the value of the sToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSToken() {
        return sToken;
    }

    /**
     * Sets the value of the sToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSToken(JAXBElement<String> value) {
        this.sToken = value;
    }

}
