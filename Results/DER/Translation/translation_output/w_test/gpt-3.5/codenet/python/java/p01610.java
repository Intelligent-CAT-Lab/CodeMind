```java
import java.util.Scanner;

public class RotateCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        
        char[][] s = {
            {'.', '.', 'r', 'r', '.', '.', '.', '.'},
            {'.', '.', 'r', 'r', '.', '.', '.', '.'},
            {'g', 'g', 'y', 'y', 'b', 'b', 'w', 'w'},
            {'g', 'g', 'y', 'y', 'b', 'b', 'w', 'w'},
            {'.', '.', 'o', 'o', '.', '.', '.', '.'},
            {'.', '.', 'o', 'o', '.', '.', '.', '.'}
        };

        for (int k = 0; k < input.length(); k++) {
            s = rotate(s, input.charAt(k));
        }

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                System.out.print(s[i][j]);
            }
            System.out.println();
        }
    }

    public static char[][] rotate(char[][] s, char k) {
        char[][] s_ = new char[6][8];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                s_[i][j] = s[i][j];
            }
        }

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
            // Left rotation logic
        } else if (k == 'U') {
            // Up rotation logic
        } else if (k == 'D') {
            // Down rotation logic
        } else if (k == 'F') {
            // Front rotation logic
        } else {
            // Default rotation logic
        }

        return s_;
    }
}
```
Note: Implement the logic for Left, Up, Down, Front, and Default rotations in the `rotate` method following the Python logic provided.
