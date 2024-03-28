Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02390{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
        int h = S / 3600;
        int hi = S % 3600;
        int m = hi / 60;
        int s = S % 60;
        System.out.println(h + ":" + m + ":" + s);
    }
}

```

### Response:
```python
import java.util.Scanner;

public class p02390{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
        int h = S // 3600;
        int hi = S % 3600;
        int m = hi // 60;
        int s = S % 60;
        System.out.println(h + ":" + m + ":" + s);
    }
}
```

Explanation:

- We import the `java.util.Scanner` class to read input from the user.
- We create a `Scanner` object named `scan` to read input from the user.
- We read an integer `S` from the user using the `nextInt()` method of the `Scanner` class.
- We calculate the number of hours `h` by dividing `S` by 3600 using the floor division operator `//`.
- We calculate the remaining seconds `hi` by taking the modulus of `S` with 3600.
- We calculate the number of minutes `m` by dividing `hi` by 60 using the floor division operator `//`.
- We calculate the remaining seconds `s` by taking the modulus of `S` with 60.
- We print the time in the format `hh:mm:ss` using the `println()` method of the `System.out` object.<|endoftext|>
