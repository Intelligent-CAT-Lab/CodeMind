n = "x"
m = "$"
text = "2xz&5H3*1a@#a*1hris"
if text.strip() == '':
    print(text)
head, mid, tail = text[0], text[1:-1], text[-1]
joined = head.replace(n, m) + mid.replace(n, m) + tail.replace(n, m)
print(joined)