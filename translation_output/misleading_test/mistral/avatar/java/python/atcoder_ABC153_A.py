<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```python
monsterHP = int(input())
servalATK = int(input())

mod = monsterHP % servalATK
ans = monsterHP // servalATK

if mod > 0:
    ans += 1

print(ans)
```</s>
