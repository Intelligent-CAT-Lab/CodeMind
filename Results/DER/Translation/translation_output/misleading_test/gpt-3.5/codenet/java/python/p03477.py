```python
def compare_sides(left1, left2, right1, right2):
    left = left1 + left2
    right = right1 + right2
    if left > right:
        return "Left"
    elif left == right:
        return "Balanced"
    else:
        return "Right"

# Test input
input_values = [3, 8, 7, 1]
print(compare_sides(*input_values))
```
