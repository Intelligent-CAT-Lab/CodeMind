def f(nums):
    for i in range(len(nums)):	## i = [] | nums = []
        nums.insert(i, nums[i]**2)	## nums = [] | i = []
    return nums	## nums = []
