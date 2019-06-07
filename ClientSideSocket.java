import java.io.*;
import java.net.*;
public class ClientSideSocket{
public void run(){
try{
int serverport=2040;
InetAddress host=InetAddress.getByName("localhost");
System.out.println("Connecting to server on port:"+serverport);
Socket socket=new Socket(host,serverport);
System.out.println("just connected to:"+socket.getRemoteSocketAddress());
PrintWriter toServer=new PrintWriter(socket.getOutputStream(),true);
BufferedReader fromServer =new BufferedReader(new InputStreamReader(socket.getInputStream()));
toServer.println("hello from"+socket.getLocalSocketAddress());
String line=fromServer.readLine();
System.out.println("client recieved:"+line+"from server");
toServer.close();
fromServer.close();
socket.close();
}
catch(UnknownHostException ex){
ex.printStackTrace();
}
catch(IOException e){
e.printStackTrace();
}
}
public static void  main(String args[]){
ClientSideSocket client=new ClientSideSocket();
client.run();
}
}