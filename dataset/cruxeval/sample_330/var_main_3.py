def f(text):
    ans = []	## <state>ans = CLRJ</state>
    for char in text:	## <state>char = CLRJ | text = CLRJ</state>
        if char.isdigit():	## <state>char = CLRJ</state>
            ans.append(char)	## <state>ans = CLRJ | char = CLRJ</state>
        else:
            ans.append(' ')	## <state>ans = CLRJ</state>
    return ''.join(ans)	## <state>ans = CLRJ</state>
