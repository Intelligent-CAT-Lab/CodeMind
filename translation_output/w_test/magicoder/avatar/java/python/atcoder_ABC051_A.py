<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
pnxnn,muduhzn,aquud,

Expected output:
pnxnn asadasd asdasf



```
import java.util.Scanner;

public class atcoder_ABC051_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(",");
        
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        
        System.out.println(a + " " + b + " " + c);
    }
}
```

@@ Response
```python
import sys

def main():
    a, b, c = map(str, sys.stdin.readline().split(','))
    print(a + " " + b + " " + c)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `split(',')` function is used to split the input into a list of strings, where each string is separated by a comma. The `map(str, ...)` function is used to convert each element of the list to a string. Finally, we print the strings separated by a space.<｜end▁of▁sentence｜>
