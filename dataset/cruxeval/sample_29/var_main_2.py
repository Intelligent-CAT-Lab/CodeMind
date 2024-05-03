def f(text):
    nums = list(filter(str.isnumeric, text))	## nums = [] | text = []
    assert len(nums) > 0	## nums = []
    return ''.join(nums)	## nums = []
