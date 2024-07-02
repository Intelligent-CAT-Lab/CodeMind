def f(nums):
    nums[:] = nums[::-1]
    return nums
f([-6, -2, 1, -3, 0, 1])