import java.util.Scanner;

public class p02137 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num - num % 500);
    }
}