def f(nums):
    count = 0
    for i in range(len(nums)):
        if len(nums) == 0:
            break
        if count % 2 == 0:
            nums.pop()
        else:
            nums.pop(0)
        count += 1
    return nums