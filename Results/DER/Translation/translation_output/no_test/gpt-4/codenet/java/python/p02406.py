Here's the translated code from Java to Python:

```python
def find_numbers_containing_three(x):
    if 3 <= x <= 10000:
        count = 0
        a = 1
        result = []
        while count < x:
            if a % 3 == 0:
                result.append(str(a))
            else:
                b = a
                while b != 0:
                    if b % 10 == 3:
                        result.append(str(a))
                        break
                    b //= 10
            a += 1
            count += 1
        return " ".join(result)

if __name__ == "__main__":
    x = int(input())
    print(find_numbers_containing_three(x))
```

This Python function (`find_numbers_containing_three`) mimics the logic of the Java code, iterating from 1 to `x` and checking if each number is divisible by 3 or contains the digit 3. The results are collected in a list and then joined into a string with spaces. The script reads an integer from the standard input, just like the BufferedReader in Java.

Please note that in Python, you usually wouldn't write this as a script with a hardcoded input call in the main function unless it's a small script or a command-line utility. It's typically more flexible to define functions that can be imported and used with different inputs.
