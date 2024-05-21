import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String a = input[0];
        String b = input[1];
        b = new StringBuilder(b).reverse().toString();
        long result = Long.parseLong(a) + Long.parseLong(b);
        System.out.println(result);
    }
}