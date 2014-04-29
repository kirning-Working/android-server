package com.kirning.post;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.kirning.android.data.User;


@WebServlet(name = "login", urlPatterns = { "/login" })
public class Post extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3378554176925057409L;

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String username = req.getParameter("username");
		String password = req.getParameter("password");
		// 载入设置
		Configuration configuration = new Configuration().configure();
		// 创建serviceRegistry
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();
		// 获取sessionFactory
		SessionFactory sessionFactory = configuration
				.buildSessionFactory(serviceRegistry);
		// 获取Session
		Session sa = sessionFactory.openSession();
		User lo = new User();
		lo.setUsername(username);
		lo.setPassword(password);
		
		sa.beginTransaction();
		sa.save(lo);
		sa.getTransaction().commit();
		
		sa.close();
		sessionFactory.close();

	}

}
