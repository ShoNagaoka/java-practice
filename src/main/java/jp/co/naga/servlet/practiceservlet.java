package jp.co.naga.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class practiceservlet extends HttpServlet {

	public void doGet(HttpServletRequest a_req,HttpServletResponse a_res) throws IOException,ServletException{
		doPost(a_req,a_res);
	}

	public void doPost(HttpServletRequest a_req,HttpServletResponse a_res) throws IOException,ServletException{

		String l_id = a_req.getParameter("id");
		String l_code = a_req.getParameter("code");
		String l_firstName = a_req.getParameter("firstName");
		String l_lastName = a_req.getParameter("lastName");
		String l_age = a_req.getParameter("age");
		String l_height = a_req.getParameter("height");
		String l_weight = a_req.getParameter("weight");


		String l_afterCode = practiceutil.changeCode(l_code);

		System.out.println(l_afterCode);
		a_res.setContentType("text/html;charset=UTF-8");
		a_res.setContentLength(1000);




		System.out.println("OK");


	}
}
