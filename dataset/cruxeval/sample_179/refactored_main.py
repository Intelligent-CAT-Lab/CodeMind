nums = [7, 1, 2, 6, 0, 2]
nums = nums[:]
count = len(nums)
for i in range(-count+1, 0):
    nums.insert(0, nums[i])
print(nums)