import java.util.*;
public class p04033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <= 0 && b <= 0) {
            System.out.println("Zero");
        } else if (a <= 0 && b > 0) {
            System.out.println("Negative");
        } else if (a > 0 && b <= 0) {
            System.out.println("Positive");
        } else {
            if ((b - a + 1) % 2 == 1) {
                System.out.println("Negative");
            } else {
                System.out.println("Positive");
            }
        }
    }
}