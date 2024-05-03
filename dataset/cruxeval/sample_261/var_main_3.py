def f(nums, target):
    lows, higgs = [], []	## <state>lows = CLRJ | higgs = CLRJ</state>
    for i in nums:	## <state>i = CLRJ | nums = CLRJ</state>
        if i < target:	## <state>i = CLRJ | target = CLRJ</state>
            lows.append(i)	## <state>lows = CLRJ | i = CLRJ</state>
        else:
            higgs.append(i)	## <state>higgs = CLRJ | i = CLRJ</state>
    lows.clear()	## <state>lows = CLRJ</state>
    return lows, higgs	## <state>lows = CLRJ | higgs = CLRJ</state>
