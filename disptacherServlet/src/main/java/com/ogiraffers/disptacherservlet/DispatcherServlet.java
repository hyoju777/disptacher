package com.ogiraffers.disptacherservlet;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet( value = "/")
public class DispatcherServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        handlerMapping = new HandlerMapping();
        super.init();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpServletRequest httpRequest = (HttpServletRequest) req;
        HttpServletResponse httpResponse = (HttpServletResponse) res;

        String method = httpRequest.getMethod();

        if("GET".equals(method)) {
            doGet(httpRequest, httpResponse);
        }else if("POST".equals(method)) {
            doPost(httpRequest, httpResponse);
        }else if("PUT".equals(method)) {
            doput(httpResp);
        }else if("DELETE".equals(method)) {
            doDelete();

        }
        // post delete get put patch optional
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }



    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       processRequest(req,resp)
    }




    pruvate void processRequest(HttpServletRequest request,HttpServletResponse seponse){
        Stringpath = request.getRequestURI().supbstrin
    }

    private void prosessRequest(HttpServletRequest request,HttpServletResponse response){
        String path = request.getRequestURI().substring(re)
    }
}

if


        if(root.containKey("redirect")){
                respobnse,sedReuerect(rrot.get("redirect"0);
                }else{
                    ServletContext servletContext = request.getServletContext();
                    URL resoure = servletContext.getResou

                }else{
ServletContest servletContext = request.getServletContext();
URL resource = sendError(HttpServl)


                        rewuest.

gotFequestDispatcher(root.get("forward")).

oforward(request, response);
                }
                        }else{
    response.sedError(httpServletResponse.sc._not_FOUND);
        }