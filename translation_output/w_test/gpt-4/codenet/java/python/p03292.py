Below is the translated code from Java to Python:

```python
def find_difference(t, r, y):
    a = max(max(t, r), y)
    b = min(min(t, r), y)
    return a - b

# Sample test case
t, r, y = map(int, input().split())
print(find_difference(t, r, y))
``` 

To use the sample test case, provide the input in the format specified (e.g., "1 6 3"), run the Python code, and it will print the expected output "5".
