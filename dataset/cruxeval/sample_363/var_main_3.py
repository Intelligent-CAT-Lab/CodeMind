def f(nums):
    nums.sort()	## <state>nums = CLRJ</state>
    n = len(nums)	## <state>n = CLRJ | nums = CLRJ</state>
    new_nums = [nums[n//2]]	## <state>new_nums = CLRJ | nums = CLRJ | n = CLRJ</state>
    
    if n % 2 == 0:	## <state>n = CLRJ</state>
        new_nums = [nums[n//2 - 1], nums[n//2]]
    
    for i in range(0, n//2):	## <state>n = CLRJ</state>
        new_nums.insert(0, nums[n-i-1])
        new_nums.append(nums[i])
    return new_nums	## <state>new_nums = CLRJ</state>
