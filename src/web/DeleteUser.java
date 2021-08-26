package web;

import service.UserService;
import service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/delete")
public class DeleteUser extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int uuid = Integer.parseInt(req.getParameter("uuid"));
        UserService userService = new UserServiceImpl();
        userService.deleteUser(uuid);
        req.getRequestDispatcher("UserList").forward(req,resp);
    }
}
