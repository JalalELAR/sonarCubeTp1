package flight.models;


import javax.persistence.Embeddable;
@Embeddable
public class InflightInfo {
	private String title;
	private String description;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public InflightInfo(String title, String description, byte[] photo) {
		super();
		this.title = title;
		this.description = description;
	}
	/**
	 * 
	 */
	public InflightInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
