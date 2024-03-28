import java.util.*;

public class p01610 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] s = {"..rr....", "..rr....","ggyybbww","ggyybbww","..oo....","..oo...."};
        for (char k : input.toCharArray()) {
            s = rotate(s, Character.toString(k));
        }
        for (String i : s) {
            System.out.println(i);
        }
    }

    public static String[] rotate(String[] s, String k) {
        String[] s_ = new String[6];
        for (int i = 0; i < 6; i++) {
            s_[i] = s[i];
        }
        if (k.equals("R")) {
            s_[0] = s[2].substring(0, 3) + s[3].charAt(3) + s[4].substring(3);
            s_[1] = s[3].substring(0, 3) + s[4].charAt(3) + s[5].substring(3);
            s_[2] = s[4].substring(0, 3) + s[5].charAt(3) + s[0].substring(3);
            s_[3] = s[5].substring(0, 3) + s[0].charAt(3) + s[1].substring(3);

            s_[4] = s[3].substring(0, 6) + s[2].charAt(3) + s[1].substring(3);
            s_[5] = s[2].substring(0, 6) + s[1].charAt(3) + s[0].substring(3);
            s_[3] = s[4].substring(0, 6) + s[5].charAt(3) + s[3].substring(3);
            s_[2] = s[5].substring(0, 6) + s[4].charAt(3) + s[3].substring(3);

            s_[2] = s[2].substring(0, 4) + s[3].charAt(4) + s[3].charAt(5) + s[2].substring(5);
            s_[3] = s[3].substring(0, 4) +