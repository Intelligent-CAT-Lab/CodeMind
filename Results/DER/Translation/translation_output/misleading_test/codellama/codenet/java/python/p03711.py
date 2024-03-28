<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def grouped(grp, x, y):
    return x in grp and y in grp

def main():
    x, y = map(int, sys.stdin.readline().split())
    grp1 = [1, 3, 5, 7, 8, 10, 12]
    grp2 = [4, 6, 9, 11]
    grp3 = [2]
    print("Yes" if grouped(grp1, x, y) or grouped(grp2, x, y) else "No")

if __name__ == "__main__":
    main()
```
Note: The `map` function is used to convert the input from a string to an integer. The `sys.stdin.readline()` function is used to read a line from the standard input. The `split()` function is used to split the input into two integers.</s>
