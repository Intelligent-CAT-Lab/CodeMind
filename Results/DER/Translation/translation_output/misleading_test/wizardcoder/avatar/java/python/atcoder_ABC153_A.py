Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10000 1

Expected output:
10046

```
import java.util.Scanner;

public class atcoder_ABC153_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long monsterHP = scan.nextLong();
        long servalATK = scan.nextLong();
        scan.close();

        long mod = monsterHP % servalATK;
        long ans = monsterHP / servalATK;

        if (mod > 0) {
            ans++;
        }

        System.out.println(ans);
    }
}
```

### Response:
```python
import java.util.Scanner;

public class atcoder_ABC153_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long monsterHP = scan.nextLong();
        long servalATK = scan.nextLong();
        scan.close();

        long mod = monsterHP % servalATK;
        long ans = monsterHP / servalATK;

        if (mod > 0):
            ans += 1;

        System.out.println(ans);
    }
}
```

Note: The colon after the if statement is used to indicate the start of a block of code.<|endoftext|>
