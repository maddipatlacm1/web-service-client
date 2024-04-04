
package com.customer.org.datacontract.schemas._2004._07.decos_connect;

import com.customer.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}Entity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CaseTypeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HandlerRoleSpecified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ManualWorkflow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProcessID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Results" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="Statusses" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseType", propOrder = {
    "caseTypeID",
    "department",
    "description",
    "handlerRoleSpecified",
    "manualWorkflow",
    "owner",
    "processID",
    "results",
    "statusses"
})
public class CaseType
    extends Entity
{

    @XmlElementRef(name = "CaseTypeID", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> caseTypeID;
    @XmlElementRef(name = "Department", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> department;
    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "HandlerRoleSpecified")
    protected Boolean handlerRoleSpecified;
    @XmlElement(name = "ManualWorkflow")
    protected Boolean manualWorkflow;
    @XmlElementRef(name = "Owner", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> owner;
    @XmlElementRef(name = "ProcessID", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<String> processID;
    @XmlElementRef(name = "Results", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> results;
    @XmlElementRef(name = "Statusses", namespace = "http://schemas.datacontract.org/2004/07/Decos.Connect.Entities", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> statusses;

    /**
     * Gets the value of the caseTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCaseTypeID() {
        return caseTypeID;
    }

    /**
     * Sets the value of the caseTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCaseTypeID(JAXBElement<String> value) {
        this.caseTypeID = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartment(JAXBElement<String> value) {
        this.department = value;
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
     * Gets the value of the handlerRoleSpecified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHandlerRoleSpecified() {
        return handlerRoleSpecified;
    }

    /**
     * Sets the value of the handlerRoleSpecified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHandlerRoleSpecified(Boolean value) {
        this.handlerRoleSpecified = value;
    }

    /**
     * Gets the value of the manualWorkflow property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManualWorkflow() {
        return manualWorkflow;
    }

    /**
     * Sets the value of the manualWorkflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManualWorkflow(Boolean value) {
        this.manualWorkflow = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwner(JAXBElement<String> value) {
        this.owner = value;
    }

    /**
     * Gets the value of the processID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProcessID() {
        return processID;
    }

    /**
     * Sets the value of the processID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProcessID(JAXBElement<String> value) {
        this.processID = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setResults(JAXBElement<ArrayOfstring> value) {
        this.results = value;
    }

    /**
     * Gets the value of the statusses property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getStatusses() {
        return statusses;
    }

    /**
     * Sets the value of the statusses property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setStatusses(JAXBElement<ArrayOfstring> value) {
        this.statusses = value;
    }

}
