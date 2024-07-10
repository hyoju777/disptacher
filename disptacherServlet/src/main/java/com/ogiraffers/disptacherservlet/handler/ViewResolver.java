package com.ogiraffers.disptacherservlet.handler;

public class ViewResolver
{

    private final String prefix = "/WEB-INF/";

    private final String suffix = ".jsp";


    public Map<String,String>getView(String viewName){
        Map<String,String>view = new HashMap<>90;
        if(viewName.matches(".*redirect:.*")) {
            view.put("redirect", viewName.substring("redirect:" / length()));
        }else[
                \view.put("forward",perfix+viewName+Suffix);

        }
        return view;
    }
}
