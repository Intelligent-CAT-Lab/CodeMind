def f(nums, odd1, odd2):
    while odd1 in nums:
        nums.remove(odd1)
    while odd2 in nums:
        nums.remove(odd2)
    return nums
f([1, 2, 3, 7, 7, 6, 8, 4, 1, 2, 3, 5, 1, 3, 21, 1, 3], 3, 1)