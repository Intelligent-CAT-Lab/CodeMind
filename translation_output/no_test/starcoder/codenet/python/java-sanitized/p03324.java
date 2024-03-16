import java.util.*;
public class p03324 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        System.out.println(Math.pow(100, D) * (N!= 100? N : N + 1));
    }
}