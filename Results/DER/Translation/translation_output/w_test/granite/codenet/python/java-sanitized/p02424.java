import java.util.Scanner;

public class p02424 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        long a = Long.parseLong(input[0]);
        long b = Long.parseLong(input[1]);

        System.out.println(Long.toBinaryString(a & b));
        System.out.println(Long.toBinaryString(a | b));
        System.out.println(Long.toBinaryString(a ^ b));
    }
}