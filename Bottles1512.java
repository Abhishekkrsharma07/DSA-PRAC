class Bottles1512 {
    public static void main(String[] args) {
        int numBottles = 9;
        int numExchange = 3;

        Solution solution = new Solution();
        int totalDrank = solution.numWaterBottles(numBottles, numExchange);

        System.out.println("Total bottles drank: " + totalDrank);
    }
}

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrank = numBottles;
        int empty = numBottles;
        
        while (empty >= numExchange) {
            int newBottles = empty / numExchange;           // exchange empties for full bottles
            totalDrank += newBottles;                      // drink the new bottles
            empty = empty % numExchange + newBottles;      // update empty bottles
        }
        
        return totalDrank;
    }
}

//class Solution{
//     public int numWaterBottles(int numBottles, int numExchange){
//         int count = numBottles;

//         while(numBottles >= numExchange){
//             int remainBottles = numBottles/numExchange;
//             count = count + remainBottles;

//             remainBottles = numBottles % numExchange;
//         }
//         return count;
//     }
// }

