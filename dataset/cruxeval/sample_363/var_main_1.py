def f(nums):
    nums.sort()	## nums = CLRJ
    n = len(nums)	## n = CLRJ | nums = CLRJ
    new_nums = [nums[n//2]]	## new_nums = CLRJ | nums = CLRJ | n = CLRJ
    
    if n % 2 == 0:	## n = CLRJ
        new_nums = [nums[n//2 - 1], nums[n//2]]
    
    for i in range(0, n//2):	## n = CLRJ
        new_nums.insert(0, nums[n-i-1])
        new_nums.append(nums[i])
    return new_nums	## new_nums = CLRJ
