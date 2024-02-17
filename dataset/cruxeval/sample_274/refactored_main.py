nums = [1, 2, 3]
target = 4
count = 0
for n1 in nums:
    for n2 in nums:
        count += (n1+n2==target)
print(count)