Below is the translated Python code from the original given Java code:

```python
from math import factorial

# Calculate the factorial of 1510
fact = factorial(1510) + 2

while True:
    try:
        n = int(input())
        print(fact)

        for i in range(2, 2 + n):
            print(i)
    except EOFError:
        break
```

Run this script in a Python interpreter, and it will await integer inputs and simulate the same logic as originally provided in the Java code. Note that this code uses the in-built `factorial` function from the `math` module in Python to find the factorial of 1510, and then simply increments it as per the logic in the Java code. Additionally, the try-except block is used to catch an `EOFError` for breaking out of the loop when the end of input is reached, replicating the behavior of the Java code's `Scanner.hasNextInt()`.
