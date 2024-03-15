Below is the translated Java code into Python:

```python
def main():
    N = int(input())
    
    heights = [int(input()) for _ in range(N)]
    
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
    # print(signed)
    
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
    
    for i, count in enumerate(counts):
        if i != 0:
            print(" ", end='')
        print(count, end='')
    print()

if __name__ == "__main__":
    main()
```

This script assumes each input from the `Scanner` in Java will be replaced by an input call in Python. Keep in mind that for large numbers of inputs, using `sys.stdin.readline` would be faster in Python. The `math.inf` constant is used to represent positive infinity, while `float('-inf')` is used to represent negative infinity.

Note that the `input()` function in Python reads a whole line from `stdin`. If inputs are provided on a single line, you might need to use `input().split()` and convert each string to an integer accordingly.
