import java.util.Scanner;

public class p02390 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int ss = scanner.nextInt();

        int hour = ss / (60 * 60);
        int remainingSeconds = ss % (60 * 60);
        int minute = remainingSeconds / 60;
        int second = remainingSeconds % 60;

        System.out.printf("%d:%d:%d%n", hour, minute, second);
    }
}