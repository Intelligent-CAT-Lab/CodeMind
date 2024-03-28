import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int b = Integer.parseInt(split[1].substring(0, split[1].length() - 1));
        int a = Integer.parseInt(split[0]);
        System.out.println(a + b);
    }
}