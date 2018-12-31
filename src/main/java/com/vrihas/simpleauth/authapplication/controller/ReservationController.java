package com.vrihas.simpleauth.authapplication.controller;

import com.vrihas.simpleauth.authapplication.bean.Reservation;
import com.vrihas.simpleauth.authapplication.bean.Response;
import com.vrihas.simpleauth.authapplication.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1")
public class ReservationController {


    @Autowired
    private ReservationService reservationService;

    @RequestMapping(value = "/reservations", method = RequestMethod.GET)
    public List getAllReservations(){
        return reservationService.getAllReservations();
    }

    @RequestMapping(value = "/reservations/{id}", method = RequestMethod.GET)
    public Optional<Reservation> getSingleReservation(@PathVariable Long id){
        return reservationService.getReservation(id);
    }

    @RequestMapping(value = "/reservations", method = RequestMethod.POST)
    public Response addReservation(@RequestBody Reservation reservation){
        reservationService.addReservation(reservation);
        return new Response("Registered Successfully", true);

    }

    @RequestMapping(value = "/reservations/{id}", method = RequestMethod.PUT)
    public void updateReservation(@RequestBody Reservation reservation,@PathVariable Long id) {
        reservationService.updateReservation(id, reservation);
    }

    @RequestMapping(value = "/reservations/{id}", method = RequestMethod.DELETE)
    public void deleteReservation(@PathVariable Long id) {
        reservationService.deleteReservation(id);
    }
}
