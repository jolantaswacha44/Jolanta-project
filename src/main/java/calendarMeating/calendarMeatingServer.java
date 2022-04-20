package calendarMeating;

import java.io.IOException;


import calendarMeating.calendarMeatingGrpc.calendarMeatingImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class calendarMeatingServer extends calendarMeatingImplBase{

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Starting gRPC Server");
		calendarMeatingServer userserver = new calendarMeatingServer();

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
	public StreamObserver<ScheduleMeatingRequest> scheduleMeating(
			StreamObserver<ScheduleMeatingResponse> responseObserver) {
		System.out.println("On Server;  inside the streaming scheduleMeating");
		return new StreamObserver<ScheduleMeatingRequest>() {

			@Override
			public void onNext(ScheduleMeatingRequest value) {
				// TODO Auto-generated method stub
				System.out.println("On Server; message from the client" + value.getRequesteMessage());
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				ScheduleMeatingResponse.Builder response = ScheduleMeatingResponse.newBuilder();
				
				response.setResponseMessage("Server say it has got your compleated message, thanks ");
				
				responseObserver.onNext(response.build());
				
				responseObserver.onCompleted();
				
			}};
	}



}//class
