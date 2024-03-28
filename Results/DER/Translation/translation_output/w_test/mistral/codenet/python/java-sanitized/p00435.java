import java.util.ArrayList;
import java.util.Scanner;

public class p00435 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i) == 'C') {
                list.add('Z');
            } else if (w.charAt(i) == 'B') {
                list.add('Y');
            } else if (w.charAt(i) == 'A') {
                list.add('X');
            } else {
                int c = (int) w.charAt(i) - 3;
                list.add((char) c);
            }
        }
        String l = new String(list.toArray());
        System.out.println(l);
    }
}