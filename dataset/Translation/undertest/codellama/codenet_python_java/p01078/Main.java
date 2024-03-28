import java.lang.Math;

public class p01078 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int K = Integer.parseInt(args[1]);
        double PI = 3.1415926535897932384626433832795;
        double area = N * Math.pow(Math.sin(PI / N), 2) * Math.cos(K * PI / N) * Math.cos((K - 1) * PI / N);
        System.out.println(area);
    }
}