text = 'g'
n = 15
if len(text) <= 2:
    print(text)
else:
    leading_chars = text[0] * (n - len(text) + 1)
    print(leading_chars + text[1:-1] + text[-1])