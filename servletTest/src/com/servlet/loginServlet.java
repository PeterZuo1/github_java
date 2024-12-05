package com.servlet;

import com.Dao.impl.loginDaoImpl;
import com.Dao.loginDao;
import com.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 22044133 左立志
 * @data 2024/11/28 14:20
 */
@WebServlet("/login")
public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        loginDaoImpl loginDao = new loginDaoImpl();
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        boolean b = loginDao.login(user);
        if (b) {
            response.sendRedirect(request.getContextPath() + "/selectAll");
//            request.getRequestDispatcher("/selectAll");
        } else
            response.sendRedirect(request.getContextPath() + "");
    }
}
