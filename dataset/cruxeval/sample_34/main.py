def f(nums, odd1, odd2):
    while odd1 in nums:
        nums.remove(odd1)
    while odd2 in nums:
        nums.remove(odd2)
    return nums