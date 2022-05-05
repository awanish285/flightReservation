package flightReservation.dao;

import flightReservation.model.Reservation;

public interface ReservationDao {
	
     Reservation bookFlight(Reservation reservastion);
     
     Reservation checkIn(long reservationId,int noOfBags);

}
