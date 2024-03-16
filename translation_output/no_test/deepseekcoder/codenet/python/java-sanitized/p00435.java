import java.util.Scanner;

public class p00435 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = scanner.next();
        StringBuilder list = new StringBuilder();
        for (int i = 0; i < w.length(); i++) {
            char c = w.charAt(i);
            if (c == 'C') {
                list.append('Z');
            } else if (c == 'B') {
                list.append('Y');
            } else if (c == 'A') {
                list.append('X');
            } else {
                list.append((char)(c - 3));
            }
        }
        String l = list.toString();
        System.out.println(l);
    }
}