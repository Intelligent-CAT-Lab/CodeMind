<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Python version of the given Java code:

```python
def main():
    str = input()
    abc = [0, 0, 0]
    for i in str:
        if i == 'a':
            abc[0] += 1
        elif i == 'b':
            abc[1] += 1
        elif i == 'c':
            abc[2] += 1

    abc.sort()

    print("YES" if (abc[1] - abc[0] < 2) and (abc[2] - abc[0] < 2) else "NO")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, counts the occurrences of 'a', 'b', and 'c', sorts the counts, and then prints "YES" if the difference between the second smallest and the smallest count is less than 2 and the difference between the largest and the smallest count is less than 2, otherwise it prints "NO".<｜end▁of▁sentence｜>
