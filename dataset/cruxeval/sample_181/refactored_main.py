s = "qwfasgahh329kn12a23"
count = 0
digits = ""
for c in s:
    if c.isdigit():
        count += 1
        digits += c
result = [digits, count]
print(result)