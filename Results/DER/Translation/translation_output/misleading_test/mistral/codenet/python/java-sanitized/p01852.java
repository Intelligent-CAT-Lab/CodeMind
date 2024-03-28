import java.util.Scanner;

public class p01852 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = (n == 0) ? 0 : (int) (Math.log(n) / Math.log(2)) - 2;
        System.out.println(result);
    }
}