def f(text):
    freq = dict()	## freq = CLRJ
    for c in text.lower():	## c = CLRJ | text = CLRJ
        if c in freq:	## c = CLRJ | freq = CLRJ
            freq[c] += 1
        else:
            freq[c] = 1	## freq = CLRJ | c = CLRJ
    return freq	## freq = CLRJ
