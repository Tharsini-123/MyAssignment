package week3.day5;

public class APIClient {
	
	public void sendRequest(String endpoint) {
		System.out.println(endpoint);
	}
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println(endpoint + " "+ requestBody + " "+ requestStatus);
	}
	
	public static void main(String[] args) {
		APIClient apiclient = new APIClient();
		apiclient.sendRequest("end the request");
		apiclient.sendRequest("end the program", "requestBody", true);
	}

}

