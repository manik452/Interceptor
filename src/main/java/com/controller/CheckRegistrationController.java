package com.controller;

import com.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by saif23 on 11/21/2016.
 */
@Controller
public class CheckRegistrationController {
    @Autowired
    private RegistrationService registrationService;


}
