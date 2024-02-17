def f(nums):
    for i in range(len(nums)):
        if nums[i] % 3 == 0:
            nums.append(nums[i])
    return nums