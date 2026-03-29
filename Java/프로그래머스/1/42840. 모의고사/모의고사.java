import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i <answers.length; i++) {
            
            if(student1[i % 5] == answers[i]) {
                count1++;
            }
            if(student2[i % 8] == answers[i]) {
                count2++;
            }
            if(student3[i % 10] == answers[i]) {
                count3++;
            }
        }
        List<Integer> list = new ArrayList<>();
        int max = Math.max(count1, Math.max(count2, count3));

        if (count1 == max) list.add(1);
        if (count2 == max) list.add(2);
        if (count3 == max) list.add(3);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}