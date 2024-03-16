Below is the translated Python code. Note that in Python, there's typically no need for a custom scanner class for reading input from stdin because Python's standard library provides simple methods to achieve the same thing. Also, the standard math library provides functions like factorial (for calculating the factorial of a number) and gcd (for computing the greatest common divisor). However, the main logic of the program has been translated and additional methods have been ignored since they are not used in the main logic.

```python
def main():
    s = input().strip()
    t = ""
    for char in s:
        if char != 'B':
            t += char
        elif t:
            t = t[:-1]
    print(t)

if __name__ == "__main__":
    main()

# Test case
# input_string = "01B0"
# Expected output: "00"
```

This translated Python script reads a string from the standard input, which in most cases would be provided by the user or a testing environment. The string is processed in the same way as the provided Java code. Each character is examined, if it's not 'B', it's appended to the result string `t`. If it is 'B' and `t` is not empty, the last character is removed from `t`. After the loop finishes, the result `t` is printed to the standard output. 

Note that the commented-out `input_string` line and the `Expected output` comment are non-executable and provided for illustrative purposes only. 

Also note that the additional functions in the original Java code such as `fact`, `lowerBound`, `upperBound`, `gcd`, `lcm`, and `isPrime` are not translated since they are not used in solving the main task. If you need to use any of those functionalities in Python, you would typically accomplish this using the Python standard libraries (`math` for `gcd` and `factorial`, etc.) or implementing similar methods.
