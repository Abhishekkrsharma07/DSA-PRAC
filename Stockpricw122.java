
public class Stockpricw122 {
    public static int MaxProfit(int[] prices){
        int profit = 0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]>prices[i]){
                profit += prices[i+1]-prices[i];
            }
           
        }
         return profit;
    }

    public static void main(String[] args){
        int prices[] = {1,4,8,4,9};
        System.out.println(MaxProfit(prices));
    }
}
