package Isamm;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/traitementMsg2")
public class traitementMsg2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public traitementMsg2() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		
		String username = request.getParameter("username");
		
		
		String value = request.getParameter("msg");
		
		String derniermsg=request.getParameter("derniermsg");
		
		
		
		
		
		
		if(derniermsg.compareTo(value)!=0)
		{
			Message nouveaumsg = new Message(username,value);
			GestionMessage.ajouterMessage(nouveaumsg);
		}
			
		
		
		
		
		
		
		getServletContext().getRequestDispatcher("/chat2.jsp").forward(request, response);
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		doGet(request, response);
	}

}
