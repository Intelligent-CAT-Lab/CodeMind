def f(nums):
    a = -1
    b = nums[1:]
    while a <= b[0]:
        nums.remove(b[0])
        a = 0
        b = b[1:]
    return nums
f([-1, 5, 3, -2, -6, 8, 8])