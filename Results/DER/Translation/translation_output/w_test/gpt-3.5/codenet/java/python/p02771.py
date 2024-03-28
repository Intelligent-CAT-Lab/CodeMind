```python
def check_numbers(A, B, C):
    if (A == B and B == C) or (A != B and A != C and B != C):
        return "No"
    else:
        return "Yes"

# Test case
A, B, C = map(int, input().split())
result = check_numbers(A, B, C)
print(result)
```
