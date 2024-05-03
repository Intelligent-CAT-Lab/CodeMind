def f(text1, text2):
    nums = []	## <state>nums = CLRJ</state>
    for i in range(len(text2)):	## <state>i = CLRJ | text2 = CLRJ</state>
        nums.append(text1.count(text2[i]))	## <state>nums = CLRJ | text1 = CLRJ | text2 = CLRJ | i = CLRJ</state>
    return sum(nums)	## <state>nums = CLRJ</state>
