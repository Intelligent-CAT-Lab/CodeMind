digits = [1,2]
digits.reverse()
if len(digits) < 2:
    digits = digits
for i in range(0, len(digits), 2):
    digits[i], digits[i+1] = digits[i+1], digits[i]
print(digits)