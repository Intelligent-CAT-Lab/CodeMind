Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC172_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        for (int i = 1; i < n + 1; i++) {
            ans += (long) i * ((long) n / (long) i) * (((long) n / (long) i) + 1) / 2;
        }
        System.out.println(ans);
    }
}
```

### Response:
```python
import java.util.Scanner;

public class atcoder_ABC172_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        for (int i = 1; i < n + 1; i++) {
            ans += (long) i * ((long) n / (long) i) * (((long) n / (long) i) + 1) / 2;
        }
        System.out.println(ans);
    }
}
```<|endoftext|>
