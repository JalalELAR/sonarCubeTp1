package flight.models;

public class Email {
private String adress;
private String password;
/**
 * @return the password
 */
public String getPassword() {
	return password;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}
private String object;
private String content;
/**
 * @return the adress
 */
public String getAdress() {
	return adress;
}
/**
 * @param adress the adress to set
 */
public void setAdress(String adress) {
	this.adress = adress;
}
/**
 * @return the object
 */
public String getObject() {
	return object;
}
/**
 * @param object the object to set
 */
public void setObject(String object) {
	this.object = object;
}
/**
 * @return the content
 */
public String getContent() {
	return content;
}
/**
 * @param content the content to set
 */
public void setContent(String content) {
	this.content = content;
}
/**
 * @param adress
 * @param object
 * @param content
 */
public Email(String adress, String object, String content) {
	super();
	this.adress = adress;
	this.object = object;
	this.content = content;
}
/**
 * 
 */
public Email() {
	super();
	// TODO Auto-generated constructor stub
}

}
