```python
def solve(s):
    a = [0] * 26
    b = [0] * 1111

    for char in s:
        a[ord(char) - ord('a')] += 1
        
    for count in a:
        b[count] += 1
        
    for i in range(999, -1, -2):
        if b[i] > 0:
            b[i] -= 1
            break
    
    m = 0
    for i in range(1, 1001, 2):
        m += b[i]
        
    if m % 2 == 0:
        print(m // 2)
    else:
        print(m // 2 + 1)

# Test case
test_input = "hcpc"
solve(test_input)
```

This is the required Python code, which is a direct translation from the Java code provided. The Python version doesn't need to handle input and output in the same way Java does, so I omitted those parts.
