import java.util.Scanner;

public class p01852 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        if (n!= 0) {
            result = String.valueOf(Integer.toBinaryString(n)).length() - 2;
        }
        System.out.println(result);
    }
}