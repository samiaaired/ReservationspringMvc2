/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author formation
 */

@RequestMapping(value="/test", method = RequestMethod.GET)
@Controller
public class TestController {
    
    @RequestMapping(value="/coucou/{a}/{b}")
    public String helloter3(@PathVariable("b")int monB,@PathVariable("a") String monA){
        System.out.println(String.format("%d %s",monB , monA));
        return "coucou.jsp";
    }
    
    @RequestMapping(value = "/hello/{numSerie}")
    public String helloter2(@PathVariable("numSerie") long ns ){
        System.out.println("***"+ns);
        return "nada.jsp";
    }
    
    @RequestMapping(value = "/hello")
    public String helloter(){
        return "existepoint.jsp";
    }
    
    
}
