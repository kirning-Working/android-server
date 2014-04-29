package com.kirning.post;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.kirning.android.data.User;
import com.kirning.util.HibernateUtil;

@WebServlet(name="login",urlPatterns={"/login"})
public class LoginPost extends HttpServlet{

	/**
	 * �û��ж��û���¼��
	 */
	private static final long serialVersionUID = 4711994278069142000L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		Session se = HibernateUtil.getSessionFactory().openSession();
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		se.beginTransaction();
		//TODOȱ�ٲ������
		
		
	}

	
	
	
}
