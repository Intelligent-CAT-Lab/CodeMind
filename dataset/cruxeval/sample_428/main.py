def f(nums):
    for i in range(len(nums)):
        if not i % 2:
            nums.append(nums[i] * nums[i + 1])
    return nums