nums = []
asc, desc = nums.copy(), []
asc.reverse()
desc = asc[:len(asc)//2]
print(desc + asc + desc)