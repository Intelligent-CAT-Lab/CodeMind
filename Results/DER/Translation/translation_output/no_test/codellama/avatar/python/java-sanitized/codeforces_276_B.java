import java.util.Scanner;
import java.util.HashMap;

public class codeforces_276_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] s = input.split(" ");
        HashMap<String, Integer> dt = new HashMap<>();
        for (String i : s) {
            if (dt.containsKey(i)) {
                dt.put(i, dt.get(i) + 1);
            } else {
                dt.put(i, 1);
            }
        }
        int cnt = 0;
        boolean x = true;
        for (String key : dt.keySet()) {
            if (dt.get(key) % 2 != 0 && cnt < 1) {
                cnt++;
            } else if (dt.get(key) % 2 != 0 && cnt >= 1) {
                x = false;
                break;
            }
        }
        if (x) {
            System.out.println("First");
        } else if (!x && s.length % 2 == 0) {
            System.out.println("Second");
        } else if (!x && s.length % 2 != 0) {
            System.out.println("First");
        }
    }
}