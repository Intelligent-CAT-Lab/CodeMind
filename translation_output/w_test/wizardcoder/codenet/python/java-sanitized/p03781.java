import java.util.Scanner;

public class p03781 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int k = 0;
        int t = 0;

        if (Math.sqrt(8 * x + 1) == Math.floor(Math.sqrt(8 * x + 1))) {
            double a = (-1 + Math.sqrt(1 + 8 * x)) / 2;
            System.out.println(Math.floor(a));
        } else {
            int x1 = (-1 + (int) Math.sqrt(1 + 8 * x)) / 2;
            System.out.println(x1 + 1);
        }
    }
}