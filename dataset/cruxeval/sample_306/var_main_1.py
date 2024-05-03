def f(nums):
    digits = []	## digits = CLRJ
    for num in nums:	## num = CLRJ | nums = CLRJ
        if (isinstance(num, str) and num.isnumeric()) or isinstance(num, int):	## num = CLRJ
            digits.append(num)	## digits = CLRJ | num = CLRJ
    digits = list(map(int, digits))	## digits = CLRJ
    return digits	## digits = CLRJ
