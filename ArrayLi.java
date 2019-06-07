import java.util.ArrayList;
public class ArrayLi{
public static void main(String[] args){
ArrayList<String>  al=new ArrayList<String>();
al.add("core java");
al.add("advanced java");
al.add("uttam k roy");
System.out.println("before adding 'herbert schildt:' "+al);
al.add(1,"herbert schildt");
System.out.println("after adding 'herbert schildt:' "+al);
al.remove(0);
System.out.println(al.isEmpty());
System.out.println(al.size());
System.out.println(al.contains("core java"));
Iterator itr=al.Iterator();
while(itr.hasNext()){
Object element=itr.next();
System.out.println(element+" ");
}
}
}   


