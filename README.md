===================================================================================================================================================
Backend Application:
Customer and Vendor separated.
Dao and implementation done on both vendor and customer and their respective address.
Testing yet to be done.

===================================================================================================================================================
FrontEnd Application:
Login page added.
vendor registration and login is on process.
===================================================================================================================================================
Error's:

*Error creating bean with name 'indexController': Unsatisfied dependency expressed through field 'vendorDao'; nested exception is org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'vendorDaoImpl': Unsatisfied dependency expressed through field 'sessionFactory'; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'getSessionFactory' defined in application.jconfig.model.HibernateConfiguration: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.hibernate.SessionFactory]: Factory method 'getSessionFactory' threw exception; nested exception is org.hibernate.AnnotationException: mappedBy reference an unknown target entity property: application.jconfig.model.CustomerAddress.user in application.jconfig.model.Customer.customerAddress at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:586)

solution:


*SEVERE: Servlet.service() for servlet [dispatcher] in context with path [/servletmvc] threw exception [Request processing failed; nested exception is org.springframework.transaction.TransactionSystemException: Could not commit Hibernate transaction; nested exception is org.hibernate.TransactionException: Transaction was marked for rollback only; cannot commit] with root cause
org.hibernate.TransactionException: Transaction was marked for rollback only; cannot commit
ERROR: line 1:1: unexpected token: form

solution:In this case there is an error 


*The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing).

In JSP im are trying to upload file along with form data so i need to have multipartResolver bean defined in spring context from common-fileupload.jar MultipartResolver Spring
