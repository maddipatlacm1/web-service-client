
package com.customer.com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.ArrayOfFile;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.Entity;


/**
 * <p>Java class for ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyValueOfEntityArrayOfFileBSZZKfqt" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Key" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}Entity"/&gt;
 *                   &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}ArrayOfFile"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt", propOrder = {
    "keyValueOfEntityArrayOfFileBSZZKfqt"
})
public class ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt {

    @XmlElement(name = "KeyValueOfEntityArrayOfFileBSZZKfqt")
    protected List<KeyValueOfEntityArrayOfFileBSZZKfqt> keyValueOfEntityArrayOfFileBSZZKfqt;

    /**
     * Gets the value of the keyValueOfEntityArrayOfFileBSZZKfqt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfEntityArrayOfFileBSZZKfqt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfEntityArrayOfFileBSZZKfqt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValueOfEntityArrayOfFileBSZZKfqt }
     * 
     * 
     */
    public List<KeyValueOfEntityArrayOfFileBSZZKfqt> getKeyValueOfEntityArrayOfFileBSZZKfqt() {
        if (keyValueOfEntityArrayOfFileBSZZKfqt == null) {
            keyValueOfEntityArrayOfFileBSZZKfqt = new ArrayList<KeyValueOfEntityArrayOfFileBSZZKfqt>();
        }
        return this.keyValueOfEntityArrayOfFileBSZZKfqt;
    }


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
     *         &lt;element name="Key" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}Entity"/&gt;
     *         &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/Decos.Connect.Entities}ArrayOfFile"/&gt;
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
        "key",
        "value"
    })
    public static class KeyValueOfEntityArrayOfFileBSZZKfqt {

        @XmlElement(name = "Key", required = true, nillable = true)
        protected Entity key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected ArrayOfFile value;

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link Entity }
         *     
         */
        public Entity getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link Entity }
         *     
         */
        public void setKey(Entity value) {
            this.key = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfFile }
         *     
         */
        public ArrayOfFile getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfFile }
         *     
         */
        public void setValue(ArrayOfFile value) {
            this.value = value;
        }

    }

}
