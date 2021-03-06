package com.mkcomp.CarRentalApp.service;

import com.mkcomp.CarRentalApp.api.request.AddReservationRequest;
import com.mkcomp.CarRentalApp.model.Customer;
import com.mkcomp.CarRentalApp.model.Reservation;

import java.util.List;
import java.util.Set;

/**
 * Service layer interface declaring CRUD operations on Reservation objects
 */
public interface ReservationService {

    Long addReservation(AddReservationRequest request);
    Set<Reservation> getAllReservations(long customerId);
    void deleteReservation(long reservationId);
    List<Reservation> findAll();
    Reservation findById(Long id);
    Long addReservation(Reservation reservation);
    List<Reservation> findReservationsByCustomer(Customer customer);

}
