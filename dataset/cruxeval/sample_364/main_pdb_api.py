def f(nums, verdict):
    res = [x for x in nums if x != 0]
    result = [[x, verdict(x)] for x in res]
    if result:
        return result
    return 'error - no numbers or all zeros!'
f([0, 3, 0, 1], lambda x: x < 2)