package in.co.sachin;


	import java.io.IOException;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	@WebServlet(urlPatterns = "/forgot")

	public class forgotcntrl extends HttpServlet {

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("doget");

		}

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			System.out.println("do post");
			String Email = req.getParameter("Email");
			String Password = req.getParameter("Password");
			
			
		}
}
