/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

import Model.Worker;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;

/**
 *
 * @author Sakshi Sinha
 */
public class WorkerConverter 
{
public static DBObject toDBObject(Worker w) 
 {

		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start();
		builder.append("WID",w.getWID());
		return builder.get();
 }
 public static Worker toWorker(DBObject doc)throws NullPointerException
 {
	        Worker w=new Worker();
                w.setWID((String)doc.get("WID"));
		return w;
}      
}
