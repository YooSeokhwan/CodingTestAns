import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        int answer = 1;
        for (int i = 1; i <= a; i++) {
            answer = answer * i;
        }
        System.out.println(answer);
        
    }
}