<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

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

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

monster_hp, serval_atk = map(int, sys.stdin.readline().split())

mod = monster_hp % serval_atk
ans = monster_hp // serval_atk

if mod > 0:
    ans += 1

print(ans)
```
Note: The `map` function is used to convert the input from a string to an integer. The `//` operator is used for integer division, which is equivalent to the `floor` function in Python.</s>
