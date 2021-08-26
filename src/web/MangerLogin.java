package web;

import dao.Manger;
import service.MangerService;
import service.MangerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/login")
public class MangerLogin extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        String MName = req.getParameter("user");
        String MPassword = req.getParameter("password");
        String YZM = req.getParameter("verifycode");
        Manger manger = new Manger(MName,MPassword);
        String YZM1 = (String) req.getSession().getAttribute("YZM");
        System.out.println(YZM1);
        if (YZM1.equals(YZM)){
            MangerService mangerService = new MangerServiceImpl();
            boolean flag = mangerService.login(manger);
            if (flag){
                resp.sendRedirect("index.jsp");
            }else {
                req.setAttribute("error","用户名或密码错误");
                req.getRequestDispatcher("login.jsp").forward(req,resp);
            }
        }else {
            req.setAttribute("error","验证码错误");
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }
    }
}
