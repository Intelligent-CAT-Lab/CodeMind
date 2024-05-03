max_num = 0
max_idx = 0
for i in range(3):
    x = int(input())
    if max_num < x:
        max_num = x
        max_idx = i
print(chr(ord('A') + max_idx))