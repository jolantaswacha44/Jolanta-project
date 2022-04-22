package bookingMeating;

import java.util.concurrent.TimeUnit;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class bookingMeatingClient {

	private static bookingMeatingGrpc.bookingMeatingBlockingStub blockingStub;
	private static bookingMeatingGrpc.bookingMeatingStub asyncStub;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

		blockingStub = bookingMeatingGrpc.newBlockingStub(channel);
		asyncStub = bookingMeatingGrpc.newStub(channel);

		//Create Request messages for use within the main method
		LoginRequest loginRequest = LoginRequest.newBuilder().setUsername("Jolanta").setPassword("Daniel").build();
		

		//Call the login RPC from within main
		LoginResponse response = blockingStub.login(loginRequest);
		System.out.println("Response from Server: " + response);

		//Call the logout RPC from within main
		//LogoutResponse responseOut = blockingStub.logout(logoutRequest);
		//System.out.println("Response from Server: " + responseOut);

		//Call the login RPC from login() method
		login();

		//Call the logout RPC from logout() method
		logout();
		meatingRoom();
		try {
			channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block			
			System.out.println("Error closing down channel");
			e.printStackTrace();
	}
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
	
	
	
	//rpc GetFirstString (containsString) returns (containsString) {}
	//rpc meatingRoom(MeatingRoomRequest) returns (stream MeatingRoomResponse){}
	//meatingRoom
	//Iterator<MeatingRoomResponse> responses = blockingStub.meatingRoom(responseMessage);
	//MeatingRoomResponse response = blockingStub.meatingRoom(meatingRoomRequest);

	//System.out.println("Response from Server: " + response);

	
		public static void meatingRoom() {
		System.out.println("Booking the meeting room avebility ");

		MeatingRoomRequest meatingRoomRequest = MeatingRoomRequest.newBuilder().setRoomAvailability("Check").build();
		
		
		StreamObserver<MeatingRoomResponse> responseObserver = new StreamObserver<MeatingRoomResponse>() {

			@Override
			public void onNext(MeatingRoomResponse value) {
				// TODO Auto-generated method stub
				System.out.println("jola " + value.getResponseMessage());
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				
			}
		
		
		};
		 asyncStub.meatingRoom(meatingRoomRequest, responseObserver);
}
}

		//MeatingRoomResponse response = blockingStub.meatingRoom(meatingRoomRequest);

			//System.out.println("Response from Server: " + response);
		
