package flightReservation.daoImpl;

import java.util.HashMap;

import flightReservation.dao.ReservationDao;
import flightReservation.model.Flight;
import flightReservation.model.Reservation;

public class ReservationDaoImpl implements ReservationDao {

	HashMap<Long, Flight> flights;
	HashMap<Long, Reservation> reservation;
	long reservationId;

	public ReservationDaoImpl() {
		reservation = new HashMap<>();
		flights = new HashMap();
		Flight flight1 = new Flight();
		flight1.setId(1l);
		flight1.setFlightNumber("123");
		flight1.setOperatingAirlines("American");
		flight1.setDepartureCity("Austin");
		flight1.setArrivalCity("Newyork");
		flight1.setDateAndTimeOfDeparture("5/22/2022");
		flights.put(flight1.getId(), flight1);
		System.out.println("ffffffff "+flight1.getId());
	}

	@Override
	public Reservation bookFlight(Reservation reservastion) {

		Flight flight = flights.get(reservastion.getFlightId());
		System.out.println("ffffffff "+reservastion.getId());
		reservastion.setFlight(flight);
		reservationId = reservationId + 1;
		reservastion.setId(reservationId);
		reservation.put(reservationId, reservastion);
		return reservastion;
	}

	@Override
	public Reservation checkIn(long reservationId, int noOfBags) {
	
		Reservation reservations = reservation.get(reservationId);
		reservations.setNoOfBags(noOfBags);
		reservations.setCheckedIn(true);
		return reservations;
	}
}
