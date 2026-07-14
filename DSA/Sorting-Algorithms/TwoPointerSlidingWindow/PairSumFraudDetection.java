public class PairSumFraudDetection {
    public static int[] findPairSum(int[] a,int target){
        int l=0,r=a.length-1;
        while(l<r){
            int sum=a[l]+a[r];
            if(sum==target) return new int[]{a[l],a[r]};
            if(sum<target) l++; else r--;
        }
        return new int[]{-1,-1};
    }
}