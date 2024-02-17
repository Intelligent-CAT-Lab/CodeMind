nums = [1, 3, -1, 1, -2, 6]
a = 0
for i in range(len(nums)):
    nums.insert(i, nums[a])
    a += 1
print(nums)