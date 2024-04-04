
package com.customer.org.datacontract.schemas._2004._07.decos_connect;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseDocument"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}Document"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Case" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}Case" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseDocument", propOrder = {
    "_case"
})
public class CaseDocument
    extends Document
{

    @XmlElementRef(name = "Case", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<Case> _case;

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Case }{@code >}
     *     
     */
    public JAXBElement<Case> getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Case }{@code >}
     *     
     */
    public void setCase(JAXBElement<Case> value) {
        this._case = value;
    }

}
