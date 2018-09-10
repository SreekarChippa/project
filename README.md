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