import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codeforces_276_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] s = scanner.nextLine().toCharArray();
        boolean x = true;
        Map<Character, Integer> dt = new HashMap<>();

        for (char i : s) {
            dt.put(i, dt.getOrDefault(i, 0) + 1);
        }

        int cnt = 0;
        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                if (cnt < 1) {
                    cnt++;
                } else {
                    x = false;
                    break;
                }
            }
        }

        if (x) {
            System.out.println("First");
        } else if (!x && s.length % 2 == 0) {
            System.out.println("Second");
        } else if (!x) {
            System.out.println("First");
        }

        scanner.close();
    }
}