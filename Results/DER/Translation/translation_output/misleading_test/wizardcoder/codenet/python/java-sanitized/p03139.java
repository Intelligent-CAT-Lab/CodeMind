import java.util.Scanner;

public class p03139 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int minValue = Math.min(A, B);
        int maxValue = Math.max(A + B - N, 0);
        System.out.println(minValue + " " + maxValue);
    }
}