class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int freeDrink = returnDrink(n);
        answer = (n * 12000) + (k * 2000) - (freeDrink * 2000);
        return answer;
    }
    
    public static int returnDrink(int n) {
        double cal = 0.0;
        if( (n / 10) >= 1 ) {
            cal = (n/10);
            int freeDrink = (int) cal;
            return freeDrink;
        } else {
            return 0;
        }
    }
}