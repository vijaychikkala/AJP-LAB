import java.util.ArrayList;
class ArrayListDemo{
public static void main(String[] args){
ArrayList<String>  al=new ArrayList<String>();
ArrayList<String>  bl=new ArrayList<String>();
ArrayList<String>  cl=new ArrayList<String>();
al.add("core java");
al.add("advanced java");
System.out.println("Collection al objects: "+al);
bl.add("C");
bl.add("C++");
System.out.println("Collection bl objects:Before Adding Collection al "+bl);
bl.addAll(al);
System.out.println("Collection bl objects:After Adding Collection al "+bl);
cl.add("C");
System.out.println("Colection cl Objects:"+cl);
bl.removeAll(cl);
System.out.println("Colection bl Objects:After removing collectio cl"+bl);
}
}