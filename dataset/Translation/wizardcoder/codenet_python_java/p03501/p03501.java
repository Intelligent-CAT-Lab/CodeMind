import java.util.Scanner;

public class p03501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int min = Math.min(A * N, B);
        System.out.println(min);
    }
}