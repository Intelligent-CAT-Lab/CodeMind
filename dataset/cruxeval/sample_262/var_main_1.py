def f(nums):
    count = len(nums)	## count = CLRJ | nums = CLRJ
    score = {0: "F", 1: "E", 2: "D", 3: "C", 4: "B", 5: "A", 6: ""}	## score = CLRJ
    result = []	## result = CLRJ
    for i in range(count):	## i = CLRJ | count = CLRJ
        result.append(score.get(nums[i]))	## result = CLRJ | score = CLRJ | nums = CLRJ | i = CLRJ
    return ''.join(result)	## result = CLRJ
