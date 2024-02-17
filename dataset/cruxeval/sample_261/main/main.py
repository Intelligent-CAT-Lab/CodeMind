def f(nums, target):
    lows, higgs = [], []
    for i in nums:
        if i < target:
            lows.append(i)
        else:
            higgs.append(i)
    lows.clear()
    return lows, higgs