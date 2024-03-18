import java.util.Scanner;

public class p02424 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading two integers from the input, assuming they're separated by a space
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Closing the scanner as good practice since we no longer need it
        scanner.close();

        // Performing the bitwise operations and printing the results in 32-bit binary format
        System.out.println(String.format("%32s", Integer.toBinaryString(a & b)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(a | b)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(a ^ b)).replace(' ', '0'));
    }
}