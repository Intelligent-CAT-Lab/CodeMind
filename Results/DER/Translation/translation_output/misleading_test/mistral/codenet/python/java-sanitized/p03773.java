import java.util.Scanner;

public class p03773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = (a + b) % 24;
        System.out.println(result);
    }
}