Here is the equivalent code in Python:

```python
def help(K, A, B):
    if A <= B:
        return 1 if A >= K else -1
    if A >= K:
        return 1
    dif = A - B
    t = (K - A) // dif + (0 if (K - A) % dif == 0 else 1)
    return 2 * t + 1

if __name__ == "__main__":
    K, A, B = map(int, input().split())
    ans = help(K, A, B)
    print(ans)
```

- The `Scanner` class is replaced by Python's built-in `input()` function, combined with `map` to convert the input strings to integers.
- Since Python supports big integers by default, there is no need for `long` type declarations.
- The static `help` function is translated directly into a Python function with the same logic.
- `System.out.println(ans);` is replaced with Python's print function.
- The main class and method structure is transformed into a Python script body guarded by the `if __name__ == "__main__":` statement to ensure the code executes only if the script is run as the main program.
