class divideint29 {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend < 0) ^ (divisor <0);

        long ldividend = Math.abs((long) dividend);
        long ldivisor = Math.abs((long) divisor);
        int result =0;

        while (ldividend >= ldivisor){
            long temp = ldivisor, multiple =1;
            while(ldividend >=(temp << 1)){
                temp <<= 1;
                multiple <<=1;

            }

            ldividend -= temp;
            result += multiple;

        }
        return negative ? -result : result;
    }
}