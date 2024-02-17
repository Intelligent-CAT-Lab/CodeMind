nums = [7, 1, 2, 6, 0, 2]
elements = [9, 0, 3]
result = []
for i in range(len(elements)):
    result.append(nums.pop())
print(nums)