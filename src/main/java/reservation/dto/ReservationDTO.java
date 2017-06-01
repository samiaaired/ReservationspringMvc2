/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservation.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import reservation.entity.Chambre;
import reservation.entity.Client;

/**
 *
 * @author formation
 */
public class ReservationDTO {
    
    public enum EtatReservation{
        
        A_PAYER,
        PAYE,
        ANNULE
       }
    
    private Long id;
    private Date dateReseravation;
    private Date dateSortie;
    private EtatReservation etat;
    private Client client ;
    private List<Chambre> chambres = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateReseravation() {
        return dateReseravation;
    }

    public void setDateReseravation(Date dateReseravation) {
        this.dateReseravation = dateReseravation;
    }

    public Date getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(Date dateSortie) {
        this.dateSortie = dateSortie;
    }

    public EtatReservation getEtat() {
        return etat;
    }

    public void setEtat(EtatReservation etat) {
        this.etat = etat;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Chambre> getChambres() {
        return chambres;
    }

    public void setChambres(List<Chambre> chambres) {
        this.chambres = chambres;
    }
    
    
    
}
