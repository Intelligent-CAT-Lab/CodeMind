def f(text):
    freq = dict()	## {"freq" : ''}
    for c in text.lower():	## {"c" : '',"text" : ''}
        if c in freq:	## {"c" : '',"freq" : ''}
            freq[c] += 1
        else:
            freq[c] = 1	## {"freq" : '',"c" : ''}
    return freq	## {"freq" : ''}
