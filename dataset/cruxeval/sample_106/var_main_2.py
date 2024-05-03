def f(nums):
    count = len(nums)	## count = [] | nums = []
    for i in range(0, count):	## i = [] | count = []
        nums.insert(i, nums[i]*2)	## nums = [] | i = []
    return nums	## nums = []
