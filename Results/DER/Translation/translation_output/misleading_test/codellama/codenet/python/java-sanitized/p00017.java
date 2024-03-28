import java.util.Scanner;

public class p00017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = decode(input);
        System.out.println(output);
    }

    public static String decode(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != ' ' && c != '.') {
                result += (char) (c + 1);
            } else {
                result += c;
            }
        }
        return result.replace((char) (ord('z') + 1), 'a');
    }
}