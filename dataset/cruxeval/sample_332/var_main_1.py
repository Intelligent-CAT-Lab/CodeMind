def f(nums):
    count = len(nums)	## count = CLRJ | nums = CLRJ
    if count == 0:	## count = CLRJ
        nums = [0] * int(nums.pop())
    elif count % 2 == 0:	## count = CLRJ
        nums.clear()	## nums = CLRJ
    else:
        del nums[:count//2:]
    return nums	## nums = CLRJ
