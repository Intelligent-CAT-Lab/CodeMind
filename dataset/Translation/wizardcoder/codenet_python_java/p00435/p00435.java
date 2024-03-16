import java.util.Scanner;

public class p00435 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
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
                int ascii = (int) c;
                ascii -= 3;
                sb.append((char) ascii);
            }
        }
        String l = sb.toString();
        System.out.println(l);
    }
}