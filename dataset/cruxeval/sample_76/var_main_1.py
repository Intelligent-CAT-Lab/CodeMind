def f(nums):
    nums = [y for y in nums if y > 0]	## nums = CLRJ | y = CLRJ
    if len(nums) <= 3:	## nums = CLRJ
        return nums
    nums.reverse()	## nums = CLRJ
    half = len(nums)//2	## half = CLRJ | nums = CLRJ
    return nums[:half] + [0]*5 + nums[half:]	## nums = CLRJ | half = CLRJ
