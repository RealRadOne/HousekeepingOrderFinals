package ServletAPIs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.AssetDAO;
import Model.Asset;
import java.io.PrintWriter;

public class AddAsset extends HttpServlet 
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String Name = request.getParameter("Name");
		String AID = request.getParameter("AID");
		if((Name.isEmpty()))
		{
			RequestDispatcher rd = request.getRequestDispatcher("AddAsset.jsp");
			out.println("<font color=red>Please fill all the fields</font>");
			rd.include(request, response);
		}
		else
		{
                        Asset a= new Asset();
			a.setName(Name);
			a.setAID(AID);
                        AssetDAO adao=new AssetDAO();
                        adao.createAsset(a);
                        out.println("<font color=red>Asset Created Sucessfully</font> with ID:"+a.getAID());
			System.out.println("Asset Added Successfully");
		}
	}
    
    
}

