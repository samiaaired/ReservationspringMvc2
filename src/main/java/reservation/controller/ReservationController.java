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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import reservation.dto.ReservationDTO;
import reservation.entity.Reservation;
import reservation.service.ChambreServiceCrud;
import reservation.service.ClientServiceCrud;
import reservation.service.ReservationServiceCrud;

/**
 *
 * @author formation
 */

@Controller
@RequestMapping(value = "/reservation")
public class ReservationController {
    
    @Autowired
    ReservationServiceCrud reservationService ;
    ChambreServiceCrud chambreService;
    
    @RequestMapping(value = "/lister")
    public String lister(Model model){
        
        
        //Récupère la liste des hotels et la passe en attribut à la vue 
        List<Reservation> reservations = (List<Reservation>)reservationService.findAll();
        model.addAttribute("ListeReservations", reservations);
        
        //Renvoie à la vue 
        return "reservation/lister.jsp";
    }
    
    
     @RequestMapping(value = "/supprimer/{idReservation}", method = RequestMethod.GET )
    public String supprimer( @PathVariable(value = "idReservation") long id){
        
        // Supprime db DB
        this.reservationService.delete(id);
        
        // Redirection vers liste
        return "redirect:/reservation/lister";
    }
    
    
     @RequestMapping(value="/ajouter",method = RequestMethod.GET)
    public String ajouterGET(Model model){
        
    
       //  model.addAttribute("listechambres", chambreService.findAll());
          ReservationDTO reservationdto= new ReservationDTO();
        
       // Au lieu de mettre reservation comme dto , on va mettre ReservationDTO
         model.addAttribute("reservation", reservationdto);
        
     //   model.addAttribute("etats",Reservation.EtatReservation.values() );
        
        return "/reservation/ajouter.jsp";
    }
}
