def f(text1, text2):
    nums = []	## nums = []
    for i in range(len(text2)):	## i = [] | text2 = []
        nums.append(text1.count(text2[i]))	## nums = [] | text1 = [] | text2 = [] | i = []
    return sum(nums)	## nums = []
