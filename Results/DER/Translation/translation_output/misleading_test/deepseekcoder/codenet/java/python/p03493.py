<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
def p03493():
    a = input()
    marbles = 0
    for i in a:
        if i == '1':
            marbles += 1
    print(marbles)

p03493()
```
<|EOT|>
