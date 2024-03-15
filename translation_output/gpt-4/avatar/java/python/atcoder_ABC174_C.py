Below is the equivalent Python code for the provided Java code:

```python
def atcoder_abc174_c():
    n = int(input())
    num = 7
    res = 1

    while num < n:
        num = num * 10 + 7
        res += 1

    seen = set()

    while True:
        if num % n == 0:
            break
        num %= n
        res += 1
        if num in seen:
            res = -1
            break
        seen.add(num)
        num = num * 10 + 7

    print(res)

atcoder_abc174_c()
```

This code has translated the functionality of Java's `HashSet` to Python's `set` and made the equivalent adjustments needed for the change from Java to Python, such as no type declarations and change in increment/decrement operators. The `Scanner` is replaced with Python's `input()` for console input. Python uses indentation instead of {} blocks to define the scope of loops and if statements. Also, the `System.out.println` has been replaced with `print`.
