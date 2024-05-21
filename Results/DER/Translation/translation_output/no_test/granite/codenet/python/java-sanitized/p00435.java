import java.util.*;

public class p00435 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < w.length(); i++) {
            char c = w.charAt(i);
            if (c == 'C') {
                list.add('Z');
            } else if (c == 'B') {
                list.add('Y');
            } else if (c == 'A') {
                list.add('X');
            } else {
                int code = c - 3;
                list.add((char) code);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c);
        }
        String l = sb.toString();
        System.out.println(l);
    }
}