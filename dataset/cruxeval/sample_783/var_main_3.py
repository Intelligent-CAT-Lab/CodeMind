def f(text, comparison):
    length = len(comparison)	## <state>length = CLRJ | comparison = CLRJ</state>
    if length <= len(text):	## <state>length = CLRJ | text = CLRJ</state>
        for i in range(length):	## <state>length = CLRJ</state>
            if comparison[length - i - 1] != text[len(text) - i - 1]:
                return i
    return length	## <state>length = CLRJ</state>
