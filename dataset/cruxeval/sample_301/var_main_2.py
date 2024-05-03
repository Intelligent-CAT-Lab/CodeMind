def f(nums):
    count = len(nums)	## count = [] | nums = []
    for i in range(-count+1, 0):	## i = [] | count = []
        nums.extend([nums[i], nums[i]])	## nums = [] | i = []
    return nums	## nums = []
