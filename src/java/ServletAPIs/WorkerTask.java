package ServletAPIs;
import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse; 
import Model.Task;
import DAO.TaskDAO;
 
public class WorkerTask extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {  
        response.setContentType("text/html");  
        String WID = request.getParameter("WID");
        PrintWriter out=response.getWriter();  
       // out.println("<a href='index.html'>Add New Employee</a>");  
        out.println("<h1>Task Assigned WorkerWise</h1>"); 
	TaskDAO wk=new TaskDAO();
        List<Task> list=wk.tWWise(WID);  
          
        out.print("<table border='1' width='100%'");  
        for(Task us:list)
        {  
                 out.print("<tr><td>"+us.getTID()+"</td><td>"+us.getWID()+"</td></tr>");   
        }  
        out.print("</table>");   
        out.close();  
    }  
}  