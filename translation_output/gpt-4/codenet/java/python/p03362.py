Below is the translated Python code from the Java code you provided:

```python
import math

INF = float('inf')

mh = [0, 1, 0, -1]
mw = [1, 0, -1, 0]

def main():
    N = int(input())
    
    count = 0
    for i in range(6, 55556, 5):
        if is_prime(i):
            print(i, end=" ")
            count += 1
        if count == N:
            break

def is_prime(n):
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

if __name__ == "__main__":
    main()
```

Please note the following differences and changes from the original Java code:

1. Python does not use explicit types, so type declarations have been omitted.
2. Python uses `input()` to read from standard input, and `print()` to write to standard output.
3. The print function in Python is used with the `end=" "` parameter to print the numbers on the same line with spaces in between, just like the Java `print` without `println`.
4. Python does not have a `Scanner` class, so input is read using the `input()` function and needs to be cast to the required type.
5. Constants are usually represented with all uppercase characters in Python as well, though Python does not have an explicit `final` keyword.
6. The range function in Python is similar to Java's for-loop syntax but it generates a sequence from start to end excluding the end point with a particular step if specified.
7. The `is_prime` function is defined with a for-loop that checks for factors up to the square root of the number, similar to the Java code.
8. The `main` function is protected by the `if __name__ == "__main__":` line to make sure that it runs only if the script is executed as the main program, not if it's imported as a module.
