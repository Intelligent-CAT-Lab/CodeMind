text = 'bbbbr'
length = len(text)
half = length // 2
encode = text[:half].encode('ascii')
if text[half:] == encode.decode():
    print(True)
else:
    print(False)