package com.ogiraffers.disptacherservlet.controler;

import jakarta.servlet.http.HttpServletRequest;

public interface Controller {




    String handleRequest(HttpServletRequest request),HttpServletResponse response);
}
