class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int count=0;
        int total=0;
        Arrays.sort(costs);
        for(int i:costs){
            if(total+i>coins){
                continue;
            }
            else{
                total+=i;
            }
            count++;
        }
        return count;
        
    }
}