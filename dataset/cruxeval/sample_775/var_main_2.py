def f(nums):
    count = len(nums)	## count = [] | nums = []
    for i in range(0, count // 2):	## i = [] | count = []
        nums[i], nums[count-i-1] = nums[count-i-1], nums[i]	## nums = [] | i = [] | count = []
    return nums	## nums = []
