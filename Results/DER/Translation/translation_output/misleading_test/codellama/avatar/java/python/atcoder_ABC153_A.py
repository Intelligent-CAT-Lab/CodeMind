<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```
import sys

monster_hp, serval_atk = map(int, sys.stdin.readline().split())

mod = monster_hp % serval_atk
ans = monster_hp // serval_atk

if mod > 0:
    ans += 1

print(ans)
```
Explanation:

* `sys.stdin.readline()` reads a line from the standard input and returns it as a string.
* `split()` splits the string into a list of strings using the space character as the delimiter.
* `map(int, ...)` applies the `int()` function to each element of the list, which converts each element to an integer.
* `monster_hp // serval_atk` performs integer division and returns the result.
* `mod > 0` checks if the remainder of the division is greater than 0.
* `ans += 1` increments the value of `ans` by 1 if the remainder is greater than 0.
* `print(ans)` prints the final result.</s>
