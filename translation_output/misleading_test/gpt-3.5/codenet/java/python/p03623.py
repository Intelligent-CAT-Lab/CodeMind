```python
def p03623():
    x, a, b = map(int, input().split())
    if abs(x-a) < abs(x-b):
        print("A")
    else:
        print("B")

# Test the function with sample input
p03623()
```
