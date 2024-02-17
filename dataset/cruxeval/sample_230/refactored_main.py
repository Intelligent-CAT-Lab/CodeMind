text = '102x0zoq'
result = ''
i = len(text)-1
while i >= 0:
    c = text[i]
    if c.isalpha():
        result += c
    i -= 1
print(result)