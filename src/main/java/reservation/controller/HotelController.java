/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservation.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import reservation.entity.Hotel;
import reservation.service.HotelServiceCrud;

/**
 *
 * @author formation
 */

@Controller
public class HotelController {
    
    @Autowired
    private HotelServiceCrud service;
    
    @RequestMapping(value = "/hotel/lister",method = RequestMethod.GET)
    public String lister(Model model){
        
        
        //Récupère la liste des hotels et la passe en attribut à la vue 
        List<Hotel> hotels = (List<Hotel>)service.findAll();
        model.addAttribute("ListeHotels", hotels);
        
        //Renvoie à la vue 
        return "hotel/lister.jsp";
    }
      
    
    
}
