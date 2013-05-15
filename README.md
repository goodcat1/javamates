javamates
=========

  Javamates is prototype project for checking modern JEE technologies
in action. Javamates performes part of business logic - creating and showing 
a loan claim. User creates claim, user can view his claims. On creation of 
claim there is request to bank web-service client for defining user permission.
Event of successful creation sent to JMS Queue.

  Javamates uses: Struts2, jQuery, Twitter Bootstrap CSS library, EJB 3, JPA/Hibernate, JMS, Derby Db as database, Apache TomEE 1.5.2 Plus as application server.

  Javamates consists of modules:
* javamates-model: entities, DTOs, converters
* javamates-ejb: EJB, MDB
* javamates-ejb-client: client interfaces to EJB
* javamates-ejb-tests: junit tests for EJBs, performed in embedded JEE container
* javamates: main web application
* bank-service-mock: mock of bank web-service
* bank-service-mockClient: client of bank web-service
