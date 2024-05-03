def f(text):
    result = ''	## <state>result = CLRJ</state>
    for char in text:	## <state>char = CLRJ | text = CLRJ</state>
        if char.isalnum():	## <state>char = CLRJ</state>
            result += char.upper()	## <state>result = CLRJ | char = CLRJ</state>
    return result	## <state>result = CLRJ</state>
