Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
9552

Expected output:
9513

```
import java.util.Scanner;

public class atcoder_ABC149_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int prime = X;
        int mid = prime / 2;
        boolean flag = false;
        
        while (true) {
            for (int i = 2; i <= mid; ++i) {
                if (prime % i == 0) {
                    flag = true;
                    break;
                }
            }
            
            if (!flag) {
                break;
            } else {
                flag = false;
            }
            
            prime++;
        }
        
        System.out.println(prime);
    }
}
```

### Response:
```python
import java.util.Scanner;

public class atcoder_ABC149_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int prime = X;
        int mid = prime / 2;
        boolean flag = False;
        
        while (True):
            for (int i = 2; i <= mid; ++i):
                if (prime % i == 0):
                    flag = True;
                    break;
            if (!flag):
                break;
            else:
                flag = False;
            prime++;
        System.out.println(prime);
    }
}
```

Note: In Python, we use `True` and `False` instead of `true` and `false`. Also, we use `:` instead of `;` to end the line.<|endoftext|>
