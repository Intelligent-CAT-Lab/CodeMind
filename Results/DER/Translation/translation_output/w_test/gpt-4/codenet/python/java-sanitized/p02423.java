import java.util.Scanner;

public class p02423 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int mask = (1 << 32) - 1;

        System.out.println(String.format("%032d", new java.math.BigInteger(Integer.toBinaryString(n))));
        
        // In Java, we need a long type to accommodate the unsigned integer representation of ~n
        long invertedN = (~n) & mask;
        System.out.println(String.format("%032d", new java.math.BigInteger(Long.toBinaryString(invertedN))));
        
        long leftShiftedN = (n << 1) & mask;
        System.out.println(String.format("%032d", new java.math.BigInteger(Long.toBinaryString(leftShiftedN))));
        
        long rightShiftedN = (n >>> 1) & mask;
        System.out.println(String.format("%032d", new java.math.BigInteger(Long.toBinaryString(rightShiftedN))));
    }
}