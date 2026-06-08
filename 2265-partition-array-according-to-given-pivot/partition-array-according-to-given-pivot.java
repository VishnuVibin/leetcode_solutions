class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
    ArrayList<Integer> list1=new ArrayList<>();
    ArrayList<Integer> list2=new ArrayList<>();
    ArrayList<Integer> list3=new ArrayList<>();
    for(int i:nums){
        if(i<pivot){
            list1.add(i);
        }
        else if(i==pivot){
            list3.add(i);
        }
        else{
            list2.add(i);
        }
      } 
    list1.addAll(list3);
    list1.addAll(list2);
    int[] res=new int[list1.size()];
    for(int i=0;i<list1.size();i++){
        res[i]=list1.get(i);
    } 
    return res;
    
    
    }
}