def f(text, digit):
    #different than previous? Just count instances digit
    count = text.count(digit)	## <state>count = CLRJ | text = CLRJ | digit = CLRJ</state>
    return int(digit) * count	## <state>digit = CLRJ | count = CLRJ</state>
