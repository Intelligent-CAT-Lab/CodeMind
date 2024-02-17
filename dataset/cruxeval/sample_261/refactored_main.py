nums = [12, 516, 5, 2, 3, 214, 51]
target = 5
lows, higgs = [], []
for i in nums:
    if i < target:
        lows.append(i)
    else:
        higgs.append(i)
lows.clear()
print(lows, higgs)