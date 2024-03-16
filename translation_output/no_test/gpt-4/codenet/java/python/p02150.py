Here is the given Java code translated to Python:

```python
def main():
    MOD = 1000000007
    a = int(input())
    b = int(input())
    x = int(input())
    s = a - b
    count = max(x - a, 0) // s
    total = (count % MOD) * (a % MOD) % MOD
    x -= count * s
    while x >= a:
        total += a
        x += -a + b
    total += x
    total %= MOD
    print(total)

if __name__ == "__main__":
    main()
```

Note that in Python, the division operator `/` performs floating-point division and `//` performs integer (floor) division. Therefore, I've used `//` in the `count` calculation to ensure it results in an integer, akin to how division works in Java by default. 

The Python code uses `input()` to read from standard input, similar to the `Scanner` in Java, and `print()` is used for output instead of `System.out.println`. Also, Python does not have `Math.max` as in Java, but it does have the built-in function `max` that serves the same purpose.
