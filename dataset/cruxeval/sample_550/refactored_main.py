nums = [1, 2, 4]
for i in range(len(nums)):
    nums.insert(i, nums[i]**2)
print(nums)