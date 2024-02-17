nums = [0, 3, 0, 1]
verdict = lambda x: x < 2
res = [x for x in nums if x != 0]
result = [[x, verdict(x)] for x in res]
if result:
    print(result)
else:
    print('error - no numbers or all zeros!')