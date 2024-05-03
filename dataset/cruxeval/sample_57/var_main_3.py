def f(text):
    text = text.upper()	## <state>text = CLRJ</state>
    count_upper = 0	## <state>count_upper = CLRJ</state>
    for char in text:	## <state>char = CLRJ | text = CLRJ</state>
        if char.isupper():	## <state>char = CLRJ</state>
            count_upper += 1	## <state>count_upper = CLRJ</state>
        else:
            return 'no'
    return count_upper // 2	## <state>count_upper = CLRJ</state>
