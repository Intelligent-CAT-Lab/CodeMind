def f(nums):
    count = len(nums)	## count = [] | nums = []
    if count == 0:	## count = []
        nums = [0] * int(nums.pop())
    elif count % 2 == 0:	## count = []
        nums.clear()	## nums = []
    else:
        del nums[:count//2:]
    return nums	## nums = []
