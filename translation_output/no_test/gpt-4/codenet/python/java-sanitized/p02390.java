import java.util.Scanner;

public class p02390 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int ss = scanner.nextInt();
        
        int hour = ss / (60 * 60);
        int second = ss % (60 * 60);
        int minute = second / 60;
        second = second % 60;
        
        System.out.printf("%d:%d:%d\n", hour, minute, second);
        
        scanner.close();
    }
}