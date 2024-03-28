Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import java.io.*;
import java.util.*;

class p00400:

    def __init__(self):
        self.systemin = BufferedReader(InputStreamReader(System.in))
        self.log = PrintStream(OutputStream() { def write(self, b): pass })

    def main(self):
        sc = Scanner(systemin)
        N = sc.nextInt()
        r = 0
        if 'A' <= N and N <= 'Z':
            r = 1
        elif 'a' <= N and N <= 'z':
            r = 2
        result.printf("%d\n", r)
        sc.close()
        return False

if __name__ == '__main__':
    instance = p00400()
    instance.main()
    instance.systemin.close()
```<|endoftext|>
