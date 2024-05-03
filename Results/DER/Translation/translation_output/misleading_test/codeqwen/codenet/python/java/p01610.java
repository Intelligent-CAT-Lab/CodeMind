Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[][] s = {{"..rr....", "..rr....", "ggyybbww", "ggyybbww", "..oo....", "..oo...."},
                {"..rr....", "..rr....", "ggyybbww", "ggyybbww", "..oo....", "..oo...."},
                {"..rr....", "..rr....", "ggyybbww", "ggyybbww", "..oo....", "..oo...."}};

        for (char c : a.toCharArray()) {
            s = rotate(s, c);
        }

        for (String[] row : s) {
            for (String cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }

    public static String[][] rotate(String[][] s, char k) {
        String[][] s_ = new String[6][8];
        if (k == 'R') {
            s_[0][3] = s[2][3];
            s_[1][3] = s[3][3];
            s_[2][3] = s[4][3];
            s_[3][3] = s[5][3];

            s_[4][3] = s[3][6];
            s_[5][3] = s[2][6];
            s_[3][6] = s[0][3];
            s_[2][6] = s[1][3];

            s_[2][4] = s[3][4];
            s_[3][4] = s[3][5];
            s_[3][5] = s[2][5];
            s_[2][5] = s[2][4];
        } else if (k == 'L') {
            s_[0][2
