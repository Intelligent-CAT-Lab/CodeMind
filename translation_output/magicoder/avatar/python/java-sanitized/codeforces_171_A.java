import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String reversedB = new StringBuilder(input[1]).reverse().toString();
        int b = Integer.parseInt(reversedB);
        int sum = Integer.parseInt(input[0]) + b;
        System.out.println(sum);
    }
}