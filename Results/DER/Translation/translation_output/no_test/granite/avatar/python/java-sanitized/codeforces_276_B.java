import java.util.*;

public class codeforces_276_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        Map<Character, Integer> dt = new HashMap<>();
        for (char c : arr) {
            if (dt.containsKey(c)) {
                dt.put(c, dt.get(c) + 1);
            } else {
                dt.put(c, 1);
            }
        }
        int cnt = 0;
        boolean x = true;
        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
            if (entry.getValue() % 2!= 0 && cnt < 1) {
                cnt += 1;
            } else if (entry.getValue() % 2!= 0 && cnt >= 1) {
                x = false;
                break;
            }
        }
        if (x) {
            System.out.println("First");
        } else if (!x && arr.length % 2 == 0) {
            System.out.println("Second");
        } else if (!x && arr.length % 2!= 0) {
            System.out.println("First");
        }
    }
}