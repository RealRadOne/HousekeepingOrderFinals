/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connect.Connection;
import Converter.AssetConverter;
import Model.Asset;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sakshi Sinha
 */
public class AssetDAO 
{
private DBCollection col;
public AssetDAO()
        {
            Connection con=Connection.getConnection();
            this.col=con.mongo.getDB("Udaan").getCollection("Asset");
	}
        //Creating the DB Entry
        public Asset createAsset(Asset a) 
        {
		DBObject doc = AssetConverter.toDBObject(a);
		this.col.insert(doc);
		String id = (String) doc.get("AID");
		a.setAID(id);
		return a;
	}  
        public List<Asset> readAllAssets() 
        {
		List<Asset> data = new ArrayList<Asset>();
		DBCursor cursor = col.find();
		while (cursor.hasNext()) 
                {
			DBObject doc = cursor.next();
			Asset a= AssetConverter.toAsset(doc);
			data.add(a);
		}
		return data;
	}
}
