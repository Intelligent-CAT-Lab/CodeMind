Here is the translated Python code:

```python
n = int(input())
ans = 0
for i in range(1, n+1):
    if i % 2 == 1:
        divcount = 0
        for k in range(1, n+1):
            if i % k == 0:
                divcount += 1
        if divcount == 8:
            ans += 1
            # print(i) # for checking the current value

print(ans)
``` 

This Python code will behave the same as the provided Java code. It initializes a counter `ans` to 0, then iterates over the numbers from 1 to `n`. For each odd number, it calculates the number of divisors that number has. If the number has exactly 8 divisors, it increments the `ans` counter. Finally, it prints the `ans` counter to the standard output.
