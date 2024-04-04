
package com.customer.org.datacontract.schemas._2004._07.system;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.customer.org.datacontract.schemas._2004._07.system package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DataTable_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Data", "DataTable");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.customer.org.datacontract.schemas._2004._07.system
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DataTable }
     * 
     */
    public DataTable createDataTable() {
        return new DataTable();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataTable }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataTable }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Data", name = "DataTable")
    public JAXBElement<DataTable> createDataTable(DataTable value) {
        return new JAXBElement<DataTable>(_DataTable_QNAME, DataTable.class, null, value);
    }

}
