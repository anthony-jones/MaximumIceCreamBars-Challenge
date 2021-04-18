import java.util.Arrays;   

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int numOfBars = 0;
        for(int i = 0; i < costs.length; i++){
            if(coins >= costs[i]){
                coins = coins - costs[i];
                numOfBars++;
            } else if (coins < costs[i]){
                break;
            }
        }
        return numOfBars;
    }
}
