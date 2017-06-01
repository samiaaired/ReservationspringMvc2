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
import org.springframework.web.bind.annotation.RequestMapping;
import reservation.entity.Reservation;
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
    
    @RequestMapping(value = "/lister")
    public String lister(Model model){
        
        
        //Récupère la liste des hotels et la passe en attribut à la vue 
        List<Reservation> reservations = (List<Reservation>)reservationService.findAll();
        model.addAttribute("ListeReservations", reservations);
        
        //Renvoie à la vue 
        return "reservation/lister.jsp";
    }
}
