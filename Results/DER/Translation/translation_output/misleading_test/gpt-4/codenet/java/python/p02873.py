Here is the Java code translated to Python:

```python
import sys

# Since no input is provided, we use an empty string
# In a regular use case, it can be replaced with input()
input_str = ""  # assuming the input is provided here

n = len(input_str)
sum = 0
ptr = 0
cnt = 0
curr = 0

while ptr < n:
    if input_str[ptr] == '>':
        while ptr < n and input_str[ptr] == '>':
            ptr += 1
            cnt += 1
        if curr > cnt:
            sum += (curr + ((cnt * (cnt - 1)) // 2))
        else:
            sum += (((cnt + 1) * cnt) // 2)
        curr = 0
        cnt = 0
    else:
        sum += curr
        curr += 1
        ptr += 1

if input_str[n - 1] == '<':
    sum += curr

print(sum)
```

In the translated code, `input_str` should be assigned the actual input string. However, for the test case provided, it's not clear what the input is. The placeholder for input is an empty string, but that would simply return `0` because there is no content to process. To properly use this code, replace `input_str = ""` with the actual input, for example `input_str = input()` to get input from the console, or set `input_str` to the provided string literal as in `input_str = "<><>"`.

For the actual test case you provided, it seems there's a typo since the input box contains no characters. If you provide the correct input string, you should be able to get the expected output from the given code.
