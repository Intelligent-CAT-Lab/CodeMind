def f(nums, elements):
    result = []
    for i in range(len(elements)):
        result.append(nums.pop())
    return nums