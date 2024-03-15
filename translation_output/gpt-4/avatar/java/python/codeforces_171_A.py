Here is the equivalent code translated to Python:

```python
def get_num(a, b):
    reverse_b = 0
    while b > 0:
        reverse_b = reverse_b * 10 + b % 10
        b //= 10
    return a + reverse_b

if __name__ == "__main__":
    a = int(input())
    b = int(input())
    ans = get_num(a, b)
    print(ans)
```

Please note the following differences in the translation:

1. Python uses `def` to define functions instead of the Java's `public static` method signature.
2. Variable names follow the `snake_case` convention, so `getNum` became `get_num`.
3. Division in Python with `//` performs an integer division.
4. Python does not require importing a separate library for basic input and output. `input()` is used to read from the standard input and `print()` to write to the standard output.
5. The entry point in Python is checked by the `if __name__ == "__main__":` idiom.
6. Unlike Java, Python does not require explicit type declarations for variables. The types are inferred at runtime.
