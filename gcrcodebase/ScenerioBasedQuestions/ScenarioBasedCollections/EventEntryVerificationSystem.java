import java.util.*; public class EventEntryVerificationSystem{
HashSet<String> emails=new HashSet<>();
void register(String e){System.out.println(emails.add(e)?"Registered":"Duplicate");}
void display(){System.out.println(emails);System.out.println("Total: "+emails.size());}
}