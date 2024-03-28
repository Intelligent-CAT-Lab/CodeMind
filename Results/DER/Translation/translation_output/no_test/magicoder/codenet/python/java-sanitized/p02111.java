import java.util.Scanner;

public class p02111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] result = divmod(input * 2, 60);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] divmod(int dividend, int divisor) {
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        return new int[]{quotient, remainder};
    }
}