def f(nums):
    nums = [y for y in nums if y > 0]
    if len(nums) <= 3:
        return nums
    nums.reverse()
    half = len(nums)//2
    return nums[:half] + [0]*5 + nums[half:]
f([10, 3, 2, 2, 6, 0])