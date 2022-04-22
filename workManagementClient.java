package workManagement;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class workManagementClient {

	private static workManagementGrpc.workManagementBlockingStub blockingStub;
	private static workManagementGrpc.workManagementStub asyncStub;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

		blockingStub = workManagementGrpc.newBlockingStub(channel);
		asyncStub = workManagementGrpc.newStub(channel);

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
		assignTasks();
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
	
	
	public static void assignTasks() throws InterruptedException {
		
		
	// scheduleMeating
	StreamObserver<AssignTasksResponse> responseObserver = new StreamObserver<AssignTasksResponse>() {

		@Override
		public void onNext(AssignTasksResponse value) {
			// TODO Auto-generated method stub
			System.out.println("Final Response from server " + value.getResponseMessage());
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

		// 
		StreamObserver<AssignTasksRequest> requestObserver = asyncStub.assignTasks(responseObserver);
		requestObserver.onNext(AssignTasksRequest.newBuilder().setRequestMessage("First message in the stream").build());
		requestObserver.onNext(AssignTasksRequest.newBuilder().setRequestMessage("Secound message in the stream").build());
		requestObserver.onNext(AssignTasksRequest.newBuilder().setRequestMessage("Third message in the stream").build());
		
		System.out.println("Client has now sent its mesages ");
		
		requestObserver.onCompleted();
		
		Thread.sleep(5000);
}
}
