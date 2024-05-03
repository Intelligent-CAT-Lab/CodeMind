def f(nums):
    count = len(nums)	## count = [] | nums = []
    for i in range(len(nums) - 1, -1, -1):	## i = [] | nums = []
        nums.insert(i, nums.pop(0))	## nums = [] | i = []
    return nums	## nums = []
