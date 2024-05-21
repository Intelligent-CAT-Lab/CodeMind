import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int G = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        int count = 0;
        for (int r = 0; r <= N / R; r++) {
            for (int g = 0; g <= (N - r * R) / G; g++) {
                if ((N - r * R - g * G) % B == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}