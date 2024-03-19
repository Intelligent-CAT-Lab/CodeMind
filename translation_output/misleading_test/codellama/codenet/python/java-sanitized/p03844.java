import java.util.Scanner;

public class p03844 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");
        int A = Integer.parseInt(tokens[0]);
        int B = Integer.parseInt(tokens[2]);
        String operator = tokens[1];
        if (operator.equals("+")) {
            System.out.println(A + B);
        } else if (operator.equals("-")) {
            System.out.println(A - B);
        }
    }
}