nums = [0, 6, 2, -1, -2]
count = len(nums)
for i in range(-count+1, 0):
    nums.extend([nums[i], nums[i]])
print(nums)