package workManagement;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class workManagementClient {

	private static workManagementGrpc.workManagementBlockingStub blockingStub;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

		blockingStub = workManagementGrpc.newBlockingStub(channel);

		//Create Request messages for use within the main method
		LoginRequest loginRequest = LoginRequest.newBuilder().setUsername("Jolanta").setPassword("Daniel").build();
		

		//Call the login RPC from within main
		LoginResponse response = blockingStub.login(loginRequest);
		System.out.println("Response from Server: " + response);

		//Call the logout RPC from within main
		//LogoutResponse responseOut = blockingStub.logout(logoutRequest);
		//System.out.println("Response from Server: " + responseOut);

		//Call the login RPC from login() method
		//login();

		//Call the logout RPC from logout() method
		//logout();
	}

	//Login
	public static void login() {
		System.out.println("Inside Login in Client: ");

		LoginRequest loginRequest = LoginRequest.newBuilder().setUsername("Jolanta").setPassword("Daniel").build();

		LoginResponse response = blockingStub.login(loginRequest);

		System.out.println("Response from Server: " + response);
	}

	//Logout
	public static void logout() {
		System.out.println("Inside Logout in Client: ");

		LogoutRequest logoutRequest = LogoutRequest.newBuilder().setUsername("Jolanta").build();

		LogoutResponse response = blockingStub.logout(logoutRequest);

		System.out.println("Response from Server: " + response);
	}
}
