import java.util.Scanner;

public class p01852 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Integer.toBinaryString(n).length() - (n == 0 ? 0 : 2));
    }
}