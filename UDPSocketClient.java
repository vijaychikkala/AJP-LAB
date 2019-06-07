import java.io.*;
import java.net.*;
public class UDPSocketClient
{
    public void createAndListenSocket()
    {
        try
        {
            DatagramSocket socket = new DatagramSocket();
            InetAddress IPAddress = InetAddress.getByName("localhost");
            byte[] incomingData = new byte[1024];
            String sentence = "This is a message from client";
            byte[] data = sentence.getBytes();
            DatagramPacket sendPacket =  new DatagramPacket(data,data.length,IPAddress,9876);
            socket.send(sendPacket);
            System.out.println("Message sent from client");
            DatagramPacket incomingPacket = new DatagramPacket(incomingData,incomingData.length);
            String response = new String(incomingPacket.getData());
            System.out.println("Response from server:"+response);
            socket.close();
        }
        catch(UnknownHostException e)
        {
            e.printStackTrace();
        }
        catch(SocketException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String...args)
    {
        UDPSocketClient client = new UDPSocketClient();
        client.createAndListenSocket();
    }
}