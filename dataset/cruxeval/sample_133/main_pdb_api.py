def f(nums, elements):
    result = []
    for i in range(len(elements)):
        result.append(nums.pop())
    return nums
f([7, 1, 2, 6, 0, 2], [9, 0, 3])