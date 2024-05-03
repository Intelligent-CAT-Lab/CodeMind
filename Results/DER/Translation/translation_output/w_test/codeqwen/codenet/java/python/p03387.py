Here is the Python equivalent of the Java code:

```python
def main():
    x = sorted(list(map(int, input().split())))
    temp = 2 * x[2] - x[1] - x[0]
    ans = (temp + 1) // 2 if temp % 2 else temp // 2
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, sorts them, calculates the difference between the largest and the smallest number, and then checks if this difference is odd or even. If it's odd, it adds 1 to the result before dividing it by 2. If it's even, it just divides it by 2. The result is then printed to the console.
