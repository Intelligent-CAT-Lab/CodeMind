def f(phrase):
    ans = 0	## <state>ans = CLRJ</state>
    for w in phrase.split():	## <state>w = CLRJ | phrase = CLRJ</state>
        for ch in w:	## <state>ch = CLRJ | w = CLRJ</state>
            if ch == "0":	## <state>ch = CLRJ</state>
                ans += 1	## <state>ans = CLRJ</state>
    return ans	## <state>ans = CLRJ</state>
