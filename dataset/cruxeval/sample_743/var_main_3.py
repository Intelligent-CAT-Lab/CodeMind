def f(text):
    string_a, string_b = text.split(',')	## <state>string_a = CLRJ | string_b = CLRJ | text = CLRJ</state>
    return -(len(string_a) + (len(string_b)))	## <state>string_a = CLRJ | string_b = CLRJ</state>
