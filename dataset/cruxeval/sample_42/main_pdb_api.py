def f(nums):
    nums.clear()
    for num in nums:
        nums.append(num*2)
    return nums
f([4, 3, 2, 1, 2, -1, 4, 2])