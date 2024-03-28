<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
abac

Expected output:
YES


```
import java.util.*;

public class p03534 {
    public void main(Scanner sc) {
        String str = sc.next();
        int abc[] = new int[3];
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 3; j++) {
                if (str.charAt(i) == "abc".charAt(j)) {
                    abc[j]++;
                }
            }
        }

        Arrays.sort(abc);

        System.out.println(((abc[1] - abc[0] < 2) && (abc[2] - abc[0] < 2)) ? "YES" : "NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new p03534().main(sc);
        sc.close();
    }
}

```
[/INST]
```python
import sys

def is_valid(s):
    abc = [0, 0, 0]
    for c in s:
        if c == 'a':
            abc[0] += 1
        elif c == 'b':
            abc[1] += 1
        elif c == 'c':
            abc[2] += 1
    abc.sort()
    return ((abc[1] - abc[0] < 2) and (abc[2] - abc[0] < 2))

def main():
    s = sys.stdin.readline().strip()
    print("YES" if is_valid(s) else "NO")

if __name__ == "__main__":
    main()
```
This code reads a string from standard input, checks if it is a valid string, and prints "YES" or "NO" accordingly.

The `is_valid` function takes a string as input and returns a boolean indicating whether the string is valid. It works by counting the number of occurrences of each character in the string and checking if the number of occurrences of each character is within the required range.

The `main` function reads a string from standard input, calls the `is_valid` function with the string as input, and prints the result.

The code uses the `sys` module to read from standard input and the `strip` method to remove any trailing newline characters from the input string.</s>
