import java.util.*;
public class p02439 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        System.out.println(Math.min(min,c)+" "+Math.max(max,c));
    }
}
