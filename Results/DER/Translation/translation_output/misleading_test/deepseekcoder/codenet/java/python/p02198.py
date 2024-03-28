<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 4

Expected output:
99

```

import java.io.*;
import java.util.*;


/**
 * AIZU ONLINE JUDGE
 * 3123
 *  2020/5/1
 */
public class p02198 {



    boolean main() throws IOException {

        Scanner sc = new Scanner(systemin);

        int N = sc.nextInt();
        int M = sc.nextInt();


        System.out.printf("%d\n", N * M);

        sc.close();
        return false;
    }



    PrintStream log;
    PrintStream result = System.out;
    BufferedReader systemin;

    static p02198 instance = new p02198();

    p02198() {
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
    N, M = map(int, sys.stdin.readline().split())
    print(N * M)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `map()` function is used to convert the input into integers. The result is then printed to the standard output using the `print()` function.
<|EOT|>
