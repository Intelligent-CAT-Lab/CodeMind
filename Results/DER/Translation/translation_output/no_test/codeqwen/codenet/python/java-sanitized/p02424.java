import java.util.Scanner;

public class p02424 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0], 2);
        int b = Integer.parseInt(input[1], 2);

        System.out.println(String.format("%032d", a & b));
        System.out.println(String.format("%032d", a | b));
        System.out.println(String.format("%032d", a ^ b));
    }
}