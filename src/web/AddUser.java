package web;

import dao.User;
import service.UserService;
import service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/AddUser")
public class AddUser extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        String uname = req.getParameter("name");
        String ugender = req.getParameter("sex");
        int uage = Integer.parseInt(req.getParameter("age"));
        String uaddress = req.getParameter("address");
        String uqq = req.getParameter("qq");
        String uemail = req.getParameter("email");
        User user = new User(0,uname,ugender,uage,uaddress,uqq,uemail);
        UserService userService = new UserServiceImpl();
        userService.addUser(user);
        req.getRequestDispatcher("UserList").forward(req,resp);
    }
}
