import java.util.Scanner;

public class p00435 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'C') {
                output += 'Z';
            } else if (c == 'B') {
                output += 'Y';
            } else if (c == 'A') {
                output += 'X';
            } else {
                output += (char) (c - 3);
            }
        }
        System.out.println(output);
    }
}