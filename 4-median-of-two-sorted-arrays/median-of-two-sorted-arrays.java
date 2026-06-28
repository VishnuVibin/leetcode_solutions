class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            arr[i+nums1.length]=nums2[i];
        }
        Arrays.sort(arr);
        int n=arr.length;
        int mid=n/2;
        if(n%2==0){
            return (double)(arr[mid-1]+arr[mid])/2;
        }
        else{
            return (double)arr[mid];
        }
    }
}