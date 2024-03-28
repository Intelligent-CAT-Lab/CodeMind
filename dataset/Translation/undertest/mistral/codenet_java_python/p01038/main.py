import sys

N = int(input())
heights = list(map(int, input().split()))

signed = []
prev = -sys.maxsize
for i in range(N - 1):
    next_diff = heights[i + 1] - heights[i]
    next_sign = next_diff if next_diff != 0 else 0
    if i == 0:
        prev = next_sign
        continue
    if prev != next_sign:
        signed.append(prev)
        prev = next_sign

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

for i in range(5):
    if i != 0:
        print(" ", end="")
    print(counts[i], end="")
print()