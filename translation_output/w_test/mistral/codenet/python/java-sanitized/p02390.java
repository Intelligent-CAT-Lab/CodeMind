import java.util.Scanner;

public class p02390 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ss = scanner.nextInt();
        int hour = ss / (60 * 60);
        int minute = ss % (60 * 60) / 60;
        int second = ss % (60 * 60) % 60;
        System.out.println(hour + ":" + minute + ":" + second);
    }
}