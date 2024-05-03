def f(text):
    freq = dict()	## <state>freq = CLRJ</state>
    for c in text.lower():	## <state>c = CLRJ | text = CLRJ</state>
        if c in freq:	## <state>c = CLRJ | freq = CLRJ</state>
            freq[c] += 1
        else:
            freq[c] = 1	## <state>freq = CLRJ | c = CLRJ</state>
    return freq	## <state>freq = CLRJ</state>
