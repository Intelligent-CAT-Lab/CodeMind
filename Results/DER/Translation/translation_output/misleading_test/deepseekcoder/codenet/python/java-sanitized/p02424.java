import java.util.Scanner;

public class p02424 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(String.format("%032d", a & b).replace(' ', '0'));
        System.out.println(String.format("%032d", a | b).replace(' ', '0'));
        System.out.println(String.format("%032d", a ^ b).replace(' ', '0'));
    }
}