def f(nums, target):
    if nums.count(0):	## nums = CLRJ
        return 0
    elif nums.count(target) < 3:	## nums = CLRJ | target = CLRJ
        return 1
    else:
        return nums.index(target)