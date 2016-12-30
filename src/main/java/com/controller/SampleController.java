package com.controller;

import org.apache.avalon.framework.logger.Logger;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by saif23 on 11/22/2016.
 */

@Controller
public class SampleController {

    //private static final Logger logger = SessionFactory.getLogger(SampleController.class);

    @RequestMapping(value = "/user/welcome", method = RequestMethod.GET)
    public String welcome() {
        return "welcome";
    }
}