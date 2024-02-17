text = 'bR'
n = -1
if n < 0 or len(text) <= n:
    result = text
else:
    result = text[0 : n]
    i = len(result) - 1
    while i >= 0:
        if result[i] != text[i]:
            break
        i -= 1
    result = text[0 : i + 1]

print(result)