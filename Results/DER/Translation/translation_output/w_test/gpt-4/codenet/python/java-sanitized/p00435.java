import java.util.Scanner;

public class p00435 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = scanner.nextLine();
        scanner.close();

        StringBuilder list = new StringBuilder();
        for (int i = 0; i < w.length(); i++) {
            char letter = w.charAt(i);
            if (letter == 'C') {
                list.append('Z');
            } else if (letter == 'B') {
                list.append('Y');
            } else if (letter == 'A') {
                list.append('X');
            } else {
                char c = (char) (letter - 3);
                list.append(c);
            }
        }
        String l = list.toString();
        System.out.println(l);
    }
}