Here is the Python equivalent of the Java code:

```python
def main():
    n = int(input())
    ans = 0
    for i in range(1, n+1):
        if i % 2 == 1:
            divcount = 0
            for k in range(1, n+1):
                if i % k == 0:
                    divcount += 1
            if divcount == 8:
                ans += 1
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, then iterates over all integers from 1 to the input number. For each odd integer, it counts how many divisors it has. If the number of divisors is 8, it increments the answer. Finally, it prints the answer.
