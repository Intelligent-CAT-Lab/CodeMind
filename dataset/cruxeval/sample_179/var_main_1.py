def f(nums):
    # Pass in a copy to avoid modifying nums
    nums = nums[:]	## nums = CLRJ
    count = len(nums)	## count = CLRJ | nums = CLRJ
    for i in range(-count+1, 0):	## i = CLRJ | count = CLRJ
        nums.insert(0, nums[i])	## nums = CLRJ | i = CLRJ
    return nums	## nums = CLRJ
