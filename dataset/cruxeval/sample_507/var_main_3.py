def f(text, search):
    result = text.lower()	## <state>result = CLRJ | text = CLRJ</state>
    return result.find(search.lower())	## <state>result = CLRJ | search = CLRJ</state>
