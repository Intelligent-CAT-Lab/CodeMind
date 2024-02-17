text = "wwwwhhhtttpp"
char = 'w'
min_count = 3
count = text.count(char)
if count < min_count:
    print(text.swapcase())
else:
    print(text)