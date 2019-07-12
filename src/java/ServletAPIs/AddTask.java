package ServletAPIs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.TaskDAO;
import Model.Task;
import java.io.PrintWriter;
//API To Add Task
public class AddTask extends HttpServlet 
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String TID = request.getParameter("TID");
		if((TID.isEmpty()))
		{
			RequestDispatcher rd = request.getRequestDispatcher("AddTask.jsp");
			out.println("<font color=red>Please fill all the fields</font>");
			rd.include(request, response);
		}
		else
		{
                        Task t=new Task();
                        t.setTID(TID);
                        TaskDAO tk=new TaskDAO();
                        tk.createTask(t);
                        out.println("<font color=red>Task Created Sucessfully</font> with ID:"+t.getTID());
                        out.print("<a href='Admin.jsp'></a>");
			System.out.println("Asset Added Successfully");
		}
	}
    
    
}

