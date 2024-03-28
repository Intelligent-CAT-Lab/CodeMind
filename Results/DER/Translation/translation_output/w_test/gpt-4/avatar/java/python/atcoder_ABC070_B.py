Here's the equivalent Python code for the provided Java code:

```python
def overlap_time(a, b, c, d):
    array = [0] * 101
    
    for i in range(a, b):
        array[i] += 1
        
    for i in range(c, d):
        array[i] += 1
        
    ans = sum(1 for i in range(101) if array[i] == 2)
    
    return ans

# Test input
input_values = "0 50 50 100"
a, b, c, d = map(int, input_values.split())

# Expected output
print(overlap_time(a, b, c, d))
```

This Python function `overlap_time` converts the Java main method, takes the four integers `a`, `b`, `c`, and `d` as input, and prints the overlapping time as per the given Java program logic. When you run the function with the test input given ("0 50 50 100"), you should expect to see the output `0`.
