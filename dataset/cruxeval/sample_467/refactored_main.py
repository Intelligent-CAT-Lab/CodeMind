nums = {}
copy = nums.copy()
newDict = dict()
for k in copy:
    newDict[k] = len(copy[k])
print(newDict)