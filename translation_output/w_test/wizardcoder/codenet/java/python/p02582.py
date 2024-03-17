Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
RRS

Expected output:
2


```
import java.io.*;

public class p02582 {

    public static void main(String[] args) throws IOException {
        PrintWriter prnt = new PrintWriter(System.out);
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String s = read.readLine();
        int res = 0;
        if (s.charAt(0) == 'R' && s.charAt(1) == 'R' && s.charAt(2) == 'R') {
            res = 3;
        } else if (s.charAt(0) == 'R' && s.charAt(1) == 'R') {
            res = 2;
        } else if (s.charAt(1) == 'R' && s.charAt(2) == 'R') {
            res = 2;
        } else if (s.charAt(0) == 'S' && s.charAt(1) == 'S' && s.charAt(2) == 'S') {
            res = 0;
        } else {
            res = 1;
        }

        prnt.println(res);
        prnt.close();
    }
}
```

### Response:
```python
import java.io.*;

public class p02582 {

    public static void main(String[] args) throws IOException {
        PrintWriter prnt = new PrintWriter(System.out);
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String s = read.readLine();
        int res = 0;
        if (s.charAt(0) == 'R' and s.charAt(1) == 'R' and s.charAt(2) == 'R'):
            res = 3;
        elif (s.charAt(0) == 'R' and s.charAt(1) == 'R'):
            res = 2;
        elif (s.charAt(1) == 'R' and s.charAt(2) == 'R'):
            res = 2;
        elif (s.charAt(0) == 'S' and s.charAt(1) == 'S' and s.charAt(2) == 'S'):
            res = 0;
        else:
            res = 1;

        prnt.println(res);
        prnt.close();
    }
}
```

Note: In Python, the `and` operator is used instead of the `&&` operator. The `elif` statement is used instead of the `else if` statement.<|endoftext|>
