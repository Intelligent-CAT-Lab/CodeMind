import java.util.Scanner;

public class p02390 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ss = scanner.nextInt();
        int hour = ss / (60 * 60);
        int remainder = ss % (60 * 60);
        int minute = remainder / 60;
        int second = remainder % 60;
        System.out.printf("%d:%d:%d\n", hour, minute, second);
    }
}