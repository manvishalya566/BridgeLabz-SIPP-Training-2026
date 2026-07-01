import java.util.*; public class SmartParkingSlotManager{
ArrayList<String> vehicles=new ArrayList<>();
void enter(String v){vehicles.add(v);} void exit(String v){vehicles.remove(v);}
boolean search(String v){return vehicles.contains(v);}
void display(){System.out.println(vehicles);System.out.println("Occupied: "+vehicles.size());}
}