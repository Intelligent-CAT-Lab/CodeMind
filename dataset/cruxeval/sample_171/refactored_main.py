nums = [3, 4, 1, 2, 3]
count = len(nums) // 2
for _ in range(count):
    nums.pop(0)
print(nums)