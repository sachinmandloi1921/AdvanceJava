package in.co.sachin;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;

@WebFilter("/app/*")
        public class Frontctl implements Filter {
 
      
     public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		
	HttpServletRequest request=(HttpServletRequest)req;
	HttpServletResponse response=(HttpServletResponse)res;
	
	HttpSession session=request.getSession();
	String id=(String) session.getAttribute("userid");
	
	if(id==null) {
		req.setAttribute("error","your session expired,please relogin! ");
		
		RequestDispatcher rd=req.getRequestDispatcher("loginview.jsp");
		rd.forward(request, response);
	}else {
	
	chain.doFilter(request, response);
	}
     }
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
  

}

