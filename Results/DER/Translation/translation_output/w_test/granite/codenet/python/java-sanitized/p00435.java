import java.util.*;

public class p00435 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        String result = "";
        for (int i = 0; i < w.length(); i++) {
            char c = w.charAt(i);
            if (c == 'C') {
                result += 'Z';
            } else if (c == 'B') {
                result += 'Y';
            } else if (c == 'A') {
                result += 'X';
            } else {
                result += (char) (c - 3);
            }
        }
        System.out.println(result);
    }
}