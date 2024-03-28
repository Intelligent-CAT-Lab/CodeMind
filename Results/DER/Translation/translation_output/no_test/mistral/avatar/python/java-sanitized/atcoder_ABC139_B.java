import java.util.Scanner;

public class atcoder_ABC139_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t, h;
        t = scanner.nextInt();
        h = scanner.nextInt();
        System.out.println((h - 2) / (t - 1) + 1);
    }
}