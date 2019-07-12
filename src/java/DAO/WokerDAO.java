package DAO;

import Connect.Connection;
import Converter.WorkerConverter;
import Converter.TaskConverter;
import Model.Worker;
import Model.Task;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Sakshi Sinha
 */
public class WokerDAO 
{
private DBCollection col;
public WokerDAO()
        {
            Connection con=Connection.getConnection();
            this.col=con.mongo.getDB("Udaan").getCollection("Worker");
	}
        //Creating the DB Entry
        public Worker createWorker(Worker a) 
        {
		DBObject doc = WorkerConverter.toDBObject(a);
		this.col.insert(doc);
		String id = (String) doc.get("WID");
		a.setWID(id);
		return a;
	}
}
