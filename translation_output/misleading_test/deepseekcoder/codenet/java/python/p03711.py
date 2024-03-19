<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3

Expected output:
IYs

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

        System.out.println( (grouped(grp1, x, y) || grouped(grp2, x, y)) ? "Yes" : "No" );
    }

}
```

### Response:
```python
def grouped(grp, x, y):
    bx = False
    by = False

    for i in grp:
        if i == x:
            bx = True
        if i == y:
            by = True

    return bx and by

def main():
    x, y = map(int, input().split())

    grp1 = [1, 3, 5, 7, 8, 10, 12]
    grp2 = [4, 6, 9, 11]
    grp3 = [2]

    if grouped(grp1, x, y) or grouped(grp2, x, y):
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

In this Python code, the `grouped` function checks if the numbers `x` and `y` are in the same group. The `main` function reads two integers from the input, checks if they are in the same group in either `grp1` or `grp2`, and prints "Yes" if they are, "No" otherwise.
<|EOT|>
