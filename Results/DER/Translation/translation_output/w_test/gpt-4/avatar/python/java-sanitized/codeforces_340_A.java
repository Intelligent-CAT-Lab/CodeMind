import java.util.Scanner;

public class codeforces_340_A {

    // Method to calculate the Greatest Common Divisor (GCD)
    public static int GCD(int a, int b) {
        while (a % b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }

    // Method to calculate the Least Common Multiple (LCM)
    public static int LCM(int a, int b) {
        return (a / GCD(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //