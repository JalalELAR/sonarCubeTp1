package flight.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Bookmark {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idBookmark;
	@Column(name = "title")
	private String title;
	@Column(name = "adding_date")
	private LocalDate addingDate;
	@Column(name = "nb_flights")
	private int nbFlights;
	@Embedded
	private FlightCriteria flightCriteria;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserDao user;
	/**
	 * @return the idBookmark
	 */
	public Long getIdBookmark() {
		return idBookmark;
	}
	/**
	 * @param idBookmark the idBookmark to set
	 */
	public void setIdBookmark(Long idBookmark) {
		this.idBookmark = idBookmark;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the addingDate
	 */
	public LocalDate getAddingDate() {
		return addingDate;
	}
	/**
	 * @param addingDate the addingDate to set
	 */
	public void setAddingDate(LocalDate addingDate) {
		this.addingDate = addingDate;
	}
	/**
	 * @return the nbFlights
	 */
	public int getNbFlights() {
		return nbFlights;
	}
	/**
	 * @param nbFlights the nbFlights to set
	 */
	public void setNbFlights(int nbFlights) {
		this.nbFlights = nbFlights;
	}
	/**
	 * @return the flightCriteria
	 */
	public FlightCriteria getFlightCriteria() {
		return flightCriteria;
	}
	/**
	 * @param flightCriteria the flightCriteria to set
	 */
	public void setFlightCriteria(FlightCriteria flightCriteria) {
		this.flightCriteria = flightCriteria;
	}
	
	/**
	 * @return the user
	 */
	public UserDao getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(UserDao user) {
		this.user = user;
	}
	/**
	 * @param idBookmark
	 * @param title
	 * @param addingDate
	 * @param nbFlights
	 * @param flightCriteria
	 */
	public Bookmark(Long idBookmark, String title, LocalDate addingDate, int nbFlights, FlightCriteria flightCriteria) {
		super();
		this.idBookmark = idBookmark;
		this.title = title;
		this.addingDate = addingDate;
		this.nbFlights = nbFlights;
		this.flightCriteria = flightCriteria;
	}
	/**
	 * 
	 */
	public Bookmark() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
