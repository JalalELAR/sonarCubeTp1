package flight.models;

import java.time.LocalDate;

public class SynthesisCriteria {
	private LocalDate departureDateMin;
	private LocalDate departureDateMax;
	/**
	 * @return the departureDateMin
	 */
	public LocalDate getDepartureDateMin() {
		return departureDateMin;
	}
	/**
	 * @param departureDateMin the departureDateMin to set
	 */
	public void setDepartureDateMin(LocalDate departureDateMin) {
		this.departureDateMin = departureDateMin;
	}
	/**
	 * @return the departureDateMax
	 */
	public LocalDate getDepartureDateMax() {
		return departureDateMax;
	}
	/**
	 * @param departureDateMax the departureDateMax to set
	 */
	public void setDepartureDateMax(LocalDate departureDateMax) {
		this.departureDateMax = departureDateMax;
	}
	/**
	 * @param departureDateMin
	 * @param departureDateMax
	 */
	public SynthesisCriteria(LocalDate departureDateMin, LocalDate departureDateMax) {
		super();
		this.departureDateMin = departureDateMin;
		this.departureDateMax = departureDateMax;
	}
	/**
	 * 
	 */
	public SynthesisCriteria() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
