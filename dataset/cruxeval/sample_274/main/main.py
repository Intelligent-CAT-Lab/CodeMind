def f(nums, target):
    count = 0
    for n1 in nums:
        for n2 in nums:
            count += (n1+n2==target)
    return count