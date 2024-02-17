text = 'SzHjifnzog'
for i in range(len(text)-1, 0, -1):
    if not text[i].isupper():
        print(text[0:i])
        break