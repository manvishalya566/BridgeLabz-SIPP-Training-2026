import java.util.*;
public class AddressBookApp{
 static ArrayList<Contact> contacts=new ArrayList<>();
 static HashMap<String,Contact> map=new HashMap<>();
 static HashSet<String> phones=new HashSet<>();
 static void add(Contact c){ if(phones.add(c.phone)){contacts.add(c); map.put(c.name,c);} }
 static Contact search(String name){ return map.get(name);}
 static void delete(String name){ Contact c=map.remove(name); if(c!=null){phones.remove(c.phone); contacts.remove(c);} }
 static void display(){ contacts.sort(Comparator.comparing(x->x.name)); for(Contact c:contacts) System.out.println(c.name+" "+c.phone+" "+c.email);}
 public static void main(String[]a){}
}