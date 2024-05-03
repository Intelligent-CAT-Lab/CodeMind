def f(nums):
    count = len(nums)	## count = [] | nums = []
    score = {0: "F", 1: "E", 2: "D", 3: "C", 4: "B", 5: "A", 6: ""}	## score = []
    result = []	## result = []
    for i in range(count):	## i = [] | count = []
        result.append(score.get(nums[i]))	## result = [] | score = [] | nums = [] | i = []
    return ''.join(result)	## result = []
