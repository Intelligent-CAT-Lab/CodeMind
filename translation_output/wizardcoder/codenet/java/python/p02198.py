Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import java.io.*;
import java.util.*;

class p02198:

    def __init__(self):
        self.systemin = BufferedReader(InputStreamReader(System.in))
        self.log = PrintStream(OutputStream() { def write(self, b): pass })

    def main(self):
        sc = Scanner(systemin)

        N = sc.nextInt()
        M = sc.nextInt()

        System.out.printf("%d\n", N * M)

        sc.close()
        return False

if __name__ == '__main__':
    instance = p02198()
    instance.main()

    instance.systemin.close()
```<|endoftext|>
