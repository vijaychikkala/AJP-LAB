import java.util.ArrayList;
class Example{
public static void main(String[] args){
ArrayList         al=new ArrayList();
al.add("AJP");
al.add(10);
al.add(100.00);
System.out.println(" "+al);
al.remove(1);
System.out.println(" "+al);
System.out.println(al.contains("AJP"));
}
}
