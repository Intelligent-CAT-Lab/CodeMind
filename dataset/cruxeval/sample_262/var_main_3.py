def f(nums):
    count = len(nums)	## <state>count = CLRJ | nums = CLRJ</state>
    score = {0: "F", 1: "E", 2: "D", 3: "C", 4: "B", 5: "A", 6: ""}	## <state>score = CLRJ</state>
    result = []	## <state>result = CLRJ</state>
    for i in range(count):	## <state>i = CLRJ | count = CLRJ</state>
        result.append(score.get(nums[i]))	## <state>result = CLRJ | score = CLRJ | nums = CLRJ | i = CLRJ</state>
    return ''.join(result)	## <state>result = CLRJ</state>
