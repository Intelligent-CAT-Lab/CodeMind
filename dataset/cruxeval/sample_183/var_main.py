def f(text):
    ls = text.split()	## {"ls" : '',"text" : ''}
    lines = " ".join(ls[::3]).splitlines()	## {"lines" : '',"ls" : ''}
    res = []	## {"res" : ''}
    for i in range(2):	## {"i" : ''}
        ln = ls[1::3]	## {"ln" : '',"ls" : ''}
        if 3 * i + 1 < len(ln):	## {"i" : '',"ln" : ''}
            res.append(" ".join(ln[3 * i:3 * (i + 1)]))
    return lines + res	## {"lines" : '',"res" : ''}
