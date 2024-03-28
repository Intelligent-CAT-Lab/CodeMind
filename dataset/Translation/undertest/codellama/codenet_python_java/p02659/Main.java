import java.util.Scanner;
import java.math.BigDecimal;

public class p02659 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        double B = Double.parseDouble(input[1]);
        System.out.println(A * B);
    }
}