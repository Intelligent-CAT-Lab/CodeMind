def f(nums):
    count = len(nums)
    while len(nums) > (count//2):
        nums.clear()
    return nums