<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def main():
    N, M = map(int, sys.stdin.readline().split())
    print(N * M)

if __name__ == "__main__":
    main()
```

Explanation:

* `sys.stdin.readline()` reads a line from the standard input.
* `split()` splits the line into a list of strings using spaces as the delimiter.
* `map(int, ...)` converts each string in the list to an integer.
* `print(N * M)` prints the product of `N` and `M`.
* The `if __name__ == "__main__":` block is used to indicate that the `main()` function should be executed when the script is run directly, rather than when it is imported as a module.</s>
