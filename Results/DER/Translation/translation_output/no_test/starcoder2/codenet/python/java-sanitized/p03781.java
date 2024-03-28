import java.util.Scanner;
import java.lang.Math;

public class p03781 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int k = 0;
        int t = 0;

        if (Math.sqrt(8 * x + 1) == Math.floor(Math.sqrt(8 * x + 1))) {
            int a = (int) ((-1 + Math.sqrt(1 + 8 * x)) / 2);
            System.out.println(a);
        } else {
            int x1 = (int) ((-1 + Math.sqrt(1 + 8 * x)) / 2);
            System.out.println(x1 + 1);
        }
    }
}