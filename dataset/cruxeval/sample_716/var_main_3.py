def f(nums):
    count = len(nums)	## <state>count = CLRJ | nums = CLRJ</state>
    while len(nums) > (count//2):	## <state>nums = CLRJ | count = CLRJ</state>
        nums.clear()	## <state>nums = CLRJ</state>
    return nums	## <state>nums = CLRJ</state>
