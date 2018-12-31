package com.vrihas.simpleauth.authapplication.repository;

import com.vrihas.simpleauth.authapplication.bean.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
}
