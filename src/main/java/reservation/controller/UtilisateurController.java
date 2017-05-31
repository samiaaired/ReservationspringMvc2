/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservation.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import reservation.dto.UtilisateurDTO;

/**
 *
 * @author formation
 */

@Controller
public class UtilisateurController {
    
     @RequestMapping(value="/deconnexion",method = RequestMethod.GET)
    public String deconnexion(HttpSession session){
         session.invalidate();//supprime tout attribut de session
         
        // session.removeAttribute("adminConnecte"); supprim qu'un seul attribu
        return ("redirect:/identification");
    }
    
    @RequestMapping(value="/identification" , method = RequestMethod.POST)
    public String identificationPOST(@ModelAttribute("utilDTO") UtilisateurDTO dto, HttpSession session){
        
        // Renvoie vers page d'identification si pas admin/admin
        if (!dto.getIdentifiant().equals("admin") || !dto.getMotDePasse().equals("admin") )
         return ("redirect: /identification");
        // Enregistrer en session que l'util est admin
         session.setAttribute("adminConnecte", true);
        //redirection vers la liste des hotels 
        return("redirect:/hotel/lister");
    }
    
    @RequestMapping(value="/identification" , method = RequestMethod.GET)
    public String identificationGet(Model model){
        model.addAttribute("utilDTO", new UtilisateurDTO());
        return "/identification.jsp";
        
    }
}
