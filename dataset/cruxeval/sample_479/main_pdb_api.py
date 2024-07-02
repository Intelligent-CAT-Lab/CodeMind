def f(nums, pop1, pop2):
    nums.pop(pop1 - 1)
    nums.pop(pop2 - 1)
    return nums
f([1, 5, 2, 3, 6], 2, 4)