def f(nums, mos):
    for num in mos:	## <state>num = CLRJ | mos = CLRJ</state>
        nums.pop(nums.index(num))	## <state>nums = CLRJ | num = CLRJ</state>
    nums.sort()	## <state>nums = CLRJ</state>
    for num in mos:	## <state>num = CLRJ | mos = CLRJ</state>
        nums += [num]	## <state>nums = CLRJ | num = CLRJ</state>
    for i in range(len(nums)-1):	## <state>i = CLRJ | nums = CLRJ</state>
        if nums[i] > nums[i+1]:	## <state>nums = CLRJ | i = CLRJ</state>
            return False
    return True