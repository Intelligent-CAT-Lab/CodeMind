import java.util.*;

public class atcoder_ABC142_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double result;
        if (N % 2 == 0) {
            result = 0.5;
        } else {
            result = (double) (N + 1) / N / 2;
        }
        System.out.println(result);
    }
}