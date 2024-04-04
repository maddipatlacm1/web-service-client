
package com.customer.com.decos.services;

import javax.xml.namespace.QName;
import com.customer.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt;
import com.customer.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringstring;
import com.customer.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.ArrayOfCase;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.ArrayOfCaseDecision;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.ArrayOfCaseDocument;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.ArrayOfCaseType;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.ArrayOfCompany;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.ArrayOfDocument;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.ArrayOfDocumentType;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.ArrayOfEntity;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.ArrayOfFolder;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.ArrayOfMeeting;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.ArrayOfPerson;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.ArrayOfTopic;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.Case;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.CaseDecision;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.CaseDocument;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.CaseType;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.Company;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.Document;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.DocumentType;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.Entity;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.File;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.FilePart;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.FileVersion;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.Filter;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.Folder;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.MailingCode;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.Meeting;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.Person;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.Role;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.Task;
import com.customer.org.datacontract.schemas._2004._07.decos_connect.Topic;
import com.customer.org.datacontract.schemas._2004._07.decos_connect_entities.ArrayOfBAGObject;
import com.customer.org.datacontract.schemas._2004._07.decos_connect_entities.ArrayOfCitizen;
import com.customer.org.datacontract.schemas._2004._07.decos_connect_entities.ArrayOfCompanyNHR;
import com.customer.org.datacontract.schemas._2004._07.decos_connect_entities.BAGObject;
import com.customer.org.datacontract.schemas._2004._07.decos_connect_entities.CaseDecisionMetaData;
import com.customer.org.datacontract.schemas._2004._07.decos_connect_entities.CaseDocumentMetaData;
import com.customer.org.datacontract.schemas._2004._07.decos_connect_entities.Citizen;
import com.customer.org.datacontract.schemas._2004._07.decos_connect_entities.CompanyNHR;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.customer.com.decos.services package. 
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

    private final static QName _FileEntity_QNAME = new QName("www.decos.com/services", "FileEntity");
    private final static QName _Token_QNAME = new QName("www.decos.com/services", "Token");
    private final static QName _Uploaded_QNAME = new QName("www.decos.com/services", "Uploaded");
    private final static QName _GetLinkedRelEntitiesWithRelationTypeFilterOEntity_QNAME = new QName("www.decos.com/services", "oEntity");
    private final static QName _GetLinkedRelEntitiesWithRelationTypeFilterORelEntity_QNAME = new QName("www.decos.com/services", "oRelEntity");
    private final static QName _GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME = new QName("www.decos.com/services", "sCollectionIdentifier");
    private final static QName _GetLinkedRelEntitiesWithRelationTypeFilterOFilter_QNAME = new QName("www.decos.com/services", "oFilter");
    private final static QName _GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME = new QName("www.decos.com/services", "sToken");
    private final static QName _GetLinkedRelEntitiesWithRelationTypeFilterResponseGetLinkedRelEntitiesWithRelationTypeFilterResult_QNAME = new QName("www.decos.com/services", "GetLinkedRelEntitiesWithRelationTypeFilterResult");
    private final static QName _GetTaskSIdentifier_QNAME = new QName("www.decos.com/services", "sIdentifier");
    private final static QName _GetTaskOParentEntity_QNAME = new QName("www.decos.com/services", "oParentEntity");
    private final static QName _GetTaskResponseGetTaskResult_QNAME = new QName("www.decos.com/services", "GetTaskResult");
    private final static QName _GetTasksByCategorySUserName_QNAME = new QName("www.decos.com/services", "sUserName");
    private final static QName _GetTasksByCategoryFilter_QNAME = new QName("www.decos.com/services", "filter");
    private final static QName _GetTasksByCategoryResponseGetTasksByCategoryResult_QNAME = new QName("www.decos.com/services", "GetTasksByCategoryResult");
    private final static QName _UploadFileByStreamBaFileData_QNAME = new QName("www.decos.com/services", "baFileData");
    private final static QName _UploadFileByStreamOFileEntity_QNAME = new QName("www.decos.com/services", "oFileEntity");
    private final static QName _GetCollectionsResponseGetCollectionsResult_QNAME = new QName("www.decos.com/services", "GetCollectionsResult");
    private final static QName _LinkEntityWithRoleEnt1_QNAME = new QName("www.decos.com/services", "ent1");
    private final static QName _LinkEntityWithRoleEnt2_QNAME = new QName("www.decos.com/services", "ent2");
    private final static QName _LinkEntityWithRoleORole_QNAME = new QName("www.decos.com/services", "oRole");
    private final static QName _GetRoleOMainItem_QNAME = new QName("www.decos.com/services", "oMainItem");
    private final static QName _GetRoleOLinkedItem_QNAME = new QName("www.decos.com/services", "oLinkedItem");
    private final static QName _GetRoleResponseGetRoleResult_QNAME = new QName("www.decos.com/services", "GetRoleResult");
    private final static QName _GetPossibleRolesResponseGetPossibleRolesResult_QNAME = new QName("www.decos.com/services", "GetPossibleRolesResult");
    private final static QName _GetCaseDocumentResponseGetCaseDocumentResult_QNAME = new QName("www.decos.com/services", "GetCaseDocumentResult");
    private final static QName _GetCaseDocumentFromCollectionResponseGetCaseDocumentFromCollectionResult_QNAME = new QName("www.decos.com/services", "GetCaseDocumentFromCollectionResult");
    private final static QName _GetCaseDocumentsSaIdentifiers_QNAME = new QName("www.decos.com/services", "saIdentifiers");
    private final static QName _GetCaseDocumentsSaCollectionIdentifiers_QNAME = new QName("www.decos.com/services", "saCollectionIdentifiers");
    private final static QName _GetCaseDocumentsResponseGetCaseDocumentsResult_QNAME = new QName("www.decos.com/services", "GetCaseDocumentsResult");
    private final static QName _GetCaseDocumentsFromCollectionResponseGetCaseDocumentsFromCollectionResult_QNAME = new QName("www.decos.com/services", "GetCaseDocumentsFromCollectionResult");
    private final static QName _GetCaseDecisionResponseGetCaseDecisionResult_QNAME = new QName("www.decos.com/services", "GetCaseDecisionResult");
    private final static QName _GetCaseDecisionFromCollectionResponseGetCaseDecisionFromCollectionResult_QNAME = new QName("www.decos.com/services", "GetCaseDecisionFromCollectionResult");
    private final static QName _GetCaseDecisionsResponseGetCaseDecisionsResult_QNAME = new QName("www.decos.com/services", "GetCaseDecisionsResult");
    private final static QName _GetCaseDecisionsFromCollectionResponseGetCaseDecisionsFromCollectionResult_QNAME = new QName("www.decos.com/services", "GetCaseDecisionsFromCollectionResult");
    private final static QName _GetCaseDecisionMetaDataOCase_QNAME = new QName("www.decos.com/services", "oCase");
    private final static QName _GetCaseDecisionMetaDataSBookName_QNAME = new QName("www.decos.com/services", "sBookName");
    private final static QName _GetCaseDecisionMetaDataResponseGetCaseDecisionMetaDataResult_QNAME = new QName("www.decos.com/services", "GetCaseDecisionMetaDataResult");
    private final static QName _GetCaseDocumentMetaDataResponseGetCaseDocumentMetaDataResult_QNAME = new QName("www.decos.com/services", "GetCaseDocumentMetaDataResult");
    private final static QName _GetExternalIdentifierTypesResponseGetExternalIdentifierTypesResult_QNAME = new QName("www.decos.com/services", "GetExternalIdentifierTypesResult");
    private final static QName _GetThumbnailOFile_QNAME = new QName("www.decos.com/services", "oFile");
    private final static QName _GetThumbnailResponseGetThumbnailResult_QNAME = new QName("www.decos.com/services", "GetThumbnailResult");
    private final static QName _GetLinkedFilesResponseGetLinkedFilesResult_QNAME = new QName("www.decos.com/services", "GetLinkedFilesResult");
    private final static QName _UploadFilePartSPartUploadToken_QNAME = new QName("www.decos.com/services", "sPartUploadToken");
    private final static QName _UploadFilePartResponseUploadFilePartResult_QNAME = new QName("www.decos.com/services", "UploadFilePartResult");
    private final static QName _LogAuditEnt_QNAME = new QName("www.decos.com/services", "ent");
    private final static QName _LogAuditSAuditMessage_QNAME = new QName("www.decos.com/services", "sAuditMessage");
    private final static QName _StartMergeSTemplateKey_QNAME = new QName("www.decos.com/services", "sTemplateKey");
    private final static QName _StartMergeResponseStartMergeResult_QNAME = new QName("www.decos.com/services", "StartMergeResult");
    private final static QName _GetDocumentResponseGetDocumentResult_QNAME = new QName("www.decos.com/services", "GetDocumentResult");
    private final static QName _GetDocumentFromCollectionResponseGetDocumentFromCollectionResult_QNAME = new QName("www.decos.com/services", "GetDocumentFromCollectionResult");
    private final static QName _GetDocumentsResponseGetDocumentsResult_QNAME = new QName("www.decos.com/services", "GetDocumentsResult");
    private final static QName _GetDocumentsFromCollectionResponseGetDocumentsFromCollectionResult_QNAME = new QName("www.decos.com/services", "GetDocumentsFromCollectionResult");
    private final static QName _GetBAGObjectResponseGetBAGObjectResult_QNAME = new QName("www.decos.com/services", "GetBAGObjectResult");
    private final static QName _GetBAGObjectFromCollectionResponseGetBAGObjectFromCollectionResult_QNAME = new QName("www.decos.com/services", "GetBAGObjectFromCollectionResult");
    private final static QName _GetBAGObjectsResponseGetBAGObjectsResult_QNAME = new QName("www.decos.com/services", "GetBAGObjectsResult");
    private final static QName _GetBagObjectsFromCollectionResponseGetBagObjectsFromCollectionResult_QNAME = new QName("www.decos.com/services", "GetBagObjectsFromCollectionResult");
    private final static QName _GetCompanyResponseGetCompanyResult_QNAME = new QName("www.decos.com/services", "GetCompanyResult");
    private final static QName _GetCompanyFromCollectionResponseGetCompanyFromCollectionResult_QNAME = new QName("www.decos.com/services", "GetCompanyFromCollectionResult");
    private final static QName _GetCompaniesResponseGetCompaniesResult_QNAME = new QName("www.decos.com/services", "GetCompaniesResult");
    private final static QName _GetCompaniesFromCollectionResponseGetCompaniesFromCollectionResult_QNAME = new QName("www.decos.com/services", "GetCompaniesFromCollectionResult");
    private final static QName _GetCompanyNHRResponseGetCompanyNHRResult_QNAME = new QName("www.decos.com/services", "GetCompanyNHRResult");
    private final static QName _GetCompanyNHRFromCollectionResponseGetCompanyNHRFromCollectionResult_QNAME = new QName("www.decos.com/services", "GetCompanyNHRFromCollectionResult");
    private final static QName _GetCompanyNHRsResponseGetCompanyNHRsResult_QNAME = new QName("www.decos.com/services", "GetCompanyNHRsResult");
    private final static QName _GetCompanyNHRsFromCollectionResponseGetCompanyNHRsFromCollectionResult_QNAME = new QName("www.decos.com/services", "GetCompanyNHRsFromCollectionResult");
    private final static QName _GetCaseResponseGetCaseResult_QNAME = new QName("www.decos.com/services", "GetCaseResult");
    private final static QName _GetCaseFromCollectionResponseGetCaseFromCollectionResult_QNAME = new QName("www.decos.com/services", "GetCaseFromCollectionResult");
    private final static QName _GetCasesResponseGetCasesResult_QNAME = new QName("www.decos.com/services", "GetCasesResult");
    private final static QName _GetCasesFromCollectionResponseGetCasesFromCollectionResult_QNAME = new QName("www.decos.com/services", "GetCasesFromCollectionResult");
    private final static QName _GetCaseTypeResponseGetCaseTypeResult_QNAME = new QName("www.decos.com/services", "GetCaseTypeResult");
    private final static QName _GetCaseTypeFromCollectionResponseGetCaseTypeFromCollectionResult_QNAME = new QName("www.decos.com/services", "GetCaseTypeFromCollectionResult");
    private final static QName _GetCaseTypesResponseGetCaseTypesResult_QNAME = new QName("www.decos.com/services", "GetCaseTypesResult");
    private final static QName _GetCaseTypesFromCollectionResponseGetCaseTypesFromCollectionResult_QNAME = new QName("www.decos.com/services", "GetCaseTypesFromCollectionResult");
    private final static QName _GetDocumentTypesFromCaseTypeOCaseType_QNAME = new QName("www.decos.com/services", "oCaseType");
    private final static QName _GetDocumentTypesFromCaseTypeResponseGetDocumentTypesFromCaseTypeResult_QNAME = new QName("www.decos.com/services", "GetDocumentTypesFromCaseTypeResult");
    private final static QName _GetDocumentTypeFromCaseTypeSDocumentType_QNAME = new QName("www.decos.com/services", "sDocumentType");
    private final static QName _GetDocumentTypeFromCaseTypeResponseGetDocumentTypeFromCaseTypeResult_QNAME = new QName("www.decos.com/services", "GetDocumentTypeFromCaseTypeResult");
    private final static QName _GetCitizenResponseGetCitizenResult_QNAME = new QName("www.decos.com/services", "GetCitizenResult");
    private final static QName _GetCitizenFromCollectionResponseGetCitizenFromCollectionResult_QNAME = new QName("www.decos.com/services", "GetCitizenFromCollectionResult");
    private final static QName _GetCitizensResponseGetCitizensResult_QNAME = new QName("www.decos.com/services", "GetCitizensResult");
    private final static QName _GetCitizensFromCollectionResponseGetCitizensFromCollectionResult_QNAME = new QName("www.decos.com/services", "GetCitizensFromCollectionResult");
    private final static QName _GetFolderResponseGetFolderResult_QNAME = new QName("www.decos.com/services", "GetFolderResult");
    private final static QName _GetFolderFromCollectionResponseGetFolderFromCollectionResult_QNAME = new QName("www.decos.com/services", "GetFolderFromCollectionResult");
    private final static QName _GetFoldersResponseGetFoldersResult_QNAME = new QName("www.decos.com/services", "GetFoldersResult");
    private final static QName _GetFoldersFromCollectionResponseGetFoldersFromCollectionResult_QNAME = new QName("www.decos.com/services", "GetFoldersFromCollectionResult");
    private final static QName _GetPersonResponseGetPersonResult_QNAME = new QName("www.decos.com/services", "GetPersonResult");
    private final static QName _GetPersonFromCollectionResponseGetPersonFromCollectionResult_QNAME = new QName("www.decos.com/services", "GetPersonFromCollectionResult");
    private final static QName _GetPersonsResponseGetPersonsResult_QNAME = new QName("www.decos.com/services", "GetPersonsResult");
    private final static QName _GetPersonsFromCollectionResponseGetPersonsFromCollectionResult_QNAME = new QName("www.decos.com/services", "GetPersonsFromCollectionResult");
    private final static QName _GetFileResponseGetFileResult_QNAME = new QName("www.decos.com/services", "GetFileResult");
    private final static QName _DownloadFileVersionVersion_QNAME = new QName("www.decos.com/services", "version");
    private final static QName _UpdateFileResponseUpdateFileResult_QNAME = new QName("www.decos.com/services", "UpdateFileResult");
    private final static QName _GetFileFromCollectionSParentIdentifier_QNAME = new QName("www.decos.com/services", "sParentIdentifier");
    private final static QName _GetFileFromCollectionSParentCollectionIdentifier_QNAME = new QName("www.decos.com/services", "sParentCollectionIdentifier");
    private final static QName _GetFileFromCollectionSParentEntityType_QNAME = new QName("www.decos.com/services", "sParentEntityType");
    private final static QName _GetFileFromCollectionResponseGetFileFromCollectionResult_QNAME = new QName("www.decos.com/services", "GetFileFromCollectionResult");
    private final static QName _DownloadFilePartSPartDownloadToken_QNAME = new QName("www.decos.com/services", "sPartDownloadToken");
    private final static QName _DownloadFilePartFVersion_QNAME = new QName("www.decos.com/services", "fVersion");
    private final static QName _DownloadFilePartResponseDownloadFilePartResult_QNAME = new QName("www.decos.com/services", "DownloadFilePartResult");
    private final static QName _GetLinkedEntitiesEntity_QNAME = new QName("www.decos.com/services", "entity");
    private final static QName _GetLinkedEntitiesSRelEntity_QNAME = new QName("www.decos.com/services", "sRelEntity");
    private final static QName _GetLinkedEntitiesResponseGetLinkedEntitiesResult_QNAME = new QName("www.decos.com/services", "GetLinkedEntitiesResult");
    private final static QName _GetLinkedRelEntitiesResponseGetLinkedRelEntitiesResult_QNAME = new QName("www.decos.com/services", "GetLinkedRelEntitiesResult");
    private final static QName _InsertResponseInsertResult_QNAME = new QName("www.decos.com/services", "InsertResult");
    private final static QName _InsertFileResponseInsertFileResult_QNAME = new QName("www.decos.com/services", "InsertFileResult");
    private final static QName _UpdateResponseUpdateResult_QNAME = new QName("www.decos.com/services", "UpdateResult");
    private final static QName _UpdateEntitiesEntities_QNAME = new QName("www.decos.com/services", "entities");
    private final static QName _UpdateEntitiesResponseUpdateEntitiesResult_QNAME = new QName("www.decos.com/services", "UpdateEntitiesResult");
    private final static QName _InsertEntitiesResponseInsertEntitiesResult_QNAME = new QName("www.decos.com/services", "InsertEntitiesResult");
    private final static QName _CheckInResponseCheckInResult_QNAME = new QName("www.decos.com/services", "CheckInResult");
    private final static QName _CheckOutResponseCheckOutResult_QNAME = new QName("www.decos.com/services", "CheckOutResult");
    private final static QName _GetTokenSSystemId_QNAME = new QName("www.decos.com/services", "sSystemId");
    private final static QName _GetTokenSSystemPwd_QNAME = new QName("www.decos.com/services", "sSystemPwd");
    private final static QName _GetTokenResponseGetTokenResult_QNAME = new QName("www.decos.com/services", "GetTokenResult");
    private final static QName _GetCollectionIdentifiersSEntityType_QNAME = new QName("www.decos.com/services", "sEntityType");
    private final static QName _GetCollectionIdentifiersResponseGetCollectionIdentifiersResult_QNAME = new QName("www.decos.com/services", "GetCollectionIdentifiersResult");
    private final static QName _GetPossibleTableValuesSPropertyName_QNAME = new QName("www.decos.com/services", "sPropertyName");
    private final static QName _GetPossibleTableValuesSStartsWith_QNAME = new QName("www.decos.com/services", "sStartsWith");
    private final static QName _GetPossibleTableValuesLstUpperLevelValues_QNAME = new QName("www.decos.com/services", "lstUpperLevelValues");
    private final static QName _GetPossibleTableValuesResponseGetPossibleTableValuesResult_QNAME = new QName("www.decos.com/services", "GetPossibleTableValuesResult");
    private final static QName _LinkEntityWithRelationTypeOEntity1_QNAME = new QName("www.decos.com/services", "oEntity1");
    private final static QName _LinkEntityWithRelationTypeOEntity2_QNAME = new QName("www.decos.com/services", "oEntity2");
    private final static QName _LinkEntityViaRelatedEntityOContactEntity_QNAME = new QName("www.decos.com/services", "oContactEntity");
    private final static QName _LinkEntityViaRelatedEntityOAddressEntity_QNAME = new QName("www.decos.com/services", "oAddressEntity");
    private final static QName _GetLinkedEntitiesWithRelationTypeResponseGetLinkedEntitiesWithRelationTypeResult_QNAME = new QName("www.decos.com/services", "GetLinkedEntitiesWithRelationTypeResult");
    private final static QName _GetLinkedRelEntitiesWithRelationTypeResponseGetLinkedRelEntitiesWithRelationTypeResult_QNAME = new QName("www.decos.com/services", "GetLinkedRelEntitiesWithRelationTypeResult");
    private final static QName _GetMailingCodeResponseGetMailingCodeResult_QNAME = new QName("www.decos.com/services", "GetMailingCodeResult");
    private final static QName _GetMeetingResponseGetMeetingResult_QNAME = new QName("www.decos.com/services", "GetMeetingResult");
    private final static QName _GetMeetingFromCollectionResponseGetMeetingFromCollectionResult_QNAME = new QName("www.decos.com/services", "GetMeetingFromCollectionResult");
    private final static QName _GetMeetingsResponseGetMeetingsResult_QNAME = new QName("www.decos.com/services", "GetMeetingsResult");
    private final static QName _GetMeetingsFromCollectionResponseGetMeetingsFromCollectionResult_QNAME = new QName("www.decos.com/services", "GetMeetingsFromCollectionResult");
    private final static QName _GetTopicResponseGetTopicResult_QNAME = new QName("www.decos.com/services", "GetTopicResult");
    private final static QName _GetTopicFromCollectionResponseGetTopicFromCollectionResult_QNAME = new QName("www.decos.com/services", "GetTopicFromCollectionResult");
    private final static QName _GetTopicsResponseGetTopicsResult_QNAME = new QName("www.decos.com/services", "GetTopicsResult");
    private final static QName _GetTopicsFromCollectionResponseGetTopicsFromCollectionResult_QNAME = new QName("www.decos.com/services", "GetTopicsFromCollectionResult");
    private final static QName _GetLinkedRelEntitiesWithFilterResponseGetLinkedRelEntitiesWithFilterResult_QNAME = new QName("www.decos.com/services", "GetLinkedRelEntitiesWithFilterResult");
    private final static QName _GetLinkedEntitiesWithFilterResponseGetLinkedEntitiesWithFilterResult_QNAME = new QName("www.decos.com/services", "GetLinkedEntitiesWithFilterResult");
    private final static QName _GetLinkedEntitiesWithRelationTypeFilterResponseGetLinkedEntitiesWithRelationTypeFilterResult_QNAME = new QName("www.decos.com/services", "GetLinkedEntitiesWithRelationTypeFilterResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.customer.com.decos.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCollectionIdentifiersResponse }
     * 
     */
    public GetCollectionIdentifiersResponse createGetCollectionIdentifiersResponse() {
        return new GetCollectionIdentifiersResponse();
    }

    /**
     * Create an instance of {@link GetLinkedRelEntitiesWithRelationTypeFilter }
     * 
     */
    public GetLinkedRelEntitiesWithRelationTypeFilter createGetLinkedRelEntitiesWithRelationTypeFilter() {
        return new GetLinkedRelEntitiesWithRelationTypeFilter();
    }

    /**
     * Create an instance of {@link GetLinkedRelEntitiesWithRelationTypeFilterResponse }
     * 
     */
    public GetLinkedRelEntitiesWithRelationTypeFilterResponse createGetLinkedRelEntitiesWithRelationTypeFilterResponse() {
        return new GetLinkedRelEntitiesWithRelationTypeFilterResponse();
    }

    /**
     * Create an instance of {@link GetTask }
     * 
     */
    public GetTask createGetTask() {
        return new GetTask();
    }

    /**
     * Create an instance of {@link GetTaskResponse }
     * 
     */
    public GetTaskResponse createGetTaskResponse() {
        return new GetTaskResponse();
    }

    /**
     * Create an instance of {@link GetTasksByCategory }
     * 
     */
    public GetTasksByCategory createGetTasksByCategory() {
        return new GetTasksByCategory();
    }

    /**
     * Create an instance of {@link GetTasksByCategoryResponse }
     * 
     */
    public GetTasksByCategoryResponse createGetTasksByCategoryResponse() {
        return new GetTasksByCategoryResponse();
    }

    /**
     * Create an instance of {@link UploadFileByStream }
     * 
     */
    public UploadFileByStream createUploadFileByStream() {
        return new UploadFileByStream();
    }

    /**
     * Create an instance of {@link UploadFileByStreamResponse }
     * 
     */
    public UploadFileByStreamResponse createUploadFileByStreamResponse() {
        return new UploadFileByStreamResponse();
    }

    /**
     * Create an instance of {@link GetCollections }
     * 
     */
    public GetCollections createGetCollections() {
        return new GetCollections();
    }

    /**
     * Create an instance of {@link GetCollectionsResponse }
     * 
     */
    public GetCollectionsResponse createGetCollectionsResponse() {
        return new GetCollectionsResponse();
    }

    /**
     * Create an instance of {@link LinkEntityWithRole }
     * 
     */
    public LinkEntityWithRole createLinkEntityWithRole() {
        return new LinkEntityWithRole();
    }

    /**
     * Create an instance of {@link LinkEntityWithRoleResponse }
     * 
     */
    public LinkEntityWithRoleResponse createLinkEntityWithRoleResponse() {
        return new LinkEntityWithRoleResponse();
    }

    /**
     * Create an instance of {@link GetRole }
     * 
     */
    public GetRole createGetRole() {
        return new GetRole();
    }

    /**
     * Create an instance of {@link GetRoleResponse }
     * 
     */
    public GetRoleResponse createGetRoleResponse() {
        return new GetRoleResponse();
    }

    /**
     * Create an instance of {@link GetPossibleRoles }
     * 
     */
    public GetPossibleRoles createGetPossibleRoles() {
        return new GetPossibleRoles();
    }

    /**
     * Create an instance of {@link GetPossibleRolesResponse }
     * 
     */
    public GetPossibleRolesResponse createGetPossibleRolesResponse() {
        return new GetPossibleRolesResponse();
    }

    /**
     * Create an instance of {@link GetCaseDocument }
     * 
     */
    public GetCaseDocument createGetCaseDocument() {
        return new GetCaseDocument();
    }

    /**
     * Create an instance of {@link GetCaseDocumentResponse }
     * 
     */
    public GetCaseDocumentResponse createGetCaseDocumentResponse() {
        return new GetCaseDocumentResponse();
    }

    /**
     * Create an instance of {@link GetCaseDocumentFromCollection }
     * 
     */
    public GetCaseDocumentFromCollection createGetCaseDocumentFromCollection() {
        return new GetCaseDocumentFromCollection();
    }

    /**
     * Create an instance of {@link GetCaseDocumentFromCollectionResponse }
     * 
     */
    public GetCaseDocumentFromCollectionResponse createGetCaseDocumentFromCollectionResponse() {
        return new GetCaseDocumentFromCollectionResponse();
    }

    /**
     * Create an instance of {@link GetCaseDocuments }
     * 
     */
    public GetCaseDocuments createGetCaseDocuments() {
        return new GetCaseDocuments();
    }

    /**
     * Create an instance of {@link GetCaseDocumentsResponse }
     * 
     */
    public GetCaseDocumentsResponse createGetCaseDocumentsResponse() {
        return new GetCaseDocumentsResponse();
    }

    /**
     * Create an instance of {@link GetCaseDocumentsFromCollection }
     * 
     */
    public GetCaseDocumentsFromCollection createGetCaseDocumentsFromCollection() {
        return new GetCaseDocumentsFromCollection();
    }

    /**
     * Create an instance of {@link GetCaseDocumentsFromCollectionResponse }
     * 
     */
    public GetCaseDocumentsFromCollectionResponse createGetCaseDocumentsFromCollectionResponse() {
        return new GetCaseDocumentsFromCollectionResponse();
    }

    /**
     * Create an instance of {@link GetCaseDecision }
     * 
     */
    public GetCaseDecision createGetCaseDecision() {
        return new GetCaseDecision();
    }

    /**
     * Create an instance of {@link GetCaseDecisionResponse }
     * 
     */
    public GetCaseDecisionResponse createGetCaseDecisionResponse() {
        return new GetCaseDecisionResponse();
    }

    /**
     * Create an instance of {@link GetCaseDecisionFromCollection }
     * 
     */
    public GetCaseDecisionFromCollection createGetCaseDecisionFromCollection() {
        return new GetCaseDecisionFromCollection();
    }

    /**
     * Create an instance of {@link GetCaseDecisionFromCollectionResponse }
     * 
     */
    public GetCaseDecisionFromCollectionResponse createGetCaseDecisionFromCollectionResponse() {
        return new GetCaseDecisionFromCollectionResponse();
    }

    /**
     * Create an instance of {@link GetCaseDecisions }
     * 
     */
    public GetCaseDecisions createGetCaseDecisions() {
        return new GetCaseDecisions();
    }

    /**
     * Create an instance of {@link GetCaseDecisionsResponse }
     * 
     */
    public GetCaseDecisionsResponse createGetCaseDecisionsResponse() {
        return new GetCaseDecisionsResponse();
    }

    /**
     * Create an instance of {@link GetCaseDecisionsFromCollection }
     * 
     */
    public GetCaseDecisionsFromCollection createGetCaseDecisionsFromCollection() {
        return new GetCaseDecisionsFromCollection();
    }

    /**
     * Create an instance of {@link GetCaseDecisionsFromCollectionResponse }
     * 
     */
    public GetCaseDecisionsFromCollectionResponse createGetCaseDecisionsFromCollectionResponse() {
        return new GetCaseDecisionsFromCollectionResponse();
    }

    /**
     * Create an instance of {@link GetCaseDecisionMetaData }
     * 
     */
    public GetCaseDecisionMetaData createGetCaseDecisionMetaData() {
        return new GetCaseDecisionMetaData();
    }

    /**
     * Create an instance of {@link GetCaseDecisionMetaDataResponse }
     * 
     */
    public GetCaseDecisionMetaDataResponse createGetCaseDecisionMetaDataResponse() {
        return new GetCaseDecisionMetaDataResponse();
    }

    /**
     * Create an instance of {@link GetCaseDocumentMetaData }
     * 
     */
    public GetCaseDocumentMetaData createGetCaseDocumentMetaData() {
        return new GetCaseDocumentMetaData();
    }

    /**
     * Create an instance of {@link GetCaseDocumentMetaDataResponse }
     * 
     */
    public GetCaseDocumentMetaDataResponse createGetCaseDocumentMetaDataResponse() {
        return new GetCaseDocumentMetaDataResponse();
    }

    /**
     * Create an instance of {@link UnlinkRole }
     * 
     */
    public UnlinkRole createUnlinkRole() {
        return new UnlinkRole();
    }

    /**
     * Create an instance of {@link UnlinkRoleResponse }
     * 
     */
    public UnlinkRoleResponse createUnlinkRoleResponse() {
        return new UnlinkRoleResponse();
    }

    /**
     * Create an instance of {@link GetExternalIdentifierTypes }
     * 
     */
    public GetExternalIdentifierTypes createGetExternalIdentifierTypes() {
        return new GetExternalIdentifierTypes();
    }

    /**
     * Create an instance of {@link GetExternalIdentifierTypesResponse }
     * 
     */
    public GetExternalIdentifierTypesResponse createGetExternalIdentifierTypesResponse() {
        return new GetExternalIdentifierTypesResponse();
    }

    /**
     * Create an instance of {@link GetThumbnail }
     * 
     */
    public GetThumbnail createGetThumbnail() {
        return new GetThumbnail();
    }

    /**
     * Create an instance of {@link GetThumbnailResponse }
     * 
     */
    public GetThumbnailResponse createGetThumbnailResponse() {
        return new GetThumbnailResponse();
    }

    /**
     * Create an instance of {@link GetLinkedFiles }
     * 
     */
    public GetLinkedFiles createGetLinkedFiles() {
        return new GetLinkedFiles();
    }

    /**
     * Create an instance of {@link GetLinkedFilesResponse }
     * 
     */
    public GetLinkedFilesResponse createGetLinkedFilesResponse() {
        return new GetLinkedFilesResponse();
    }

    /**
     * Create an instance of {@link UploadFilePart }
     * 
     */
    public UploadFilePart createUploadFilePart() {
        return new UploadFilePart();
    }

    /**
     * Create an instance of {@link UploadFilePartResponse }
     * 
     */
    public UploadFilePartResponse createUploadFilePartResponse() {
        return new UploadFilePartResponse();
    }

    /**
     * Create an instance of {@link LogAudit }
     * 
     */
    public LogAudit createLogAudit() {
        return new LogAudit();
    }

    /**
     * Create an instance of {@link LogAuditResponse }
     * 
     */
    public LogAuditResponse createLogAuditResponse() {
        return new LogAuditResponse();
    }

    /**
     * Create an instance of {@link StartMerge }
     * 
     */
    public StartMerge createStartMerge() {
        return new StartMerge();
    }

    /**
     * Create an instance of {@link StartMergeResponse }
     * 
     */
    public StartMergeResponse createStartMergeResponse() {
        return new StartMergeResponse();
    }

    /**
     * Create an instance of {@link GetDocument }
     * 
     */
    public GetDocument createGetDocument() {
        return new GetDocument();
    }

    /**
     * Create an instance of {@link GetDocumentResponse }
     * 
     */
    public GetDocumentResponse createGetDocumentResponse() {
        return new GetDocumentResponse();
    }

    /**
     * Create an instance of {@link GetDocumentFromCollection }
     * 
     */
    public GetDocumentFromCollection createGetDocumentFromCollection() {
        return new GetDocumentFromCollection();
    }

    /**
     * Create an instance of {@link GetDocumentFromCollectionResponse }
     * 
     */
    public GetDocumentFromCollectionResponse createGetDocumentFromCollectionResponse() {
        return new GetDocumentFromCollectionResponse();
    }

    /**
     * Create an instance of {@link GetDocuments }
     * 
     */
    public GetDocuments createGetDocuments() {
        return new GetDocuments();
    }

    /**
     * Create an instance of {@link GetDocumentsResponse }
     * 
     */
    public GetDocumentsResponse createGetDocumentsResponse() {
        return new GetDocumentsResponse();
    }

    /**
     * Create an instance of {@link GetDocumentsFromCollection }
     * 
     */
    public GetDocumentsFromCollection createGetDocumentsFromCollection() {
        return new GetDocumentsFromCollection();
    }

    /**
     * Create an instance of {@link GetDocumentsFromCollectionResponse }
     * 
     */
    public GetDocumentsFromCollectionResponse createGetDocumentsFromCollectionResponse() {
        return new GetDocumentsFromCollectionResponse();
    }

    /**
     * Create an instance of {@link GetBAGObject }
     * 
     */
    public GetBAGObject createGetBAGObject() {
        return new GetBAGObject();
    }

    /**
     * Create an instance of {@link GetBAGObjectResponse }
     * 
     */
    public GetBAGObjectResponse createGetBAGObjectResponse() {
        return new GetBAGObjectResponse();
    }

    /**
     * Create an instance of {@link GetBAGObjectFromCollection }
     * 
     */
    public GetBAGObjectFromCollection createGetBAGObjectFromCollection() {
        return new GetBAGObjectFromCollection();
    }

    /**
     * Create an instance of {@link GetBAGObjectFromCollectionResponse }
     * 
     */
    public GetBAGObjectFromCollectionResponse createGetBAGObjectFromCollectionResponse() {
        return new GetBAGObjectFromCollectionResponse();
    }

    /**
     * Create an instance of {@link GetBAGObjects }
     * 
     */
    public GetBAGObjects createGetBAGObjects() {
        return new GetBAGObjects();
    }

    /**
     * Create an instance of {@link GetBAGObjectsResponse }
     * 
     */
    public GetBAGObjectsResponse createGetBAGObjectsResponse() {
        return new GetBAGObjectsResponse();
    }

    /**
     * Create an instance of {@link GetBagObjectsFromCollection }
     * 
     */
    public GetBagObjectsFromCollection createGetBagObjectsFromCollection() {
        return new GetBagObjectsFromCollection();
    }

    /**
     * Create an instance of {@link GetBagObjectsFromCollectionResponse }
     * 
     */
    public GetBagObjectsFromCollectionResponse createGetBagObjectsFromCollectionResponse() {
        return new GetBagObjectsFromCollectionResponse();
    }

    /**
     * Create an instance of {@link GetCompany }
     * 
     */
    public GetCompany createGetCompany() {
        return new GetCompany();
    }

    /**
     * Create an instance of {@link GetCompanyResponse }
     * 
     */
    public GetCompanyResponse createGetCompanyResponse() {
        return new GetCompanyResponse();
    }

    /**
     * Create an instance of {@link GetCompanyFromCollection }
     * 
     */
    public GetCompanyFromCollection createGetCompanyFromCollection() {
        return new GetCompanyFromCollection();
    }

    /**
     * Create an instance of {@link GetCompanyFromCollectionResponse }
     * 
     */
    public GetCompanyFromCollectionResponse createGetCompanyFromCollectionResponse() {
        return new GetCompanyFromCollectionResponse();
    }

    /**
     * Create an instance of {@link GetCompanies }
     * 
     */
    public GetCompanies createGetCompanies() {
        return new GetCompanies();
    }

    /**
     * Create an instance of {@link GetCompaniesResponse }
     * 
     */
    public GetCompaniesResponse createGetCompaniesResponse() {
        return new GetCompaniesResponse();
    }

    /**
     * Create an instance of {@link GetCompaniesFromCollection }
     * 
     */
    public GetCompaniesFromCollection createGetCompaniesFromCollection() {
        return new GetCompaniesFromCollection();
    }

    /**
     * Create an instance of {@link GetCompaniesFromCollectionResponse }
     * 
     */
    public GetCompaniesFromCollectionResponse createGetCompaniesFromCollectionResponse() {
        return new GetCompaniesFromCollectionResponse();
    }

    /**
     * Create an instance of {@link GetCompanyNHR }
     * 
     */
    public GetCompanyNHR createGetCompanyNHR() {
        return new GetCompanyNHR();
    }

    /**
     * Create an instance of {@link GetCompanyNHRResponse }
     * 
     */
    public GetCompanyNHRResponse createGetCompanyNHRResponse() {
        return new GetCompanyNHRResponse();
    }

    /**
     * Create an instance of {@link GetCompanyNHRFromCollection }
     * 
     */
    public GetCompanyNHRFromCollection createGetCompanyNHRFromCollection() {
        return new GetCompanyNHRFromCollection();
    }

    /**
     * Create an instance of {@link GetCompanyNHRFromCollectionResponse }
     * 
     */
    public GetCompanyNHRFromCollectionResponse createGetCompanyNHRFromCollectionResponse() {
        return new GetCompanyNHRFromCollectionResponse();
    }

    /**
     * Create an instance of {@link GetCompanyNHRs }
     * 
     */
    public GetCompanyNHRs createGetCompanyNHRs() {
        return new GetCompanyNHRs();
    }

    /**
     * Create an instance of {@link GetCompanyNHRsResponse }
     * 
     */
    public GetCompanyNHRsResponse createGetCompanyNHRsResponse() {
        return new GetCompanyNHRsResponse();
    }

    /**
     * Create an instance of {@link GetCompanyNHRsFromCollection }
     * 
     */
    public GetCompanyNHRsFromCollection createGetCompanyNHRsFromCollection() {
        return new GetCompanyNHRsFromCollection();
    }

    /**
     * Create an instance of {@link GetCompanyNHRsFromCollectionResponse }
     * 
     */
    public GetCompanyNHRsFromCollectionResponse createGetCompanyNHRsFromCollectionResponse() {
        return new GetCompanyNHRsFromCollectionResponse();
    }

    /**
     * Create an instance of {@link GetCase }
     * 
     */
    public GetCase createGetCase() {
        return new GetCase();
    }

    /**
     * Create an instance of {@link GetCaseResponse }
     * 
     */
    public GetCaseResponse createGetCaseResponse() {
        return new GetCaseResponse();
    }

    /**
     * Create an instance of {@link GetCaseFromCollection }
     * 
     */
    public GetCaseFromCollection createGetCaseFromCollection() {
        return new GetCaseFromCollection();
    }

    /**
     * Create an instance of {@link GetCaseFromCollectionResponse }
     * 
     */
    public GetCaseFromCollectionResponse createGetCaseFromCollectionResponse() {
        return new GetCaseFromCollectionResponse();
    }

    /**
     * Create an instance of {@link GetCases }
     * 
     */
    public GetCases createGetCases() {
        return new GetCases();
    }

    /**
     * Create an instance of {@link GetCasesResponse }
     * 
     */
    public GetCasesResponse createGetCasesResponse() {
        return new GetCasesResponse();
    }

    /**
     * Create an instance of {@link GetCasesFromCollection }
     * 
     */
    public GetCasesFromCollection createGetCasesFromCollection() {
        return new GetCasesFromCollection();
    }

    /**
     * Create an instance of {@link GetCasesFromCollectionResponse }
     * 
     */
    public GetCasesFromCollectionResponse createGetCasesFromCollectionResponse() {
        return new GetCasesFromCollectionResponse();
    }

    /**
     * Create an instance of {@link GetCaseType }
     * 
     */
    public GetCaseType createGetCaseType() {
        return new GetCaseType();
    }

    /**
     * Create an instance of {@link GetCaseTypeResponse }
     * 
     */
    public GetCaseTypeResponse createGetCaseTypeResponse() {
        return new GetCaseTypeResponse();
    }

    /**
     * Create an instance of {@link GetCaseTypeFromCollection }
     * 
     */
    public GetCaseTypeFromCollection createGetCaseTypeFromCollection() {
        return new GetCaseTypeFromCollection();
    }

    /**
     * Create an instance of {@link GetCaseTypeFromCollectionResponse }
     * 
     */
    public GetCaseTypeFromCollectionResponse createGetCaseTypeFromCollectionResponse() {
        return new GetCaseTypeFromCollectionResponse();
    }

    /**
     * Create an instance of {@link GetCaseTypes }
     * 
     */
    public GetCaseTypes createGetCaseTypes() {
        return new GetCaseTypes();
    }

    /**
     * Create an instance of {@link GetCaseTypesResponse }
     * 
     */
    public GetCaseTypesResponse createGetCaseTypesResponse() {
        return new GetCaseTypesResponse();
    }

    /**
     * Create an instance of {@link GetCaseTypesFromCollection }
     * 
     */
    public GetCaseTypesFromCollection createGetCaseTypesFromCollection() {
        return new GetCaseTypesFromCollection();
    }

    /**
     * Create an instance of {@link GetCaseTypesFromCollectionResponse }
     * 
     */
    public GetCaseTypesFromCollectionResponse createGetCaseTypesFromCollectionResponse() {
        return new GetCaseTypesFromCollectionResponse();
    }

    /**
     * Create an instance of {@link GetDocumentTypesFromCaseType }
     * 
     */
    public GetDocumentTypesFromCaseType createGetDocumentTypesFromCaseType() {
        return new GetDocumentTypesFromCaseType();
    }

    /**
     * Create an instance of {@link GetDocumentTypesFromCaseTypeResponse }
     * 
     */
    public GetDocumentTypesFromCaseTypeResponse createGetDocumentTypesFromCaseTypeResponse() {
        return new GetDocumentTypesFromCaseTypeResponse();
    }

    /**
     * Create an instance of {@link GetDocumentTypeFromCaseType }
     * 
     */
    public GetDocumentTypeFromCaseType createGetDocumentTypeFromCaseType() {
        return new GetDocumentTypeFromCaseType();
    }

    /**
     * Create an instance of {@link GetDocumentTypeFromCaseTypeResponse }
     * 
     */
    public GetDocumentTypeFromCaseTypeResponse createGetDocumentTypeFromCaseTypeResponse() {
        return new GetDocumentTypeFromCaseTypeResponse();
    }

    /**
     * Create an instance of {@link GetCitizen }
     * 
     */
    public GetCitizen createGetCitizen() {
        return new GetCitizen();
    }

    /**
     * Create an instance of {@link GetCitizenResponse }
     * 
     */
    public GetCitizenResponse createGetCitizenResponse() {
        return new GetCitizenResponse();
    }

    /**
     * Create an instance of {@link GetCitizenFromCollection }
     * 
     */
    public GetCitizenFromCollection createGetCitizenFromCollection() {
        return new GetCitizenFromCollection();
    }

    /**
     * Create an instance of {@link GetCitizenFromCollectionResponse }
     * 
     */
    public GetCitizenFromCollectionResponse createGetCitizenFromCollectionResponse() {
        return new GetCitizenFromCollectionResponse();
    }

    /**
     * Create an instance of {@link GetCitizens }
     * 
     */
    public GetCitizens createGetCitizens() {
        return new GetCitizens();
    }

    /**
     * Create an instance of {@link GetCitizensResponse }
     * 
     */
    public GetCitizensResponse createGetCitizensResponse() {
        return new GetCitizensResponse();
    }

    /**
     * Create an instance of {@link GetCitizensFromCollection }
     * 
     */
    public GetCitizensFromCollection createGetCitizensFromCollection() {
        return new GetCitizensFromCollection();
    }

    /**
     * Create an instance of {@link GetCitizensFromCollectionResponse }
     * 
     */
    public GetCitizensFromCollectionResponse createGetCitizensFromCollectionResponse() {
        return new GetCitizensFromCollectionResponse();
    }

    /**
     * Create an instance of {@link GetFolder }
     * 
     */
    public GetFolder createGetFolder() {
        return new GetFolder();
    }

    /**
     * Create an instance of {@link GetFolderResponse }
     * 
     */
    public GetFolderResponse createGetFolderResponse() {
        return new GetFolderResponse();
    }

    /**
     * Create an instance of {@link GetFolderFromCollection }
     * 
     */
    public GetFolderFromCollection createGetFolderFromCollection() {
        return new GetFolderFromCollection();
    }

    /**
     * Create an instance of {@link GetFolderFromCollectionResponse }
     * 
     */
    public GetFolderFromCollectionResponse createGetFolderFromCollectionResponse() {
        return new GetFolderFromCollectionResponse();
    }

    /**
     * Create an instance of {@link GetFolders }
     * 
     */
    public GetFolders createGetFolders() {
        return new GetFolders();
    }

    /**
     * Create an instance of {@link GetFoldersResponse }
     * 
     */
    public GetFoldersResponse createGetFoldersResponse() {
        return new GetFoldersResponse();
    }

    /**
     * Create an instance of {@link GetFoldersFromCollection }
     * 
     */
    public GetFoldersFromCollection createGetFoldersFromCollection() {
        return new GetFoldersFromCollection();
    }

    /**
     * Create an instance of {@link GetFoldersFromCollectionResponse }
     * 
     */
    public GetFoldersFromCollectionResponse createGetFoldersFromCollectionResponse() {
        return new GetFoldersFromCollectionResponse();
    }

    /**
     * Create an instance of {@link GetPerson }
     * 
     */
    public GetPerson createGetPerson() {
        return new GetPerson();
    }

    /**
     * Create an instance of {@link GetPersonResponse }
     * 
     */
    public GetPersonResponse createGetPersonResponse() {
        return new GetPersonResponse();
    }

    /**
     * Create an instance of {@link GetPersonFromCollection }
     * 
     */
    public GetPersonFromCollection createGetPersonFromCollection() {
        return new GetPersonFromCollection();
    }

    /**
     * Create an instance of {@link GetPersonFromCollectionResponse }
     * 
     */
    public GetPersonFromCollectionResponse createGetPersonFromCollectionResponse() {
        return new GetPersonFromCollectionResponse();
    }

    /**
     * Create an instance of {@link GetPersons }
     * 
     */
    public GetPersons createGetPersons() {
        return new GetPersons();
    }

    /**
     * Create an instance of {@link GetPersonsResponse }
     * 
     */
    public GetPersonsResponse createGetPersonsResponse() {
        return new GetPersonsResponse();
    }

    /**
     * Create an instance of {@link GetPersonsFromCollection }
     * 
     */
    public GetPersonsFromCollection createGetPersonsFromCollection() {
        return new GetPersonsFromCollection();
    }

    /**
     * Create an instance of {@link GetPersonsFromCollectionResponse }
     * 
     */
    public GetPersonsFromCollectionResponse createGetPersonsFromCollectionResponse() {
        return new GetPersonsFromCollectionResponse();
    }

    /**
     * Create an instance of {@link GetFile }
     * 
     */
    public GetFile createGetFile() {
        return new GetFile();
    }

    /**
     * Create an instance of {@link GetFileResponse }
     * 
     */
    public GetFileResponse createGetFileResponse() {
        return new GetFileResponse();
    }

    /**
     * Create an instance of {@link DownloadAsPDF }
     * 
     */
    public DownloadAsPDF createDownloadAsPDF() {
        return new DownloadAsPDF();
    }

    /**
     * Create an instance of {@link DownloadAsPDFResponse }
     * 
     */
    public DownloadAsPDFResponse createDownloadAsPDFResponse() {
        return new DownloadAsPDFResponse();
    }

    /**
     * Create an instance of {@link DownloadFile }
     * 
     */
    public DownloadFile createDownloadFile() {
        return new DownloadFile();
    }

    /**
     * Create an instance of {@link DownloadFileResponse }
     * 
     */
    public DownloadFileResponse createDownloadFileResponse() {
        return new DownloadFileResponse();
    }

    /**
     * Create an instance of {@link FileMessage }
     * 
     */
    public FileMessage createFileMessage() {
        return new FileMessage();
    }

    /**
     * Create an instance of {@link DownloadFileVersion }
     * 
     */
    public DownloadFileVersion createDownloadFileVersion() {
        return new DownloadFileVersion();
    }

    /**
     * Create an instance of {@link DownloadFileVersionResponse }
     * 
     */
    public DownloadFileVersionResponse createDownloadFileVersionResponse() {
        return new DownloadFileVersionResponse();
    }

    /**
     * Create an instance of {@link UpdateFile }
     * 
     */
    public UpdateFile createUpdateFile() {
        return new UpdateFile();
    }

    /**
     * Create an instance of {@link UpdateFileResponse }
     * 
     */
    public UpdateFileResponse createUpdateFileResponse() {
        return new UpdateFileResponse();
    }

    /**
     * Create an instance of {@link DeleteFile }
     * 
     */
    public DeleteFile createDeleteFile() {
        return new DeleteFile();
    }

    /**
     * Create an instance of {@link DeleteFileResponse }
     * 
     */
    public DeleteFileResponse createDeleteFileResponse() {
        return new DeleteFileResponse();
    }

    /**
     * Create an instance of {@link ConvertToPDF }
     * 
     */
    public ConvertToPDF createConvertToPDF() {
        return new ConvertToPDF();
    }

    /**
     * Create an instance of {@link ConvertToPDFResponse }
     * 
     */
    public ConvertToPDFResponse createConvertToPDFResponse() {
        return new ConvertToPDFResponse();
    }

    /**
     * Create an instance of {@link GetFileFromCollection }
     * 
     */
    public GetFileFromCollection createGetFileFromCollection() {
        return new GetFileFromCollection();
    }

    /**
     * Create an instance of {@link GetFileFromCollectionResponse }
     * 
     */
    public GetFileFromCollectionResponse createGetFileFromCollectionResponse() {
        return new GetFileFromCollectionResponse();
    }

    /**
     * Create an instance of {@link DownloadFileVersionByEntity }
     * 
     */
    public DownloadFileVersionByEntity createDownloadFileVersionByEntity() {
        return new DownloadFileVersionByEntity();
    }

    /**
     * Create an instance of {@link DownloadFileVersionByEntityResponse }
     * 
     */
    public DownloadFileVersionByEntityResponse createDownloadFileVersionByEntityResponse() {
        return new DownloadFileVersionByEntityResponse();
    }

    /**
     * Create an instance of {@link DownloadFilePart }
     * 
     */
    public DownloadFilePart createDownloadFilePart() {
        return new DownloadFilePart();
    }

    /**
     * Create an instance of {@link DownloadFilePartResponse }
     * 
     */
    public DownloadFilePartResponse createDownloadFilePartResponse() {
        return new DownloadFilePartResponse();
    }

    /**
     * Create an instance of {@link GetLinkedEntities }
     * 
     */
    public GetLinkedEntities createGetLinkedEntities() {
        return new GetLinkedEntities();
    }

    /**
     * Create an instance of {@link GetLinkedEntitiesResponse }
     * 
     */
    public GetLinkedEntitiesResponse createGetLinkedEntitiesResponse() {
        return new GetLinkedEntitiesResponse();
    }

    /**
     * Create an instance of {@link GetLinkedRelEntities }
     * 
     */
    public GetLinkedRelEntities createGetLinkedRelEntities() {
        return new GetLinkedRelEntities();
    }

    /**
     * Create an instance of {@link GetLinkedRelEntitiesResponse }
     * 
     */
    public GetLinkedRelEntitiesResponse createGetLinkedRelEntitiesResponse() {
        return new GetLinkedRelEntitiesResponse();
    }

    /**
     * Create an instance of {@link Insert }
     * 
     */
    public Insert createInsert() {
        return new Insert();
    }

    /**
     * Create an instance of {@link InsertResponse }
     * 
     */
    public InsertResponse createInsertResponse() {
        return new InsertResponse();
    }

    /**
     * Create an instance of {@link InsertFile }
     * 
     */
    public InsertFile createInsertFile() {
        return new InsertFile();
    }

    /**
     * Create an instance of {@link InsertFileResponse }
     * 
     */
    public InsertFileResponse createInsertFileResponse() {
        return new InsertFileResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link UpdateEntities }
     * 
     */
    public UpdateEntities createUpdateEntities() {
        return new UpdateEntities();
    }

    /**
     * Create an instance of {@link UpdateEntitiesResponse }
     * 
     */
    public UpdateEntitiesResponse createUpdateEntitiesResponse() {
        return new UpdateEntitiesResponse();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link LinkEntity }
     * 
     */
    public LinkEntity createLinkEntity() {
        return new LinkEntity();
    }

    /**
     * Create an instance of {@link LinkEntityResponse }
     * 
     */
    public LinkEntityResponse createLinkEntityResponse() {
        return new LinkEntityResponse();
    }

    /**
     * Create an instance of {@link UnlinkEntity }
     * 
     */
    public UnlinkEntity createUnlinkEntity() {
        return new UnlinkEntity();
    }

    /**
     * Create an instance of {@link UnlinkEntityResponse }
     * 
     */
    public UnlinkEntityResponse createUnlinkEntityResponse() {
        return new UnlinkEntityResponse();
    }

    /**
     * Create an instance of {@link LinkEntities }
     * 
     */
    public LinkEntities createLinkEntities() {
        return new LinkEntities();
    }

    /**
     * Create an instance of {@link LinkEntitiesResponse }
     * 
     */
    public LinkEntitiesResponse createLinkEntitiesResponse() {
        return new LinkEntitiesResponse();
    }

    /**
     * Create an instance of {@link UnlinkEntities }
     * 
     */
    public UnlinkEntities createUnlinkEntities() {
        return new UnlinkEntities();
    }

    /**
     * Create an instance of {@link UnlinkEntitiesResponse }
     * 
     */
    public UnlinkEntitiesResponse createUnlinkEntitiesResponse() {
        return new UnlinkEntitiesResponse();
    }

    /**
     * Create an instance of {@link InsertEntities }
     * 
     */
    public InsertEntities createInsertEntities() {
        return new InsertEntities();
    }

    /**
     * Create an instance of {@link InsertEntitiesResponse }
     * 
     */
    public InsertEntitiesResponse createInsertEntitiesResponse() {
        return new InsertEntitiesResponse();
    }

    /**
     * Create an instance of {@link DeleteEntities }
     * 
     */
    public DeleteEntities createDeleteEntities() {
        return new DeleteEntities();
    }

    /**
     * Create an instance of {@link DeleteEntitiesResponse }
     * 
     */
    public DeleteEntitiesResponse createDeleteEntitiesResponse() {
        return new DeleteEntitiesResponse();
    }

    /**
     * Create an instance of {@link CheckIn }
     * 
     */
    public CheckIn createCheckIn() {
        return new CheckIn();
    }

    /**
     * Create an instance of {@link CheckInResponse }
     * 
     */
    public CheckInResponse createCheckInResponse() {
        return new CheckInResponse();
    }

    /**
     * Create an instance of {@link CheckOut }
     * 
     */
    public CheckOut createCheckOut() {
        return new CheckOut();
    }

    /**
     * Create an instance of {@link CheckOutResponse }
     * 
     */
    public CheckOutResponse createCheckOutResponse() {
        return new CheckOutResponse();
    }

    /**
     * Create an instance of {@link GetToken }
     * 
     */
    public GetToken createGetToken() {
        return new GetToken();
    }

    /**
     * Create an instance of {@link GetTokenResponse }
     * 
     */
    public GetTokenResponse createGetTokenResponse() {
        return new GetTokenResponse();
    }

    /**
     * Create an instance of {@link GetCollectionIdentifiers }
     * 
     */
    public GetCollectionIdentifiers createGetCollectionIdentifiers() {
        return new GetCollectionIdentifiers();
    }

    /**
     * Create an instance of {@link GetCollectionIdentifiersResponse.GetCollectionIdentifiersResult }
     * 
     */
    public GetCollectionIdentifiersResponse.GetCollectionIdentifiersResult createGetCollectionIdentifiersResponseGetCollectionIdentifiersResult() {
        return new GetCollectionIdentifiersResponse.GetCollectionIdentifiersResult();
    }

    /**
     * Create an instance of {@link GetPossibleTableValues }
     * 
     */
    public GetPossibleTableValues createGetPossibleTableValues() {
        return new GetPossibleTableValues();
    }

    /**
     * Create an instance of {@link GetPossibleTableValuesResponse }
     * 
     */
    public GetPossibleTableValuesResponse createGetPossibleTableValuesResponse() {
        return new GetPossibleTableValuesResponse();
    }

    /**
     * Create an instance of {@link LinkEntityWithRelationType }
     * 
     */
    public LinkEntityWithRelationType createLinkEntityWithRelationType() {
        return new LinkEntityWithRelationType();
    }

    /**
     * Create an instance of {@link LinkEntityWithRelationTypeResponse }
     * 
     */
    public LinkEntityWithRelationTypeResponse createLinkEntityWithRelationTypeResponse() {
        return new LinkEntityWithRelationTypeResponse();
    }

    /**
     * Create an instance of {@link UnlinkEntityWithRelationType }
     * 
     */
    public UnlinkEntityWithRelationType createUnlinkEntityWithRelationType() {
        return new UnlinkEntityWithRelationType();
    }

    /**
     * Create an instance of {@link UnlinkEntityWithRelationTypeResponse }
     * 
     */
    public UnlinkEntityWithRelationTypeResponse createUnlinkEntityWithRelationTypeResponse() {
        return new UnlinkEntityWithRelationTypeResponse();
    }

    /**
     * Create an instance of {@link LinkEntityViaRelatedEntity }
     * 
     */
    public LinkEntityViaRelatedEntity createLinkEntityViaRelatedEntity() {
        return new LinkEntityViaRelatedEntity();
    }

    /**
     * Create an instance of {@link LinkEntityViaRelatedEntityResponse }
     * 
     */
    public LinkEntityViaRelatedEntityResponse createLinkEntityViaRelatedEntityResponse() {
        return new LinkEntityViaRelatedEntityResponse();
    }

    /**
     * Create an instance of {@link UnlinkEntityViaRelatedEntity }
     * 
     */
    public UnlinkEntityViaRelatedEntity createUnlinkEntityViaRelatedEntity() {
        return new UnlinkEntityViaRelatedEntity();
    }

    /**
     * Create an instance of {@link UnlinkEntityViaRelatedEntityResponse }
     * 
     */
    public UnlinkEntityViaRelatedEntityResponse createUnlinkEntityViaRelatedEntityResponse() {
        return new UnlinkEntityViaRelatedEntityResponse();
    }

    /**
     * Create an instance of {@link GetLinkedEntitiesWithRelationType }
     * 
     */
    public GetLinkedEntitiesWithRelationType createGetLinkedEntitiesWithRelationType() {
        return new GetLinkedEntitiesWithRelationType();
    }

    /**
     * Create an instance of {@link GetLinkedEntitiesWithRelationTypeResponse }
     * 
     */
    public GetLinkedEntitiesWithRelationTypeResponse createGetLinkedEntitiesWithRelationTypeResponse() {
        return new GetLinkedEntitiesWithRelationTypeResponse();
    }

    /**
     * Create an instance of {@link GetLinkedRelEntitiesWithRelationType }
     * 
     */
    public GetLinkedRelEntitiesWithRelationType createGetLinkedRelEntitiesWithRelationType() {
        return new GetLinkedRelEntitiesWithRelationType();
    }

    /**
     * Create an instance of {@link GetLinkedRelEntitiesWithRelationTypeResponse }
     * 
     */
    public GetLinkedRelEntitiesWithRelationTypeResponse createGetLinkedRelEntitiesWithRelationTypeResponse() {
        return new GetLinkedRelEntitiesWithRelationTypeResponse();
    }

    /**
     * Create an instance of {@link GetMailingCode }
     * 
     */
    public GetMailingCode createGetMailingCode() {
        return new GetMailingCode();
    }

    /**
     * Create an instance of {@link GetMailingCodeResponse }
     * 
     */
    public GetMailingCodeResponse createGetMailingCodeResponse() {
        return new GetMailingCodeResponse();
    }

    /**
     * Create an instance of {@link GetMeeting }
     * 
     */
    public GetMeeting createGetMeeting() {
        return new GetMeeting();
    }

    /**
     * Create an instance of {@link GetMeetingResponse }
     * 
     */
    public GetMeetingResponse createGetMeetingResponse() {
        return new GetMeetingResponse();
    }

    /**
     * Create an instance of {@link GetMeetingFromCollection }
     * 
     */
    public GetMeetingFromCollection createGetMeetingFromCollection() {
        return new GetMeetingFromCollection();
    }

    /**
     * Create an instance of {@link GetMeetingFromCollectionResponse }
     * 
     */
    public GetMeetingFromCollectionResponse createGetMeetingFromCollectionResponse() {
        return new GetMeetingFromCollectionResponse();
    }

    /**
     * Create an instance of {@link GetMeetings }
     * 
     */
    public GetMeetings createGetMeetings() {
        return new GetMeetings();
    }

    /**
     * Create an instance of {@link GetMeetingsResponse }
     * 
     */
    public GetMeetingsResponse createGetMeetingsResponse() {
        return new GetMeetingsResponse();
    }

    /**
     * Create an instance of {@link GetMeetingsFromCollection }
     * 
     */
    public GetMeetingsFromCollection createGetMeetingsFromCollection() {
        return new GetMeetingsFromCollection();
    }

    /**
     * Create an instance of {@link GetMeetingsFromCollectionResponse }
     * 
     */
    public GetMeetingsFromCollectionResponse createGetMeetingsFromCollectionResponse() {
        return new GetMeetingsFromCollectionResponse();
    }

    /**
     * Create an instance of {@link GetTopic }
     * 
     */
    public GetTopic createGetTopic() {
        return new GetTopic();
    }

    /**
     * Create an instance of {@link GetTopicResponse }
     * 
     */
    public GetTopicResponse createGetTopicResponse() {
        return new GetTopicResponse();
    }

    /**
     * Create an instance of {@link GetTopicFromCollection }
     * 
     */
    public GetTopicFromCollection createGetTopicFromCollection() {
        return new GetTopicFromCollection();
    }

    /**
     * Create an instance of {@link GetTopicFromCollectionResponse }
     * 
     */
    public GetTopicFromCollectionResponse createGetTopicFromCollectionResponse() {
        return new GetTopicFromCollectionResponse();
    }

    /**
     * Create an instance of {@link GetTopics }
     * 
     */
    public GetTopics createGetTopics() {
        return new GetTopics();
    }

    /**
     * Create an instance of {@link GetTopicsResponse }
     * 
     */
    public GetTopicsResponse createGetTopicsResponse() {
        return new GetTopicsResponse();
    }

    /**
     * Create an instance of {@link GetTopicsFromCollection }
     * 
     */
    public GetTopicsFromCollection createGetTopicsFromCollection() {
        return new GetTopicsFromCollection();
    }

    /**
     * Create an instance of {@link GetTopicsFromCollectionResponse }
     * 
     */
    public GetTopicsFromCollectionResponse createGetTopicsFromCollectionResponse() {
        return new GetTopicsFromCollectionResponse();
    }

    /**
     * Create an instance of {@link GetLinkedRelEntitiesWithFilter }
     * 
     */
    public GetLinkedRelEntitiesWithFilter createGetLinkedRelEntitiesWithFilter() {
        return new GetLinkedRelEntitiesWithFilter();
    }

    /**
     * Create an instance of {@link GetLinkedRelEntitiesWithFilterResponse }
     * 
     */
    public GetLinkedRelEntitiesWithFilterResponse createGetLinkedRelEntitiesWithFilterResponse() {
        return new GetLinkedRelEntitiesWithFilterResponse();
    }

    /**
     * Create an instance of {@link GetLinkedEntitiesWithFilter }
     * 
     */
    public GetLinkedEntitiesWithFilter createGetLinkedEntitiesWithFilter() {
        return new GetLinkedEntitiesWithFilter();
    }

    /**
     * Create an instance of {@link GetLinkedEntitiesWithFilterResponse }
     * 
     */
    public GetLinkedEntitiesWithFilterResponse createGetLinkedEntitiesWithFilterResponse() {
        return new GetLinkedEntitiesWithFilterResponse();
    }

    /**
     * Create an instance of {@link GetLinkedEntitiesWithRelationTypeFilter }
     * 
     */
    public GetLinkedEntitiesWithRelationTypeFilter createGetLinkedEntitiesWithRelationTypeFilter() {
        return new GetLinkedEntitiesWithRelationTypeFilter();
    }

    /**
     * Create an instance of {@link GetLinkedEntitiesWithRelationTypeFilterResponse }
     * 
     */
    public GetLinkedEntitiesWithRelationTypeFilterResponse createGetLinkedEntitiesWithRelationTypeFilterResponse() {
        return new GetLinkedEntitiesWithRelationTypeFilterResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "FileEntity")
    public JAXBElement<File> createFileEntity(File value) {
        return new JAXBElement<File>(_FileEntity_QNAME, File.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "Token")
    public JAXBElement<String> createToken(String value) {
        return new JAXBElement<String>(_Token_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "Uploaded")
    public JAXBElement<Boolean> createUploaded(Boolean value) {
        return new JAXBElement<Boolean>(_Uploaded_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oEntity", scope = GetLinkedRelEntitiesWithRelationTypeFilter.class)
    public JAXBElement<Entity> createGetLinkedRelEntitiesWithRelationTypeFilterOEntity(Entity value) {
        return new JAXBElement<Entity>(_GetLinkedRelEntitiesWithRelationTypeFilterOEntity_QNAME, Entity.class, GetLinkedRelEntitiesWithRelationTypeFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oRelEntity", scope = GetLinkedRelEntitiesWithRelationTypeFilter.class)
    public JAXBElement<Entity> createGetLinkedRelEntitiesWithRelationTypeFilterORelEntity(Entity value) {
        return new JAXBElement<Entity>(_GetLinkedRelEntitiesWithRelationTypeFilterORelEntity_QNAME, Entity.class, GetLinkedRelEntitiesWithRelationTypeFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetLinkedRelEntitiesWithRelationTypeFilter.class)
    public JAXBElement<String> createGetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetLinkedRelEntitiesWithRelationTypeFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oFilter", scope = GetLinkedRelEntitiesWithRelationTypeFilter.class)
    public JAXBElement<Filter> createGetLinkedRelEntitiesWithRelationTypeFilterOFilter(Filter value) {
        return new JAXBElement<Filter>(_GetLinkedRelEntitiesWithRelationTypeFilterOFilter_QNAME, Filter.class, GetLinkedRelEntitiesWithRelationTypeFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetLinkedRelEntitiesWithRelationTypeFilter.class)
    public JAXBElement<String> createGetLinkedRelEntitiesWithRelationTypeFilterSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetLinkedRelEntitiesWithRelationTypeFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetLinkedRelEntitiesWithRelationTypeFilterResult", scope = GetLinkedRelEntitiesWithRelationTypeFilterResponse.class)
    public JAXBElement<ArrayOfEntity> createGetLinkedRelEntitiesWithRelationTypeFilterResponseGetLinkedRelEntitiesWithRelationTypeFilterResult(ArrayOfEntity value) {
        return new JAXBElement<ArrayOfEntity>(_GetLinkedRelEntitiesWithRelationTypeFilterResponseGetLinkedRelEntitiesWithRelationTypeFilterResult_QNAME, ArrayOfEntity.class, GetLinkedRelEntitiesWithRelationTypeFilterResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetTask.class)
    public JAXBElement<String> createGetTaskSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetTask.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetTask.class)
    public JAXBElement<String> createGetTaskSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetTask.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oParentEntity", scope = GetTask.class)
    public JAXBElement<Entity> createGetTaskOParentEntity(Entity value) {
        return new JAXBElement<Entity>(_GetTaskOParentEntity_QNAME, Entity.class, GetTask.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetTask.class)
    public JAXBElement<String> createGetTaskSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetTask.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Task }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Task }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetTaskResult", scope = GetTaskResponse.class)
    public JAXBElement<Task> createGetTaskResponseGetTaskResult(Task value) {
        return new JAXBElement<Task>(_GetTaskResponseGetTaskResult_QNAME, Task.class, GetTaskResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sUserName", scope = GetTasksByCategory.class)
    public JAXBElement<String> createGetTasksByCategorySUserName(String value) {
        return new JAXBElement<String>(_GetTasksByCategorySUserName_QNAME, String.class, GetTasksByCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "filter", scope = GetTasksByCategory.class)
    public JAXBElement<Filter> createGetTasksByCategoryFilter(Filter value) {
        return new JAXBElement<Filter>(_GetTasksByCategoryFilter_QNAME, Filter.class, GetTasksByCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetTasksByCategory.class)
    public JAXBElement<String> createGetTasksByCategorySToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetTasksByCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetTasksByCategoryResult", scope = GetTasksByCategoryResponse.class)
    public JAXBElement<ArrayOfEntity> createGetTasksByCategoryResponseGetTasksByCategoryResult(ArrayOfEntity value) {
        return new JAXBElement<ArrayOfEntity>(_GetTasksByCategoryResponseGetTasksByCategoryResult_QNAME, ArrayOfEntity.class, GetTasksByCategoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "baFileData", scope = UploadFileByStream.class)
    public JAXBElement<byte[]> createUploadFileByStreamBaFileData(byte[] value) {
        return new JAXBElement<byte[]>(_UploadFileByStreamBaFileData_QNAME, byte[].class, UploadFileByStream.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oFileEntity", scope = UploadFileByStream.class)
    public JAXBElement<File> createUploadFileByStreamOFileEntity(File value) {
        return new JAXBElement<File>(_UploadFileByStreamOFileEntity_QNAME, File.class, UploadFileByStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = UploadFileByStream.class)
    public JAXBElement<String> createUploadFileByStreamSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, UploadFileByStream.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCollections.class)
    public JAXBElement<String> createGetCollectionsSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCollections.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCollectionsResult", scope = GetCollectionsResponse.class)
    public JAXBElement<String> createGetCollectionsResponseGetCollectionsResult(String value) {
        return new JAXBElement<String>(_GetCollectionsResponseGetCollectionsResult_QNAME, String.class, GetCollectionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "ent1", scope = LinkEntityWithRole.class)
    public JAXBElement<Entity> createLinkEntityWithRoleEnt1(Entity value) {
        return new JAXBElement<Entity>(_LinkEntityWithRoleEnt1_QNAME, Entity.class, LinkEntityWithRole.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "ent2", scope = LinkEntityWithRole.class)
    public JAXBElement<Entity> createLinkEntityWithRoleEnt2(Entity value) {
        return new JAXBElement<Entity>(_LinkEntityWithRoleEnt2_QNAME, Entity.class, LinkEntityWithRole.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Role }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Role }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oRole", scope = LinkEntityWithRole.class)
    public JAXBElement<Role> createLinkEntityWithRoleORole(Role value) {
        return new JAXBElement<Role>(_LinkEntityWithRoleORole_QNAME, Role.class, LinkEntityWithRole.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = LinkEntityWithRole.class)
    public JAXBElement<String> createLinkEntityWithRoleSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, LinkEntityWithRole.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oMainItem", scope = GetRole.class)
    public JAXBElement<Entity> createGetRoleOMainItem(Entity value) {
        return new JAXBElement<Entity>(_GetRoleOMainItem_QNAME, Entity.class, GetRole.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oLinkedItem", scope = GetRole.class)
    public JAXBElement<Entity> createGetRoleOLinkedItem(Entity value) {
        return new JAXBElement<Entity>(_GetRoleOLinkedItem_QNAME, Entity.class, GetRole.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetRole.class)
    public JAXBElement<String> createGetRoleSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetRole.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Role }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Role }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetRoleResult", scope = GetRoleResponse.class)
    public JAXBElement<Role> createGetRoleResponseGetRoleResult(Role value) {
        return new JAXBElement<Role>(_GetRoleResponseGetRoleResult_QNAME, Role.class, GetRoleResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetPossibleRoles.class)
    public JAXBElement<String> createGetPossibleRolesSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetPossibleRoles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetPossibleRolesResult", scope = GetPossibleRolesResponse.class)
    public JAXBElement<ArrayOfstring> createGetPossibleRolesResponseGetPossibleRolesResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetPossibleRolesResponseGetPossibleRolesResult_QNAME, ArrayOfstring.class, GetPossibleRolesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetCaseDocument.class)
    public JAXBElement<String> createGetCaseDocumentSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetCaseDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCaseDocument.class)
    public JAXBElement<String> createGetCaseDocumentSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCaseDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaseDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CaseDocument }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCaseDocumentResult", scope = GetCaseDocumentResponse.class)
    public JAXBElement<CaseDocument> createGetCaseDocumentResponseGetCaseDocumentResult(CaseDocument value) {
        return new JAXBElement<CaseDocument>(_GetCaseDocumentResponseGetCaseDocumentResult_QNAME, CaseDocument.class, GetCaseDocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetCaseDocumentFromCollection.class)
    public JAXBElement<String> createGetCaseDocumentFromCollectionSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetCaseDocumentFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetCaseDocumentFromCollection.class)
    public JAXBElement<String> createGetCaseDocumentFromCollectionSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetCaseDocumentFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCaseDocumentFromCollection.class)
    public JAXBElement<String> createGetCaseDocumentFromCollectionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCaseDocumentFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaseDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CaseDocument }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCaseDocumentFromCollectionResult", scope = GetCaseDocumentFromCollectionResponse.class)
    public JAXBElement<CaseDocument> createGetCaseDocumentFromCollectionResponseGetCaseDocumentFromCollectionResult(CaseDocument value) {
        return new JAXBElement<CaseDocument>(_GetCaseDocumentFromCollectionResponseGetCaseDocumentFromCollectionResult_QNAME, CaseDocument.class, GetCaseDocumentFromCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "saIdentifiers", scope = GetCaseDocuments.class)
    public JAXBElement<ArrayOfstring> createGetCaseDocumentsSaIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCaseDocumentsSaIdentifiers_QNAME, ArrayOfstring.class, GetCaseDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "saCollectionIdentifiers", scope = GetCaseDocuments.class)
    public JAXBElement<ArrayOfstring> createGetCaseDocumentsSaCollectionIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCaseDocumentsSaCollectionIdentifiers_QNAME, ArrayOfstring.class, GetCaseDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCaseDocuments.class)
    public JAXBElement<String> createGetCaseDocumentsSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCaseDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCaseDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCaseDocument }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCaseDocumentsResult", scope = GetCaseDocumentsResponse.class)
    public JAXBElement<ArrayOfCaseDocument> createGetCaseDocumentsResponseGetCaseDocumentsResult(ArrayOfCaseDocument value) {
        return new JAXBElement<ArrayOfCaseDocument>(_GetCaseDocumentsResponseGetCaseDocumentsResult_QNAME, ArrayOfCaseDocument.class, GetCaseDocumentsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetCaseDocumentsFromCollection.class)
    public JAXBElement<String> createGetCaseDocumentsFromCollectionSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetCaseDocumentsFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "filter", scope = GetCaseDocumentsFromCollection.class)
    public JAXBElement<Filter> createGetCaseDocumentsFromCollectionFilter(Filter value) {
        return new JAXBElement<Filter>(_GetTasksByCategoryFilter_QNAME, Filter.class, GetCaseDocumentsFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCaseDocumentsFromCollection.class)
    public JAXBElement<String> createGetCaseDocumentsFromCollectionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCaseDocumentsFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCaseDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCaseDocument }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCaseDocumentsFromCollectionResult", scope = GetCaseDocumentsFromCollectionResponse.class)
    public JAXBElement<ArrayOfCaseDocument> createGetCaseDocumentsFromCollectionResponseGetCaseDocumentsFromCollectionResult(ArrayOfCaseDocument value) {
        return new JAXBElement<ArrayOfCaseDocument>(_GetCaseDocumentsFromCollectionResponseGetCaseDocumentsFromCollectionResult_QNAME, ArrayOfCaseDocument.class, GetCaseDocumentsFromCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetCaseDecision.class)
    public JAXBElement<String> createGetCaseDecisionSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetCaseDecision.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCaseDecision.class)
    public JAXBElement<String> createGetCaseDecisionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCaseDecision.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaseDecision }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CaseDecision }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCaseDecisionResult", scope = GetCaseDecisionResponse.class)
    public JAXBElement<CaseDecision> createGetCaseDecisionResponseGetCaseDecisionResult(CaseDecision value) {
        return new JAXBElement<CaseDecision>(_GetCaseDecisionResponseGetCaseDecisionResult_QNAME, CaseDecision.class, GetCaseDecisionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetCaseDecisionFromCollection.class)
    public JAXBElement<String> createGetCaseDecisionFromCollectionSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetCaseDecisionFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetCaseDecisionFromCollection.class)
    public JAXBElement<String> createGetCaseDecisionFromCollectionSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetCaseDecisionFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCaseDecisionFromCollection.class)
    public JAXBElement<String> createGetCaseDecisionFromCollectionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCaseDecisionFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaseDecision }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CaseDecision }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCaseDecisionFromCollectionResult", scope = GetCaseDecisionFromCollectionResponse.class)
    public JAXBElement<CaseDecision> createGetCaseDecisionFromCollectionResponseGetCaseDecisionFromCollectionResult(CaseDecision value) {
        return new JAXBElement<CaseDecision>(_GetCaseDecisionFromCollectionResponseGetCaseDecisionFromCollectionResult_QNAME, CaseDecision.class, GetCaseDecisionFromCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "saIdentifiers", scope = GetCaseDecisions.class)
    public JAXBElement<ArrayOfstring> createGetCaseDecisionsSaIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCaseDocumentsSaIdentifiers_QNAME, ArrayOfstring.class, GetCaseDecisions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "saCollectionIdentifiers", scope = GetCaseDecisions.class)
    public JAXBElement<ArrayOfstring> createGetCaseDecisionsSaCollectionIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCaseDocumentsSaCollectionIdentifiers_QNAME, ArrayOfstring.class, GetCaseDecisions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCaseDecisions.class)
    public JAXBElement<String> createGetCaseDecisionsSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCaseDecisions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCaseDecision }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCaseDecision }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCaseDecisionsResult", scope = GetCaseDecisionsResponse.class)
    public JAXBElement<ArrayOfCaseDecision> createGetCaseDecisionsResponseGetCaseDecisionsResult(ArrayOfCaseDecision value) {
        return new JAXBElement<ArrayOfCaseDecision>(_GetCaseDecisionsResponseGetCaseDecisionsResult_QNAME, ArrayOfCaseDecision.class, GetCaseDecisionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetCaseDecisionsFromCollection.class)
    public JAXBElement<String> createGetCaseDecisionsFromCollectionSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetCaseDecisionsFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "filter", scope = GetCaseDecisionsFromCollection.class)
    public JAXBElement<Filter> createGetCaseDecisionsFromCollectionFilter(Filter value) {
        return new JAXBElement<Filter>(_GetTasksByCategoryFilter_QNAME, Filter.class, GetCaseDecisionsFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCaseDecisionsFromCollection.class)
    public JAXBElement<String> createGetCaseDecisionsFromCollectionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCaseDecisionsFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCaseDecision }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCaseDecision }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCaseDecisionsFromCollectionResult", scope = GetCaseDecisionsFromCollectionResponse.class)
    public JAXBElement<ArrayOfCaseDecision> createGetCaseDecisionsFromCollectionResponseGetCaseDecisionsFromCollectionResult(ArrayOfCaseDecision value) {
        return new JAXBElement<ArrayOfCaseDecision>(_GetCaseDecisionsFromCollectionResponseGetCaseDecisionsFromCollectionResult_QNAME, ArrayOfCaseDecision.class, GetCaseDecisionsFromCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Case }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Case }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oCase", scope = GetCaseDecisionMetaData.class)
    public JAXBElement<Case> createGetCaseDecisionMetaDataOCase(Case value) {
        return new JAXBElement<Case>(_GetCaseDecisionMetaDataOCase_QNAME, Case.class, GetCaseDecisionMetaData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sBookName", scope = GetCaseDecisionMetaData.class)
    public JAXBElement<String> createGetCaseDecisionMetaDataSBookName(String value) {
        return new JAXBElement<String>(_GetCaseDecisionMetaDataSBookName_QNAME, String.class, GetCaseDecisionMetaData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCaseDecisionMetaData.class)
    public JAXBElement<String> createGetCaseDecisionMetaDataSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCaseDecisionMetaData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaseDecisionMetaData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CaseDecisionMetaData }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCaseDecisionMetaDataResult", scope = GetCaseDecisionMetaDataResponse.class)
    public JAXBElement<CaseDecisionMetaData> createGetCaseDecisionMetaDataResponseGetCaseDecisionMetaDataResult(CaseDecisionMetaData value) {
        return new JAXBElement<CaseDecisionMetaData>(_GetCaseDecisionMetaDataResponseGetCaseDecisionMetaDataResult_QNAME, CaseDecisionMetaData.class, GetCaseDecisionMetaDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Case }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Case }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oCase", scope = GetCaseDocumentMetaData.class)
    public JAXBElement<Case> createGetCaseDocumentMetaDataOCase(Case value) {
        return new JAXBElement<Case>(_GetCaseDecisionMetaDataOCase_QNAME, Case.class, GetCaseDocumentMetaData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sBookName", scope = GetCaseDocumentMetaData.class)
    public JAXBElement<String> createGetCaseDocumentMetaDataSBookName(String value) {
        return new JAXBElement<String>(_GetCaseDecisionMetaDataSBookName_QNAME, String.class, GetCaseDocumentMetaData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCaseDocumentMetaData.class)
    public JAXBElement<String> createGetCaseDocumentMetaDataSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCaseDocumentMetaData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaseDocumentMetaData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CaseDocumentMetaData }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCaseDocumentMetaDataResult", scope = GetCaseDocumentMetaDataResponse.class)
    public JAXBElement<CaseDocumentMetaData> createGetCaseDocumentMetaDataResponseGetCaseDocumentMetaDataResult(CaseDocumentMetaData value) {
        return new JAXBElement<CaseDocumentMetaData>(_GetCaseDocumentMetaDataResponseGetCaseDocumentMetaDataResult_QNAME, CaseDocumentMetaData.class, GetCaseDocumentMetaDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "ent1", scope = UnlinkRole.class)
    public JAXBElement<Entity> createUnlinkRoleEnt1(Entity value) {
        return new JAXBElement<Entity>(_LinkEntityWithRoleEnt1_QNAME, Entity.class, UnlinkRole.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "ent2", scope = UnlinkRole.class)
    public JAXBElement<Entity> createUnlinkRoleEnt2(Entity value) {
        return new JAXBElement<Entity>(_LinkEntityWithRoleEnt2_QNAME, Entity.class, UnlinkRole.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Role }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Role }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oRole", scope = UnlinkRole.class)
    public JAXBElement<Role> createUnlinkRoleORole(Role value) {
        return new JAXBElement<Role>(_LinkEntityWithRoleORole_QNAME, Role.class, UnlinkRole.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = UnlinkRole.class)
    public JAXBElement<String> createUnlinkRoleSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, UnlinkRole.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetExternalIdentifierTypes.class)
    public JAXBElement<String> createGetExternalIdentifierTypesSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetExternalIdentifierTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetExternalIdentifierTypesResult", scope = GetExternalIdentifierTypesResponse.class)
    public JAXBElement<ArrayOfstring> createGetExternalIdentifierTypesResponseGetExternalIdentifierTypesResult(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetExternalIdentifierTypesResponseGetExternalIdentifierTypesResult_QNAME, ArrayOfstring.class, GetExternalIdentifierTypesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oFile", scope = GetThumbnail.class)
    public JAXBElement<File> createGetThumbnailOFile(File value) {
        return new JAXBElement<File>(_GetThumbnailOFile_QNAME, File.class, GetThumbnail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetThumbnail.class)
    public JAXBElement<String> createGetThumbnailSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetThumbnail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetThumbnailResult", scope = GetThumbnailResponse.class)
    public JAXBElement<byte[]> createGetThumbnailResponseGetThumbnailResult(byte[] value) {
        return new JAXBElement<byte[]>(_GetThumbnailResponseGetThumbnailResult_QNAME, byte[].class, GetThumbnailResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oEntity", scope = GetLinkedFiles.class)
    public JAXBElement<Entity> createGetLinkedFilesOEntity(Entity value) {
        return new JAXBElement<Entity>(_GetLinkedRelEntitiesWithRelationTypeFilterOEntity_QNAME, Entity.class, GetLinkedFiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetLinkedFiles.class)
    public JAXBElement<String> createGetLinkedFilesSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetLinkedFiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetLinkedFiles.class)
    public JAXBElement<String> createGetLinkedFilesSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetLinkedFiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetLinkedFilesResult", scope = GetLinkedFilesResponse.class)
    public JAXBElement<ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt> createGetLinkedFilesResponseGetLinkedFilesResult(ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt value) {
        return new JAXBElement<ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt>(_GetLinkedFilesResponseGetLinkedFilesResult_QNAME, ArrayOfKeyValueOfEntityArrayOfFileBSZZKfqt.class, GetLinkedFilesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "baFileData", scope = UploadFilePart.class)
    public JAXBElement<byte[]> createUploadFilePartBaFileData(byte[] value) {
        return new JAXBElement<byte[]>(_UploadFileByStreamBaFileData_QNAME, byte[].class, UploadFilePart.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oFileEntity", scope = UploadFilePart.class)
    public JAXBElement<File> createUploadFilePartOFileEntity(File value) {
        return new JAXBElement<File>(_UploadFileByStreamOFileEntity_QNAME, File.class, UploadFilePart.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sPartUploadToken", scope = UploadFilePart.class)
    public JAXBElement<String> createUploadFilePartSPartUploadToken(String value) {
        return new JAXBElement<String>(_UploadFilePartSPartUploadToken_QNAME, String.class, UploadFilePart.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = UploadFilePart.class)
    public JAXBElement<String> createUploadFilePartSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, UploadFilePart.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "UploadFilePartResult", scope = UploadFilePartResponse.class)
    public JAXBElement<String> createUploadFilePartResponseUploadFilePartResult(String value) {
        return new JAXBElement<String>(_UploadFilePartResponseUploadFilePartResult_QNAME, String.class, UploadFilePartResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "ent", scope = LogAudit.class)
    public JAXBElement<Entity> createLogAuditEnt(Entity value) {
        return new JAXBElement<Entity>(_LogAuditEnt_QNAME, Entity.class, LogAudit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sAuditMessage", scope = LogAudit.class)
    public JAXBElement<String> createLogAuditSAuditMessage(String value) {
        return new JAXBElement<String>(_LogAuditSAuditMessage_QNAME, String.class, LogAudit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = LogAudit.class)
    public JAXBElement<String> createLogAuditSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, LogAudit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "ent", scope = StartMerge.class)
    public JAXBElement<Entity> createStartMergeEnt(Entity value) {
        return new JAXBElement<Entity>(_LogAuditEnt_QNAME, Entity.class, StartMerge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sTemplateKey", scope = StartMerge.class)
    public JAXBElement<String> createStartMergeSTemplateKey(String value) {
        return new JAXBElement<String>(_StartMergeSTemplateKey_QNAME, String.class, StartMerge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = StartMerge.class)
    public JAXBElement<String> createStartMergeSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, StartMerge.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "StartMergeResult", scope = StartMergeResponse.class)
    public JAXBElement<String> createStartMergeResponseStartMergeResult(String value) {
        return new JAXBElement<String>(_StartMergeResponseStartMergeResult_QNAME, String.class, StartMergeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetDocument.class)
    public JAXBElement<String> createGetDocumentSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetDocument.class)
    public JAXBElement<String> createGetDocumentSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetDocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetDocumentResult", scope = GetDocumentResponse.class)
    public JAXBElement<Document> createGetDocumentResponseGetDocumentResult(Document value) {
        return new JAXBElement<Document>(_GetDocumentResponseGetDocumentResult_QNAME, Document.class, GetDocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetDocumentFromCollection.class)
    public JAXBElement<String> createGetDocumentFromCollectionSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetDocumentFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetDocumentFromCollection.class)
    public JAXBElement<String> createGetDocumentFromCollectionSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetDocumentFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetDocumentFromCollection.class)
    public JAXBElement<String> createGetDocumentFromCollectionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetDocumentFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetDocumentFromCollectionResult", scope = GetDocumentFromCollectionResponse.class)
    public JAXBElement<Document> createGetDocumentFromCollectionResponseGetDocumentFromCollectionResult(Document value) {
        return new JAXBElement<Document>(_GetDocumentFromCollectionResponseGetDocumentFromCollectionResult_QNAME, Document.class, GetDocumentFromCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "saIdentifiers", scope = GetDocuments.class)
    public JAXBElement<ArrayOfstring> createGetDocumentsSaIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCaseDocumentsSaIdentifiers_QNAME, ArrayOfstring.class, GetDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "saCollectionIdentifiers", scope = GetDocuments.class)
    public JAXBElement<ArrayOfstring> createGetDocumentsSaCollectionIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCaseDocumentsSaCollectionIdentifiers_QNAME, ArrayOfstring.class, GetDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetDocuments.class)
    public JAXBElement<String> createGetDocumentsSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetDocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocument }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetDocumentsResult", scope = GetDocumentsResponse.class)
    public JAXBElement<ArrayOfDocument> createGetDocumentsResponseGetDocumentsResult(ArrayOfDocument value) {
        return new JAXBElement<ArrayOfDocument>(_GetDocumentsResponseGetDocumentsResult_QNAME, ArrayOfDocument.class, GetDocumentsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetDocumentsFromCollection.class)
    public JAXBElement<String> createGetDocumentsFromCollectionSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetDocumentsFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "filter", scope = GetDocumentsFromCollection.class)
    public JAXBElement<Filter> createGetDocumentsFromCollectionFilter(Filter value) {
        return new JAXBElement<Filter>(_GetTasksByCategoryFilter_QNAME, Filter.class, GetDocumentsFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetDocumentsFromCollection.class)
    public JAXBElement<String> createGetDocumentsFromCollectionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetDocumentsFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocument }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocument }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetDocumentsFromCollectionResult", scope = GetDocumentsFromCollectionResponse.class)
    public JAXBElement<ArrayOfDocument> createGetDocumentsFromCollectionResponseGetDocumentsFromCollectionResult(ArrayOfDocument value) {
        return new JAXBElement<ArrayOfDocument>(_GetDocumentsFromCollectionResponseGetDocumentsFromCollectionResult_QNAME, ArrayOfDocument.class, GetDocumentsFromCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetBAGObject.class)
    public JAXBElement<String> createGetBAGObjectSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetBAGObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetBAGObject.class)
    public JAXBElement<String> createGetBAGObjectSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetBAGObject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BAGObject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BAGObject }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetBAGObjectResult", scope = GetBAGObjectResponse.class)
    public JAXBElement<BAGObject> createGetBAGObjectResponseGetBAGObjectResult(BAGObject value) {
        return new JAXBElement<BAGObject>(_GetBAGObjectResponseGetBAGObjectResult_QNAME, BAGObject.class, GetBAGObjectResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetBAGObjectFromCollection.class)
    public JAXBElement<String> createGetBAGObjectFromCollectionSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetBAGObjectFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetBAGObjectFromCollection.class)
    public JAXBElement<String> createGetBAGObjectFromCollectionSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetBAGObjectFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetBAGObjectFromCollection.class)
    public JAXBElement<String> createGetBAGObjectFromCollectionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetBAGObjectFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BAGObject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BAGObject }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetBAGObjectFromCollectionResult", scope = GetBAGObjectFromCollectionResponse.class)
    public JAXBElement<BAGObject> createGetBAGObjectFromCollectionResponseGetBAGObjectFromCollectionResult(BAGObject value) {
        return new JAXBElement<BAGObject>(_GetBAGObjectFromCollectionResponseGetBAGObjectFromCollectionResult_QNAME, BAGObject.class, GetBAGObjectFromCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "saIdentifiers", scope = GetBAGObjects.class)
    public JAXBElement<ArrayOfstring> createGetBAGObjectsSaIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCaseDocumentsSaIdentifiers_QNAME, ArrayOfstring.class, GetBAGObjects.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "saCollectionIdentifiers", scope = GetBAGObjects.class)
    public JAXBElement<ArrayOfstring> createGetBAGObjectsSaCollectionIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCaseDocumentsSaCollectionIdentifiers_QNAME, ArrayOfstring.class, GetBAGObjects.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetBAGObjects.class)
    public JAXBElement<String> createGetBAGObjectsSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetBAGObjects.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBAGObject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBAGObject }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetBAGObjectsResult", scope = GetBAGObjectsResponse.class)
    public JAXBElement<ArrayOfBAGObject> createGetBAGObjectsResponseGetBAGObjectsResult(ArrayOfBAGObject value) {
        return new JAXBElement<ArrayOfBAGObject>(_GetBAGObjectsResponseGetBAGObjectsResult_QNAME, ArrayOfBAGObject.class, GetBAGObjectsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetBagObjectsFromCollection.class)
    public JAXBElement<String> createGetBagObjectsFromCollectionSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetBagObjectsFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "filter", scope = GetBagObjectsFromCollection.class)
    public JAXBElement<Filter> createGetBagObjectsFromCollectionFilter(Filter value) {
        return new JAXBElement<Filter>(_GetTasksByCategoryFilter_QNAME, Filter.class, GetBagObjectsFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetBagObjectsFromCollection.class)
    public JAXBElement<String> createGetBagObjectsFromCollectionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetBagObjectsFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBAGObject }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBAGObject }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetBagObjectsFromCollectionResult", scope = GetBagObjectsFromCollectionResponse.class)
    public JAXBElement<ArrayOfBAGObject> createGetBagObjectsFromCollectionResponseGetBagObjectsFromCollectionResult(ArrayOfBAGObject value) {
        return new JAXBElement<ArrayOfBAGObject>(_GetBagObjectsFromCollectionResponseGetBagObjectsFromCollectionResult_QNAME, ArrayOfBAGObject.class, GetBagObjectsFromCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetCompany.class)
    public JAXBElement<String> createGetCompanySIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetCompany.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCompany.class)
    public JAXBElement<String> createGetCompanySToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCompany.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Company }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Company }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCompanyResult", scope = GetCompanyResponse.class)
    public JAXBElement<Company> createGetCompanyResponseGetCompanyResult(Company value) {
        return new JAXBElement<Company>(_GetCompanyResponseGetCompanyResult_QNAME, Company.class, GetCompanyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetCompanyFromCollection.class)
    public JAXBElement<String> createGetCompanyFromCollectionSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetCompanyFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetCompanyFromCollection.class)
    public JAXBElement<String> createGetCompanyFromCollectionSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetCompanyFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCompanyFromCollection.class)
    public JAXBElement<String> createGetCompanyFromCollectionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCompanyFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Company }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Company }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCompanyFromCollectionResult", scope = GetCompanyFromCollectionResponse.class)
    public JAXBElement<Company> createGetCompanyFromCollectionResponseGetCompanyFromCollectionResult(Company value) {
        return new JAXBElement<Company>(_GetCompanyFromCollectionResponseGetCompanyFromCollectionResult_QNAME, Company.class, GetCompanyFromCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "saIdentifiers", scope = GetCompanies.class)
    public JAXBElement<ArrayOfstring> createGetCompaniesSaIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCaseDocumentsSaIdentifiers_QNAME, ArrayOfstring.class, GetCompanies.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "saCollectionIdentifiers", scope = GetCompanies.class)
    public JAXBElement<ArrayOfstring> createGetCompaniesSaCollectionIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCaseDocumentsSaCollectionIdentifiers_QNAME, ArrayOfstring.class, GetCompanies.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCompanies.class)
    public JAXBElement<String> createGetCompaniesSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCompanies.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCompany }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCompany }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCompaniesResult", scope = GetCompaniesResponse.class)
    public JAXBElement<ArrayOfCompany> createGetCompaniesResponseGetCompaniesResult(ArrayOfCompany value) {
        return new JAXBElement<ArrayOfCompany>(_GetCompaniesResponseGetCompaniesResult_QNAME, ArrayOfCompany.class, GetCompaniesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetCompaniesFromCollection.class)
    public JAXBElement<String> createGetCompaniesFromCollectionSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetCompaniesFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "filter", scope = GetCompaniesFromCollection.class)
    public JAXBElement<Filter> createGetCompaniesFromCollectionFilter(Filter value) {
        return new JAXBElement<Filter>(_GetTasksByCategoryFilter_QNAME, Filter.class, GetCompaniesFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCompaniesFromCollection.class)
    public JAXBElement<String> createGetCompaniesFromCollectionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCompaniesFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCompany }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCompany }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCompaniesFromCollectionResult", scope = GetCompaniesFromCollectionResponse.class)
    public JAXBElement<ArrayOfCompany> createGetCompaniesFromCollectionResponseGetCompaniesFromCollectionResult(ArrayOfCompany value) {
        return new JAXBElement<ArrayOfCompany>(_GetCompaniesFromCollectionResponseGetCompaniesFromCollectionResult_QNAME, ArrayOfCompany.class, GetCompaniesFromCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetCompanyNHR.class)
    public JAXBElement<String> createGetCompanyNHRSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetCompanyNHR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCompanyNHR.class)
    public JAXBElement<String> createGetCompanyNHRSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCompanyNHR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyNHR }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompanyNHR }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCompanyNHRResult", scope = GetCompanyNHRResponse.class)
    public JAXBElement<CompanyNHR> createGetCompanyNHRResponseGetCompanyNHRResult(CompanyNHR value) {
        return new JAXBElement<CompanyNHR>(_GetCompanyNHRResponseGetCompanyNHRResult_QNAME, CompanyNHR.class, GetCompanyNHRResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetCompanyNHRFromCollection.class)
    public JAXBElement<String> createGetCompanyNHRFromCollectionSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetCompanyNHRFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetCompanyNHRFromCollection.class)
    public JAXBElement<String> createGetCompanyNHRFromCollectionSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetCompanyNHRFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCompanyNHRFromCollection.class)
    public JAXBElement<String> createGetCompanyNHRFromCollectionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCompanyNHRFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyNHR }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompanyNHR }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCompanyNHRFromCollectionResult", scope = GetCompanyNHRFromCollectionResponse.class)
    public JAXBElement<CompanyNHR> createGetCompanyNHRFromCollectionResponseGetCompanyNHRFromCollectionResult(CompanyNHR value) {
        return new JAXBElement<CompanyNHR>(_GetCompanyNHRFromCollectionResponseGetCompanyNHRFromCollectionResult_QNAME, CompanyNHR.class, GetCompanyNHRFromCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "saIdentifiers", scope = GetCompanyNHRs.class)
    public JAXBElement<ArrayOfstring> createGetCompanyNHRsSaIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCaseDocumentsSaIdentifiers_QNAME, ArrayOfstring.class, GetCompanyNHRs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "saCollectionIdentifiers", scope = GetCompanyNHRs.class)
    public JAXBElement<ArrayOfstring> createGetCompanyNHRsSaCollectionIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCaseDocumentsSaCollectionIdentifiers_QNAME, ArrayOfstring.class, GetCompanyNHRs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCompanyNHRs.class)
    public JAXBElement<String> createGetCompanyNHRsSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCompanyNHRs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCompanyNHR }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCompanyNHR }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCompanyNHRsResult", scope = GetCompanyNHRsResponse.class)
    public JAXBElement<ArrayOfCompanyNHR> createGetCompanyNHRsResponseGetCompanyNHRsResult(ArrayOfCompanyNHR value) {
        return new JAXBElement<ArrayOfCompanyNHR>(_GetCompanyNHRsResponseGetCompanyNHRsResult_QNAME, ArrayOfCompanyNHR.class, GetCompanyNHRsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetCompanyNHRsFromCollection.class)
    public JAXBElement<String> createGetCompanyNHRsFromCollectionSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetCompanyNHRsFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "filter", scope = GetCompanyNHRsFromCollection.class)
    public JAXBElement<Filter> createGetCompanyNHRsFromCollectionFilter(Filter value) {
        return new JAXBElement<Filter>(_GetTasksByCategoryFilter_QNAME, Filter.class, GetCompanyNHRsFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCompanyNHRsFromCollection.class)
    public JAXBElement<String> createGetCompanyNHRsFromCollectionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCompanyNHRsFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCompanyNHR }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCompanyNHR }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCompanyNHRsFromCollectionResult", scope = GetCompanyNHRsFromCollectionResponse.class)
    public JAXBElement<ArrayOfCompanyNHR> createGetCompanyNHRsFromCollectionResponseGetCompanyNHRsFromCollectionResult(ArrayOfCompanyNHR value) {
        return new JAXBElement<ArrayOfCompanyNHR>(_GetCompanyNHRsFromCollectionResponseGetCompanyNHRsFromCollectionResult_QNAME, ArrayOfCompanyNHR.class, GetCompanyNHRsFromCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetCase.class)
    public JAXBElement<String> createGetCaseSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetCase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCase.class)
    public JAXBElement<String> createGetCaseSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Case }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Case }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCaseResult", scope = GetCaseResponse.class)
    public JAXBElement<Case> createGetCaseResponseGetCaseResult(Case value) {
        return new JAXBElement<Case>(_GetCaseResponseGetCaseResult_QNAME, Case.class, GetCaseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetCaseFromCollection.class)
    public JAXBElement<String> createGetCaseFromCollectionSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetCaseFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetCaseFromCollection.class)
    public JAXBElement<String> createGetCaseFromCollectionSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetCaseFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCaseFromCollection.class)
    public JAXBElement<String> createGetCaseFromCollectionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCaseFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Case }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Case }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCaseFromCollectionResult", scope = GetCaseFromCollectionResponse.class)
    public JAXBElement<Case> createGetCaseFromCollectionResponseGetCaseFromCollectionResult(Case value) {
        return new JAXBElement<Case>(_GetCaseFromCollectionResponseGetCaseFromCollectionResult_QNAME, Case.class, GetCaseFromCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "saIdentifiers", scope = GetCases.class)
    public JAXBElement<ArrayOfstring> createGetCasesSaIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCaseDocumentsSaIdentifiers_QNAME, ArrayOfstring.class, GetCases.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "saCollectionIdentifiers", scope = GetCases.class)
    public JAXBElement<ArrayOfstring> createGetCasesSaCollectionIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCaseDocumentsSaCollectionIdentifiers_QNAME, ArrayOfstring.class, GetCases.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCases.class)
    public JAXBElement<String> createGetCasesSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCases.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCase }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCasesResult", scope = GetCasesResponse.class)
    public JAXBElement<ArrayOfCase> createGetCasesResponseGetCasesResult(ArrayOfCase value) {
        return new JAXBElement<ArrayOfCase>(_GetCasesResponseGetCasesResult_QNAME, ArrayOfCase.class, GetCasesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetCasesFromCollection.class)
    public JAXBElement<String> createGetCasesFromCollectionSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetCasesFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "filter", scope = GetCasesFromCollection.class)
    public JAXBElement<Filter> createGetCasesFromCollectionFilter(Filter value) {
        return new JAXBElement<Filter>(_GetTasksByCategoryFilter_QNAME, Filter.class, GetCasesFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCasesFromCollection.class)
    public JAXBElement<String> createGetCasesFromCollectionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCasesFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCase }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCasesFromCollectionResult", scope = GetCasesFromCollectionResponse.class)
    public JAXBElement<ArrayOfCase> createGetCasesFromCollectionResponseGetCasesFromCollectionResult(ArrayOfCase value) {
        return new JAXBElement<ArrayOfCase>(_GetCasesFromCollectionResponseGetCasesFromCollectionResult_QNAME, ArrayOfCase.class, GetCasesFromCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetCaseType.class)
    public JAXBElement<String> createGetCaseTypeSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetCaseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCaseType.class)
    public JAXBElement<String> createGetCaseTypeSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCaseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CaseType }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCaseTypeResult", scope = GetCaseTypeResponse.class)
    public JAXBElement<CaseType> createGetCaseTypeResponseGetCaseTypeResult(CaseType value) {
        return new JAXBElement<CaseType>(_GetCaseTypeResponseGetCaseTypeResult_QNAME, CaseType.class, GetCaseTypeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetCaseTypeFromCollection.class)
    public JAXBElement<String> createGetCaseTypeFromCollectionSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetCaseTypeFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetCaseTypeFromCollection.class)
    public JAXBElement<String> createGetCaseTypeFromCollectionSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetCaseTypeFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCaseTypeFromCollection.class)
    public JAXBElement<String> createGetCaseTypeFromCollectionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCaseTypeFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CaseType }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCaseTypeFromCollectionResult", scope = GetCaseTypeFromCollectionResponse.class)
    public JAXBElement<CaseType> createGetCaseTypeFromCollectionResponseGetCaseTypeFromCollectionResult(CaseType value) {
        return new JAXBElement<CaseType>(_GetCaseTypeFromCollectionResponseGetCaseTypeFromCollectionResult_QNAME, CaseType.class, GetCaseTypeFromCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "saIdentifiers", scope = GetCaseTypes.class)
    public JAXBElement<ArrayOfstring> createGetCaseTypesSaIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCaseDocumentsSaIdentifiers_QNAME, ArrayOfstring.class, GetCaseTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "saCollectionIdentifiers", scope = GetCaseTypes.class)
    public JAXBElement<ArrayOfstring> createGetCaseTypesSaCollectionIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCaseDocumentsSaCollectionIdentifiers_QNAME, ArrayOfstring.class, GetCaseTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCaseTypes.class)
    public JAXBElement<String> createGetCaseTypesSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCaseTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCaseType }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCaseTypesResult", scope = GetCaseTypesResponse.class)
    public JAXBElement<ArrayOfCaseType> createGetCaseTypesResponseGetCaseTypesResult(ArrayOfCaseType value) {
        return new JAXBElement<ArrayOfCaseType>(_GetCaseTypesResponseGetCaseTypesResult_QNAME, ArrayOfCaseType.class, GetCaseTypesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetCaseTypesFromCollection.class)
    public JAXBElement<String> createGetCaseTypesFromCollectionSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetCaseTypesFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "filter", scope = GetCaseTypesFromCollection.class)
    public JAXBElement<Filter> createGetCaseTypesFromCollectionFilter(Filter value) {
        return new JAXBElement<Filter>(_GetTasksByCategoryFilter_QNAME, Filter.class, GetCaseTypesFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCaseTypesFromCollection.class)
    public JAXBElement<String> createGetCaseTypesFromCollectionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCaseTypesFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCaseType }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCaseTypesFromCollectionResult", scope = GetCaseTypesFromCollectionResponse.class)
    public JAXBElement<ArrayOfCaseType> createGetCaseTypesFromCollectionResponseGetCaseTypesFromCollectionResult(ArrayOfCaseType value) {
        return new JAXBElement<ArrayOfCaseType>(_GetCaseTypesFromCollectionResponseGetCaseTypesFromCollectionResult_QNAME, ArrayOfCaseType.class, GetCaseTypesFromCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CaseType }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oCaseType", scope = GetDocumentTypesFromCaseType.class)
    public JAXBElement<CaseType> createGetDocumentTypesFromCaseTypeOCaseType(CaseType value) {
        return new JAXBElement<CaseType>(_GetDocumentTypesFromCaseTypeOCaseType_QNAME, CaseType.class, GetDocumentTypesFromCaseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetDocumentTypesFromCaseType.class)
    public JAXBElement<String> createGetDocumentTypesFromCaseTypeSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetDocumentTypesFromCaseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumentType }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetDocumentTypesFromCaseTypeResult", scope = GetDocumentTypesFromCaseTypeResponse.class)
    public JAXBElement<ArrayOfDocumentType> createGetDocumentTypesFromCaseTypeResponseGetDocumentTypesFromCaseTypeResult(ArrayOfDocumentType value) {
        return new JAXBElement<ArrayOfDocumentType>(_GetDocumentTypesFromCaseTypeResponseGetDocumentTypesFromCaseTypeResult_QNAME, ArrayOfDocumentType.class, GetDocumentTypesFromCaseTypeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CaseType }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oCaseType", scope = GetDocumentTypeFromCaseType.class)
    public JAXBElement<CaseType> createGetDocumentTypeFromCaseTypeOCaseType(CaseType value) {
        return new JAXBElement<CaseType>(_GetDocumentTypesFromCaseTypeOCaseType_QNAME, CaseType.class, GetDocumentTypeFromCaseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sDocumentType", scope = GetDocumentTypeFromCaseType.class)
    public JAXBElement<String> createGetDocumentTypeFromCaseTypeSDocumentType(String value) {
        return new JAXBElement<String>(_GetDocumentTypeFromCaseTypeSDocumentType_QNAME, String.class, GetDocumentTypeFromCaseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetDocumentTypeFromCaseType.class)
    public JAXBElement<String> createGetDocumentTypeFromCaseTypeSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetDocumentTypeFromCaseType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentType }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetDocumentTypeFromCaseTypeResult", scope = GetDocumentTypeFromCaseTypeResponse.class)
    public JAXBElement<DocumentType> createGetDocumentTypeFromCaseTypeResponseGetDocumentTypeFromCaseTypeResult(DocumentType value) {
        return new JAXBElement<DocumentType>(_GetDocumentTypeFromCaseTypeResponseGetDocumentTypeFromCaseTypeResult_QNAME, DocumentType.class, GetDocumentTypeFromCaseTypeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetCitizen.class)
    public JAXBElement<String> createGetCitizenSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetCitizen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCitizen.class)
    public JAXBElement<String> createGetCitizenSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCitizen.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Citizen }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Citizen }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCitizenResult", scope = GetCitizenResponse.class)
    public JAXBElement<Citizen> createGetCitizenResponseGetCitizenResult(Citizen value) {
        return new JAXBElement<Citizen>(_GetCitizenResponseGetCitizenResult_QNAME, Citizen.class, GetCitizenResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetCitizenFromCollection.class)
    public JAXBElement<String> createGetCitizenFromCollectionSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetCitizenFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetCitizenFromCollection.class)
    public JAXBElement<String> createGetCitizenFromCollectionSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetCitizenFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCitizenFromCollection.class)
    public JAXBElement<String> createGetCitizenFromCollectionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCitizenFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Citizen }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Citizen }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCitizenFromCollectionResult", scope = GetCitizenFromCollectionResponse.class)
    public JAXBElement<Citizen> createGetCitizenFromCollectionResponseGetCitizenFromCollectionResult(Citizen value) {
        return new JAXBElement<Citizen>(_GetCitizenFromCollectionResponseGetCitizenFromCollectionResult_QNAME, Citizen.class, GetCitizenFromCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "saIdentifiers", scope = GetCitizens.class)
    public JAXBElement<ArrayOfstring> createGetCitizensSaIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCaseDocumentsSaIdentifiers_QNAME, ArrayOfstring.class, GetCitizens.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "saCollectionIdentifiers", scope = GetCitizens.class)
    public JAXBElement<ArrayOfstring> createGetCitizensSaCollectionIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCaseDocumentsSaCollectionIdentifiers_QNAME, ArrayOfstring.class, GetCitizens.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCitizens.class)
    public JAXBElement<String> createGetCitizensSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCitizens.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCitizen }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCitizen }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCitizensResult", scope = GetCitizensResponse.class)
    public JAXBElement<ArrayOfCitizen> createGetCitizensResponseGetCitizensResult(ArrayOfCitizen value) {
        return new JAXBElement<ArrayOfCitizen>(_GetCitizensResponseGetCitizensResult_QNAME, ArrayOfCitizen.class, GetCitizensResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetCitizensFromCollection.class)
    public JAXBElement<String> createGetCitizensFromCollectionSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetCitizensFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "filter", scope = GetCitizensFromCollection.class)
    public JAXBElement<Filter> createGetCitizensFromCollectionFilter(Filter value) {
        return new JAXBElement<Filter>(_GetTasksByCategoryFilter_QNAME, Filter.class, GetCitizensFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCitizensFromCollection.class)
    public JAXBElement<String> createGetCitizensFromCollectionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCitizensFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCitizen }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCitizen }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCitizensFromCollectionResult", scope = GetCitizensFromCollectionResponse.class)
    public JAXBElement<ArrayOfCitizen> createGetCitizensFromCollectionResponseGetCitizensFromCollectionResult(ArrayOfCitizen value) {
        return new JAXBElement<ArrayOfCitizen>(_GetCitizensFromCollectionResponseGetCitizensFromCollectionResult_QNAME, ArrayOfCitizen.class, GetCitizensFromCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetFolder.class)
    public JAXBElement<String> createGetFolderSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetFolder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetFolder.class)
    public JAXBElement<String> createGetFolderSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetFolder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Folder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Folder }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetFolderResult", scope = GetFolderResponse.class)
    public JAXBElement<Folder> createGetFolderResponseGetFolderResult(Folder value) {
        return new JAXBElement<Folder>(_GetFolderResponseGetFolderResult_QNAME, Folder.class, GetFolderResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetFolderFromCollection.class)
    public JAXBElement<String> createGetFolderFromCollectionSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetFolderFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetFolderFromCollection.class)
    public JAXBElement<String> createGetFolderFromCollectionSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetFolderFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetFolderFromCollection.class)
    public JAXBElement<String> createGetFolderFromCollectionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetFolderFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Folder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Folder }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetFolderFromCollectionResult", scope = GetFolderFromCollectionResponse.class)
    public JAXBElement<Folder> createGetFolderFromCollectionResponseGetFolderFromCollectionResult(Folder value) {
        return new JAXBElement<Folder>(_GetFolderFromCollectionResponseGetFolderFromCollectionResult_QNAME, Folder.class, GetFolderFromCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "saIdentifiers", scope = GetFolders.class)
    public JAXBElement<ArrayOfstring> createGetFoldersSaIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCaseDocumentsSaIdentifiers_QNAME, ArrayOfstring.class, GetFolders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "saCollectionIdentifiers", scope = GetFolders.class)
    public JAXBElement<ArrayOfstring> createGetFoldersSaCollectionIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCaseDocumentsSaCollectionIdentifiers_QNAME, ArrayOfstring.class, GetFolders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetFolders.class)
    public JAXBElement<String> createGetFoldersSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetFolders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFolder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfFolder }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetFoldersResult", scope = GetFoldersResponse.class)
    public JAXBElement<ArrayOfFolder> createGetFoldersResponseGetFoldersResult(ArrayOfFolder value) {
        return new JAXBElement<ArrayOfFolder>(_GetFoldersResponseGetFoldersResult_QNAME, ArrayOfFolder.class, GetFoldersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetFoldersFromCollection.class)
    public JAXBElement<String> createGetFoldersFromCollectionSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetFoldersFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "filter", scope = GetFoldersFromCollection.class)
    public JAXBElement<Filter> createGetFoldersFromCollectionFilter(Filter value) {
        return new JAXBElement<Filter>(_GetTasksByCategoryFilter_QNAME, Filter.class, GetFoldersFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetFoldersFromCollection.class)
    public JAXBElement<String> createGetFoldersFromCollectionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetFoldersFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFolder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfFolder }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetFoldersFromCollectionResult", scope = GetFoldersFromCollectionResponse.class)
    public JAXBElement<ArrayOfFolder> createGetFoldersFromCollectionResponseGetFoldersFromCollectionResult(ArrayOfFolder value) {
        return new JAXBElement<ArrayOfFolder>(_GetFoldersFromCollectionResponseGetFoldersFromCollectionResult_QNAME, ArrayOfFolder.class, GetFoldersFromCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetPerson.class)
    public JAXBElement<String> createGetPersonSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetPerson.class)
    public JAXBElement<String> createGetPersonSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Person }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetPersonResult", scope = GetPersonResponse.class)
    public JAXBElement<Person> createGetPersonResponseGetPersonResult(Person value) {
        return new JAXBElement<Person>(_GetPersonResponseGetPersonResult_QNAME, Person.class, GetPersonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetPersonFromCollection.class)
    public JAXBElement<String> createGetPersonFromCollectionSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetPersonFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetPersonFromCollection.class)
    public JAXBElement<String> createGetPersonFromCollectionSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetPersonFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetPersonFromCollection.class)
    public JAXBElement<String> createGetPersonFromCollectionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetPersonFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Person }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetPersonFromCollectionResult", scope = GetPersonFromCollectionResponse.class)
    public JAXBElement<Person> createGetPersonFromCollectionResponseGetPersonFromCollectionResult(Person value) {
        return new JAXBElement<Person>(_GetPersonFromCollectionResponseGetPersonFromCollectionResult_QNAME, Person.class, GetPersonFromCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "saIdentifiers", scope = GetPersons.class)
    public JAXBElement<ArrayOfstring> createGetPersonsSaIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCaseDocumentsSaIdentifiers_QNAME, ArrayOfstring.class, GetPersons.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "saCollectionIdentifiers", scope = GetPersons.class)
    public JAXBElement<ArrayOfstring> createGetPersonsSaCollectionIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCaseDocumentsSaCollectionIdentifiers_QNAME, ArrayOfstring.class, GetPersons.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetPersons.class)
    public JAXBElement<String> createGetPersonsSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetPersons.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPerson }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPerson }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetPersonsResult", scope = GetPersonsResponse.class)
    public JAXBElement<ArrayOfPerson> createGetPersonsResponseGetPersonsResult(ArrayOfPerson value) {
        return new JAXBElement<ArrayOfPerson>(_GetPersonsResponseGetPersonsResult_QNAME, ArrayOfPerson.class, GetPersonsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetPersonsFromCollection.class)
    public JAXBElement<String> createGetPersonsFromCollectionSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetPersonsFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "filter", scope = GetPersonsFromCollection.class)
    public JAXBElement<Filter> createGetPersonsFromCollectionFilter(Filter value) {
        return new JAXBElement<Filter>(_GetTasksByCategoryFilter_QNAME, Filter.class, GetPersonsFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetPersonsFromCollection.class)
    public JAXBElement<String> createGetPersonsFromCollectionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetPersonsFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPerson }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPerson }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetPersonsFromCollectionResult", scope = GetPersonsFromCollectionResponse.class)
    public JAXBElement<ArrayOfPerson> createGetPersonsFromCollectionResponseGetPersonsFromCollectionResult(ArrayOfPerson value) {
        return new JAXBElement<ArrayOfPerson>(_GetPersonsFromCollectionResponseGetPersonsFromCollectionResult_QNAME, ArrayOfPerson.class, GetPersonsFromCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetFile.class)
    public JAXBElement<String> createGetFileSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetFile.class)
    public JAXBElement<String> createGetFileSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetFileResult", scope = GetFileResponse.class)
    public JAXBElement<File> createGetFileResponseGetFileResult(File value) {
        return new JAXBElement<File>(_GetFileResponseGetFileResult_QNAME, File.class, GetFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "ent", scope = DownloadAsPDF.class)
    public JAXBElement<File> createDownloadAsPDFEnt(File value) {
        return new JAXBElement<File>(_LogAuditEnt_QNAME, File.class, DownloadAsPDF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = DownloadAsPDF.class)
    public JAXBElement<String> createDownloadAsPDFSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, DownloadAsPDF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "ent", scope = DownloadFile.class)
    public JAXBElement<File> createDownloadFileEnt(File value) {
        return new JAXBElement<File>(_LogAuditEnt_QNAME, File.class, DownloadFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = DownloadFile.class)
    public JAXBElement<String> createDownloadFileSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, DownloadFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = DownloadFileVersion.class)
    public JAXBElement<String> createDownloadFileVersionSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, DownloadFileVersion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileVersion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileVersion }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "version", scope = DownloadFileVersion.class)
    public JAXBElement<FileVersion> createDownloadFileVersionVersion(FileVersion value) {
        return new JAXBElement<FileVersion>(_DownloadFileVersionVersion_QNAME, FileVersion.class, DownloadFileVersion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = DownloadFileVersion.class)
    public JAXBElement<String> createDownloadFileVersionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, DownloadFileVersion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "ent", scope = UpdateFile.class)
    public JAXBElement<File> createUpdateFileEnt(File value) {
        return new JAXBElement<File>(_LogAuditEnt_QNAME, File.class, UpdateFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = UpdateFile.class)
    public JAXBElement<String> createUpdateFileSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, UpdateFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "UpdateFileResult", scope = UpdateFileResponse.class)
    public JAXBElement<File> createUpdateFileResponseUpdateFileResult(File value) {
        return new JAXBElement<File>(_UpdateFileResponseUpdateFileResult_QNAME, File.class, UpdateFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "ent", scope = DeleteFile.class)
    public JAXBElement<File> createDeleteFileEnt(File value) {
        return new JAXBElement<File>(_LogAuditEnt_QNAME, File.class, DeleteFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = DeleteFile.class)
    public JAXBElement<String> createDeleteFileSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, DeleteFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = ConvertToPDF.class)
    public JAXBElement<String> createConvertToPDFSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, ConvertToPDF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = ConvertToPDF.class)
    public JAXBElement<String> createConvertToPDFSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, ConvertToPDF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetFileFromCollection.class)
    public JAXBElement<String> createGetFileFromCollectionSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetFileFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sParentIdentifier", scope = GetFileFromCollection.class)
    public JAXBElement<String> createGetFileFromCollectionSParentIdentifier(String value) {
        return new JAXBElement<String>(_GetFileFromCollectionSParentIdentifier_QNAME, String.class, GetFileFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sParentCollectionIdentifier", scope = GetFileFromCollection.class)
    public JAXBElement<String> createGetFileFromCollectionSParentCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetFileFromCollectionSParentCollectionIdentifier_QNAME, String.class, GetFileFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sParentEntityType", scope = GetFileFromCollection.class)
    public JAXBElement<String> createGetFileFromCollectionSParentEntityType(String value) {
        return new JAXBElement<String>(_GetFileFromCollectionSParentEntityType_QNAME, String.class, GetFileFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetFileFromCollection.class)
    public JAXBElement<String> createGetFileFromCollectionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetFileFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetFileFromCollectionResult", scope = GetFileFromCollectionResponse.class)
    public JAXBElement<File> createGetFileFromCollectionResponseGetFileFromCollectionResult(File value) {
        return new JAXBElement<File>(_GetFileFromCollectionResponseGetFileFromCollectionResult_QNAME, File.class, GetFileFromCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "ent", scope = DownloadFileVersionByEntity.class)
    public JAXBElement<File> createDownloadFileVersionByEntityEnt(File value) {
        return new JAXBElement<File>(_LogAuditEnt_QNAME, File.class, DownloadFileVersionByEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileVersion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileVersion }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "version", scope = DownloadFileVersionByEntity.class)
    public JAXBElement<FileVersion> createDownloadFileVersionByEntityVersion(FileVersion value) {
        return new JAXBElement<FileVersion>(_DownloadFileVersionVersion_QNAME, FileVersion.class, DownloadFileVersionByEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = DownloadFileVersionByEntity.class)
    public JAXBElement<String> createDownloadFileVersionByEntitySToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, DownloadFileVersionByEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "ent", scope = DownloadFilePart.class)
    public JAXBElement<File> createDownloadFilePartEnt(File value) {
        return new JAXBElement<File>(_LogAuditEnt_QNAME, File.class, DownloadFilePart.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sPartDownloadToken", scope = DownloadFilePart.class)
    public JAXBElement<String> createDownloadFilePartSPartDownloadToken(String value) {
        return new JAXBElement<String>(_DownloadFilePartSPartDownloadToken_QNAME, String.class, DownloadFilePart.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileVersion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileVersion }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "fVersion", scope = DownloadFilePart.class)
    public JAXBElement<FileVersion> createDownloadFilePartFVersion(FileVersion value) {
        return new JAXBElement<FileVersion>(_DownloadFilePartFVersion_QNAME, FileVersion.class, DownloadFilePart.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = DownloadFilePart.class)
    public JAXBElement<String> createDownloadFilePartSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, DownloadFilePart.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilePart }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FilePart }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "DownloadFilePartResult", scope = DownloadFilePartResponse.class)
    public JAXBElement<FilePart> createDownloadFilePartResponseDownloadFilePartResult(FilePart value) {
        return new JAXBElement<FilePart>(_DownloadFilePartResponseDownloadFilePartResult_QNAME, FilePart.class, DownloadFilePartResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "entity", scope = GetLinkedEntities.class)
    public JAXBElement<Entity> createGetLinkedEntitiesEntity(Entity value) {
        return new JAXBElement<Entity>(_GetLinkedEntitiesEntity_QNAME, Entity.class, GetLinkedEntities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sRelEntity", scope = GetLinkedEntities.class)
    public JAXBElement<String> createGetLinkedEntitiesSRelEntity(String value) {
        return new JAXBElement<String>(_GetLinkedEntitiesSRelEntity_QNAME, String.class, GetLinkedEntities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetLinkedEntities.class)
    public JAXBElement<String> createGetLinkedEntitiesSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetLinkedEntities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetLinkedEntities.class)
    public JAXBElement<String> createGetLinkedEntitiesSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetLinkedEntities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetLinkedEntitiesResult", scope = GetLinkedEntitiesResponse.class)
    public JAXBElement<ArrayOfEntity> createGetLinkedEntitiesResponseGetLinkedEntitiesResult(ArrayOfEntity value) {
        return new JAXBElement<ArrayOfEntity>(_GetLinkedEntitiesResponseGetLinkedEntitiesResult_QNAME, ArrayOfEntity.class, GetLinkedEntitiesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "entity", scope = GetLinkedRelEntities.class)
    public JAXBElement<Entity> createGetLinkedRelEntitiesEntity(Entity value) {
        return new JAXBElement<Entity>(_GetLinkedEntitiesEntity_QNAME, Entity.class, GetLinkedRelEntities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oRelEntity", scope = GetLinkedRelEntities.class)
    public JAXBElement<Entity> createGetLinkedRelEntitiesORelEntity(Entity value) {
        return new JAXBElement<Entity>(_GetLinkedRelEntitiesWithRelationTypeFilterORelEntity_QNAME, Entity.class, GetLinkedRelEntities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetLinkedRelEntities.class)
    public JAXBElement<String> createGetLinkedRelEntitiesSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetLinkedRelEntities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetLinkedRelEntities.class)
    public JAXBElement<String> createGetLinkedRelEntitiesSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetLinkedRelEntities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetLinkedRelEntitiesResult", scope = GetLinkedRelEntitiesResponse.class)
    public JAXBElement<ArrayOfEntity> createGetLinkedRelEntitiesResponseGetLinkedRelEntitiesResult(ArrayOfEntity value) {
        return new JAXBElement<ArrayOfEntity>(_GetLinkedRelEntitiesResponseGetLinkedRelEntitiesResult_QNAME, ArrayOfEntity.class, GetLinkedRelEntitiesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "ent", scope = Insert.class)
    public JAXBElement<Entity> createInsertEnt(Entity value) {
        return new JAXBElement<Entity>(_LogAuditEnt_QNAME, Entity.class, Insert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = Insert.class)
    public JAXBElement<String> createInsertSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, Insert.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "InsertResult", scope = InsertResponse.class)
    public JAXBElement<Entity> createInsertResponseInsertResult(Entity value) {
        return new JAXBElement<Entity>(_InsertResponseInsertResult_QNAME, Entity.class, InsertResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "ent", scope = InsertFile.class)
    public JAXBElement<File> createInsertFileEnt(File value) {
        return new JAXBElement<File>(_LogAuditEnt_QNAME, File.class, InsertFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = InsertFile.class)
    public JAXBElement<String> createInsertFileSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, InsertFile.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link File }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "InsertFileResult", scope = InsertFileResponse.class)
    public JAXBElement<File> createInsertFileResponseInsertFileResult(File value) {
        return new JAXBElement<File>(_InsertFileResponseInsertFileResult_QNAME, File.class, InsertFileResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "ent", scope = Update.class)
    public JAXBElement<Entity> createUpdateEnt(Entity value) {
        return new JAXBElement<Entity>(_LogAuditEnt_QNAME, Entity.class, Update.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = Update.class)
    public JAXBElement<String> createUpdateSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, Update.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "UpdateResult", scope = UpdateResponse.class)
    public JAXBElement<Entity> createUpdateResponseUpdateResult(Entity value) {
        return new JAXBElement<Entity>(_UpdateResponseUpdateResult_QNAME, Entity.class, UpdateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "entities", scope = UpdateEntities.class)
    public JAXBElement<ArrayOfEntity> createUpdateEntitiesEntities(ArrayOfEntity value) {
        return new JAXBElement<ArrayOfEntity>(_UpdateEntitiesEntities_QNAME, ArrayOfEntity.class, UpdateEntities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = UpdateEntities.class)
    public JAXBElement<String> createUpdateEntitiesSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, UpdateEntities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "UpdateEntitiesResult", scope = UpdateEntitiesResponse.class)
    public JAXBElement<ArrayOfEntity> createUpdateEntitiesResponseUpdateEntitiesResult(ArrayOfEntity value) {
        return new JAXBElement<ArrayOfEntity>(_UpdateEntitiesResponseUpdateEntitiesResult_QNAME, ArrayOfEntity.class, UpdateEntitiesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "ent", scope = Delete.class)
    public JAXBElement<Entity> createDeleteEnt(Entity value) {
        return new JAXBElement<Entity>(_LogAuditEnt_QNAME, Entity.class, Delete.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = Delete.class)
    public JAXBElement<String> createDeleteSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, Delete.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "ent1", scope = LinkEntity.class)
    public JAXBElement<Entity> createLinkEntityEnt1(Entity value) {
        return new JAXBElement<Entity>(_LinkEntityWithRoleEnt1_QNAME, Entity.class, LinkEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "ent2", scope = LinkEntity.class)
    public JAXBElement<Entity> createLinkEntityEnt2(Entity value) {
        return new JAXBElement<Entity>(_LinkEntityWithRoleEnt2_QNAME, Entity.class, LinkEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = LinkEntity.class)
    public JAXBElement<String> createLinkEntitySToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, LinkEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "ent1", scope = UnlinkEntity.class)
    public JAXBElement<Entity> createUnlinkEntityEnt1(Entity value) {
        return new JAXBElement<Entity>(_LinkEntityWithRoleEnt1_QNAME, Entity.class, UnlinkEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "ent2", scope = UnlinkEntity.class)
    public JAXBElement<Entity> createUnlinkEntityEnt2(Entity value) {
        return new JAXBElement<Entity>(_LinkEntityWithRoleEnt2_QNAME, Entity.class, UnlinkEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = UnlinkEntity.class)
    public JAXBElement<String> createUnlinkEntitySToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, UnlinkEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "ent", scope = LinkEntities.class)
    public JAXBElement<Entity> createLinkEntitiesEnt(Entity value) {
        return new JAXBElement<Entity>(_LogAuditEnt_QNAME, Entity.class, LinkEntities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "entities", scope = LinkEntities.class)
    public JAXBElement<ArrayOfEntity> createLinkEntitiesEntities(ArrayOfEntity value) {
        return new JAXBElement<ArrayOfEntity>(_UpdateEntitiesEntities_QNAME, ArrayOfEntity.class, LinkEntities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = LinkEntities.class)
    public JAXBElement<String> createLinkEntitiesSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, LinkEntities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "ent", scope = UnlinkEntities.class)
    public JAXBElement<Entity> createUnlinkEntitiesEnt(Entity value) {
        return new JAXBElement<Entity>(_LogAuditEnt_QNAME, Entity.class, UnlinkEntities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "entities", scope = UnlinkEntities.class)
    public JAXBElement<ArrayOfEntity> createUnlinkEntitiesEntities(ArrayOfEntity value) {
        return new JAXBElement<ArrayOfEntity>(_UpdateEntitiesEntities_QNAME, ArrayOfEntity.class, UnlinkEntities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = UnlinkEntities.class)
    public JAXBElement<String> createUnlinkEntitiesSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, UnlinkEntities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "entities", scope = InsertEntities.class)
    public JAXBElement<ArrayOfEntity> createInsertEntitiesEntities(ArrayOfEntity value) {
        return new JAXBElement<ArrayOfEntity>(_UpdateEntitiesEntities_QNAME, ArrayOfEntity.class, InsertEntities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = InsertEntities.class)
    public JAXBElement<String> createInsertEntitiesSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, InsertEntities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "InsertEntitiesResult", scope = InsertEntitiesResponse.class)
    public JAXBElement<ArrayOfEntity> createInsertEntitiesResponseInsertEntitiesResult(ArrayOfEntity value) {
        return new JAXBElement<ArrayOfEntity>(_InsertEntitiesResponseInsertEntitiesResult_QNAME, ArrayOfEntity.class, InsertEntitiesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "entities", scope = DeleteEntities.class)
    public JAXBElement<ArrayOfEntity> createDeleteEntitiesEntities(ArrayOfEntity value) {
        return new JAXBElement<ArrayOfEntity>(_UpdateEntitiesEntities_QNAME, ArrayOfEntity.class, DeleteEntities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = DeleteEntities.class)
    public JAXBElement<String> createDeleteEntitiesSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, DeleteEntities.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "ent", scope = CheckIn.class)
    public JAXBElement<Entity> createCheckInEnt(Entity value) {
        return new JAXBElement<Entity>(_LogAuditEnt_QNAME, Entity.class, CheckIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = CheckIn.class)
    public JAXBElement<String> createCheckInSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, CheckIn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "CheckInResult", scope = CheckInResponse.class)
    public JAXBElement<Entity> createCheckInResponseCheckInResult(Entity value) {
        return new JAXBElement<Entity>(_CheckInResponseCheckInResult_QNAME, Entity.class, CheckInResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "ent", scope = CheckOut.class)
    public JAXBElement<Entity> createCheckOutEnt(Entity value) {
        return new JAXBElement<Entity>(_LogAuditEnt_QNAME, Entity.class, CheckOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = CheckOut.class)
    public JAXBElement<String> createCheckOutSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, CheckOut.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "CheckOutResult", scope = CheckOutResponse.class)
    public JAXBElement<Entity> createCheckOutResponseCheckOutResult(Entity value) {
        return new JAXBElement<Entity>(_CheckOutResponseCheckOutResult_QNAME, Entity.class, CheckOutResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sSystemId", scope = GetToken.class)
    public JAXBElement<String> createGetTokenSSystemId(String value) {
        return new JAXBElement<String>(_GetTokenSSystemId_QNAME, String.class, GetToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sSystemPwd", scope = GetToken.class)
    public JAXBElement<String> createGetTokenSSystemPwd(String value) {
        return new JAXBElement<String>(_GetTokenSSystemPwd_QNAME, String.class, GetToken.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetTokenResult", scope = GetTokenResponse.class)
    public JAXBElement<String> createGetTokenResponseGetTokenResult(String value) {
        return new JAXBElement<String>(_GetTokenResponseGetTokenResult_QNAME, String.class, GetTokenResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sEntityType", scope = GetCollectionIdentifiers.class)
    public JAXBElement<String> createGetCollectionIdentifiersSEntityType(String value) {
        return new JAXBElement<String>(_GetCollectionIdentifiersSEntityType_QNAME, String.class, GetCollectionIdentifiers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetCollectionIdentifiers.class)
    public JAXBElement<String> createGetCollectionIdentifiersSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetCollectionIdentifiers.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCollectionIdentifiersResponse.GetCollectionIdentifiersResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCollectionIdentifiersResponse.GetCollectionIdentifiersResult }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetCollectionIdentifiersResult", scope = GetCollectionIdentifiersResponse.class)
    public JAXBElement<GetCollectionIdentifiersResponse.GetCollectionIdentifiersResult> createGetCollectionIdentifiersResponseGetCollectionIdentifiersResult(GetCollectionIdentifiersResponse.GetCollectionIdentifiersResult value) {
        return new JAXBElement<GetCollectionIdentifiersResponse.GetCollectionIdentifiersResult>(_GetCollectionIdentifiersResponseGetCollectionIdentifiersResult_QNAME, GetCollectionIdentifiersResponse.GetCollectionIdentifiersResult.class, GetCollectionIdentifiersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "ent", scope = GetPossibleTableValues.class)
    public JAXBElement<Entity> createGetPossibleTableValuesEnt(Entity value) {
        return new JAXBElement<Entity>(_LogAuditEnt_QNAME, Entity.class, GetPossibleTableValues.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sPropertyName", scope = GetPossibleTableValues.class)
    public JAXBElement<String> createGetPossibleTableValuesSPropertyName(String value) {
        return new JAXBElement<String>(_GetPossibleTableValuesSPropertyName_QNAME, String.class, GetPossibleTableValues.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sStartsWith", scope = GetPossibleTableValues.class)
    public JAXBElement<String> createGetPossibleTableValuesSStartsWith(String value) {
        return new JAXBElement<String>(_GetPossibleTableValuesSStartsWith_QNAME, String.class, GetPossibleTableValues.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "lstUpperLevelValues", scope = GetPossibleTableValues.class)
    public JAXBElement<ArrayOfstring> createGetPossibleTableValuesLstUpperLevelValues(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetPossibleTableValuesLstUpperLevelValues_QNAME, ArrayOfstring.class, GetPossibleTableValues.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetPossibleTableValues.class)
    public JAXBElement<String> createGetPossibleTableValuesSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetPossibleTableValues.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetPossibleTableValuesResult", scope = GetPossibleTableValuesResponse.class)
    public JAXBElement<ArrayOfKeyValueOfstringstring> createGetPossibleTableValuesResponseGetPossibleTableValuesResult(ArrayOfKeyValueOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValueOfstringstring>(_GetPossibleTableValuesResponseGetPossibleTableValuesResult_QNAME, ArrayOfKeyValueOfstringstring.class, GetPossibleTableValuesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oEntity1", scope = LinkEntityWithRelationType.class)
    public JAXBElement<Entity> createLinkEntityWithRelationTypeOEntity1(Entity value) {
        return new JAXBElement<Entity>(_LinkEntityWithRelationTypeOEntity1_QNAME, Entity.class, LinkEntityWithRelationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oEntity2", scope = LinkEntityWithRelationType.class)
    public JAXBElement<Entity> createLinkEntityWithRelationTypeOEntity2(Entity value) {
        return new JAXBElement<Entity>(_LinkEntityWithRelationTypeOEntity2_QNAME, Entity.class, LinkEntityWithRelationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = LinkEntityWithRelationType.class)
    public JAXBElement<String> createLinkEntityWithRelationTypeSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, LinkEntityWithRelationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oEntity1", scope = UnlinkEntityWithRelationType.class)
    public JAXBElement<Entity> createUnlinkEntityWithRelationTypeOEntity1(Entity value) {
        return new JAXBElement<Entity>(_LinkEntityWithRelationTypeOEntity1_QNAME, Entity.class, UnlinkEntityWithRelationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oEntity2", scope = UnlinkEntityWithRelationType.class)
    public JAXBElement<Entity> createUnlinkEntityWithRelationTypeOEntity2(Entity value) {
        return new JAXBElement<Entity>(_LinkEntityWithRelationTypeOEntity2_QNAME, Entity.class, UnlinkEntityWithRelationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = UnlinkEntityWithRelationType.class)
    public JAXBElement<String> createUnlinkEntityWithRelationTypeSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, UnlinkEntityWithRelationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oEntity", scope = LinkEntityViaRelatedEntity.class)
    public JAXBElement<Entity> createLinkEntityViaRelatedEntityOEntity(Entity value) {
        return new JAXBElement<Entity>(_GetLinkedRelEntitiesWithRelationTypeFilterOEntity_QNAME, Entity.class, LinkEntityViaRelatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oContactEntity", scope = LinkEntityViaRelatedEntity.class)
    public JAXBElement<Entity> createLinkEntityViaRelatedEntityOContactEntity(Entity value) {
        return new JAXBElement<Entity>(_LinkEntityViaRelatedEntityOContactEntity_QNAME, Entity.class, LinkEntityViaRelatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oAddressEntity", scope = LinkEntityViaRelatedEntity.class)
    public JAXBElement<Entity> createLinkEntityViaRelatedEntityOAddressEntity(Entity value) {
        return new JAXBElement<Entity>(_LinkEntityViaRelatedEntityOAddressEntity_QNAME, Entity.class, LinkEntityViaRelatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = LinkEntityViaRelatedEntity.class)
    public JAXBElement<String> createLinkEntityViaRelatedEntitySToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, LinkEntityViaRelatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oEntity", scope = UnlinkEntityViaRelatedEntity.class)
    public JAXBElement<Entity> createUnlinkEntityViaRelatedEntityOEntity(Entity value) {
        return new JAXBElement<Entity>(_GetLinkedRelEntitiesWithRelationTypeFilterOEntity_QNAME, Entity.class, UnlinkEntityViaRelatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oContactEntity", scope = UnlinkEntityViaRelatedEntity.class)
    public JAXBElement<Entity> createUnlinkEntityViaRelatedEntityOContactEntity(Entity value) {
        return new JAXBElement<Entity>(_LinkEntityViaRelatedEntityOContactEntity_QNAME, Entity.class, UnlinkEntityViaRelatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oAddressEntity", scope = UnlinkEntityViaRelatedEntity.class)
    public JAXBElement<Entity> createUnlinkEntityViaRelatedEntityOAddressEntity(Entity value) {
        return new JAXBElement<Entity>(_LinkEntityViaRelatedEntityOAddressEntity_QNAME, Entity.class, UnlinkEntityViaRelatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = UnlinkEntityViaRelatedEntity.class)
    public JAXBElement<String> createUnlinkEntityViaRelatedEntitySToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, UnlinkEntityViaRelatedEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oEntity", scope = GetLinkedEntitiesWithRelationType.class)
    public JAXBElement<Entity> createGetLinkedEntitiesWithRelationTypeOEntity(Entity value) {
        return new JAXBElement<Entity>(_GetLinkedRelEntitiesWithRelationTypeFilterOEntity_QNAME, Entity.class, GetLinkedEntitiesWithRelationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sRelEntity", scope = GetLinkedEntitiesWithRelationType.class)
    public JAXBElement<String> createGetLinkedEntitiesWithRelationTypeSRelEntity(String value) {
        return new JAXBElement<String>(_GetLinkedEntitiesSRelEntity_QNAME, String.class, GetLinkedEntitiesWithRelationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetLinkedEntitiesWithRelationType.class)
    public JAXBElement<String> createGetLinkedEntitiesWithRelationTypeSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetLinkedEntitiesWithRelationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetLinkedEntitiesWithRelationType.class)
    public JAXBElement<String> createGetLinkedEntitiesWithRelationTypeSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetLinkedEntitiesWithRelationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetLinkedEntitiesWithRelationTypeResult", scope = GetLinkedEntitiesWithRelationTypeResponse.class)
    public JAXBElement<ArrayOfEntity> createGetLinkedEntitiesWithRelationTypeResponseGetLinkedEntitiesWithRelationTypeResult(ArrayOfEntity value) {
        return new JAXBElement<ArrayOfEntity>(_GetLinkedEntitiesWithRelationTypeResponseGetLinkedEntitiesWithRelationTypeResult_QNAME, ArrayOfEntity.class, GetLinkedEntitiesWithRelationTypeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oEntity", scope = GetLinkedRelEntitiesWithRelationType.class)
    public JAXBElement<Entity> createGetLinkedRelEntitiesWithRelationTypeOEntity(Entity value) {
        return new JAXBElement<Entity>(_GetLinkedRelEntitiesWithRelationTypeFilterOEntity_QNAME, Entity.class, GetLinkedRelEntitiesWithRelationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oRelEntity", scope = GetLinkedRelEntitiesWithRelationType.class)
    public JAXBElement<Entity> createGetLinkedRelEntitiesWithRelationTypeORelEntity(Entity value) {
        return new JAXBElement<Entity>(_GetLinkedRelEntitiesWithRelationTypeFilterORelEntity_QNAME, Entity.class, GetLinkedRelEntitiesWithRelationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetLinkedRelEntitiesWithRelationType.class)
    public JAXBElement<String> createGetLinkedRelEntitiesWithRelationTypeSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetLinkedRelEntitiesWithRelationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetLinkedRelEntitiesWithRelationType.class)
    public JAXBElement<String> createGetLinkedRelEntitiesWithRelationTypeSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetLinkedRelEntitiesWithRelationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetLinkedRelEntitiesWithRelationTypeResult", scope = GetLinkedRelEntitiesWithRelationTypeResponse.class)
    public JAXBElement<ArrayOfEntity> createGetLinkedRelEntitiesWithRelationTypeResponseGetLinkedRelEntitiesWithRelationTypeResult(ArrayOfEntity value) {
        return new JAXBElement<ArrayOfEntity>(_GetLinkedRelEntitiesWithRelationTypeResponseGetLinkedRelEntitiesWithRelationTypeResult_QNAME, ArrayOfEntity.class, GetLinkedRelEntitiesWithRelationTypeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetMailingCode.class)
    public JAXBElement<String> createGetMailingCodeSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetMailingCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetMailingCode.class)
    public JAXBElement<String> createGetMailingCodeSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetMailingCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailingCode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MailingCode }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetMailingCodeResult", scope = GetMailingCodeResponse.class)
    public JAXBElement<MailingCode> createGetMailingCodeResponseGetMailingCodeResult(MailingCode value) {
        return new JAXBElement<MailingCode>(_GetMailingCodeResponseGetMailingCodeResult_QNAME, MailingCode.class, GetMailingCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetMeeting.class)
    public JAXBElement<String> createGetMeetingSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetMeeting.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetMeeting.class)
    public JAXBElement<String> createGetMeetingSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetMeeting.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Meeting }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Meeting }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetMeetingResult", scope = GetMeetingResponse.class)
    public JAXBElement<Meeting> createGetMeetingResponseGetMeetingResult(Meeting value) {
        return new JAXBElement<Meeting>(_GetMeetingResponseGetMeetingResult_QNAME, Meeting.class, GetMeetingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetMeetingFromCollection.class)
    public JAXBElement<String> createGetMeetingFromCollectionSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetMeetingFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetMeetingFromCollection.class)
    public JAXBElement<String> createGetMeetingFromCollectionSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetMeetingFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetMeetingFromCollection.class)
    public JAXBElement<String> createGetMeetingFromCollectionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetMeetingFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Meeting }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Meeting }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetMeetingFromCollectionResult", scope = GetMeetingFromCollectionResponse.class)
    public JAXBElement<Meeting> createGetMeetingFromCollectionResponseGetMeetingFromCollectionResult(Meeting value) {
        return new JAXBElement<Meeting>(_GetMeetingFromCollectionResponseGetMeetingFromCollectionResult_QNAME, Meeting.class, GetMeetingFromCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "saIdentifiers", scope = GetMeetings.class)
    public JAXBElement<ArrayOfstring> createGetMeetingsSaIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCaseDocumentsSaIdentifiers_QNAME, ArrayOfstring.class, GetMeetings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "saCollectionIdentifiers", scope = GetMeetings.class)
    public JAXBElement<ArrayOfstring> createGetMeetingsSaCollectionIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCaseDocumentsSaCollectionIdentifiers_QNAME, ArrayOfstring.class, GetMeetings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetMeetings.class)
    public JAXBElement<String> createGetMeetingsSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetMeetings.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMeeting }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfMeeting }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetMeetingsResult", scope = GetMeetingsResponse.class)
    public JAXBElement<ArrayOfMeeting> createGetMeetingsResponseGetMeetingsResult(ArrayOfMeeting value) {
        return new JAXBElement<ArrayOfMeeting>(_GetMeetingsResponseGetMeetingsResult_QNAME, ArrayOfMeeting.class, GetMeetingsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetMeetingsFromCollection.class)
    public JAXBElement<String> createGetMeetingsFromCollectionSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetMeetingsFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "filter", scope = GetMeetingsFromCollection.class)
    public JAXBElement<Filter> createGetMeetingsFromCollectionFilter(Filter value) {
        return new JAXBElement<Filter>(_GetTasksByCategoryFilter_QNAME, Filter.class, GetMeetingsFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetMeetingsFromCollection.class)
    public JAXBElement<String> createGetMeetingsFromCollectionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetMeetingsFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMeeting }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfMeeting }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetMeetingsFromCollectionResult", scope = GetMeetingsFromCollectionResponse.class)
    public JAXBElement<ArrayOfMeeting> createGetMeetingsFromCollectionResponseGetMeetingsFromCollectionResult(ArrayOfMeeting value) {
        return new JAXBElement<ArrayOfMeeting>(_GetMeetingsFromCollectionResponseGetMeetingsFromCollectionResult_QNAME, ArrayOfMeeting.class, GetMeetingsFromCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetTopic.class)
    public JAXBElement<String> createGetTopicSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetTopic.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetTopic.class)
    public JAXBElement<String> createGetTopicSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetTopic.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Topic }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Topic }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetTopicResult", scope = GetTopicResponse.class)
    public JAXBElement<Topic> createGetTopicResponseGetTopicResult(Topic value) {
        return new JAXBElement<Topic>(_GetTopicResponseGetTopicResult_QNAME, Topic.class, GetTopicResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sIdentifier", scope = GetTopicFromCollection.class)
    public JAXBElement<String> createGetTopicFromCollectionSIdentifier(String value) {
        return new JAXBElement<String>(_GetTaskSIdentifier_QNAME, String.class, GetTopicFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetTopicFromCollection.class)
    public JAXBElement<String> createGetTopicFromCollectionSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetTopicFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetTopicFromCollection.class)
    public JAXBElement<String> createGetTopicFromCollectionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetTopicFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Topic }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Topic }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetTopicFromCollectionResult", scope = GetTopicFromCollectionResponse.class)
    public JAXBElement<Topic> createGetTopicFromCollectionResponseGetTopicFromCollectionResult(Topic value) {
        return new JAXBElement<Topic>(_GetTopicFromCollectionResponseGetTopicFromCollectionResult_QNAME, Topic.class, GetTopicFromCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "saIdentifiers", scope = GetTopics.class)
    public JAXBElement<ArrayOfstring> createGetTopicsSaIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCaseDocumentsSaIdentifiers_QNAME, ArrayOfstring.class, GetTopics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "saCollectionIdentifiers", scope = GetTopics.class)
    public JAXBElement<ArrayOfstring> createGetTopicsSaCollectionIdentifiers(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_GetCaseDocumentsSaCollectionIdentifiers_QNAME, ArrayOfstring.class, GetTopics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetTopics.class)
    public JAXBElement<String> createGetTopicsSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetTopics.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTopic }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTopic }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetTopicsResult", scope = GetTopicsResponse.class)
    public JAXBElement<ArrayOfTopic> createGetTopicsResponseGetTopicsResult(ArrayOfTopic value) {
        return new JAXBElement<ArrayOfTopic>(_GetTopicsResponseGetTopicsResult_QNAME, ArrayOfTopic.class, GetTopicsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetTopicsFromCollection.class)
    public JAXBElement<String> createGetTopicsFromCollectionSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetTopicsFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "filter", scope = GetTopicsFromCollection.class)
    public JAXBElement<Filter> createGetTopicsFromCollectionFilter(Filter value) {
        return new JAXBElement<Filter>(_GetTasksByCategoryFilter_QNAME, Filter.class, GetTopicsFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetTopicsFromCollection.class)
    public JAXBElement<String> createGetTopicsFromCollectionSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetTopicsFromCollection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTopic }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTopic }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetTopicsFromCollectionResult", scope = GetTopicsFromCollectionResponse.class)
    public JAXBElement<ArrayOfTopic> createGetTopicsFromCollectionResponseGetTopicsFromCollectionResult(ArrayOfTopic value) {
        return new JAXBElement<ArrayOfTopic>(_GetTopicsFromCollectionResponseGetTopicsFromCollectionResult_QNAME, ArrayOfTopic.class, GetTopicsFromCollectionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oEntity", scope = GetLinkedRelEntitiesWithFilter.class)
    public JAXBElement<Entity> createGetLinkedRelEntitiesWithFilterOEntity(Entity value) {
        return new JAXBElement<Entity>(_GetLinkedRelEntitiesWithRelationTypeFilterOEntity_QNAME, Entity.class, GetLinkedRelEntitiesWithFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oRelEntity", scope = GetLinkedRelEntitiesWithFilter.class)
    public JAXBElement<Entity> createGetLinkedRelEntitiesWithFilterORelEntity(Entity value) {
        return new JAXBElement<Entity>(_GetLinkedRelEntitiesWithRelationTypeFilterORelEntity_QNAME, Entity.class, GetLinkedRelEntitiesWithFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetLinkedRelEntitiesWithFilter.class)
    public JAXBElement<String> createGetLinkedRelEntitiesWithFilterSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetLinkedRelEntitiesWithFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oFilter", scope = GetLinkedRelEntitiesWithFilter.class)
    public JAXBElement<Filter> createGetLinkedRelEntitiesWithFilterOFilter(Filter value) {
        return new JAXBElement<Filter>(_GetLinkedRelEntitiesWithRelationTypeFilterOFilter_QNAME, Filter.class, GetLinkedRelEntitiesWithFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetLinkedRelEntitiesWithFilter.class)
    public JAXBElement<String> createGetLinkedRelEntitiesWithFilterSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetLinkedRelEntitiesWithFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetLinkedRelEntitiesWithFilterResult", scope = GetLinkedRelEntitiesWithFilterResponse.class)
    public JAXBElement<ArrayOfEntity> createGetLinkedRelEntitiesWithFilterResponseGetLinkedRelEntitiesWithFilterResult(ArrayOfEntity value) {
        return new JAXBElement<ArrayOfEntity>(_GetLinkedRelEntitiesWithFilterResponseGetLinkedRelEntitiesWithFilterResult_QNAME, ArrayOfEntity.class, GetLinkedRelEntitiesWithFilterResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oEntity", scope = GetLinkedEntitiesWithFilter.class)
    public JAXBElement<Entity> createGetLinkedEntitiesWithFilterOEntity(Entity value) {
        return new JAXBElement<Entity>(_GetLinkedRelEntitiesWithRelationTypeFilterOEntity_QNAME, Entity.class, GetLinkedEntitiesWithFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sRelEntity", scope = GetLinkedEntitiesWithFilter.class)
    public JAXBElement<String> createGetLinkedEntitiesWithFilterSRelEntity(String value) {
        return new JAXBElement<String>(_GetLinkedEntitiesSRelEntity_QNAME, String.class, GetLinkedEntitiesWithFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetLinkedEntitiesWithFilter.class)
    public JAXBElement<String> createGetLinkedEntitiesWithFilterSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetLinkedEntitiesWithFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oFilter", scope = GetLinkedEntitiesWithFilter.class)
    public JAXBElement<Filter> createGetLinkedEntitiesWithFilterOFilter(Filter value) {
        return new JAXBElement<Filter>(_GetLinkedRelEntitiesWithRelationTypeFilterOFilter_QNAME, Filter.class, GetLinkedEntitiesWithFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetLinkedEntitiesWithFilter.class)
    public JAXBElement<String> createGetLinkedEntitiesWithFilterSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetLinkedEntitiesWithFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetLinkedEntitiesWithFilterResult", scope = GetLinkedEntitiesWithFilterResponse.class)
    public JAXBElement<ArrayOfEntity> createGetLinkedEntitiesWithFilterResponseGetLinkedEntitiesWithFilterResult(ArrayOfEntity value) {
        return new JAXBElement<ArrayOfEntity>(_GetLinkedEntitiesWithFilterResponseGetLinkedEntitiesWithFilterResult_QNAME, ArrayOfEntity.class, GetLinkedEntitiesWithFilterResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oEntity", scope = GetLinkedEntitiesWithRelationTypeFilter.class)
    public JAXBElement<Entity> createGetLinkedEntitiesWithRelationTypeFilterOEntity(Entity value) {
        return new JAXBElement<Entity>(_GetLinkedRelEntitiesWithRelationTypeFilterOEntity_QNAME, Entity.class, GetLinkedEntitiesWithRelationTypeFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sRelEntity", scope = GetLinkedEntitiesWithRelationTypeFilter.class)
    public JAXBElement<String> createGetLinkedEntitiesWithRelationTypeFilterSRelEntity(String value) {
        return new JAXBElement<String>(_GetLinkedEntitiesSRelEntity_QNAME, String.class, GetLinkedEntitiesWithRelationTypeFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sCollectionIdentifier", scope = GetLinkedEntitiesWithRelationTypeFilter.class)
    public JAXBElement<String> createGetLinkedEntitiesWithRelationTypeFilterSCollectionIdentifier(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSCollectionIdentifier_QNAME, String.class, GetLinkedEntitiesWithRelationTypeFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Filter }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "oFilter", scope = GetLinkedEntitiesWithRelationTypeFilter.class)
    public JAXBElement<Filter> createGetLinkedEntitiesWithRelationTypeFilterOFilter(Filter value) {
        return new JAXBElement<Filter>(_GetLinkedRelEntitiesWithRelationTypeFilterOFilter_QNAME, Filter.class, GetLinkedEntitiesWithRelationTypeFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "sToken", scope = GetLinkedEntitiesWithRelationTypeFilter.class)
    public JAXBElement<String> createGetLinkedEntitiesWithRelationTypeFilterSToken(String value) {
        return new JAXBElement<String>(_GetLinkedRelEntitiesWithRelationTypeFilterSToken_QNAME, String.class, GetLinkedEntitiesWithRelationTypeFilter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEntity }{@code >}
     */
    @XmlElementDecl(namespace = "www.decos.com/services", name = "GetLinkedEntitiesWithRelationTypeFilterResult", scope = GetLinkedEntitiesWithRelationTypeFilterResponse.class)
    public JAXBElement<ArrayOfEntity> createGetLinkedEntitiesWithRelationTypeFilterResponseGetLinkedEntitiesWithRelationTypeFilterResult(ArrayOfEntity value) {
        return new JAXBElement<ArrayOfEntity>(_GetLinkedEntitiesWithRelationTypeFilterResponseGetLinkedEntitiesWithRelationTypeFilterResult_QNAME, ArrayOfEntity.class, GetLinkedEntitiesWithRelationTypeFilterResponse.class, value);
    }

}
