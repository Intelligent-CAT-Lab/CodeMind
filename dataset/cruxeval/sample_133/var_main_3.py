def f(nums, elements):
    result = []	## <state>result = CLRJ</state>
    for i in range(len(elements)):	## <state>i = CLRJ | elements = CLRJ</state>
        result.append(nums.pop())	## <state>result = CLRJ | nums = CLRJ</state>
    return nums	## <state>nums = CLRJ</state>
