import java.util.*;
public class codeforces_276_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean x = true;
        HashMap<Character, Integer> dt = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (dt.containsKey(ch)) {
                dt.put(ch, dt.get(ch) + 1);
            } else {
                dt.put(ch, 1);
            }
        }
        int cnt = 0;
        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
            if (entry.getValue() % 2!= 0 && cnt < 1) {
                cnt++;
            } else if (entry.getValue() % 2!= 0 && cnt >= 1) {
                x = false;
                break;
            }
        }
        if (x) {
            System.out.println("First");
        } else if (!x && s.length() % 2 == 0) {
            System.out.println("Second");
        } else if (!x && s.length() % 2!= 0) {
            System.out.println("First");
        }
    }
}