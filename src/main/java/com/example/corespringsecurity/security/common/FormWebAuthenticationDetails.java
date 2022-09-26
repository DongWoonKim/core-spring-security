package com.example.corespringsecurity.security.common;

import org.springframework.security.web.authentication.WebAuthenticationDetails;

import javax.servlet.http.HttpServletRequest;

public class FormWebAuthenticationDetails extends WebAuthenticationDetails {

    private String secretkey;

    public FormWebAuthenticationDetails(HttpServletRequest request) {
        super(request);
        this.secretkey = request.getParameter("secret_key");
    }

    public String getSecretkey() {
        return secretkey;
    }
}
