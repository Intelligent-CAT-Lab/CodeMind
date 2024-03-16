import java.util.Scanner;

public class p02423 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mask = (1 << 32) - 1;

        System.out.println(String.format("%32s", Integer.toBinaryString(n)).replaceAll(" ", "0"));
        System.out.println(String.format("%32s", Integer.toBinaryString(~n & mask)).replaceAll(" ", "0"));
        System.out.println(String.format("%32s", Integer.toBinaryString((n << 1) & mask)).replaceAll(" ", "0"));
        System.out.println(String.format("%32s", Integer.toBinaryString((n >>> 1) & mask)).replaceAll(" ", "0"));

        scanner.close();
    }
}