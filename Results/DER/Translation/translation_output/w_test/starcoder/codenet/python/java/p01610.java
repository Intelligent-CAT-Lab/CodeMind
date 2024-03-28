<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
R

Expected output:
..ry....
..ry....
ggyobbrw
ggyobbrw
..ow....
..ow....


```
def rotate(s,k):
    s_ = [[s[i][j] for j in range(8)] for i in range(6)]
    if k == "R":
        s_[0][3] = s[2][3]
        s_[1][3] = s[3][3]
        s_[2][3] = s[4][3]
        s_[3][3] = s[5][3]

        s_[4][3] = s[3][6]
        s_[5][3] = s[2][6]
        s_[3][6] = s[0][3]
        s_[2][6] = s[1][3]

        s_[2][4] = s[3][4]
        s_[3][4] = s[3][5]
        s_[3][5] = s[2][5]
        s_[2][5] = s[2][4]

    elif k == "L":
        s_[0][2] = s[3][7]
        s_[1][2] = s[2][7]
        s_[2][2] = s[0][2]
        s_[3][2] = s[1][2]

        s_[4][2] = s[2][2]
        s_[5][2] = s[3][2]
        s_[3][7] = s[4][2]
        s_[2][7] = s[5][2]

        s_[2][1] = s[2][0]
        s_[2][0] = s[3][0]
        s_[3][0] = s[3][1]
        s_[3][1] = s[2][1]

    elif k == "U":
        s_[2][0] = s[2][2]
        s_[2][1] = s[2][3]
        s_[2][2] = s[2][4]
        s_[2][3] = s[2][5]

        s_[2][4] = s[2][6]
        s_[2][5] = s[2][7]
        s_[2][6] = s[2][0]
        s_[2][7] = s[2][1]

        s_[0][2] = s[1][2]
        s_[1][2] = s[1][3]
        s_[1][3] = s[0][3]
        s_[0][3] = s[0][2]

    elif k == "D":
        s_[3][0] = s[3][6]
        s_[3][1] = s[3][7]
        s_[3][2] = s[3][0]
        s_[3][3] = s[3][1]

        s_[3][4] = s[3][2]
        s_[3][5] = s[3][3]
        s_[3][6] = s[3][4]
        s_[3][7] = s[3][5]

        s_[4][2] = s[5][2]
        s_[5][2] = s[5][3]
        s_[5][3] = s[4][3]
        s_[4][3] = s[4][2]

    elif k == "F":
        s_[1][2] = s[3][1]
        s_[1][3] = s[2][1]
        s_[3][1] = s[4][3]
        s_[2][1] = s[4][2]

        s_[4][3] = s[2][4]
        s_[4][2] = s[3][4]
        s_[2][4] = s[1][2]
        s_[3][4] = s[1][3]

        s_[2][2] = s[3][2]
        s_[3][2] = s[3][3]
        s_[3][3] = s[2][3]
        s_[2][3] = s[2][2]

    else:
        s_[0][2] = s[2][5]
        s_[0][3] = s[3][5]
        s_[2][5] = s[5][3]
        s_[3][5] = s[5][2]

        s_[5][3] = s[3][0]
        s_[5][2] = s[2][0]
        s_[3][0] = s[0][2]
        s_[2][0] = s[0][3]

        s_[2][6] = s[3][6]
        s_[3][6] = s[3][7]
        s_[3][7] = s[2][7]
        s_[2][7] = s[2][6]
    return s_
a = input()
s = ["..rr....", "..rr....","ggyybbww","ggyybbww","..oo....","..oo...."]
for k in a:
    s = rotate(s,k)

for i in s:
    for j in i:
        print(j,end = "")
    print()


```

java code:<fim_suffix><fim_middle>

```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[][] arr = new String[6][8];
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 8; j++) {
                arr[i][j] = ".";
            }
        }
        arr[0][3] = arr[2][3] = arr[3][3] = arr[4][3] = arr[5][3] = ".";
        arr[4][3] = arr[3][6] = arr[2][6] = arr[0][3] = arr[1][3] = ".";
        arr[2][4] = arr[3][4] = arr[3][5] = arr[2][5] = arr[2][4] = ".";
        arr[0][2] = arr[2][5] = arr[3][5] = arr[5][3] = arr[5][2] = ".";
        arr[5][3] = arr[3][0] = arr[2][0] = arr[0][2] = arr[0][3] = ".";
        arr[2][6] = arr[3][6] = arr[3][7] = arr[2][7] = arr[2][6] = ".";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'R') {
                String temp = arr[0][3];
                arr[0][3] = arr[2][3];
                arr[2][3] = arr[3][3];
                arr[3][3] = arr[4][3];
                arr[4][3] = arr[5][3];
                arr[5][3] = temp;

                temp = arr[4][3];
                arr[4][3] = arr[3][6];
                arr[3][6] = arr[2][6];
                arr[2][6] = arr[0][3];
                arr[0][3] = arr[1][3];
                arr[1][3] = temp;

                temp = arr[2][4];
                arr[2][4] = arr[3][4];
                arr[3][4] = arr[3][5];
                arr[3][5] = arr[2][5];
                arr[2][5] = arr[2][4];
            }
            else if(s.charAt(i) == 'L') {
                String temp = arr[0][2];
                arr[0][2] = arr[3][7];
                arr[3][7] = arr[2][7];
                arr[2][7] = arr[0][2];
                arr[0][2] = arr[1][2];
                arr[1][2] = temp;

                temp = arr[4][2];
                arr[4][2] = arr[2][2];
                arr[2][2] = arr[3][2];
                arr[3][2] = arr[3][7];
                arr[3][7] = arr[4][2];
                arr[4][2] = temp;

                temp = arr[2][1];
                arr[2][1] = arr[2][0];
                arr[2][0] = arr[3][0];
                arr[3][0] = arr[3][1];
                arr[3][1] = arr[2
