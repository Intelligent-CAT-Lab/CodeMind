import java.util.Scanner;

public class p02263 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");
        int result = 0;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                int a = result;
                int b = Integer.parseInt(tokens[i + 1]);
                result = a + b;
                i++;
            } else if (tokens[i].equals("-")) {
                int a = result;
                int b = Integer.parseInt(tokens[i + 1]);
                result = a - b;
                i++;
            } else if (tokens[i].equals("*")) {
                int a = result;
                int b = Integer.parseInt(tokens[i + 1]);
                result = a * b;
                i++;
            } else {
                result = Integer.parseInt(tokens[i]);
            }
        }
        System.out.println(result);
    }
}