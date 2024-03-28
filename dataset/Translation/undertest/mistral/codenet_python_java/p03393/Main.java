import java.util.*;

public class p03393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.length() < 26) {
            for (int i = 0; i < 26; i++) {
                char c = (char) (i + 'a');
                if (!Character.isLetter(c) || !s.contains(c)) {
                    System.out.println(s + c);
                    return;
                }
            }
        } else {
            for (int i = 25; i >= 0; i--) {
                for (int j = ord(s.charAt(i)) + 1; j <= ord('z'); j++) {
                    char c = (char) j;
                    if (!Character.isLetter(c) || !s.substring(0, i).contains(c)) {
                        System.out.println(s.substring(0, i) + c);
                        return;
                    }
                }
            }
            System.out.println(-1);
            return;
        }
    }
}