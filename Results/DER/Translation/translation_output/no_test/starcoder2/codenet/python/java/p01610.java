
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] s = {"..rr....", "..rr....","ggyybbww","ggyybbww","..oo....","..oo...."};
        for (int i = 0; i < a.length(); i++) {
            s = rotate(s,a.charAt(i));
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length(); j++) {
                System.out.print(s[i].charAt(j));
            }
            System.out.println();
        }
    }

    public static String[] rotate(String[] s, char k) {
        String[] s_ = new String[6];
        for (int i = 0; i < 6; i++) {
            s_[i] = "";
            for (int j = 0; j < 8; j++) {
                s_[i] += s[i].charAt(j);
            }
        }
        if (k == 'R') {
            s_[0] = s_[0].substring(0, 3) + s[2].charAt(3) + s_[0].substring(4);
            s_[1] = s_[1].substring(0, 3) + s[3].charAt(3) + s_[1].substring(4);
            s_[2] = s_[2].substring(0, 3) + s[4].charAt(3) + s_[2].substring(4);
            s_[3] = s_[3].substring(0, 3) + s[5].charAt(3) + s_[3].substring(4);

            s_[4] = s_[4].substring(0, 3) + s[3].charAt(6) + s_[4].substring(4);
            s_[5] = s_[5].substring(0, 3) + s[2].charAt(6) + s_[5].substring(4);
            s_[3] = s_[3].substring(0, 6) + s[0].charAt(3) + s_[3].substring(7);
            s_[2] = s_[2].substring(0, 6) + s[1].charAt(3) + s_[2].substring(7);

            s_[2] = s_[2].substring(0, 4) + s[3].charAt(4) + s_[2].substring(5);
            s_[3] = s_[3].substring(0, 4) + s[3].charAt(5) + s_[3].substring(5);
            s_[3] = s_[3].substring(0, 5) + s[2].charAt(5) + s_[3].substring(6);
            s_[2] = s_[2].substring(0, 5) + s[2].charAt(4) + s_[2].substring(6);
        } else if (k == 'L') {
            s_[0] = s_[0].substring(0, 2) + s[3].charAt(7) + s_[0].substring(3);
            s_[1] = s_[1].substring(0, 2) + s[2].charAt(7) + s_[1].substring(3);
            s_[2] = s_[2].substring(0, 2) + s[0].charAt(2) + s_[2].substring(3);
            s_[3] = s_[3].substring(0, 2) + s[1].charAt(2) + s_[3].substring(3);

            s_[4] = s_[4].substring(0, 2) +
