def f(nums):
    nums.reverse()
    return ''.join(map(str, nums))
f([-1, 9, 3, 1, -2])