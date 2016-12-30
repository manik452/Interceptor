package com.controller;

import com.interceptors.SessionData;
import com.model.*;
import com.service.RegistrationService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by saif23 on 11/8/2016.
 */
@Controller
public class LoginController {

    @Autowired
    RegistrationService registrationService;

    @Autowired
    SessionFactory sessionFactory;

    @Autowired
    SessionData sessionData;

    @RequestMapping(value = "/login")
    public String getUserNamePassword(Model model) {

        model.addAttribute("login", new Login());
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String postUserNamePassword(@ModelAttribute Login login, Model model) {


        Registration registrationObject = registrationService.getUser(login.getUsername());
        if ((registrationObject.getUsername().equals(login.getUsername())) &&
                (registrationObject.getUserpassword().equals(login.getUserpassword()))) {

            User user = new User();
            user.setName(login.getUsername());
            user.setId((long)registrationObject.getID());
            sessionData.setUser(user);

            return "redirect:/user/pblog";
        }
        model.addAttribute("errormessage", "Incorrect Password and username");
        return "redirect:/login";
    }

    @RequestMapping("/user/logout")
    public String logout(HttpSession session) {
        sessionData.setUser(null); //sessionData = null causes NPE in next login
        session.invalidate();
        return "redirect:/login";
    }
}
