class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int i=0;
        int count=0;
        int[] arr=new int[n+1];
        while(i<n){
            
            count+=gain[i];
            arr[i+1]=count;
            i++;
        }
        int max=Integer.MIN_VALUE;
        for(int j=0;j<n+1;j++){
            max=Math.max(arr[j],max);
            
        }
        return max;
    }
}