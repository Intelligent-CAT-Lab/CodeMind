import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int b = Integer.parseInt(new StringBuilder(input[1]).reverse().toString());
        int a = Integer.parseInt(input[0]);
        System.out.println(a + b);
    }
}