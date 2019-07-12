Instructions to Execute the Project
Requirements-
1.A Java IDE
2.MongoDB
In Netbeans
3.This Uses the Glassfish server NetBeans Uses
1.File->Open Project->Select the project->Open Project->In Libraries add mongo-java-driver-3.5.0->Run
2.The JSON files may be exported for convenience however it is not necessary

Brief of project
1.Model-Consists of the entities modelled
2.Connection-Uses *singleton* design pattern to create a connection at a time
3.API-Servlets--Controllers
4.DAO-Consisting of all DB Operations as per the requiremennts
5.Converter-To convert Mongo DBObject to model object and vice-versa
6.A JSP-The view layer for the application
Design principles involved-Singleton And MVC
---------------------Author-SAKSHI SINHA----------------------------