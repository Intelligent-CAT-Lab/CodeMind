<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
67

Expected output:
-55

```
import java.io.*;
import java.util.*;


/**
 * AIZU ONLINE JUDGE
 * 0405
 *  2020/5/6
 */
public class p00400 {



    boolean main() throws IOException {

        Scanner sc = new Scanner(systemin);

        int N = sc.nextInt();
        int r = 0;
        if ('A' <= N && N <= 'Z')
            r = 1;
        else if ('a' <= N && N <= 'z')
            r = 2;
        result.printf("%d\n", r);

        sc.close();
        return false;
    }



    PrintStream log;
    PrintStream result = System.out;
    BufferedReader systemin;

    static p00400 instance = new p00400();

    p00400() {
        systemin = new BufferedReader(new InputStreamReader(System.in));
        log = new PrintStream(new OutputStream() { public void write(int b) {} } );
    }

    public static void main(String[] args) throws IOException {

        instance.main();
        instance.systemin.close();
    }


}



```
[/INST]
```python
import sys

def main():
    N = int(input())
    r = 0
    if 'A' <= N <= 'Z':
        r = 1
    elif 'a' <= N <= 'z':
        r = 2
    print(r)

if __name__ == '__main__':
    main()
```
Note that the `main()` function is the same as the `main()` function in the Java code, but it is written in Python. The `if` statement is also similar, but it uses Python's `elif` instead of Java's `else if`. The `print()` function is used to print the result instead of `System.out.printf()`.</s>
