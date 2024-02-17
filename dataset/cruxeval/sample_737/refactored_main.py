nums = [0, 6, 2, -1, -2]
counts = 0
for i in nums:
    if str(i).isdecimal():
        if counts == 0:
            counts += 1
print(counts)