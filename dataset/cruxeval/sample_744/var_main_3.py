def f(text, new_ending):
    result = list(text)	## <state>result = CLRJ | text = CLRJ</state>
    result.extend(new_ending)	## <state>result = CLRJ | new_ending = CLRJ</state>
    return ''.join(result)	## <state>result = CLRJ</state>
