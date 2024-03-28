The following is the translated Python code from the provided Java code:

```python
# Test input
a = int(input())

a100 = a // 100
a10 = a // 10 - a100 * 10
a1 = a - a100 * 100 - a10 * 10
rev = a1 * 100 + a10 * 10 + a100

if a == rev:
    ans = "Ye"
else:
    ans = "No"

# Output
print(ans)
```

To use this code, you can input a number, and it will output "Ye" if the number is a palindrome (the same forwards as backwards) or "No" if it is not. In the test case given (575), the output should be "Ye" as 575 is a palindrome.
