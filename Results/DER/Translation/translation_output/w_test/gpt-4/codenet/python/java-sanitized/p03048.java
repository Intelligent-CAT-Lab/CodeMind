import java.util.Scanner;

public class p03048 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");

        int R = Integer.parseInt(inputs[0]);
        int G = Integer.parseInt(inputs[1]);
        int B = Integer.parseInt(inputs[2]);
        int n = Integer.parseInt(inputs[3]);

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

        scanner.close();
    }
}