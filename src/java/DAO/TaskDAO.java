/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Model.Task;
import Connect.Connection;
import Converter.TaskConverter;
import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sakshi Sinha
 */
public class TaskDAO 
{
 private DBCollection col;

	public TaskDAO()
        {
            Connection con=Connection.getConnection();
            this.col=con.mongo.getDB("Udaan").getCollection("Task");
	}
        //Creating the DB Entry
        public Task createTask(Task t) 
        {
		DBObject doc = TaskConverter.toDBObject(t);
		this.col.insert(doc);
		String id = (String) doc.get("TID");
		t.setTID(id);
		return t;
	} 
        //Updating the DB Entry
        public void updateTask(Task t) 
        {
		DBObject query = BasicDBObjectBuilder.start().append("TID",t.getTID()).get();
                this.col.update(query, TaskConverter.toDBObject(t));
	}
        public List<Task> tWWise(String WorkID)
        {
           List<Task> result=new ArrayList<Task>();
            try
            {
            BasicDBObject query = new BasicDBObject();
            query.put("WID",WorkID);
            DBCursor cursor = col.find(query);
		while (cursor.hasNext()) 
                {
			DBObject doc = cursor.next();
			Task t= TaskConverter.toTask(doc);
			result.add(t);
		}
            }
            catch(Exception e)
            {
                System.out.println("Just an error");
            }
            return(result); 
        }
}
