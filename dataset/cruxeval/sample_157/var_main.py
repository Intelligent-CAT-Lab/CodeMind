def f(phrase):
    ans = 0	## {"ans" : ''}
    for w in phrase.split():	## {"w" : '',"phrase" : ''}
        for ch in w:	## {"ch" : '',"w" : ''}
            if ch == "0":	## {"ch" : ''}
                ans += 1	## {"ans" : ''}
    return ans	## {"ans" : ''}
