import java.util.Scanner;

public class p00435 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < w.length(); i++) {
            char currentChar = w.charAt(i);
            if (currentChar == 'C') {
                sb.append('Z');
            } else if (currentChar == 'B') {
                sb.append('Y');
            } else if (currentChar == 'A') {
                sb.append('X');
            } else {
                char c = (char) (currentChar - 3);
                sb.append(c);
            }
        }

        String result = sb.toString();
        System.out.println(result);
    }
}