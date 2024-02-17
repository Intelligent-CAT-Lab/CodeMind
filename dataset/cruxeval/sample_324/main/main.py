def f(nums):
    asc, desc = nums.copy(), []
    asc.reverse()
    desc = asc[:len(asc)//2]
    return desc + asc + desc