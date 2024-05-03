def f(digits):
    digits.reverse()	## digits = []
    if len(digits) < 2:	## digits = []
        return digits
    for i in range(0, len(digits), 2):	## i = [] | digits = []
        digits[i], digits[i+1] = digits[i+1], digits[i]	## digits = [] | i = []
    return digits	## digits = []
