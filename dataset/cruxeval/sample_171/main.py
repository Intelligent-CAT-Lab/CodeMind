def f(nums):
    count = len(nums) // 2
    for _ in range(count):
        nums.pop(0)
    return nums