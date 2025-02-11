class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = {};
        int[] nums = new int[strlist.length];
        for (int i =0; i < strlist.length; i++) {
           char[] charArray = strlist[i].toCharArray();
           nums[i] = charArray.length;
        
        }
        return nums;
    }
}