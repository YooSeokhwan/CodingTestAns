class Solution {
    public int solution(int num, int n) {
        int answer = identify(num, n);
        return answer;
    }
    
    
    public int identify(int num, int n) {
        if((num % n) == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}