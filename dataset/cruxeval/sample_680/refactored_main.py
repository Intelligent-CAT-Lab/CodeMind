text = "we@32r71g72ug94=(823658*!@324"
letters = ''
for i in range(len(text)):
    if text[i].isalnum():
        letters += text[i]
print(letters)