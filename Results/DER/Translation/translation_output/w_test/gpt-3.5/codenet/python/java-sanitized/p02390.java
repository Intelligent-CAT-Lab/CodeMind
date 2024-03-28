import java.util.Scanner;

public class p02390 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ss = scanner.nextInt();
        
        int hour = ss / (int)Math.pow(60, 2);
        int second = ss % (int)Math.pow(60, 2);
        int minute = second / 60;
        second = second % 60;
        
        System.out.printf("%d:%d:%d%n", hour, minute, second);
    }
}