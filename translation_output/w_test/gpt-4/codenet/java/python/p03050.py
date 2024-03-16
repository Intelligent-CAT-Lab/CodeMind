Here's the translation of the Java code to Python:

```python
import math

def calculate_sum_of_divisors(n):
    ans = 0
    for i in range(1, int(math.sqrt(n)) + 1):
        if n % i == 0:
            m = n // i - 1
            if i < m:
                ans += m
    return ans

def main():
    n = int(input())
    ans = calculate_sum_of_divisors(n)
    print(ans)

if __name__ == "__main__":
    main()
```

To run this with the example input of `8`, you would execute the script and enter `8` when prompted. The expected output would be `10`.
