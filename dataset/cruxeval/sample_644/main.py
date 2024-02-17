def f(nums, pos):
    s = slice(None)
    if pos % 2:
        s = slice(None, -1)
    nums[s].reverse()
    return nums