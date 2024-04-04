
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
 *         &lt;element name="sPartDownloadToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fVersion" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}FileVersion" minOccurs="0"/&gt;
 *         &lt;element name="bAsPDF" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "sPartDownloadToken",
    "fVersion",
    "bAsPDF",
    "sToken"
})
@XmlRootElement(name = "DownloadFilePart")
public class DownloadFilePart {

    @XmlElementRef(name = "ent", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<File> ent;
    @XmlElementRef(name = "sPartDownloadToken", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sPartDownloadToken;
    @XmlElementRef(name = "fVersion", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<FileVersion> fVersion;
    protected Boolean bAsPDF;
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
     * Gets the value of the sPartDownloadToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSPartDownloadToken() {
        return sPartDownloadToken;
    }

    /**
     * Sets the value of the sPartDownloadToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSPartDownloadToken(JAXBElement<String> value) {
        this.sPartDownloadToken = value;
    }

    /**
     * Gets the value of the fVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FileVersion }{@code >}
     *     
     */
    public JAXBElement<FileVersion> getFVersion() {
        return fVersion;
    }

    /**
     * Sets the value of the fVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FileVersion }{@code >}
     *     
     */
    public void setFVersion(JAXBElement<FileVersion> value) {
        this.fVersion = value;
    }

    /**
     * Gets the value of the bAsPDF property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBAsPDF() {
        return bAsPDF;
    }

    /**
     * Sets the value of the bAsPDF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBAsPDF(Boolean value) {
        this.bAsPDF = value;
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
