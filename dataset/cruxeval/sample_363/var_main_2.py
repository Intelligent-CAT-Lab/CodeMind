def f(nums):
    nums.sort()	## nums = []
    n = len(nums)	## n = [] | nums = []
    new_nums = [nums[n//2]]	## new_nums = [] | nums = [] | n = []
    
    if n % 2 == 0:	## n = []
        new_nums = [nums[n//2 - 1], nums[n//2]]
    
    for i in range(0, n//2):	## n = []
        new_nums.insert(0, nums[n-i-1])
        new_nums.append(nums[i])
    return new_nums	## new_nums = []
