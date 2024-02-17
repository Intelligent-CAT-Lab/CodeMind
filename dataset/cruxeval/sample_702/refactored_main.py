nums = [0, -5, -4]
count = len(nums)
for i in range(len(nums) - 1, -1, -1):
    nums.insert(i, nums.pop(0))
print(nums)