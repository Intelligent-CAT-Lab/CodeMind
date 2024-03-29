Here is the equivalent Python code for the given Java code:

```python
def calculate_output(N, M):
    X = 1900 * M + 100 * (N - M)
    rate = 1
    
    for i in range(M):
        rate *= 2
    
    return rate * X

# Test input
input_str = input()
N, M = map(int, input_str.split())

# Call the function and print the result
print(calculate_output(N, M))
```
You can run this Python code, and when prompted for input, if you provide "1 1", you should receive the expected output of 3800.
