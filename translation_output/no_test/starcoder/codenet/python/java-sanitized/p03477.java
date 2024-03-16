import java.util.*;
public class p03477 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        if (a + b < c + d) {
            System.out.println("Right");
        } else if (a + b == c + d) {
            System.out.println("Balanced");
        } else {
            System.out.println("Left");
        }
    }
}