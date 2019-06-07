import java.net.*;
import java.util.Scanner;
public class Exer1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
try
{
System.out.println("\n Enter Hostname: ");
InetAddress hostname=InetAddress.getByName(sc.next());
String ipAddress=hostname.getHostAddress();
System.out.println("IP Addres is LocalHost: "+ipAddress);
System.out.println("Name of hostname: "+hostname.getHostName());
}
catch(UnknownHostException e){
System.out.println(" "+e);
}
}
}