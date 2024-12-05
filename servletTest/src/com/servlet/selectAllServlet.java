package com.servlet;

import com.Dao.impl.loginDaoImpl;
import com.Dao.impl.selectDaoImpl;
import com.Dao.selectDao;
import com.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * @author 22044133 左立志
 * @data 2024/11/28 15:18
 */
@WebServlet("/selectAll")
public class selectAllServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        selectDaoImpl selectDao = new selectDaoImpl();
        try {
            List<User> users = selectDao.selectAll();
            request.setAttribute("user1",users);
            request.getRequestDispatcher(request.getContextPath()+"/home.jsp").forward(request,response);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
