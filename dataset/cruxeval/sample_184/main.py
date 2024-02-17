def f(digits):
    digits.reverse()
    if len(digits) < 2:
        return digits
    for i in range(0, len(digits), 2):
        digits[i], digits[i+1] = digits[i+1], digits[i]
    return digits