Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import java.io.*;
import java.util.*;

public class p02198 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        System.out.printf("%d\n", N * M);

        sc.close();
    }
}
```

Explanation:

- We import the necessary classes from the java.io and java.util packages.
- We define a class called `p02198` which contains the main method.
- Inside the main method, we create a `Scanner` object to read input from the standard input stream.
- We read two integers `N` and `M` from the input stream using the `nextInt()` method of the `Scanner` class.
- We print the product of `N` and `M` using the `printf()` method of the `System.out` object.
- We close the `Scanner` object to release any system resources it may be holding.<|endoftext|>
