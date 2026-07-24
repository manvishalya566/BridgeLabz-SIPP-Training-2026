public class FixedWindowCPUSpike{
public static int maxSubarrayOfSizeK(int[] a,int k){
int sum=0,max=Integer.MIN_VALUE,s=0;
for(int e=0;e<a.length;e++){sum+=a[e]; if(e>=k-1){max=Math.max(max,sum); sum-=a[s++];}}
return max;}}