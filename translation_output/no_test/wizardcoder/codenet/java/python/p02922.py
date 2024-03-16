Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

- We need to import the `java.util.Scanner` package in python to read input from the user.
- We create a `Scanner` object to read input from the user.
- We read two integers `a` and `b` from the user using the `nextInt()` method of the `Scanner` class.
- We calculate the answer `ans` using integer division `(b-1)//(a-1)`.
- We check if `b` is divisible by `a` using the modulo operator `%`. If `b` is divisible by `a`, then `ans` will be the number of times `a` can be subtracted from `b` to get `1`. If `b` is not divisible by `a`, then `ans` will be the number of times `a` can be subtracted from `b` to get `1` plus `1` (since we need to add `1` to account for the extra division).
- We print the answer using the `println()` method of the `System.out` object.<|endoftext|>
