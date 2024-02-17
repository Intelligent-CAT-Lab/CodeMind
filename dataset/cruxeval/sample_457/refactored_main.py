nums = [3, 1, 7, 5, 6]
count = list(range(len(nums)))
for i in range(len(nums)):
    nums.pop()
    if len(count) > 0:
        count.pop(0)
print(nums)