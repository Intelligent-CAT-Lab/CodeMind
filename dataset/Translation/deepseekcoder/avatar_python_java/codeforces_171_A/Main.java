import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitInput = input.split(" ");
        String reversedB = new StringBuilder(splitInput[1]).reverse().toString();
        int b = Integer.parseInt(reversedB);
        int a = Integer.parseInt(splitInput[0]);
        System.out.println(a + b);
    }
}