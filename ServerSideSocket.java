import java.io.*;
import java.net.*;
public class ServerSideSocket{
public void run(){
try{
int serverport=2040;
ServerSocket serversocket=new ServerSocket(serverport);
serversocket.setSoTimeout(10000);
while(true){
System.out.println("Waiting for client on port"+serversocket.getLocalPort()+"...");
Socket server=serversocket.accept();
System.out.println("Just connected to "+server.getRemoteSocketAddress());
PrintWriter toClient=new PrintWriter(server.getOutputStream(),true);
BufferedReader fromClient=new BufferedReader(new InputStreamReader(server.getInputStream()));
String line=fromClient.readLine();
System.out.println("Server received: "+line);
toClient.println("Thank you for connecting to "+server.getLocalSocketAddress()+ "\nGoodBye!..");
}
}
catch(UnknownHostException ex){
ex.printStackTrace();
}
catch(IOException e){
e.printStackTrace();
}
}
public static void main(String args[]){
ServerSideSocket srv=new ServerSideSocket();
srv.run();
}
}