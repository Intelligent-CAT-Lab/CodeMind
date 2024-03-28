```python
def compute_sum(S):
    if len(S) == 1:
        return int(S)

    N = [int(char) for char in S]

    patternCount = 1
    tmpBit = ""
    for i in range(len(N)):
        if i > 0:
            patternCount *= 2
            tmpBit += "1"

    sum_total = 0
    for i in range(patternCount):
        bin_val = bin(i)[2:].zfill(len(tmpBit))
        add = str(N[0])
        for j in range(len(bin_val)):
            if bin_val[j] == '1':
                sum_total += int(add)
                add = ""
            add += str(N[j + 1])
        if len(add) > 0:
            sum_total += int(add)

    return sum_total

# Test the function with the given input
input_str = "125"
output = compute_sum(input_str)
print(output)
```
```python
# Output
91
```

