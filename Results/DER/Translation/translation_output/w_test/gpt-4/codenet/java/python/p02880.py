Below is the Python translation of the Java code you've provided. I've used a `for` loop to go through the numbers from 1 to 9 and check if the input number is divisible by the number, with the quotient being less than 10. It prints "Yes" if the condition is met for any number and "No" otherwise.

```python
def check_divisible(n):
    for a in range(1, 10):
        if n % a == 0 and n // a < 10:
            return "Yes"
    return "No"

# Test input
N = int(input())
print(check_divisible(N))
```

To run the test case provided, you would simply need to input the integer 10 when prompted. The output would be "Yes".
