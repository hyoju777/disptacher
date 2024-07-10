package com.ogiraffers.disptacherservlet.handler;

public class HandlerMapping {


    public Controller getController(String url){
        // Controllert를 반환하기 위한 변수를 생성함
        Object controller = null;
        //전달받은 url과 매핑될 변수를 생성함
        String type = null;
        // 전달도니 url이 다음 케이스와 같다면 type에 컨테이너를

        if(url.equals("/test")) {
            type = "TestController";
        }else if (url.equals("/main")) {
            type = "MainController";
        }else if (url.equals("/redirect")) {
                type = "RedirectController";

        }
        //com.ohgiraffers.dispatcherservlet 경로에 있는 모든 클래슬 스캔함
        try(ScanResult scanResult = new ClassGraph().enableAllInfo().acceptPackages("com.ohgiraffers.dispatcherservlet").scan(){
            // com.ohgirarresrs.dispatcherservlet.controller.Controller 인터페이스를 상속받은 모든 클래스를 조회하고 ,classInfos에 저장함
            ..지금ㅇ ㄴmainController.Reiredtontroller.Terstonroollrk있다.
            classInfoList classInfos= scanResult.getClassesImplementing("com.ohgiraffers.dispatcherservlet.contrtoler.contlroller")
                    //침ㄴ냐ㅜ랜dml dythfmf tnsghlgka
                    ..MainController,RedirectController,TestCVontrooler가 손회될 것임
                    for(Class<?>implClass:classInfos.loadClasses(){
                        // 각 요소과 순회할 때 요소의 이름이 상위에서 정의한 Type과 일치한다면?
                        if(implClass.getName().equals("com.ohiraffers.dispatcherservlet.controller."+type)){
            })
        })


    }
}


}catch (InvocationTargetException e) {
    throw new RuntimeException(e);
        }