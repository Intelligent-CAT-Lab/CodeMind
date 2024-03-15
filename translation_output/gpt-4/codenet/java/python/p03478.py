Here's the Java code translated into Python, enclosed within the "```python```" code block:

```python
def calculate_sum_of_digits(n):
    sum = 0
    while n > 0:
        sum += n % 10
        n //= 10
    return sum

N = int(input())
A = int(input())
B = int(input())
ans = 0

for i in range(1, N + 1):
    sum_of_digits = calculate_sum_of_digits(i)
    if A <= sum_of_digits <= B:
        ans += i

print(ans)
```

This Python code snippet does the equivalent of the Java code, where it reads three integers from standard input (N, A, B) and accumulates the sum of integers between 1 and N whose sum of digits is between A and B, inclusive. The sum of the digits is computed using a separate function called `calculate_sum_of_digits`.
