Here is the Python equivalent of the Java code:

```python
import sys

A = int(sys.stdin.readline())
B = int(sys.stdin.readline())
C = int(sys.stdin.readline())
D = int(sys.stdin.readline())
E = int(sys.stdin.readline())
F = int(sys.stdin.readline())

ans1 = A * 100
ans2 = 0

for a in range(F // (A * 100) + 1):
    for b in range(F // (B * 100) + 1):
        for c in range(F // C + 1):
            for d in range(F // D + 1):
                if (100 * a * A + 100 * b * B + C * c + D * d) <= F and (C * c + D * d) / (100 * a * A + 100 * b * B + C * c + D * d) <= E / 100:
                    if a == 0 and b == 0:
                        continue
                    if (ans2 / ans1) < (C * c + D * d) / (100 * a * A + 100 * b * B + C * c + D * d):
                        ans1 = 100 * a * A + 100 * b * B + C * c + D * d
                        ans2 = C * c + D * d

print(int(ans1), int(ans2))
```

This Python code does the same thing as the Java code. It reads 7 integers from the standard input, calculates the possible combinations of a, b, c, and d, and checks if the current combination satisfies the conditions. If it does, it updates the values of ans1 and ans2 if the current combination is better than the previous one. Finally, it prints the values of ans1 and ans2.
