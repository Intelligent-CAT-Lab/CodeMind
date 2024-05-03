def f(text, char):
    if char in text:	## {"char" : '',"text" : ''}
        suff, char, pref = text.partition(char)	## {"suff" : '',"char" : '',"pref" : '',"text" : ''}
        pref = suff[:-len(char)] + suff[len(char):] + char + pref	## {"pref" : '',"suff" : '',"char" : ''}
        return suff + char + pref	## {"suff" : '',"char" : '',"pref" : ''}
    return text