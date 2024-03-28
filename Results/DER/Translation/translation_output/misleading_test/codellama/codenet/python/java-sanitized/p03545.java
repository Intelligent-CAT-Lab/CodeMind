import java.util.Scanner;

public class p03545 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int a = Character.getNumericValue(input.charAt(0));
        int b = Character.getNumericValue(input.charAt(1));
        int c = Character.getNumericValue(input.charAt(2));
        int d = Character.getNumericValue(input.charAt(3));

        if ((a + b + c + d) == 7) {
            System.out.println(a + "+" + b + "+" + c + "+" + d + "=7");
        } else if ((a + b + c - d) == 7) {
            System.out.println(a + "+" + b + "+" + c + "-" + d + "=7");
        } else if ((a + b - c + d) == 7) {
            System.out.println(a + "+" + b + "-" + c + "+" + d + "=7");
        } else if ((a + b - c - d) == 7) {
            System.out.println(a + "+" + b + "-" + c + "-" + d + "=7");
        } else if ((a - b + c + d) == 7) {
            System.out.println(a + "-" + b + "+" + c + "+" + d + "=7");
        } else if ((a - b + c - d) == 7) {
            System.out.println(a + "-" + b + "+" + c + "-" + d + "=7");
        } else if ((a - b - c + d) == 7) {
            System.out.println(a + "-" + b + "-" + c + "+" + d + "=7");
        } else if ((a - b - c - d) == 7) {
            System.out.println(a + "-" + b + "-" + c + "-" + d + "=7");
        }
    }
}