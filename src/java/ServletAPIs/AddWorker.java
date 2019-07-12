package ServletAPIs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.WokerDAO;
import Model.Worker;
import java.io.PrintWriter;
//API To Add Worker
public class AddWorker extends HttpServlet 
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String WID = request.getParameter("WID");
		if((WID.isEmpty()))
		{
			RequestDispatcher rd = request.getRequestDispatcher("AddWorker.jsp");
			out.println("<font color=red>Please fill all the fields</font>");
			rd.include(request, response);
		}
		else
		{
                        Worker w=new Worker();
                        w.setWID(WID);
                        WokerDAO adao=new WokerDAO();
                        adao.createWorker(w);
                        out.println("<font color=red>Worker Created Sucessfully</font> with ID:"+w.getWID());
			System.out.println("Asset Added Successfully");
		}
	}
    
    
}

