Here is the Python equivalent of the Java code:

```python
def main():
    a, b, k = map(int, input().split())
    set_ = set()
    cnt = 0
    for i in range(a, b + 1):
        if cnt >= k:
            break
        cnt += 1
        set_.add(i)
    cnt = 0
    for i in range(b, a - 1, -1):
        if cnt >= k:
            break
        cnt += 1
        set_.add(i)
    
    for ans in sorted(set_):
        print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, creates a set, and then adds the integers from `a` to `b` (inclusive) and from `b` to `a` (inclusive) to the set. It then prints the sorted elements of the set.
