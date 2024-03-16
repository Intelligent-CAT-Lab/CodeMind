import java.util.Scanner;

public class p03609 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int t = scanner.nextInt();
        int result = x - t;
        System.out.println(result > 0 ? result : 0);
    }
}