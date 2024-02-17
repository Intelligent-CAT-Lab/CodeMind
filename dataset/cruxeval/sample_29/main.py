def f(text):
    nums = list(filter(str.isnumeric, text))
    assert len(nums) > 0
    return ''.join(nums)