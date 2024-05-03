def f(nums, target):
    count = 0	## count = CLRJ
    for n1 in nums:	## n1 = CLRJ | nums = CLRJ
        for n2 in nums:	## n2 = CLRJ | nums = CLRJ
            count += (n1+n2==target)	## count = CLRJ | n1 = CLRJ | n2 = CLRJ | target = CLRJ
    return count	## count = CLRJ
