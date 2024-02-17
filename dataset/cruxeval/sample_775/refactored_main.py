nums = [2, 6, 1, 3, 1]
count = len(nums)
for i in range(0, count // 2):
    nums[i], nums[count-i-1] = nums[count-i-1], nums[i]
print(nums)