import java.util.*; public class MinimumWindowSubstring{
public static String minWindowSubstring(String s,String t){
if(s.isEmpty()||t.isEmpty()) return "";
Map<Character,Integer> need=new HashMap<>(),win=new HashMap<>();
for(char c:t.toCharArray()) need.put(c,need.getOrDefault(c,0)+1);
int req=need.size(),formed=0,start=0,min=Integer.MAX_VALUE,minS=0;
for(int e=0;e<s.length();e++){char c=s.charAt(e); win.put(c,win.getOrDefault(c,0)+1);
if(need.containsKey(c)&&win.get(c).equals(need.get(c))) formed++;
while(formed==req){if(e-start+1<min){min=e-start+1;minS=start;}
char lc=s.charAt(start); win.put(lc,win.get(lc)-1);
if(need.containsKey(lc)&&win.get(lc)<need.get(lc)) formed--; start++;}}
return min==Integer.MAX_VALUE?"":s.substring(minS,minS+min);}}