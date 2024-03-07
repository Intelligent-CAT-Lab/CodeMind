import java.util.Scanner;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] s = input.split(" ");
        if (s[0].equals(s[1]) && s[2].equals(s[3]) && !s[0].equals(s[2])) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}