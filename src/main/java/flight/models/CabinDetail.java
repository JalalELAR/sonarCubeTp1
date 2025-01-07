package flight.models;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import flight.enumerations.CabinClass;

@Embeddable
public class CabinDetail {
	@Enumerated(EnumType.STRING)
	private CabinClass cabinClass;
	private String bagage;
	private String cancellation;
	private String rebooking;
	private String refund;
	private Double fare;

	/**
	 * @return the cabinClass
	 */
	public CabinClass getCabinClass() {
		return cabinClass;
	}
	/**
	 * @param cabinClass the cabinClass to set
	 */
	public void setCabinClass(CabinClass cabinClass) {
		this.cabinClass = cabinClass;
	}
	/**
	 * @return the cabinType
	 */
	public CabinClass getCabinType() {
		return cabinClass;
	}
	/**
	 * @param cabinType the cabinType to set
	 */
	public void setCabinType(CabinClass cabinType) {
		this.cabinClass = cabinType;
	}
	/**
	 * @return the bagage
	 */
	public String getBagage() {
		return bagage;
	}
	/**
	 * @param bagage the bagage to set
	 */
	public void setBagage(String bagage) {
		this.bagage = bagage;
	}
	/**
	 * @return the cancellation
	 */
	public String getCancellation() {
		return cancellation;
	}
	/**
	 * @param cancellation the cancellation to set
	 */
	public void setCancellation(String cancellation) {
		this.cancellation = cancellation;
	}
	/**
	 * @return the rebooking
	 */
	public String getRebooking() {
		return rebooking;
	}
	/**
	 * @param rebooking the rebooking to set
	 */
	public void setRebooking(String rebooking) {
		this.rebooking = rebooking;
	}
	/**
	 * @return the refund
	 */
	public String getRefund() {
		return refund;
	}
	/**
	 * @param refund the refund to set
	 */
	public void setRefund(String refund) {
		this.refund = refund;
	}
	/**
	 * @return the fare
	 */
	public Double getFare() {
		return fare;
	}
	/**
	 * @param fare the fare to set
	 */
	public void setFare(double fare) {
		this.fare = fare;
	}
	
	/**
	 * @param cabinType
	 * @param bagage
	 * @param cancellation
	 * @param rebooking
	 * @param refund
	 * @param fare
	 */
	public CabinDetail(CabinClass cabinClass, String bagage, String cancellation, String rebooking, String refund,
			Double fare) {
		super();
		this.cabinClass = cabinClass;
		this.bagage = bagage;
		this.cancellation = cancellation;
		this.rebooking = rebooking;
		this.refund = refund;
		this.fare = fare;
	}
	/**
	 * 
	 */
	public CabinDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
