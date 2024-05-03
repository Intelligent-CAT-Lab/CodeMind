def f(nums, target):
    lows, higgs = [], []	## lows = CLRJ | higgs = CLRJ
    for i in nums:	## i = CLRJ | nums = CLRJ
        if i < target:	## i = CLRJ | target = CLRJ
            lows.append(i)	## lows = CLRJ | i = CLRJ
        else:
            higgs.append(i)	## higgs = CLRJ | i = CLRJ
    lows.clear()	## lows = CLRJ
    return lows, higgs	## lows = CLRJ | higgs = CLRJ
