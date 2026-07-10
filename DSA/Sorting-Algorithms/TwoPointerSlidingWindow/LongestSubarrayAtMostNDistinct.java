import java.util.*; public class LongestSubarrayAtMostNDistinct{
public static int longestSubarrayWithAtMostNDistinct(int[] a,int n){
Map<Integer,Integer> f=new HashMap<>(); int s=0,max=0;
for(int e=0;e<a.length;e++){f.put(a[e],f.getOrDefault(a[e],0)+1);
while(f.size()>n){int x=a[s]; f.put(x,f.get(x)-1); if(f.get(x)==0)f.remove(x); s++;}
max=Math.max(max,e-s+1);} return max;}}