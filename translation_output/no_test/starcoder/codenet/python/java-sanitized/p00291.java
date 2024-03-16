import java.util.*;
public class p00291 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt();
        int c5 = sc.nextInt();
        int c10 = sc.nextInt();
        int c50 = sc.nextInt();
        int c100 = sc.nextInt();
        int c500 = sc.nextInt();
        int sum = c1 + c5*5 + c10*10 + c50*50 + c100*100 + c500*500;
        System.out.println(1 if sum >= 1000 else 0);
    }
}