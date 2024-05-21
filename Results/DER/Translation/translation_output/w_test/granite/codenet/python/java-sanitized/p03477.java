import java.util.*;

public class p03477 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        if (A + B < C + D) {
            System.out.println("Left");
        } else if (A + B == C + D) {
            System.out.println("Balanced");
        } else {
            System.out.println("Right");
        }
    }
}