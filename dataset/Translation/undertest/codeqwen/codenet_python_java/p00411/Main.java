import java.util.Scanner;

public class p00411 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int t = Integer.parseInt(inputs[1]);
        int r = Integer.parseInt(inputs[2]);
        double ans = (double) r * t / a;
        System.out.printf("%.6f", ans);
    }
}