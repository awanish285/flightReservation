package flightReservation.tests;

import flightReservation.dao.ReservationDao;
import flightReservation.daoImpl.ReservationDaoImpl;
import flightReservation.model.Passenger;
import flightReservation.model.Reservation;

public class Test {
	
	
	
public static void main(String []args)
{
	
ReservationDao dao=new ReservationDaoImpl();
Reservation reservation = new Reservation();
Passenger passenger = new Passenger();
passenger.setId(123l);
passenger.setFirstName("John");
passenger.setLastName("Bailey");
passenger.setEmail("john@bailey.com");

reservation.setPassenger(passenger);
reservation.setFlightId(1l);
Reservation savedReservation = dao.bookFlight(reservation);
System.out.println(savedReservation) ;

System.out.println(dao.checkIn(savedReservation.getId(), 2));

}
}
