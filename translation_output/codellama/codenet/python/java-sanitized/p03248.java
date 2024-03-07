import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class p03248 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.charAt(s.length() - 1) == '1' || s.charAt(0) == '0') {
            System.out.println(-1);
            return;
        }

        List<Integer> plist = new ArrayList<>();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '1') {
                plist.add(i);
            }
        }

        for (int i = 0; i < s.length() - 1; i++) {
            int r = plist.indexOf(i);
            System.out.println(i + 1 + " " + (r + 1));
        }
    }
}