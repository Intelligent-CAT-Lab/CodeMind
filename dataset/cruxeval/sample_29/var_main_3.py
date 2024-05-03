def f(text):
    nums = list(filter(str.isnumeric, text))	## <state>nums = CLRJ | text = CLRJ</state>
    assert len(nums) > 0	## <state>nums = CLRJ</state>
    return ''.join(nums)	## <state>nums = CLRJ</state>
