def f(nums):
    nums = [y for y in nums if y > 0]	## nums = [] | y = []
    if len(nums) <= 3:	## nums = []
        return nums
    nums.reverse()	## nums = []
    half = len(nums)//2	## half = [] | nums = []
    return nums[:half] + [0]*5 + nums[half:]	## nums = [] | half = []
