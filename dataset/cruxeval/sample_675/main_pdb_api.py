def f(nums, sort_count):
    nums.sort()
    return nums[:sort_count]
f([1, 2, 2, 3, 4, 5], 1)