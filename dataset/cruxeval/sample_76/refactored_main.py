nums = [10, 3, 2, 2, 6, 0]
nums = [y for y in nums if y > 0]
if len(nums) <= 3:
    print(nums)
else:
    nums.reverse()
    half = len(nums)//2
    print(nums[:half] + [0]*5 + nums[half:])