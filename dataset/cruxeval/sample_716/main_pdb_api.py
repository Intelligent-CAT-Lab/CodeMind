def f(nums):
    count = len(nums)
    while len(nums) > (count//2):
        nums.clear()
    return nums
f([2, 1, 2, 3, 1, 6, 3, 8])