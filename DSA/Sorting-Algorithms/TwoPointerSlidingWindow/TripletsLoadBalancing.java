import java.util.*; public class TripletsLoadBalancing{
public static List<List<Integer>> findTriplets(int[] jobs,int target){
Arrays.sort(jobs); List<List<Integer>> res=new ArrayList<>();
for(int i=0;i<jobs.length-2;i++){ if(i>0&&jobs[i]==jobs[i-1]) continue;
int l=i+1,r=jobs.length-1;
while(l<r){ int s=jobs[i]+jobs[l]+jobs[r];
if(s==target){res.add(Arrays.asList(jobs[i],jobs[l],jobs[r]));
while(l<r&&jobs[l]==jobs[l+1])l++; while(l<r&&jobs[r]==jobs[r-1])r--; l++;r--;}
else if(s<target)l++; else r--;}}
return res;}}