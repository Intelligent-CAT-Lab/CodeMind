def f(digits):
    digits.reverse()	## <state>digits = CLRJ</state>
    if len(digits) < 2:	## <state>digits = CLRJ</state>
        return digits
    for i in range(0, len(digits), 2):	## <state>i = CLRJ | digits = CLRJ</state>
        digits[i], digits[i+1] = digits[i+1], digits[i]	## <state>digits = CLRJ | i = CLRJ</state>
    return digits	## <state>digits = CLRJ</state>
