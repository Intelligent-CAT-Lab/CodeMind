Here's the given Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    
    public static char[][] rotate(char[][] s, char k) {
        char[][] s_ = new char[6][8];
        for (int i = 0; i < 6; i++) {
            System.arraycopy(s[i], 0, s_[i], 0, 8);
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
            s_[0][2] = s[3][7];
            s_[1][2] = s[2][7];
            s_[2][2] = s[0][2];
            s_[3][2] = s[1][2];
            
            s_[4][2] = s[2][2];
            s_[5][2] = s[3][2];
            s_[3][7] = s[4][2];
            s_[2][7] = s[5][2];
            
            s_[2][1] = s[2][0];
            s_[2][0] = s[3][0];
            s_[3][0] = s[3][1];
            s_[3][1] = s[2][1];
        } else if (k == 'U') {
            s_[2][0] = s[2][2];
            s_[2][1] = s[2][3];
            s_[2][2] = s[2][4];
            s_[2][3] = s[2][5];
            
            s_[2][4] = s[2][6];
            s_[2][5] = s[2][7];
            s_[2][6] = s[2][0];
            s_[2][7] = s[2][1];
            
            s_[0][2] = s[1][2];
            s_[1][2] = s[1][3];
            s_[1][3] = s[0][3];
            s_[0][3] = s[0][2];
        } else if (k == 'D') {
            s_[3][0] = s[3][6];
            s_[3][1] = s[3][7];
            s_[3][2] = s[3][0];
            s_[3][3] = s[3][1];
            
            s_[3][4] = s[3][2];
            s_[3][5] = s[3][3];
            s_[3][6] = s[3][4];
            s_[3][7] = s[3][5];
            
            s_[4][2] = s[5][2];
            s_[5][2] = s[5][3];
            s_[5][3] = s[4][3];
            s_[4][3] = s[4][2];
        } else if (k == 'F') {
            s_[1][2] = s[3][1];
            s_[1][3] = s[2][1];
            s_[3][1] = s[4][3];
            s_[2][1] = s[4][2];
            
            s_[4][3] = s[2][4];
            s_[4][2] = s[3][4];
            s_[2][4] = s[1][2];
            s_[3][4] = s[1][3];
            
            s_[2][2] = s[3][2];
            s_[3][2] = s[3][3];
            s_[3][3] = s[2][3];
            s_[2][3] = s[2][2];
        } else { // Assume 'k' is 'B'
            s_[0][2] = s[2][5];
            s_[0][3] = s[3][5];
            s_[2][5] = s[5][3];
            s_[3][5] = s[5][2];
            
            s_[5][3] = s[3][0];
            s_[5][2] = s[2][0];
            s_[3][0] = s[0][2];
            s_[2][0] = s[0][3];
            
            s_[2][6] = s[3][6];
            s_[3][6] = s[3][7];
            s_[3][7] = s[2][7];
            s_[2][7] = s[2][6];
        }
        return s_;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        char[][] s = {
            "..rr....".toCharArray(),
            "..rr....".toCharArray(),
            "ggyybbww".toCharArray(),
            "ggyybbww".toCharArray(),
            "..oo....".toCharArray(),
            "..oo....".toCharArray()
        };
        
        for (int i = 0; i < a.length(); i++) {
            s = rotate(s, a.charAt(i));
        }
        
        for (char[] row : s) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
        scanner.close();
    }
}
```

The above Java code receives an input string (a single character in this context) and then applies the rotation to the 2D array representing the cube's faces. After applying all rotations, it prints out the result.
