<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
8


```

import java.util.Scanner;

public class p02915 {
    public static void main(String[] args) {
        new p02915().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int ans = S * S* S;


        System.out.println(ans);
    }
}

```
[/INST]
```
import sys

def main():
    S = int(sys.stdin.readline())
    ans = S * S * S
    print(ans)

if __name__ == '__main__':
    main()
```
This is the equivalent Python code for the given Java code. It uses the `sys` module to read input from stdin and the `int` function to convert the input to an integer. The rest of the code is similar to the Java code, with the exception of the `print` function being used instead of `System.out.println`.</s>
