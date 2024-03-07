import java.util.Scanner;

public class p00017 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.trim();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ' && c != '.') {
                s = s.replace(c, (char) (c + 1));
            }
        }
        s = s.replace((char) (ord('z') + 1), 'a');
        System.out.println(s);
    }
}