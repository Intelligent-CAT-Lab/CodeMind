def f(nums):
    count = 1
    for i in range(count, len(nums) - 1, 2):
        nums[i] = max(nums[i], nums[count-1])
        count += 1
    return nums