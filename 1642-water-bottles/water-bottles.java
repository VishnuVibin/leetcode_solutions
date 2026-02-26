class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count=numBottles;
        while(numBottles>=numExchange){
            int rem=numBottles%numExchange;
            int dig=numBottles/numExchange;
            count+=dig;
            numBottles=rem+dig;            
        } 
        return count;
    }
}