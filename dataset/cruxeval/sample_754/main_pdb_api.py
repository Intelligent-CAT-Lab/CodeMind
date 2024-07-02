def f(nums):
    nums = ['{0:{fill}>{width}}'.format(val, **{'fill': '0', 'width': nums[0]}) for val in nums[1:]]
    return [str(val) for val in nums]
f(['1', '2', '2', '44', '0', '7', '20257'])