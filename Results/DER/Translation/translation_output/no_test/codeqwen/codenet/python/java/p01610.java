Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[][] s = {
                {"..rr....", "..rr....", "ggyybbww", "ggyybbww", "..oo....", "..oo...."},
                {"..rr....", "..rr....", "ggyybbww", "ggyybbww", "..oo....", "..oo...."},
                {"..rr....", "..rr....", "ggyybbww", "ggyybbww", "..oo....", "..oo...."},
                {"..rr....", "..rr....", "ggyybbww", "ggyybbww", "..oo....", "..oo...."},
                {"..rr....", "..rr....", "ggyybbww", "ggyybbww", "..oo....", "..oo...."},
                {"..rr....", "..rr....", "ggyybbww", "ggyybbww", "..oo....", "..oo...."}
        };

        for (char k : a.toCharArray()) {
            s = rotate(s, k);
        }

        for (String[] i : s) {
            for (String j : i) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static String[][] rotate(String[][] s, char k) {
        String[][] s_ = new String[6][8];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                s_[i][j] = s[i][j];
            }
        }

        if (k == 'R') {
            s_[0][3] = s[2][3];
            s_[1][3] = s[3][3];
            s_[2][3] = s
