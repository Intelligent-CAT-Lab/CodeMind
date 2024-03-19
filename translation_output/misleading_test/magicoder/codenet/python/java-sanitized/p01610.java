import java.util.*;

public class p01610 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] s = {"..rr....", "..rr....","ggyybbww","ggyybbww","..oo....","..oo...."};
        for (char k : input.toCharArray()) {
            s = rotate(s, k);
        }
        for (String i : s) {
            System.out.println(i);
        }
    }

    public static String[] rotate(String[] s, char k) {
        String[] s_ = new String[6];
        for (int i = 0; i < 6; i++) {
            s_[i] = s[i];
        }
        if (k == 'R') {
            s_[0] = s[2] + s[3] + s[4] + s[5];
            s_[1] = s[3] + s[4] + s[5] + s[2];
            s_[2] = s[4] + s[5] + s[0] + s[1];
            s_[3] = s[5] + s[0] + s[1] + s[2];
            s_[4] = s[3] + s[6] + s[7] + s[0];
            s_[5] = s[2] + s[6] + s[7] + s[1];
        } else if (k == 'L') {
            s_[0] = s[7] + s[6] + s[2] + s[3];
            s_[1] = s[6] + s[7] + s[3] + s[2];
            s_[2] = s[2] + s[3] + s[0] + s[1];
            s_[3] = s[3] + s[0] + s[1] + s[2];
            s_[4] = s[2] + s[2] + s[4] + s[5];
            s_[5] = s[3] + s[3] + s[5] + s[4];
        } else if (k == 'U') {
            s_[0] = s[2] + s[3] + s[4] + s[5];
            s_[1] = s[3] + s[4] + s[5] + s[2];