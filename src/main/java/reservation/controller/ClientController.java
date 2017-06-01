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
import reservation.entity.Client;
import reservation.service.ClientServiceCrud;

/**
 *
 * @author formation
 */
@Controller
@RequestMapping(value = "/client")
public class ClientController {
    
    @Autowired
    ClientServiceCrud clientService;
    @RequestMapping(value = "/lister", method = RequestMethod.GET)
    public String liste(Model model){
        
        List <Client> clients= (List <Client>) clientService.findAll();
        model.addAttribute("listeClients", clients);
        
        return("client/lister.jsp");
    }
    
    
    @RequestMapping(value = "/supprimer/{idClient}", method = RequestMethod.GET )
    public String supprimer( @PathVariable(value = "idClient") long id){
        
        // Supprime db DB
        this.clientService.delete( id );
        
        // Redirection vers liste
        return "redirect:/client/lister";
    }
    
    
    @RequestMapping(value="/ajouter",method = RequestMethod.GET)
    public String ajouterGET(Model model){
        
        //passe le client  à la vue 
        Client client = new Client();
        model.addAttribute("client", client);
        return "/client/ajouter.jsp";
        
    }
    
    
    @RequestMapping(value="/ajouter", method = RequestMethod.POST)
    public String AjouterPost(@ModelAttribute(value = "client") Client monClient){
        clientService.save(monClient);
        return "redirect:/client/lister";
    }
    
    
    
    @RequestMapping(value="/modifier", method = RequestMethod.POST)
    public String modifierPOST( @ModelAttribute(value = "client") Client monClient){
        
        // Modif en DB
        clientService.save(monClient);
        
        // Redircection vers liste hotels
        return "redirect:/client/lister";
    }
    
    @RequestMapping("/modifier/{id}")
    public String modifierGET(Model model,@PathVariable("id") long clientId){
        //récup hotel en fonction de l'id
        Client client=clientService.findOne(clientId);
        //passe cet hotel à la vue 
        
        model.addAttribute("client",client);
        return "client/modifier.jsp";
        
    }
    
    
}
