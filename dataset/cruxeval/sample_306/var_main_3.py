def f(nums):
    digits = []	## <state>digits = CLRJ</state>
    for num in nums:	## <state>num = CLRJ | nums = CLRJ</state>
        if (isinstance(num, str) and num.isnumeric()) or isinstance(num, int):	## <state>num = CLRJ</state>
            digits.append(num)	## <state>digits = CLRJ | num = CLRJ</state>
    digits = list(map(int, digits))	## <state>digits = CLRJ</state>
    return digits	## <state>digits = CLRJ</state>
