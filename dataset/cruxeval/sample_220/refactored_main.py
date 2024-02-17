text = "abcdefgabc"
m = 1
n = 2
text = "{}{}{}".format(text, text[:m], text[n:])
result = ""
for i in range(n, len(text)-m):
    result = text[i] + result
print(result)