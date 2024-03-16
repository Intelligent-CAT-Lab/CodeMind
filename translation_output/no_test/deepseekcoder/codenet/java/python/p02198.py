<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

class p02198:

    def __init__(self):
        self.systemin = sys.stdin
        self.log = open('log.txt', 'w')
        self.result = sys.stdout

    def main(self):
        N, M = map(int, self.systemin.readline().split())
        self.result.write(str(N * M) + '\n')
        self.systemin.close()
        self.log.close()

if __name__ == "__main__":
    p02198().main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, multiplies them together, and writes the result to the standard output. The log file 'log.txt' is also created to record the process.
<|EOT|>
