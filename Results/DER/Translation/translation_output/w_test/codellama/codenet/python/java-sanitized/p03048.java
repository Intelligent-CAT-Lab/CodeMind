import java.util.Scanner;

public class p03048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int G = sc.nextInt();
        int B = sc.nextInt();
        int n = sc.nextInt();
        int cnt = 0;
        for (int r = n/R+1; r >= 0; r--) {
            for (int g = (n-r*R)/G+1; g >= 0; g--) {
                int b = (n-r*R-g*G)/B;
                if (r * R + g * G + b * B == n) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}