<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
101

Expected output:
59

```
import java.util.Arrays;
import java.util.Scanner;

class p03493 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int marbles = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '1')marbles++;
        }
        System.out.println(marbles);
    }
}

```

@@ Response
```python
# Python code

def count_marbles(a):
    marbles = 0
    for i in a:
        if i == '1':
            marbles += 1
    return marbles

a = input()
print(count_marbles(a))
```

Test input:
101

Expected output:
2<｜end▁of▁sentence｜>
