package bookingMeating;

import java.io.IOException;

import bookingMeating.bookingMeatingGrpc.bookingMeatingImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class bookingMeatingServer extends bookingMeatingImplBase{

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Starting gRPC Server");
		bookingMeatingServer userserver = new bookingMeatingServer();

		int port = 50051;

		try {
			Server server = ServerBuilder.forPort(port)
					.addService(userserver)
					.build()
					.start();

			System.out.println("Server started with Port:" + server.getPort());
		    server.awaitTermination();

		}//try
		catch(IOException e){
			e.printStackTrace();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}

	}//main

	@Override
	public void login(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {
		System.out.println("Inside UserService::Login()");
		String username = request.getUsername();
		String password = request.getPassword();

		LoginResponse.Builder response = LoginResponse.newBuilder();
		System.out.println("username = " + username + ", password = " + password);

		if(username.equals("Jolanta") && password.equals("Daniel")) {
			// return Success response
			response.setResponseCode(1).setResponseMessage(username + ".....Successfully logged in");
		}
		else {
			// return Success response
			response.setResponseCode(99).setResponseMessage(username + "... Sorry Login Failed");
		}

		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}



	@Override
	public void logout(LogoutRequest request, StreamObserver<LogoutResponse> responseObserver) {
		System.out.println("Inside UserService::Logout()");
		String username = request.getUsername();

		LogoutResponse.Builder response = LogoutResponse.newBuilder();
		System.out.println("Logging out username = " + username);

		if(username.equals("Jolanta")) {
			// return Success response
			response.setResponseCode(1).setResponseMessage(username + ".....Successfully logged out");
		}
		else {
			// return Success response
			response.setResponseCode(99).setResponseMessage(username +
					"... Sorry Logout Failed, user not logged in: " + username);
		}

		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void meatingRoom(MeatingRoomRequest request, StreamObserver<MeatingRoomResponse> responseObserver) {
		// TODO Auto-generated method stub
		super.meatingRoom(request, responseObserver);
		String responseMessage = request.getRoomAvailability();
		System.out.println("Book the meeating room" + responseMessage);
		 
		MeatingRoomResponse.Builder responseBuilder = MeatingRoomResponse.newBuilder();
		
		responseBuilder.setResponseMessage("Server striming: Our First Response responseMessage is:");
		
		responseObserver.onNext(responseBuilder.build());
		
		responseBuilder.setResponseMessage("Server striming: Our Secound Response responseMessage is:");
		
		
		responseObserver.onNext(responseBuilder.build());
		
		responseBuilder.setResponseMessage("Server striming: Our Third Response responseMessage is:");
		
		
		responseObserver.onNext(responseBuilder.build());
		
		responseObserver.onCompleted();

	}



}//class
