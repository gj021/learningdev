package junit.model;

public class Client {
	private int clientId;
	private String clientName;
	
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", clientName=" + clientName + "]";
	}
	public Client(int clientId, String clientName) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
	}
	public Client() {
		
	}
}
