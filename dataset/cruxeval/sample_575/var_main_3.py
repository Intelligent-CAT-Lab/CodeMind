def f(nums, val):
    new_list = []	## <state>new_list = CLRJ</state>
    [new_list.extend([i] * val) for i in nums]	## <state>new_list = CLRJ | i = CLRJ | val = CLRJ | nums = CLRJ</state>
    return sum(new_list)	## <state>new_list = CLRJ</state>
