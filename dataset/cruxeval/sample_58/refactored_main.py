nums = [-1, 0, 0, 1, 1]
count = len(nums)
for i in [i % 2 for i in range(count)]:
    nums.append(nums[i])
print(nums)