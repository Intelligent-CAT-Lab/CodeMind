import java.util.Scanner;

public class p01078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double PI = 3.1415926535897932384626433832795;
        double area = n * Math.sin(PI / n) * Math.cos(k * PI / n) / Math.cos((k - 1) * PI / n);
        System.out.println(area);
    }
}