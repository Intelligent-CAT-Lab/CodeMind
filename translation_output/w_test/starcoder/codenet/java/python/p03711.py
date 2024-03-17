<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3

Expected output:
Yes


```
import java.util.Scanner;

public class p03711 {

    private static boolean grouped(int[] grp, int x, int y) {
        boolean bx = false;
        boolean by = false;

        for (int i = 0; i < grp.length; i++) {
            if (grp[i] == x) {
                bx = true;
            }
            if (grp[i] == y) {
                by = true;
            }
        }

        return bx && by;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] grp1 = {1, 3, 5, 7, 8, 10, 12};
        int[] grp2 = {4, 6, 9, 11};
        int[] grp3 = {2};

        System.out.println( (grouped(grp1, x, y) || grouped(grp2, x, y))? "Yes" : "No" );
    }

}
```

python code:<fim_suffix><fim_middle>

```python
import sys

def grouped(grp, x, y):
    bx = False
    by = False

    for i in range(len(grp)):
        if grp[i] == x:
            bx = True
        if grp[i] == y:
            by = True

    return bx and by

if __name__ == "__main__":
    x = int(sys.stdin.readline())
    y = int(sys.stdin.readline())

    grp1 = [1, 3, 5, 7, 8, 10, 12]
    grp2 = [4, 6, 9, 11]
    grp3 = [2]

    print("Yes" if (grouped(grp1, x, y) or grouped(grp2, x, y)) else "No")
```
<|endoftext|>
