def f(nums):
    output = []	## <state>output = CLRJ</state>
    for n in nums:	## <state>n = CLRJ | nums = CLRJ</state>
        output.append((nums.count(n), n))	## <state>output = CLRJ | nums = CLRJ | n = CLRJ</state>
    output.sort(reverse=True)	## <state>output = CLRJ</state>
    return output	## <state>output = CLRJ</state>
