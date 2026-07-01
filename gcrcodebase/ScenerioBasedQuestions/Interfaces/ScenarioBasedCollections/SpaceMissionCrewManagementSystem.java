import java.util.*; public class SpaceMissionCrewManagementSystem{
HashMap<String,List<Astronaut>> crews=new HashMap<>(); HashMap<String,HashSet<String>> assigned=new HashMap<>();
void addMission(String m){crews.putIfAbsent(m,new ArrayList<>());assigned.putIfAbsent(m,new HashSet<>());}
void assign(String m,Astronaut a){addMission(m); if(assigned.get(m).add(""+a.astronautId)) crews.get(m).add(a);}
void display(){for(String m:crews.keySet()) System.out.println(m+":"+crews.get(m)+" Total:"+crews.get(m).size());}
}