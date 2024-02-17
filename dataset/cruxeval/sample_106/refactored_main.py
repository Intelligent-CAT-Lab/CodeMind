nums = [2, 8, -2, 9, 3, 3]
count = len(nums)
for i in range(0, count):
    nums.insert(i, nums[i]*2)
print(nums)