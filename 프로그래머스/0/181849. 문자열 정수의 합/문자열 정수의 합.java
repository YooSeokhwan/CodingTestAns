class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] num_strs = num_str.split("");
        int[] nums = new int[num_strs.length];
        
        for (int i = 0; i < num_strs.length; i++) {
            String s = num_strs[i];
            
            nums[i] = Integer.parseInt(s);
            answer = answer + nums[i];
        }
        return answer;
    }
}