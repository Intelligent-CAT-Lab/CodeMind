import java.util.Scanner;

public class p03860 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");
        String A = tokens[0];
        String x = tokens[1];
        String C = tokens[2];
        System.out.println(A + x.charAt(0) + C);
    }
}