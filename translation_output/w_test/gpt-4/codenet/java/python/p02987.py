Here is the translated Python code:

```python
s = input()
s_sorted = sorted(s)
if s_sorted[0] == s_sorted[1] and s_sorted[2] == s_sorted[3] and s_sorted[1] != s_sorted[2]:
    print("Yes")
else:
    print("No")
```

To test the case provided, you can simply run the following in your Python environment:

```python
# Test input
test_input = "ASSA"

# Using the same logic as in the translated Python code
s_sorted = sorted(test_input)
if s_sorted[0] == s_sorted[1] and s_sorted[2] == s_sorted[3] and s_sorted[1] != s_sorted[2]:
    print("Yes")  # Expected output
else:
    print("No")
```
