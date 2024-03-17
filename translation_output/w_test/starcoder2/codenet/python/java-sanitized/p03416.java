import java.util.Scanner;

public class p03416 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int t = sc.nextInt();
        int count = 0;
        for (int i = f; i <= t; i++) {
            String s = String.valueOf(i);
            if (s.equals(new StringBuilder(s).reverse().toString())) {
                count++;
            }
        }
        System.out.println(count);
    }
}