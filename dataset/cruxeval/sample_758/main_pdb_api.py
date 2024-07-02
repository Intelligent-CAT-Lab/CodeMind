def f(nums):
    if nums[::-1] == nums:
        return True
    return False
f([0, 3, 6, 2])