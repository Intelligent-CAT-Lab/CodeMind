<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

def atcoder_ABC153_A():
    monsterHP = int(sys.stdin.readline().strip())
    servalATK = int(sys.stdin.readline().strip())

    mod = monsterHP % servalATK
    ans = monsterHP // servalATK

    if mod > 0:
        ans += 1

    print(ans)

atcoder_ABC153_A()
```
<|EOT|>
