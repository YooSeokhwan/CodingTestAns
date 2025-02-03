class Solution {
    public int solution(int number, int n, int m) {
        int answer = identify(number, n, m);
        return answer;
    }
    
    public int identify(int number, int n, int m) {
        if((number % n) == 0) {
            if((number % m) == 0) {
                return 1;
            } return 0;
        } else {
            return 0;
        }
    }
}