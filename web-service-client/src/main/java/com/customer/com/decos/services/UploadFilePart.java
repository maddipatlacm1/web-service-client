
package com.customer.com.decos.services;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.File;


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
 *         &lt;element name="baFileData" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="oFileEntity" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}File" minOccurs="0"/&gt;
 *         &lt;element name="sPartUploadToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bEndUpload" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "baFileData",
    "oFileEntity",
    "sPartUploadToken",
    "bEndUpload",
    "sToken"
})
@XmlRootElement(name = "UploadFilePart")
public class UploadFilePart {

    @XmlElementRef(name = "baFileData", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> baFileData;
    @XmlElementRef(name = "oFileEntity", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<File> oFileEntity;
    @XmlElementRef(name = "sPartUploadToken", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sPartUploadToken;
    protected Boolean bEndUpload;
    @XmlElementRef(name = "sToken", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sToken;

    /**
     * Gets the value of the baFileData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getBaFileData() {
        return baFileData;
    }

    /**
     * Sets the value of the baFileData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setBaFileData(JAXBElement<byte[]> value) {
        this.baFileData = value;
    }

    /**
     * Gets the value of the oFileEntity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link File }{@code >}
     *     
     */
    public JAXBElement<File> getOFileEntity() {
        return oFileEntity;
    }

    /**
     * Sets the value of the oFileEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link File }{@code >}
     *     
     */
    public void setOFileEntity(JAXBElement<File> value) {
        this.oFileEntity = value;
    }

    /**
     * Gets the value of the sPartUploadToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSPartUploadToken() {
        return sPartUploadToken;
    }

    /**
     * Sets the value of the sPartUploadToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSPartUploadToken(JAXBElement<String> value) {
        this.sPartUploadToken = value;
    }

    /**
     * Gets the value of the bEndUpload property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBEndUpload() {
        return bEndUpload;
    }

    /**
     * Sets the value of the bEndUpload property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBEndUpload(Boolean value) {
        this.bEndUpload = value;
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
