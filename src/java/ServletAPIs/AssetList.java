package ServletAPIs;
import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse; 
import Model.Asset;
import DAO.AssetDAO;
//API TO List Out All Asset
public class AssetList extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
       // out.println("<a href='index.html'>Add New Employee</a>");  
        out.println("<h1>Asset List</h1>"); 
	AssetDAO userDAO = new AssetDAO();
        List<Asset> list=userDAO.readAllAssets();  
          
        out.print("<table border='1' width='100%'");  
        for(Asset us:list)
        {  
                 out.print("<tr><td>"+us.getAID()+"</td><td>"+us.getName()+"</td></tr>");   
        }  
        out.print("</table>");   
        out.close();  
    }  
}  