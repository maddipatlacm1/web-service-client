
package com.customer.com.decos.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="DownloadAsPDFResult" type="{http://schemas.microsoft.com/Message}StreamBody"/&gt;
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
    "downloadAsPDFResult"
})
@XmlRootElement(name = "DownloadAsPDFResponse")
public class DownloadAsPDFResponse {

    @XmlElement(name = "DownloadAsPDFResult", required = true)
    protected byte[] downloadAsPDFResult;

    /**
     * Gets the value of the downloadAsPDFResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDownloadAsPDFResult() {
        return downloadAsPDFResult;
    }

    /**
     * Sets the value of the downloadAsPDFResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDownloadAsPDFResult(byte[] value) {
        this.downloadAsPDFResult = value;
    }

}
