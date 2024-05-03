def f(nums):
    nums = ['{0:{fill}>{width}}'.format(val, **{'fill': '0', 'width': nums[0]}) for val in nums[1:]]	## nums = CLRJ | val = CLRJ
    return [str(val) for val in nums]	## val = CLRJ | nums = CLRJ
