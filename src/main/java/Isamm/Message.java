package Isamm;

public class Message {

	private String username;
	private String value;
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
	public Message(String username, String value) {
		
		this.username = username;
		this.value = value;
		
	}
	
	
	
	
	
}
