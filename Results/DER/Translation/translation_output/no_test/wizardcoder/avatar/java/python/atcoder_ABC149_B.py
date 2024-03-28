Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class atcoder_ABC149_B {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long A = Long.parseLong(stdIn.next());
        long B = Long.parseLong(stdIn.next());
        long K = Long.parseLong(stdIn.next());
        long n = A - K;
        
        if (A + B <= K) {
            System.out.println("0 0");
        } else if (n < 0) {
            System.out.println("0 " + (A + B - K));
        } else {
            System.out.println(n + " " + B);
        }
    }
}
```

### Response:
```python
import java.util.*;

class atcoder_ABC149_B:
    def main(self):
        stdIn = Scanner(System.in)
        A = Long.parseLong(stdIn.next())
        B = Long.parseLong(stdIn.next())
        K = Long.parseLong(stdIn.next())
        n = A - K
        
        if A + B <= K:
            print("0 0")
        elif n < 0:
            print("0", A + B - K)
        else:
            print(n, B)

atcoder_ABC149_B().main()
```<|endoftext|>
