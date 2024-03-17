Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 1 2

Expected output:
3
5
9
17
33
65
129
257
513
1025


```
import java.util.*;

class atcoder_ABC127_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());

        for (int i = 0; i < 10; i++) {
            x = r * x - d;
            System.out.println(x);
        }
    }
}
```

### Response:
```python
import java.util.*;

class atcoder_ABC127_B:
    def main(self):
        sc = Scanner(System.in)
        r = Integer.parseInt(sc.next())
        d = Integer.parseInt(sc.next())
        x = Integer.parseInt(sc.next())

        for i in range(10):
            x = r * x - d
            print(x)

atcoder_ABC127_B().main()
```<|endoftext|>
