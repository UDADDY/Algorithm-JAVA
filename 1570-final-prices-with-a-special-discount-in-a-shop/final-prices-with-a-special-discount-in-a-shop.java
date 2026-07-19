class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] result = new int[n];

        for(int i=0; i<n; i++) {
            int current = prices[i];

            for(int j=i+1; j<n; j++) {
                int next = prices[j];

                if(next <= current) {
                    current -= next;
                    break;
                }
            }

            result[i] = current;
        }

        return result;
    }
}