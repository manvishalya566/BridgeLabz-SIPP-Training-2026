import java.util.*; public class SmartCityTrafficMonitoringSystem{
HashMap<String,Integer> roads=new HashMap<>();
void update(String r,int c){roads.put(r,roads.getOrDefault(r,0)+c);}
void report(){TreeMap<String,Integer> t=new TreeMap<>(roads);System.out.println(t);String b=null;int mx=-1;for(var e:roads.entrySet())if(e.getValue()>mx){mx=e.getValue();b=e.getKey();}System.out.println("Busiest:"+b);}
}