package com.adi.login;
import com.adi.user.User;
import com.adi.user.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController
{
    @RequestMapping("/test")
    public ModelAndView test(HttpServletRequest request, HttpServletResponse response)
    {
        String name= request.getParameter("name");
        String email= request.getParameter("email");

        UserServiceImpl y=new UserServiceImpl();

        boolean statusExist=y.findUserExistence(email);
        if(statusExist)
        {
           // y.insertUser(name, email);
            ModelAndView mv = new ModelAndView();
            mv.setViewName("postLoggedIn.jsp");
            mv.addObject("name", name);
            mv.addObject("email", email);
           // mv.addObject("deptName",deptName);
            return mv;
        }
        else
        {
            ModelAndView mv1= new ModelAndView();
            mv1.setViewName("unsuccessfullLogin.jsp");
            mv1.addObject("email",email);
            return mv1;
        }
    }
}
