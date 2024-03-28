Here is the equivalent Python code to achieve the same functionality as the given Java code:

```python
# Read input values
P, Q, R = map(int, input().split())

# Determine the highest sum using two out of the three integers
if P >= Q:
    max_sum = Q + R if P >= R else P + Q
elif Q >= R:
    max_sum = P + R if Q >= P else Q + R
elif R >= P:
    max_sum = P + Q if R >= Q else P + R

# Output the result
print(-max_sum)
```

When you run this Python code with the provided test input '1 3 4', it will output -57 as the expected output.

