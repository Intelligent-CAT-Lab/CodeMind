import java.util.Scanner;

public class p02423 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mask = (1 << 32) - 1;

        System.out.println(String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(~n & mask)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString((n << 1) & mask)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString((n >> 1) & mask)).replace(' ', '0'));
    }
}