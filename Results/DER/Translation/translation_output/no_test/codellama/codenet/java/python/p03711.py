<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import sys

def grouped(grp, x, y):
    return x in grp and y in grp

if __name__ == "__main__":
    x, y = map(int, sys.stdin.readline().split())
    grp1 = [1, 3, 5, 7, 8, 10, 12]
    grp2 = [4, 6, 9, 11]
    grp3 = [2]
    print("Yes" if grouped(grp1, x, y) or grouped(grp2, x, y) else "No")
```
This is the equivalent Python code for the given Java code. The `grouped` function is defined in the same way, and the `main` function is also similar, but with some minor changes to accommodate the Python syntax. The `map` function is used to convert the input from the standard input to integers, and the `print` function is used to print the output.</s>
