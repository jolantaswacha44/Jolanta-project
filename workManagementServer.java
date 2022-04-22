package workManagement;

import java.io.IOException;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import workManagement.workManagementGrpc.workManagementImplBase;

public class workManagementServer extends workManagementImplBase{

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Starting gRPC Server");
		workManagementServer userserver = new workManagementServer();

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

	//@Override
	//public StreamObserver<AssignTasksRequest> assignTasks(StreamObserver<> responseObserver) {
		// TODO Auto-generated method stub
		//return super.assignTasks(responseObserver);AssignTasksResponse
	//}
	public StreamObserver<AssignTasksRequest> assignTasks(StreamObserver<AssignTasksResponse> responseObserver) {
		
		return new StreamObserver<AssignTasksRequest> () {

			@Override
			public void onNext(AssignTasksRequest value) {
				// TODO Auto-generated method stub
				String responseMessage = value.getRequestMessage();
				System.out.println("Assaign task request" + responseMessage);
				 
				AssignTasksResponse.Builder responseBuilder = AssignTasksResponse.newBuilder();
				
				responseBuilder.setResponseMessage("Server striming: Our First Response responseMessage is:" + responseMessage);
				
responseObserver.onNext(responseBuilder.build());
				
				responseBuilder.setResponseMessage("Server striming: Our Secound Response responseMessage is:"+ responseMessage);
				
				
				responseObserver.onNext(responseBuilder.build());
				
				responseBuilder.setResponseMessage("Server striming: Our Third Response responseMessage is:"+ responseMessage);
				
				
				responseObserver.onNext(responseBuilder.build());
				
				responseObserver.onCompleted();
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
	}


}//class

