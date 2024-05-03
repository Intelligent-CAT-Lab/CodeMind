def f(nums):
    m = max(nums)	## <state>m = CLRJ | nums = CLRJ</state>
    for i in range(m):	## <state>i = CLRJ | m = CLRJ</state>
        nums.reverse()	## <state>nums = CLRJ</state>
    return nums	## <state>nums = CLRJ</state>
