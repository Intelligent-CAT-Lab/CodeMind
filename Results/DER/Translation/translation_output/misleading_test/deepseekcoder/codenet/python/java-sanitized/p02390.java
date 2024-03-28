import java.util.Scanner;

public class p02390 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ss = scanner.nextInt();
        int hour = ss / (60*60);
        int second = ss % (60*60);
        int minute = second / 60;
        second = second % 60;
        System.out.printf("%02d:%02d:%02d", hour, minute, second);
    }
}