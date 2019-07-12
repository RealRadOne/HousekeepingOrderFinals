/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;
import Model.*;
import org.bson.types.ObjectId;
import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
/**
 *
 * @author Sakshi Sinha
 */
public class AssetConverter 
{
  public static DBObject toDBObject(Asset a) 
 {

		BasicDBObjectBuilder builder = BasicDBObjectBuilder.start();
		builder.append("AID",a.getAID());
                builder.append("Name",a.getName());
		return builder.get();
 }
 public static Asset toAsset(DBObject doc)throws NullPointerException
 {
		Asset a =new Asset();
		a.setName((String) doc.get("Name"));
                a.setAID((String)doc.get("AID"));
		return a;
}  
}
