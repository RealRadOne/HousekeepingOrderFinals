/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Sakshi Sinha
 */
public class Task 
{
private String TID;
private String Name;
private String AID;
private String WID;
private String Date;
private String DDate;
//DDate denotes the deadline date for completion of task
 public String getTID()
 {
            return TID;
 }
 public void setTID(String TID)
 {
            this.TID=TID;
 }
public String getName() 
{
	    return Name;
}
public void setName(String Name) 
{
	    this.Name =Name;
} 
public String getWID()
 {
            return WID;
 }
 public void setWID(String WID)
 {
            this.WID=WID;
 }
 public String getDate()
{
            return Date;
}
public void setDate(String Date)
{
            this.Date=Date;
}
public String getAID()
 {
            return AID;
 }
 public void setAID(String AID)
 {
            this.AID=AID;
 }
  public String getDDate()
{
            return DDate;
}
public void setDDate(String DDate)
{
            this.DDate=DDate;
}
}
