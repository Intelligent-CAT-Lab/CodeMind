Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 10

Expected output:
3


```
import java.util.Scanner;
public class p02922 {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int ans = (b-1)/(a-1);
    if((b-1)%(a-1)==0) {
    	System.out.println(ans);
    }else {
    	System.out.println(ans+1);
    }
    }
}
```

### Response:
```python
import java.util.Scanner;

public class p02922 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = (b-1)//(a-1);
        if((b-1)%(a-1)==0) {
            System.out.println(ans);
        }else {
            System.out.println(ans+1);
        }
    }
}
```

Explanation:

- We first import the `java.util.Scanner` class to read input from the user.
- We then create a `Scanner` object `sc` to read input from the user.
- We read two integers `a` and `b` from the user using the `nextInt()` method of the `Scanner` class.
- We calculate the answer `ans` as `(b-1)//(a-1)` which is the integer division of `(b-1)` by `(a-1)`.
- We check if `(b-1)` is divisible by `(a-1)` using the modulo operator `%`. If it is, we print `ans` as the output. Otherwise, we print `ans+1` as the output.<|endoftext|>
