Here is the Python equivalent of the Java code:

```python
def main():
    l = int(input())
    k = l
    t = 1
    count = 1
    ans = []
    while l > 1:
        if (l & 1) == 1:
            k -= t
            ans.append(f"{count} 20 {k}")
        ans.append(f"{count} {count+1} {t}")
        count += 1
        l >>= 1
        t *= 2
    print(f"20 {count+19}")
    for i in range(19):
        print(f"{i+1} {i+2} 0")
    for s in ans:
        print(s)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, calculates the values and prints them in the same format as the Java code.
