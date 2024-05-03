def f(nums, odd1, odd2):
    while odd1 in nums:	## <state>odd1 = CLRJ | nums = CLRJ</state>
        nums.remove(odd1)	## <state>nums = CLRJ | odd1 = CLRJ</state>
    while odd2 in nums:	## <state>odd2 = CLRJ | nums = CLRJ</state>
        nums.remove(odd2)	## <state>nums = CLRJ | odd2 = CLRJ</state>
    return nums	## <state>nums = CLRJ</state>
