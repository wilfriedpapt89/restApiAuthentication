package com.akenge.restapiauthentication.controller;

import com.akenge.restapiauthentication.repository.UserRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    protected final Log logger = LogFactory.getLog(getClass());

    private final UserRepository userRepository;

    public AuthenticationController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
