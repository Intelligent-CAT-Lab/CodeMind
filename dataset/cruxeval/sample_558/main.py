def f(nums, mos):
    for num in mos:
        nums.pop(nums.index(num))
    nums.sort()
    for num in mos:
        nums += [num]
    for i in range(len(nums)-1):
        if nums[i] > nums[i+1]:
            return False
    return True