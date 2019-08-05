package com.adi.signup;

import com.adi.dept.DeptServiceImpl;
import com.adi.interest.InterestServiceImpl;
import com.adi.user.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SignupController {
    @RequestMapping("/signup")
    public ModelAndView test(HttpServletRequest request, HttpServletResponse response) {
        String name= request.getParameter("name");
        String email= request.getParameter("email");
        String deptName =request.getParameter("deptName");

        UserServiceImpl y=new UserServiceImpl();
        DeptServiceImpl ds=new DeptServiceImpl();
        InterestServiceImpl is =new InterestServiceImpl();

        boolean statusExist =y.findUserExistence(email);
        if(!statusExist) {

            int u_id=y.insertUser(name, email);
           // is.addInterest(u_id,ds.getDeptIdByName(deptName));

            ModelAndView mv = new ModelAndView();
            mv.setViewName("postSignup.jsp");
            mv.addObject("email", email);
            return mv;
        }
        else {
            ModelAndView mv1 = new ModelAndView();
            mv1.setViewName("unsuccessfullSignup.jsp");
            mv1.addObject("email", email);
            return mv1;
        }
    }
}