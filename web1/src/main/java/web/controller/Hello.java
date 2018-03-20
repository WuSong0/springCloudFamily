package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class Hello {

    @RequestMapping(value = "/hello")
    @ResponseBody
    public void a(@RequestHeader HttpServletRequest request, HttpServletResponse response){
        try{
            response.getWriter().write("hello from web1");
        }catch (Exception e){}
    }

    @Autowired
    Environment env;
    @RequestMapping(value = "/hi")
    public String config(){
        return "hi"+env.getProperty("indir");
    }

}
