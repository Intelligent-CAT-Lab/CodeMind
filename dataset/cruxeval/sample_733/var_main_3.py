def f(text):
    length = len(text) // 2	## <state>length = CLRJ | text = CLRJ</state>
    left_half = text[:length]	## <state>left_half = CLRJ | text = CLRJ | length = CLRJ</state>
    right_half = text[length:][::-1]	## <state>right_half = CLRJ | text = CLRJ | length = CLRJ</state>
    return left_half + right_half	## <state>left_half = CLRJ | right_half = CLRJ</state>
