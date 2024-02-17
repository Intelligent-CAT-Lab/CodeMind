integer = 8999
n = 2
i = 1
text = str(integer)
while (i+len(text) < n):
    i += len(text)
print(text.zfill(i+len(text)))