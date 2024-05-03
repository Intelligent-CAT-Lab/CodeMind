def f(digits):
    digits.reverse()	## digits = CLRJ
    if len(digits) < 2:	## digits = CLRJ
        return digits
    for i in range(0, len(digits), 2):	## i = CLRJ | digits = CLRJ
        digits[i], digits[i+1] = digits[i+1], digits[i]	## digits = CLRJ | i = CLRJ
    return digits	## digits = CLRJ
