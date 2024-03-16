<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys

class p02198:
    def __init__(self):
        self.systemin = sys.stdin

    def main(self):
        N, M = map(int, self.systemin.readline().split())
        print(N * M)

if __name__ == "__main__":
    instance = p02198()
    instance.main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, multiplies them, and prints the result. The `__init__` method initializes the `systemin` attribute to the standard input stream. The `main` method reads the input, performs the multiplication, and prints the result. The `if __name__ == "__main__":` block creates an instance of the `p02198` class and calls its `main` method.<｜end▁of▁sentence｜>
