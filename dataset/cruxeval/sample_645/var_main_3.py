def f(nums, target):
    if nums.count(0):	## <state>nums = CLRJ</state>
        return 0
    elif nums.count(target) < 3:	## <state>nums = CLRJ | target = CLRJ</state>
        return 1
    else:
        return nums.index(target)