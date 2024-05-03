def f(nums):
    middle = len(nums)//2	## <state>middle = CLRJ | nums = CLRJ</state>
    return nums[middle:] + nums[0:middle]	## <state>nums = CLRJ | middle = CLRJ</state>
