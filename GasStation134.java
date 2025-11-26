class GasStation134 {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if (totalGas < totalCost) {
            return -1;
        }
        int currentGas = 0;
        int startIndex = 0;

        for (int i = 0; i < gas.length; i++) {
            currentGas += gas[i] - cost[i];
            if (currentGas < 0) {
                startIndex = i + 1;
                currentGas = 0;
            }
        }
        return startIndex;
    }

    public static void main(String[] args){
        int gas[] ={1,2,4,5,7};
        int cost[] = {8,3,1,2,5};
        System.out.println(canCompleteCircuit(gas,cost));
    }
}
