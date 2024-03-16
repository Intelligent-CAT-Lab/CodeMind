Here is the translated code from Java to Python:

```python
import math

def gcd(p, q):
    while q != 0:
        p, q = q, p % q
    return p

def main():
    N = int(input())
    result = 0

    for i in range(1, N + 1):
        for j in range(1, N + 1):
            a = gcd(i, j)
            for k in range(1, N + 1):
                result += gcd(a, k)
    
    print(result)

if __name__ == "__main__":
    main()
```

Note a few differences in syntax and semantics between Python and Java:

1. Python uses dynamic typing and therefore does not require variable declarations (like int N, result, and a in Java).
2. The `range()` function in Python is used in place of Java's `for` loop structure. Note that `range(1, N + 1)` in Python corresponds to the `(1; i<=N; i++)` in Java since Python's `range` is upper-bound exclusive.
3. The import statement is different. In Python, you would normally use `import math` to gain access to math-related functions, but here the custom `gcd` function is written inline.
4. In Python, the `input()` function reads input from the standard input stream, which is typically the keyboard.
5. The print function in Python is used to display the result, compared to System.out.println in Java.
6. Python does not have a separate `public static void main` method; the equivalent is just a `main()` function with an `if __name__ == "__main__"` guard to ensure it's not run when the module is imported.
7. Python's `gcd` function uses a loop instead of recursion. Recursion in Python is not as commonly used for this case because of stack limitations and less tail recursion optimization compared to Java.
