import java.util.Scanner;

public class p00435 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = scanner.next();
        
        StringBuilder list = new StringBuilder();
        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i) == 'C') {
                list.append('Z');
            } else if (w.charAt(i) == 'B') {
                list.append('Y');
            } else if (w.charAt(i) == 'A') {
                list.append('X');
            } else {
                char c = (char)(w.charAt(i) - 3);
                list.append(c);
            }
        }
        String l = list.toString();
        System.out.println(l);
    }
}