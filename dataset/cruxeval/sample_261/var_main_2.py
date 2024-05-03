def f(nums, target):
    lows, higgs = [], []	## lows = [] | higgs = []
    for i in nums:	## i = [] | nums = []
        if i < target:	## i = [] | target = []
            lows.append(i)	## lows = [] | i = []
        else:
            higgs.append(i)	## higgs = [] | i = []
    lows.clear()	## lows = []
    return lows, higgs	## lows = [] | higgs = []
