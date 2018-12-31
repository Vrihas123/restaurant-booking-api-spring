package com.vrihas.simpleauth.authapplication.service;

import com.vrihas.simpleauth.authapplication.bean.Reservation;
import com.vrihas.simpleauth.authapplication.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public List getAllReservations() {
        List reservations = new ArrayList();

        reservationRepository.findAll().forEach(reservations::add);

        return reservations;
    }

    public Optional<Reservation> getReservation(Long id){
        return reservationRepository.findById(id);
    }

    public void addReservation(Reservation reservation){
        reservationRepository.save(reservation);
    }

    public void updateReservation(Long id, Reservation reservation){
        reservationRepository.save(reservation);
    }

    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }
}
