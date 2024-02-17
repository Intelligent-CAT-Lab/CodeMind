nums = [2, 3, 4, 6, -2]
for i in range(len(nums)-1, -1, -1):
    if nums[i] % 2 == 1:
        nums.insert(i+1, nums[i])
print(nums)