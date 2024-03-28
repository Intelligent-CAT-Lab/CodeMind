Here's the Java code translated into Python:

```python
def calculate_interior_angle_sum(num_sides):
    return 180 * (num_sides - 2)

num = int(input())
answer = calculate_interior_angle_sum(num)
print(answer)
```

Test Case:
```python
# Sample Test Case
num = 3
print(calculate_interior_angle_sum(num))  # Expected Output: 180
```
When you run the Python code with the input `3`, it should output `180`, which is the expected output.
