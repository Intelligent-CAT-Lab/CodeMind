import java.util.Scanner;

public class p03048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int R = Integer.parseInt(input[0]);
        int G = Integer.parseInt(input[1]);
        int B = Integer.parseInt(input[2]);
        int n = Integer.parseInt(input[3]);
        int cnt = 0;
        for (int r = 0; r <= n / R; r++) {
            for (int g = 0; g <= (n - r * R) / G; g++) {
                int b = (n - r * R - g * G) / B;
                if (r * R + g * G + b * B == n) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}