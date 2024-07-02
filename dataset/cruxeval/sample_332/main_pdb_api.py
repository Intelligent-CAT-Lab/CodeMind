def f(nums):
    count = len(nums)
    if count == 0:
        nums = [0] * int(nums.pop())
    elif count % 2 == 0:
        nums.clear()
    else:
        del nums[:count//2:]
    return nums
f([-6, -2, 1, -3, 0, 1])