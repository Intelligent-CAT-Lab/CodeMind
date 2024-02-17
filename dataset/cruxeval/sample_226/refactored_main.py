nums = [1, 3]
for i in range(len(nums)):
    if nums[i] % 3 == 0:
        nums.append(nums[i])
print(nums)