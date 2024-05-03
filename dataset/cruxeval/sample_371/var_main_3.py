def f(nums):
    for odd in nums[:]:	## <state>odd = CLRJ | nums = CLRJ</state>
        if odd % 2 != 0:	## <state>odd = CLRJ</state>
            nums.remove(odd)	## <state>nums = CLRJ | odd = CLRJ</state>
    sum_ = 0	## <state>sum_ = CLRJ</state>
    for num in nums:	## <state>num = CLRJ | nums = CLRJ</state>
        sum_ += num	## <state>sum_ = CLRJ | num = CLRJ</state>
    return sum_	## <state>sum_ = CLRJ</state>
