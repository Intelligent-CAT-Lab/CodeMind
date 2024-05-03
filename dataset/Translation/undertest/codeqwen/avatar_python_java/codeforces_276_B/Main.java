import java.util.HashMap;
import java.util.Map;

public class codeforces_276_B {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        char[] chars = s.toCharArray();
        Map<Character, Integer> dt = new HashMap<>();
        for (char c : chars) {
            if (dt.containsKey(c)) {
                dt.put(c, dt.get(c) + 1);
            } else {
                dt.put(c, 1);
            }
        }
        int cnt = 0;
        boolean x = true;
        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
            if (entry.getValue() % 2 != 0 && cnt < 1) {
                cnt += 1;
            } else if (entry.getValue() % 2 != 0 && cnt >= 1) {
                x = false;
                break;
            }
        }
        if (x) {
            System.out.println(" First ");
        } else if (!x && s.length() % 2 == 0) {
            System.out.println(" Second ");
        } else if (!x && s.length() % 2 != 0) {
            System.out.println(" First ");
        }
    }
}