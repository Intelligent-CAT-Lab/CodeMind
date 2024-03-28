import java.util.Scanner;

public class p03844 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers and an operator (+, -, *, /): ");
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");
        int A = Integer.parseInt(tokens[0]);
        int B = Integer.parseInt(tokens[1]);
        String operator = tokens[2];
        if (operator.equals("+")) {
            System.out.println(A + B);
        } else if (operator.equals("-")) {
            System.out.println(A - B);
        }
    }
}