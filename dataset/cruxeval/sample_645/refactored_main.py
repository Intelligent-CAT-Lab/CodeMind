nums = [1, 1, 1, 2]
target = 3
if nums.count(0):
    print(0)
elif nums.count(target) < 3:
    print(1)
else:
    print(nums.index(target))