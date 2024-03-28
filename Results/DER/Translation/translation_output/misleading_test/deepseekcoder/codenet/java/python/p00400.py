<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def main():
    N = ord(sys.stdin.readline().strip())
    r = 0
    if 65 <= N <= 90:
        r = 1
    elif 97 <= N <= 122:
        r = 2
    print(r)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `ord()` function to get the ASCII value of the input character. Then we check if this value falls within the ranges for uppercase and lowercase letters in ASCII. The result is printed to the standard output.
<|EOT|>
