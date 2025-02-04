class Solution {
    public String solution(String my_string, int k) {
        String answer = returnValue(my_string, k);
        return answer;
    }
    public static String returnValue(String str, int k) {
        String[] strArr = new String[k-1];
        for(int i = 0; i < k -1; i++) {
            strArr[i] = str;
        }
        
        for(String string : strArr) {
            str = str + string;
        }
        return str;
    }
}