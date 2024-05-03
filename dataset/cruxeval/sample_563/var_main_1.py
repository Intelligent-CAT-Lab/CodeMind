def f(text1, text2):
    nums = []	## nums = CLRJ
    for i in range(len(text2)):	## i = CLRJ | text2 = CLRJ
        nums.append(text1.count(text2[i]))	## nums = CLRJ | text1 = CLRJ | text2 = CLRJ | i = CLRJ
    return sum(nums)	## nums = CLRJ
