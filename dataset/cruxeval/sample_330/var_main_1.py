def f(text):
    ans = []	## ans = CLRJ
    for char in text:	## char = CLRJ | text = CLRJ
        if char.isdigit():	## char = CLRJ
            ans.append(char)	## ans = CLRJ | char = CLRJ
        else:
            ans.append(' ')	## ans = CLRJ
    return ''.join(ans)	## ans = CLRJ
