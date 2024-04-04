
package com.customer.com.microsoft.schemas._2003._10.serialization.arrays;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.customer.com.microsoft.schemas._2003._10.serialization.arrays package. 
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

    private final static QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private final static QName _ArrayOfanyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfanyType");
    private final static QName _ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt");
    private final static QName _ArrayOfKeyValueOfstringstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfstringstring");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.customer.com.microsoft.schemas._2003._10.serialization.arrays
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfstringstring }
     * 
     */
    public ArrayOfKeyValueOfstringstring createArrayOfKeyValueOfstringstring() {
        return new ArrayOfKeyValueOfstringstring();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt }
     * 
     */
    public ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt createArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt() {
        return new ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link ArrayOfanyType }
     * 
     */
    public ArrayOfanyType createArrayOfanyType() {
        return new ArrayOfanyType();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfstringstring.KeyValueOfstringstring }
     * 
     */
    public ArrayOfKeyValueOfstringstring.KeyValueOfstringstring createArrayOfKeyValueOfstringstringKeyValueOfstringstring() {
        return new ArrayOfKeyValueOfstringstring.KeyValueOfstringstring();
    }

    /**
     * Create an instance of {@link ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt.KeyValueOfEntityArrayOfFileBSZZKfqt }
     * 
     */
    public ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt.KeyValueOfEntityArrayOfFileBSZZKfqt createArrayOfKeyValueOfEntityArrayOfFileBSZZKfqtKeyValueOfEntityArrayOfFileBSZZKfqt() {
        return new ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt.KeyValueOfEntityArrayOfFileBSZZKfqt();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfanyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfanyType")
    public JAXBElement<ArrayOfanyType> createArrayOfanyType(ArrayOfanyType value) {
        return new JAXBElement<ArrayOfanyType>(_ArrayOfanyType_QNAME, ArrayOfanyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt")
    public JAXBElement<ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt> createArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt(ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt value) {
        return new JAXBElement<ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt>(_ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt_QNAME, ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfKeyValueOfstringstring")
    public JAXBElement<ArrayOfKeyValueOfstringstring> createArrayOfKeyValueOfstringstring(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_ArrayOfKeyValueOfstringstring_QNAME, ArrayOfKeyValueOfstringstring.class, null, value);
    }

}
