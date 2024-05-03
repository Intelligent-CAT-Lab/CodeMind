def f(nums, n):
    pos = len(nums) - 1	## pos = CLRJ | nums = CLRJ
    for i in range(-len(nums), 0):	## nums = CLRJ
        nums.insert(pos, nums[i])
    return nums	## nums = CLRJ
