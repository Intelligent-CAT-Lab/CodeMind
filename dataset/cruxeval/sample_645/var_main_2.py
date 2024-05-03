def f(nums, target):
    if nums.count(0):	## nums = []
        return 0
    elif nums.count(target) < 3:	## nums = [] | target = []
        return 1
    else:
        return nums.index(target)