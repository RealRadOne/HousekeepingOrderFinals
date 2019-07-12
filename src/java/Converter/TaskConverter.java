/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;
import Model.Task;;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
/**
 *
 * @author Sakshi Sinha
 */
public class TaskConverter 
{
 public static DBObject toDBObject(Task w) 
 {

		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start();
		builder.append("WID",w.getWID());
                builder.append("TID",w.getTID());
                //builder.append("AID",w.getAID());
                builder.append("Date",w.getDate());
                builder.append("DDate",w.getDDate());
		return builder.get();
 }
 public static Task toTask(DBObject doc)throws NullPointerException
 {
	        Task w=new Task();
                w.setWID((String)doc.get("WID"));
                w.setTID((String)doc.get("TID"));
                //w.setAID((String)doc.get("AID"));
                w.setDate((String)doc.get("Date"));
                w.setDDate((String)doc.get("DDate"));
		return w;
}    
}
