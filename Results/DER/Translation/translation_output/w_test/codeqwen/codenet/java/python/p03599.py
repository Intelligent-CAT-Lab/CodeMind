Here is the Python equivalent of the Java code:

```python
def main():
    A = int(input())
    B = int(input())
    C = int(input())
    D = int(input())
    E = int(input())
    F = int(input())
    ans1 = A * 100
    ans2 = 0
    for a in range(int(F / (A * 100)) + 1):
        for b in range(int(F / (B * 100)) + 1):
            for c in range(int(F / C) + 1):
                for d in range(int(F / D) + 1):
                    if (100 * a * A + 100 * b * B + C * c + D * d) <= F and (C * c + D * d) / (100 * a * A + 100 * b * B + C * c + D * d) <= E / 100:
                        if a == 0 and b == 0:
                            continue
                        if (ans2 / ans1) < (C * c + D * d) / (100 * a * A + 100 * b * B + C * c + D * d):
                            ans1 = 100 * a * A + 100 * b * B + C * c + D * d
                            ans2 = C * c + D * d
    print(int(ans1), int(ans2))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads in the input values, then iterates over all possible combinations of a, b, c, and d. If the current combination satisfies the conditions, it checks if it's the best combination so far and updates the answer accordingly. Finally, it prints out the answer.
