text = 'catNG'
dng = 'NG'
if dng not in text:
    print(text)
else:
    if text[-len(dng):] == dng:
        print(text[:-len(dng)])
    else:
        print(text[:-1] + f(text[:-2], dng))