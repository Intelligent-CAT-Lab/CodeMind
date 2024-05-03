def f(nums):
    nums = ['{0:{fill}>{width}}'.format(val, **{'fill': '0', 'width': nums[0]}) for val in nums[1:]]	## <state>nums = CLRJ | val = CLRJ</state>
    return [str(val) for val in nums]	## <state>val = CLRJ | nums = CLRJ</state>
