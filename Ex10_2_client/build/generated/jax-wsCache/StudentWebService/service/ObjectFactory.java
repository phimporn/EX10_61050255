
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _HeuristicMixedException_QNAME = new QName("http://services/", "HeuristicMixedException");
    private final static QName _UpdateResponse_QNAME = new QName("http://services/", "updateResponse");
    private final static QName _FindStudentById_QNAME = new QName("http://services/", "findStudentById");
    private final static QName _NotSupportedException_QNAME = new QName("http://services/", "NotSupportedException");
    private final static QName _HeuristicRollbackException_QNAME = new QName("http://services/", "HeuristicRollbackException");
    private final static QName _FindStudentByIdResponse_QNAME = new QName("http://services/", "findStudentByIdResponse");
    private final static QName _SystemException_QNAME = new QName("http://services/", "SystemException");
    private final static QName _DeleteResponse_QNAME = new QName("http://services/", "deleteResponse");
    private final static QName _Insert_QNAME = new QName("http://services/", "insert");
    private final static QName _Update_QNAME = new QName("http://services/", "update");
    private final static QName _InsertResponse_QNAME = new QName("http://services/", "insertResponse");
    private final static QName _RollbackException_QNAME = new QName("http://services/", "RollbackException");
    private final static QName _Delete_QNAME = new QName("http://services/", "delete");
    private final static QName _Student_QNAME = new QName("http://services/", "student");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link Insert }
     * 
     */
    public Insert createInsert() {
        return new Insert();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link RollbackException }
     * 
     */
    public RollbackException createRollbackException() {
        return new RollbackException();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link InsertResponse }
     * 
     */
    public InsertResponse createInsertResponse() {
        return new InsertResponse();
    }

    /**
     * Create an instance of {@link HeuristicRollbackException }
     * 
     */
    public HeuristicRollbackException createHeuristicRollbackException() {
        return new HeuristicRollbackException();
    }

    /**
     * Create an instance of {@link SystemException }
     * 
     */
    public SystemException createSystemException() {
        return new SystemException();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link FindStudentByIdResponse }
     * 
     */
    public FindStudentByIdResponse createFindStudentByIdResponse() {
        return new FindStudentByIdResponse();
    }

    /**
     * Create an instance of {@link HeuristicMixedException }
     * 
     */
    public HeuristicMixedException createHeuristicMixedException() {
        return new HeuristicMixedException();
    }

    /**
     * Create an instance of {@link NotSupportedException }
     * 
     */
    public NotSupportedException createNotSupportedException() {
        return new NotSupportedException();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link FindStudentById }
     * 
     */
    public FindStudentById createFindStudentById() {
        return new FindStudentById();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeuristicMixedException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "HeuristicMixedException")
    public JAXBElement<HeuristicMixedException> createHeuristicMixedException(HeuristicMixedException value) {
        return new JAXBElement<HeuristicMixedException>(_HeuristicMixedException_QNAME, HeuristicMixedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findStudentById")
    public JAXBElement<FindStudentById> createFindStudentById(FindStudentById value) {
        return new JAXBElement<FindStudentById>(_FindStudentById_QNAME, FindStudentById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotSupportedException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "NotSupportedException")
    public JAXBElement<NotSupportedException> createNotSupportedException(NotSupportedException value) {
        return new JAXBElement<NotSupportedException>(_NotSupportedException_QNAME, NotSupportedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeuristicRollbackException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "HeuristicRollbackException")
    public JAXBElement<HeuristicRollbackException> createHeuristicRollbackException(HeuristicRollbackException value) {
        return new JAXBElement<HeuristicRollbackException>(_HeuristicRollbackException_QNAME, HeuristicRollbackException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindStudentByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findStudentByIdResponse")
    public JAXBElement<FindStudentByIdResponse> createFindStudentByIdResponse(FindStudentByIdResponse value) {
        return new JAXBElement<FindStudentByIdResponse>(_FindStudentByIdResponse_QNAME, FindStudentByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "SystemException")
    public JAXBElement<SystemException> createSystemException(SystemException value) {
        return new JAXBElement<SystemException>(_SystemException_QNAME, SystemException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Insert }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "insert")
    public JAXBElement<Insert> createInsert(Insert value) {
        return new JAXBElement<Insert>(_Insert_QNAME, Insert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "insertResponse")
    public JAXBElement<InsertResponse> createInsertResponse(InsertResponse value) {
        return new JAXBElement<InsertResponse>(_InsertResponse_QNAME, InsertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RollbackException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "RollbackException")
    public JAXBElement<RollbackException> createRollbackException(RollbackException value) {
        return new JAXBElement<RollbackException>(_RollbackException_QNAME, RollbackException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Student }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "student")
    public JAXBElement<Student> createStudent(Student value) {
        return new JAXBElement<Student>(_Student_QNAME, Student.class, null, value);
    }

}
