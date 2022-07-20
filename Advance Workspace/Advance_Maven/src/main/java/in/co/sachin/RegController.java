package in.co.sachin;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/reg")

public class RegController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doget");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("do post");

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String id=req.getParameter("id");
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String login = req.getParameter("login");
		String pwd = req.getParameter("pwd");
		String gender = req.getParameter("gender");
		String dob = req.getParameter("dob");
		String mob = req.getParameter("mob");

		Regbean bean = new Regbean();
        bean.setId(id);
		bean.setFirstName(fname);
		bean.setLastName(lname);
		bean.setLogin(login);
		bean.setPassword(pwd);
		bean.setGender(gender);
		try {
			bean.setDOB(sdf.parse(dob));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		bean.setMobileNo(mob);

		RegModel model = new RegModel();
		try {
			model.add(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
