Shooter is an email send service that provides:

1. RESTful and async API for adding emails to send;
2. Create multiple email campaigns for multi-type email sending;
3. Register layout templates for different campaigns;
4. Admin control.

To generate IDE project file:

	gradle idea
	gradle eclipse
	
To build:

	gradle assemble
	
To deploy, start your server and copy the war to deploy dir: 

	cp ./dist/shooter-$VERSION.war $CATALINA_HOME/webapps
	
Make query:

	curl http://localhost:8080/shooter/api/myresource
	
