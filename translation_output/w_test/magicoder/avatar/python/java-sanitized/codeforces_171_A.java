import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        StringBuilder b = new StringBuilder(input[1]);
        b.reverse();
        long result = Long.parseLong(input[0]) + Long.parseLong(b.toString());
        System.out.println(result);
    }
}