import java.util.Scanner;

public class p01078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        double area = N * Math.pow(180/N, 2) * Math.sin(PI/N) * Math.cos(K*PI/N) / Math.cos((K-1)*PI/N);
        System.out.printf("%.5f", area);
    }
}