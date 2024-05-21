import java.util.*;

public class p00387 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int result = (B + A - 1) / A;
        System.out.println(result);
    }
}