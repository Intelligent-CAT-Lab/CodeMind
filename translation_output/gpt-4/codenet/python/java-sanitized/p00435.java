import java.util.Scanner;

public class p00435 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String w = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < w.length(); i++) {
            char c = w.charAt(i);
            if (c == 'C') {
                sb.append('Z');
            } else if (c == 'B') {
                sb.append('Y');
            } else if (c == 'A') {
                sb.append('X');
            } else {
                char shifted = (char) (c - 3);
                sb.append(shifted);
            }
        }

        String l = sb.toString();
        System.out.println(l);
        
        scanner.close();
    }
}