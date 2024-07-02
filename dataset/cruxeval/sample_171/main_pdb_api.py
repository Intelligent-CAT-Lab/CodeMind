def f(nums):
    count = len(nums) // 2
    for _ in range(count):
        nums.pop(0)
    return nums
f([3, 4, 1, 2, 3])