def f(text):
    arr = text.split()	## <state>arr = CLRJ | text = CLRJ</state>
    result = []	## <state>result = CLRJ</state>
    for item in arr:	## <state>item = CLRJ | arr = CLRJ</state>
        if item.endswith('day'):	## <state>item = CLRJ</state>
            item += 'y'
        else:
            item += 'day'	## <state>item = CLRJ</state>
        result.append(item)	## <state>result = CLRJ | item = CLRJ</state>
    return ' '.join(result)	## <state>result = CLRJ</state>
