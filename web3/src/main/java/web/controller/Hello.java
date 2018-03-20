package web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class Hello {

    @RequestMapping(value = "/hello")
    public void a(HttpServletRequest request, HttpServletResponse response){
        try{
            response.getWriter().write("hello from web3");
        }catch (Exception e){}
    }
}
