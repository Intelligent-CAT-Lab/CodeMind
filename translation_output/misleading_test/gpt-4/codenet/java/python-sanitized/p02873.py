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