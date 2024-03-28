import java.util.Scanner;

public class p03324 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        int result = 100;
        for (int i = 1; i <= D; i++) {
            result *= 100;
        }
        result *= N;
        if (N == 100) {
            result -= 100;
        }
        System.out.println(result);
    }
}