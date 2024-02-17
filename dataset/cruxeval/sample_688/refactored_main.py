nums = [3, 1, 9, 0, 2, 0, 8]
l = []
for i in nums:
    if i not in l:
        l.append(i)
print(l)