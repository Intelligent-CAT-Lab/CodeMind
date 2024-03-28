import java.util.Scanner;

public class p01610 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
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
        if (k == 'R') {
            s_[0] = s[2].substring(4) + s[0].substring(0, 3);
            s_[1] = s[3].substring(4) + s[1].substring(0, 3);
            s_[2] = s[4].substring(4) + s[2].substring(0, 3);
            s_[3] = s[5].substring(4) + s[3].substring(0, 3);

            s_[4] = s[3].substring(0, 3) + s[4].substring(3);
            s_[5] = s[2].substring(0, 3) + s[5].substring(3);
        }
        // Similar transformations for other directions
        // ...
        return s_;
    }
}