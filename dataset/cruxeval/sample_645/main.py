def f(nums, target):
    if nums.count(0):
        return 0
    elif nums.count(target) < 3:
        return 1
    else:
        return nums.index(target)