def f(nums):
    nums = [y for y in nums if y > 0]	## <state>nums = CLRJ | y = CLRJ</state>
    if len(nums) <= 3:	## <state>nums = CLRJ</state>
        return nums
    nums.reverse()	## <state>nums = CLRJ</state>
    half = len(nums)//2	## <state>half = CLRJ | nums = CLRJ</state>
    return nums[:half] + [0]*5 + nums[half:]	## <state>nums = CLRJ | half = CLRJ</state>
