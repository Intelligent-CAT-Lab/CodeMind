def f(phrase):
    ans = 0	## ans = CLRJ
    for w in phrase.split():	## w = CLRJ | phrase = CLRJ
        for ch in w:	## ch = CLRJ | w = CLRJ
            if ch == "0":	## ch = CLRJ
                ans += 1	## ans = CLRJ
    return ans	## ans = CLRJ
