import java.util.*; public class SmartClassroomAttendanceTracker{
HashMap<String,ArrayList<String>> map=new HashMap<>();
void mark(String sub,String stu){map.putIfAbsent(sub,new ArrayList<>()); if(!map.get(sub).contains(stu)) map.get(sub).add(stu);}
void display(){for(String s:map.keySet()) System.out.println(s+":"+map.get(s)+" Total:"+map.get(s).size());}
}