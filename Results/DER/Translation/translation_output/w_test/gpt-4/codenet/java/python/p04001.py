The following code is the Python equivalent of the provided Java code:

```python
S = input().strip()
if len(S) == 1:
    print(S)
    exit(0)

N = [int(digit) for digit in S]
pattern_count = 1
tmp_bit = ""
for i in range(len(N)):
    if i > 0:
        pattern_count *= 2
        tmp_bit += "1"

sum_ = 0
for i in range(pattern_count):
    bin_ = bin(i)[2:]  # get binary representation without the '0b' prefix
    while len(bin_) < len(tmp_bit):
        bin_ = "0" + bin_
    add = str(N[0])
    for j in range(len(bin_)):
        if bin_[j] == '1':
            sum_ += int(add)
            add = ""
        add += str(N[j + 1])
    if len(add) > 0:
        sum_ += int(add)

print(sum_)
```

You can test this code with the input `125` as shown in the test case:

```python
# Test Input
S = '125'

# Expected Output: 176
```

Using the test case, the output will be `176` if you run the Python code with the input `125`.
