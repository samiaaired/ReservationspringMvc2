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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import reservation.entity.Hotel;
import reservation.service.HotelServiceCrud;

/**
 *
 * @author formation
 */

@Controller
@RequestMapping(value="/hotel")
public class HotelController {
    
    @Autowired
    private HotelServiceCrud hotelService;
    
     @RequestMapping(value="/ajouter",method = RequestMethod.GET)
    public String ajouterGET(Model model){
        
        //passe cet hotel à la vue 
        Hotel hotel =new Hotel();
        model.addAttribute("hotel", hotel);
        return "/hotel/ajout.jsp";
        
    }
    
    
    @RequestMapping(value="/ajouter", method = RequestMethod.POST)
    public String Ajouter(@ModelAttribute(value = "hotel") Hotel monHotel){
        hotelService.save(monHotel);
        return "redirect:/hotel/lister";
    }
    
    
    @RequestMapping(value="/modifier", method = RequestMethod.POST)
    public String modifierPOST( @ModelAttribute(value = "hotel") Hotel monHotel){
        
        // Modif en DB
        hotelService.save(monHotel);
        
        // Redirection vers liste hotels
        return "redirect:/hotel/lister";
    }
    
    @RequestMapping("/modifier/{id}")
    public String modifierGET(Model model,@PathVariable("id") long hotelId){
        //récup hotel en fonction de l'id
        Hotel h=hotelService.findOne(hotelId);
        //passe cet hotel à la vue 
        
        model.addAttribute("hotel", h);
        return "hotel/modifier.jsp";
        
    }
    
    
    
    @RequestMapping(value = "/supprimer/{idHotel}", method = RequestMethod.GET )
    public String supprimer( @PathVariable(value = "idHotel") long id){
        
        // Supprime db DB
        this.hotelService.delete( id );
        
        // Redirection vers liste
        return "redirect:/hotel/lister";
    }
    
    @RequestMapping(value = "/lister")
    public String lister(Model model){
        
        
        //Récupère la liste des hotels et la passe en attribut à la vue 
        List<Hotel> hotels = (List<Hotel>)hotelService.findAll();
        model.addAttribute("ListeHotels", hotels);
        
        //Renvoie à la vue 
        return "hotel/lister.jsp";
    }
      
}