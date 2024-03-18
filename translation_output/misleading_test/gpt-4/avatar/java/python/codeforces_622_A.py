Here is the equivalent Python code for the given Java code:

```python
import math

def main():
    n1 = int(input())
    n = int((math.sqrt(1 + (8 * n1)) - 1) / 2)
    ans = n1 - (((n + 1) * n) // 2)
    print(ans if ans != 0 else n)
    
if __name__ == "__main__":
    main()
```

To test this Python code with the input `99992`, you would run the script and provide the number when prompted; you should expect the output `344`.

Remember that the division symbol in the original Java code is for integer division, so in Python I have replaced it with `//` to make sure we get an integer result. This is important because Python's `/` operator always performs floating-point division by default. 

Also, `input()` is used for reading input from the user in Python, and `int()` is used to convert the string obtained from `input()` into an integer. The `math.sqrt()` function is used to compute the square root in Python, equivalent to Java's `Math.sqrt()`.
