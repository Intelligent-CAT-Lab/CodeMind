def f(text):
    nums = list(filter(str.isnumeric, text))	## nums = CLRJ | text = CLRJ
    assert len(nums) > 0	## nums = CLRJ
    return ''.join(nums)	## nums = CLRJ
