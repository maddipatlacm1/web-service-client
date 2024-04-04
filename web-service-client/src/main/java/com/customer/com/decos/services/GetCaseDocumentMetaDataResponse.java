
package com.customer.com.decos.services;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import com.customer.org.datacontract.schemas._2004._07.decos_connect_entities.CaseDocumentMetaData;


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
 *         &lt;element name="GetCaseDocumentMetaDataResult" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities.CaseMetaData}CaseDocumentMetaData" minOccurs="0"/&gt;
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
    "getCaseDocumentMetaDataResult"
})
@XmlRootElement(name = "GetCaseDocumentMetaDataResponse")
public class GetCaseDocumentMetaDataResponse {

    @XmlElementRef(name = "GetCaseDocumentMetaDataResult", namespace = "www.decos.com/services", type = JAXBElement.class, required = false)
    protected JAXBElement<CaseDocumentMetaData> getCaseDocumentMetaDataResult;

    /**
     * Gets the value of the getCaseDocumentMetaDataResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CaseDocumentMetaData }{@code >}
     *     
     */
    public JAXBElement<CaseDocumentMetaData> getGetCaseDocumentMetaDataResult() {
        return getCaseDocumentMetaDataResult;
    }

    /**
     * Sets the value of the getCaseDocumentMetaDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CaseDocumentMetaData }{@code >}
     *     
     */
    public void setGetCaseDocumentMetaDataResult(JAXBElement<CaseDocumentMetaData> value) {
        this.getCaseDocumentMetaDataResult = value;
    }

}
