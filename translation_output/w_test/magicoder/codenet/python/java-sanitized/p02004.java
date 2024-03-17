import java.util.*;

public class p02004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(countGroups(input));
    }

    public static int countGroups(String s) {
        int r = 0;
        int t = 0;
        for (char c : s.toCharArray()) {
            if (c == 'R') {
                t += 1;
                if (t == 4) {
                    r += 1;
                    t = 0;
                }
            } else {
                t -= 1;
                if (t == -4) {
                    t = 0;
                }
            }
        }
        return r;
    }
}