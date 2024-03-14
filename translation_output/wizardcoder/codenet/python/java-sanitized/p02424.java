import java.util.Scanner;

public class p02424 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(String.format("%32s", Integer.toBinaryString(a & b)));
        System.out.println(String.format("%32s", Integer.toBinaryString(a | b)));
        System.out.println(String.format("%32s", Integer.toBinaryString(a ^ b)));
    }
}