Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10000 1

Expected output:
10000


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
import sys

input = sys.stdin.readline().split()
monsterHP = int(input[0])
servalATK = int(input[1])

mod = monsterHP % servalATK
ans = monsterHP // servalATK

if mod > 0:
    ans += 1

print(ans)
```

Explanation:

- We first import the `sys` module to read input from the standard input.
- We then read the input from the standard input using `sys.stdin.readline().split()` and convert it into integers.
- We calculate the remainder of `monsterHP` divided by `servalATK` and store it in the variable `mod`.
- We calculate the quotient of `monsterHP` divided by `servalATK` and store it in the variable `ans`.
- We check if `mod` is greater than 0. If it is, we increment `ans` by 1.
- Finally, we print the value of `ans`.<|endoftext|>
