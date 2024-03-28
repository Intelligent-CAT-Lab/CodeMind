import java.util.*;
public class p02843 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int q = N / 100;
        int mod = N % 100;
        System.out.println(1 if mod <= q * 5 else 0);
    }
}