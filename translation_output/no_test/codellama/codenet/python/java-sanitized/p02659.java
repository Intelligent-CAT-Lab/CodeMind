import java.util.Scanner;
import java.math.BigDecimal;

public class p02659 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String A = input[0];
        String B = input[1];
        BigDecimal result = new BigDecimal(A).multiply(new BigDecimal(B));
        System.out.println(result);
    }
}