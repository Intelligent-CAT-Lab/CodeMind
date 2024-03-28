<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
abac

Expected output:
Y@ES

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

def main():
    str = sys.stdin.readline().strip()
    abc = [0, 0, 0]
    for i in range(len(str)):
        for j in range(3):
            if str[i] == "abc"[j]:
                abc[j] += 1

    abc.sort()

    if (abc[1] - abc[0] < 2) and (abc[2] - abc[0] < 2):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```
Note: The `sys` module is used to read input from stdin, and the `strip()` method is used to remove any trailing newline characters from the input string. The `range()` function is used to iterate over the characters in the input string, and the `sort()` method is used to sort the `abc` list. The `if` statement is used to check if the condition is met, and the `print()` function is used to print the output.</s>
