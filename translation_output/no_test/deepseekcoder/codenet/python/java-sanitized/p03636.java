import java.util.Scanner;

public class p03636 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitInput = input.split("\\*");
        String a = splitInput[0];
        String c = splitInput[2];
        String b = splitInput[1];
        System.out.println(a + b.length() + c);
    }
}