package ServletAPIs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;  
import java.util.Date;  
import DAO.TaskDAO;
import Model.Task;
import java.io.PrintWriter;

public class AllocateTask extends HttpServlet 
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String TID = request.getParameter("TID");
		String WID = request.getParameter("WID");
                String DDate = request.getParameter("DDate");
		if((TID.isEmpty()))
		{
			RequestDispatcher rd = request.getRequestDispatcher("AddAsset.jsp");
			out.println("<font color=red>Please fill all the fields</font>");
			rd.include(request, response);
		}
		else
		{
                        TaskDAO tsk=new TaskDAO();
                        Task t=new Task();
                        t.setTID(TID);
                        t.setWID(WID);
                        String pattern = "dd-MM-yyyy";
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
                        String date = simpleDateFormat.format(new Date());
                        System.out.println(date);
                        t.setDate(date);
                        t.setDDate(DDate);
                        tsk.updateTask(t);
                        out.println("Task Added Successfully");
                        out.print("<table border='1' width='100%'");
                        {
                        out.print("<tr><td>"+t.getTID()+"</td><td>"+t.getWID()+"</td><td>"+t.getDate()+"</td></tr>"); 
                        }
                        out.print("</table>");   
			System.out.println("Asset Added Successfully");
		}
	}
    
    
}

