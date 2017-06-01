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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import reservation.entity.Chambre;
import reservation.entity.Hotel;
import reservation.service.ChambreServiceCrud;
import reservation.service.HotelServiceCrud;

/**
 *
 * @author formation
 */
@Controller
@RequestMapping(value = "/chambre")
public class ChambreController {
    
    
    @Autowired
    private ChambreServiceCrud chambreService;
    @Autowired
    private HotelServiceCrud hotelService;
    
  
    @RequestMapping(value ="/lister" ,method = RequestMethod.GET)
    public String lister(Model model){
        
        List<Chambre> chambres=(List<Chambre>) chambreService.findAll();
        model.addAttribute("ListesChambre", chambres);
  
        return "/chambre/lister.jsp";
        
    }
       @RequestMapping(value = "/ajouter", method = RequestMethod.POST)
    public String ajouterPost(@ModelAttribute("chambre") Chambre chambre){
        
        
        //ajouter vers base de données 
        chambreService.save(chambre);
        //redirection vers la liste des chambre
        return("redirect:/chambre/lister");
    }
    
    @RequestMapping(value="/ajouter" ,method = RequestMethod.GET)
    public String ajouterGet(Model model){
        
        //Ajouter au  model la liste des hotels
        model.addAttribute("hotels", hotelService.findAll());
       
        
        // Ajouter mon ModelAttribute ( = DTO ) au modèle
        model.addAttribute("chambre", new Chambre());
        
        return "/chambre/ajouter.jsp";
    }
    
     @RequestMapping(value = "/supprimer/{idChambre}", method = RequestMethod.GET )
    public String supprimer( @PathVariable(value = "idChambre") long id){
        
        // Supprime db DB
        this.chambreService.delete( id );
        
        // Redirection vers liste
        return "redirect:/chambre/lister";
    }
    
    @RequestMapping(value="/modifier", method = RequestMethod.POST)
    public String modifierPOST( @ModelAttribute(value = "chambre") Chambre ch){
        
      // Modif en DB
        
        
        chambreService.save(ch);
        
        // Redirection vers la liste des chambres 
        return "redirect:/chambre/lister";
    }
    
    @RequestMapping(value="/modifier/{id}", method = RequestMethod.GET)
    public String modifierGET(Model model,@PathVariable("id") long chambreId){
       
        //avoir la liste des hotel
         model.addAttribute("hotels", hotelService.findAll());
        //récup chambre en fonction de l'id
        Chambre chambre=chambreService.findOne(chambreId);
        //passe la chambre à la vue 
        
        model.addAttribute("chambre", chambre);
        return "chambre/modifier.jsp";
        
    }
    
    
    
    
}
