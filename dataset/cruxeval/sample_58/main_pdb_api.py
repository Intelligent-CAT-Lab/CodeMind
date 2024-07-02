def f(nums):
    count = len(nums)
    for i in [i % 2 for i in range(count)]:
        nums.append(nums[i])
    return nums
f([-1, 0, 0, 1, 1])