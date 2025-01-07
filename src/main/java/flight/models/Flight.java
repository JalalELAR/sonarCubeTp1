package flight.models;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import flight.enumerations.FlightType;
import flight.enumerations.TravelType;

@Entity
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFlight;

	@ManyToOne
	@JoinColumn(name = "company_id")
	private Company company;

	@Column(name = "flight_type")
	@Enumerated(EnumType.STRING)
	private FlightType flightType;

	@Column(name = "travel_type")
	@Enumerated(EnumType.STRING)
	private TravelType travelType;

	@Column(name = "departure_date")
	private LocalDate departureDate;

	@Column(name = "arrival_date")
	private LocalDate arrivalDate;

	@Column(name = "back_date")
	private LocalDate backDate;

	@Column(name = "departure_time")
	private LocalTime departureTime;

	@Column(name = "arrival_time")
	private LocalTime arrivalTime;

	@Column(name = "back_time")
	private LocalTime backTime;

	@Column(name = "departure_location")
	private String departureLocation;

	@Column(name = "arrival_location")
	private String arrivalLocation;

	@Column(name = "flight_duration")
	private LocalTime flightDuration;

	@Column(name = "connection_duration")
	private LocalTime connectionDuration;

	@Column(name = "aircraft_type")
	private String aircraftType;

	public Long getIdFlight() {
		return idFlight;
	}

	public void setIdFlight(Long idFlight) {
		this.idFlight = idFlight;
	}

	public FlightType getFlightType() {
		return flightType;
	}

	public void setFlightType(FlightType flightType) {
		this.flightType = flightType;
	}

	public TravelType getTravelType() {
		return travelType;
	}

	public void setTravelType(TravelType travelType) {
		this.travelType = travelType;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public LocalDate getBackDate() {
		return backDate;
	}

	public void setBackDate(LocalDate backDate) {
		this.backDate = backDate;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public LocalTime getBackTime() {
		return backTime;
	}

	public void setBackTime(LocalTime backTime) {
		this.backTime = backTime;
	}

	public String getDepartureLocation() {
		return departureLocation;
	}

	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}

	public String getArrivalLocation() {
		return arrivalLocation;
	}

	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}

	public LocalTime getFlightDuration() {
		return flightDuration;
	}

	public void setFlightDuration(LocalTime flightDuration) {
		this.flightDuration = flightDuration;
	}

	/**
	 * @return the connectionDuration
	 */
	public LocalTime getConnectionDuration() {
		return connectionDuration;
	}

	/**
	 * @param connectionDuration
	 *            the connectionDuration to set
	 */
	public void setConnectionDuration(LocalTime connectionDuration) {
		this.connectionDuration = connectionDuration;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}


	/**
	 * @return the company
	 */
	public Company getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(Company company) {
		this.company = company;
	}

	/**
	 * @param idFlight
	 * @param company
	 * @param flightType
	 * @param travelType
	 * @param departureDate
	 * @param arrivalDate
	 * @param backDate
	 * @param departureTime
	 * @param arrivalTime
	 * @param backTime
	 * @param departureLocation
	 * @param arrivalLocation
	 * @param flightDuration
	 * @param connectionDuration
	 * @param aircraftType
	 */
	public Flight(Long idFlight, Company company, FlightType flightType, TravelType travelType, LocalDate departureDate,
			LocalDate arrivalDate, LocalDate backDate, LocalTime departureTime, LocalTime arrivalTime,
			LocalTime backTime, String departureLocation, String arrivalLocation, LocalTime flightDuration,
			LocalTime connectionDuration, String aircraftType) {
		super();
		this.idFlight = idFlight;
		this.company = company;
		this.flightType = flightType;
		this.travelType = travelType;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.backDate = backDate;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.backTime = backTime;
		this.departureLocation = departureLocation;
		this.arrivalLocation = arrivalLocation;
		this.flightDuration = flightDuration;
		this.connectionDuration = connectionDuration;
		this.aircraftType = aircraftType;
	}

	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}

}
