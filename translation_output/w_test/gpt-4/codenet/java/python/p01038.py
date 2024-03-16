Here's the Java code you provided translated to Python:

```python
def main():
    # Input parsing
    nums = list(map(int, input().split()))
    N = nums[0]
    heights = nums[1:]
    
    signed = []
    prev = float('-inf')
    
    for i in range(N - 1):
        next_diff = heights[i + 1] - heights[i]
        next_sign = 0 if next_diff == 0 else int(next_diff / abs(next_diff))
        
        if i == 0:
            prev = next_sign
            continue
        
        if prev != next_sign:
            signed.append(prev)
            prev = next_sign
    if prev != float('-inf'):
        signed.append(prev)
    # print(signed)  # For debugging, if needed
    
    counts = [0] * 5
    
    for i in range(1, len(signed) - 1):
        prev_sign = signed[i - 1]
        curr_sign = signed[i]
        next_sign = signed[i + 1]
        
        if curr_sign == 0:
            if prev_sign == 1 and next_sign == -1:
                counts[0] += 1
            elif prev_sign == -1 and next_sign == 1:
                counts[1] += 1
            else:
                counts[2] += 1
    
    for i in range(len(signed) - 1):
        curr_sign = signed[i]
        next_sign = signed[i + 1]
        
        if curr_sign != next_sign and curr_sign != 0 and next_sign != 0:
            if curr_sign > 0:
                counts[3] += 1
            else:
                counts[4] += 1
    
    print(" ".join(map(str, counts)))

if __name__ == "__main__":
    main()
```

Now let's test the code:

Test input:
```
5 1 2 3 4 3
```

Expected output:
```
0 0 0 1 0
```

You can run the Python code using the above input and check if it generates the expected output.
