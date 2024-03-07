<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p02606 {

    public p02606() {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int d = scanner.nextInt();

        int Ans = 0;
        for (int i = L; i <= R; i++) {
            if (i % d == 0)
                Ans++;
        }

        System.out.println(Ans);
    }

    public static void main(String[] args) {
        new p02606();
    }
}


Translate the above java code to python.

python code:

[/INST]
```python
import sys

L, R, d = map(int, sys.stdin.readline().split())

ans = 0
for i in range(L, R+1):
    if i % d == 0:
        ans += 1

print(ans)
```
This code uses the `map` function to convert the input from a string to a list of integers, and then uses a `for` loop to iterate over the range of numbers from `L` to `R` and count the number of multiples of `d`. Finally, it prints the result.</s>
